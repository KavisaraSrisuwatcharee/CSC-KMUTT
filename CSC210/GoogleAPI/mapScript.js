var myMap;
var mapOptions;
function mapInit() {
    var a = 5;
    var b = 10;
    // alert(a+b);
    document.getElementById('abc').value = a + b;
    var SIT = { lat: 13.652784, lng: 100.493642 };
    mapOptions = { zoom: 12, center: SIT };
    myMap = new google.maps.Map(
        document.getElementById('mapDisplay'), mapOptions
    )
    shop = {
        position: { lat: 13.746318, lng: 100.534136 },
        title: "Best Gold Fish @ Siam Paragon"
    }

    myMarker = new google.maps.Marker(shop);
    myMarker.setMap(myMap);
    var shopList = [
        { position: { lat: 13.697667, lng: 100.537583 }, title: "Gold Fish @Central Rama 3" },
        {
            position: { lat: 13.646854, lng: 100.680141 }, title: "Gold Fish @Mega Bangna",
            icon: {
                url: "http://map.google.com/mapfiles/ms/icons/blue-dot.png"
            }
        },
        {
            position: { lat: 18.793268, lng: 98.984972 }, title: "Gold Fish @Chiangmai",
            icon: {
                url: "https://www.sit.kmutt.ac.th/wp-content/uploads/2020/08/SIT_Logo25Y-02-dicut.png"
            }
        },
        { position: { lat: 35.681077, lng: 139.768792 }, title: "Gold Fish @Tokyo" },

    ];
    for (let index = 0; index < shopList.length; index++) {
        myMarker = new google.maps.Marker(shopList[index]);
        myMarker.setMap(myMap);
    }
    customer = {
        position: SIT, title: "Drag to your home", draggable: true,
        icon: {
            url: "http://maps.google.com/mapfiles/ms/icons/purple-dot.png"
        }
    };
    var customerMarker = new google.maps.Marker(customer);
    customerMarker.setMap(myMap);
    google.maps.event.addListener(customerMarker, "dragend", function (event) {
        var latCus = this.position.lat();
        var lngCus= this.position.lng();
        document.getElementById('latitude').value=latCus;
        document.getElementById('longitude').value= lngCus;
})
}
