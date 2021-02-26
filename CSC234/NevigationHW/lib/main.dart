import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'HomePage',
      theme: ThemeData(
        primaryColor: Colors.lightGreen[400],
        // textTheme:
        //     Theme.of(context).textTheme.apply(bodyColor: Colors.amber)),
      ),
      home: Scaffold(
          appBar: AppBar(
            centerTitle: true,
            title: Text(
              'Mutipages Navigation',
            ),
          ),
          body: HomePage()),
    );
  }
}

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  final textController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Container(
        padding: EdgeInsets.all(30),
        child: Form(
          child: Column(
            children: <Widget>[
              TextFormField(
                controller: textController,
                decoration: InputDecoration(
                    border: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(20))),
              ),
              Container(
                padding: EdgeInsets.all(50),
                child: Column(
                  children: <Widget>[
                    RaisedButton(
                      color: Colors.amber,
                      onPressed: () {
                        var value = textController.text;
                        if (!value.isEmpty) {
                          if (value == 'text01') {
                            Navigator.push(
                                context,
                                MaterialPageRoute(
                                    builder: (context) => Page01()));
                            return;
                          }
                          if (value == 'text02') {
                            Navigator.push(
                                context,
                                MaterialPageRoute(
                                    builder: (context) => Page02()));
                            return;
                          }

                          Navigator.push(
                              context,
                              MaterialPageRoute(
                                  builder: (context) => UnknownPage()));
                        }
                      },
                      child: Text('submit'),
                      shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(15),
                      ),
                    )
                  ],
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

class Page01 extends StatelessWidget {
  const Page01({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        padding: EdgeInsets.all(20),
        width: double.infinity,
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text('Text01'),
            Text('Sawaddee ka Jarn Toei'),
            RaisedButton(
                onPressed: () {
                  Navigator.of(context).pop();
                },
                child: Text('back'),
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15),
                )),
          ],
        ),
      ),
    );
  }
}

class Page02 extends StatelessWidget {
  const Page02({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        padding: EdgeInsets.all(20),
        width: double.infinity,
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text('Text02'),
            Text('Sawaddee ka Jarn Toei'),
            RaisedButton(
                onPressed: () {
                  Navigator.of(context).pop();
                },
                child: Text('back'),
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15),
                )),
          ],
        ),
      ),
    );
  }
}

class UnknownPage extends StatelessWidget {
  const UnknownPage({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        padding: EdgeInsets.all(20),
        width: double.infinity,
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text('Mai mee information'),
            Text('404 page not found'),
            RaisedButton(
                onPressed: () {
                  Navigator.of(context).pop();
                },
                child: Text('back'),
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15),
                )),
          ],
        ),
      ),
    );
  }
}
