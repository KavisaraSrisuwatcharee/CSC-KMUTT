import 'package:flutter/material.dart';
import 'package:multipage/oldmain.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      routes: {
        '/': (context) => HomePage(),
        '/details': (context) => Detail1Screen(),
        '/details2': (context) => Detail2Screen(),
      },
    );
  }
}

class HomePage extends StatelessWidget {
  final textController = TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Container(
      child: Column(
        children: [
          TextField(
            controller: textController,
          ),
          TextButton(
              onPressed: () {
                var value = textController.text;
                if (value == 'text01') {
                  // Navigate to Detail 1
                  Navigator.push(context,
                      MaterialPageRoute(builder: (context) => Detail1Screen()));
                  return;
                }
                if (value == 'text02') {
                  Navigator.push(context,
                      MaterialPageRoute(builder: (context) => Detail2Screen()));
                  // Navigate to Detail 2
                  return;
                }
                Navigator.push(context,
                    MaterialPageRoute(builder: (context) => UnknownScreen()));
                // Navigate to Unknown
              },
              child: Text("Go"))
        ],
      ),
    ));
  }
}
