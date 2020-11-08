public class Puzzle {
    public static void main(String[] args) {
        char[][] puzzle = {
                {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'},
                {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'},
                {'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'},
                {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'},
                {'a', 'p', 'e', 'e', 'm', 'f', 'g', 'h'},
                {'p', 'q', 'r', 's', 't', 'u', 'v', 'w'},
                {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'},
                {'m', 'n', 'o', 'p', 'q', 'r', 's', 't'},
        };

        int[] position = new int[2];
        position = search(puzzle, "hef");
        for(int i=0;i<2;i++){
            System.out.print(position[i] + " ");
        }
    }

    public static int[] search(char[][] a, String key) {
        int[] location = {-1, -1};
        for (int row = 0; row < a.length; row++) {
            for (int i = 0; i < a[0].length; i++) {
                // Horizontal Search
                // i point for each colume
                // Left to right
                int j = 0; //j is pointer for key
                while (i <= a[0].length - key.length()
                        && j < key.length() && a[row][i + j] == key.charAt(j)) {
                    j++;
                }
                if (j == key.length()) {
                    location[0] = row;
                    location[1] = i;
                    return location;
                }
                // Right to left
                j = 0; //j is pointer for key
                while (i >= key.length() - 1 && j < key.length() && a[row][i - j] == key.charAt(j)) {
                    j++;
                }
                if (j == key.length()) {
                    location[0] = row;
                    location[1] = i;
                    return location;
                }
            }
        }

        for (int col = 0; col < a.length; col++) {
            for (int i = 0; i <= a[0].length - key.length(); i++) {
                // Verticle Search
                // i point within a row
                int j = 0; //j is pointer for key
                while (j < key.length() && a[i + j][col] == key.charAt(j)) {
                    j++;
                }
                if (j == key.length()) {
                    location[0] = col;
                    location[1] = i;
                    return location;
                }

                j = 0;
                while (i-j>=0 && j < key.length() && a[i - j][col] == key.charAt(j)) {
                    j++;
                }
                if (j == key.length()) {
                    location[0] = col;
                    location[1] = i;
                    return location;
                }
            }
        }

        //diagonal slope -
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                int c = 0;
                while (i + c < a.length && j + c < a[0].length && c < key.length() && a[i + c][j + c] == key.charAt(c)) {
                    c++;
                }
                if (c == key.length()) {
                    location[0] = i;
                    location[1] = j;
                    return location;
                }

                c = 0;
                while (i - c >= 0 && j - c >= 0 && key.charAt(c) == a[i - c][j - c]) {
                    c++;
                }
                if (c == key.length()) {
                    location[0] = i;
                    location[1] = j;
                    return location;
                }
            }
        }

        //diagonal slope +
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                int c = 0;
                while (i + c < a.length && j - c >= 0 && c < key.length() && a[i + c][j - c] == key.charAt(c)) {
                    c++;
                }
                if (c == key.length()) {
                    location[0] = i;
                    location[1] = j;
                    return location;
                }

                c = 0;
                while (i - c >= 0 && j + c < a[0].length && c < key.length() && a[i - c][j + c] == key.charAt(c)) {
                    c++;
                }
                if (c == key.length()) {
                    location[0] = i;
                    location[1] = j;
                    return location;
                }
            }
        }
        return location;
    }
}
