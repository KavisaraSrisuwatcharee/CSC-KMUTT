import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'MyForm',
      theme: ThemeData(
          primaryColor: Colors.lightGreen[400],
          textTheme:
              Theme.of(context).textTheme.apply(bodyColor: Colors.amber)),
      home: Scaffold(
          appBar: AppBar(
            title: Text('Form Validation Demo'),
          ),
          body: MyForm()),
    );
  }
}

class MyForm extends StatefulWidget {
  @override
  _MyFormState createState() => _MyFormState();
}

class _MyFormState extends State<MyForm> {
  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.all(30),
      child: Form(
        child: Column(
          children: <Widget>[
            TextFormField(
              decoration: InputDecoration(labelText: 'Name'),
            ),
            TextFormField(
              decoration: InputDecoration(labelText: 'Student ID'),
            ),
            Container(
              padding: EdgeInsets.all(50),
              child: Column(
                children: <Widget>[
                  RaisedButton(onPressed: null, child: Text('submit'))
                ],
              ),
            )
          ],
        ),
      ),
    );
  }
}
