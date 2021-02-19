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
        // textTheme:
        //     Theme.of(context).textTheme.apply(bodyColor: Colors.amber)),
      ),
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
  final _nameFocusNode = FocusNode();
  final _idFocusNode = FocusNode();
  final _formKey = GlobalKey<FormState>();
  var name = "";
  var id = "";

  void _saveForm() {
    if (_formKey.currentState.validate()) {
      _formKey.currentState.save();
      FocusScope.of(context).requestFocus(this._nameFocusNode);
      showDialog(
          context: context,
          builder: (ctx) => new AlertDialog(
                title: Text('Your information'),
                content: Container(
                  height: 100,
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Text(this.name),
                      SizedBox(
                        height: 20,
                      ),
                      Text(this.id)
                    ],
                  ),
                ),
                actions: <Widget>[
                  FlatButton(
                    child: Text(
                      'Close me!',
                      style: TextStyle(color: Colors.amber[500]),
                    ),
                    onPressed: () {
                      Navigator.of(context).pop();
                    },
                  )
                ],
              ));
    }
  }

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Container(
        padding: EdgeInsets.all(30),
        child: Form(
          key: _formKey,
          child: Column(
            children: <Widget>[
              TextFormField(
                validator: (value) {
                  if (value.isEmpty) {
                    return 'Please enter your name';
                  }
                  return null;
                },
                decoration: InputDecoration(labelText: 'Name'),
                textInputAction: TextInputAction.next,
                onSaved: (value) {
                  this.name = value;
                },
                focusNode: this._nameFocusNode,
              ),
              TextFormField(
                validator: (value) {
                  if (value.isEmpty) {
                    return 'Please enter student ID';
                  }
                  return null;
                },
                decoration: InputDecoration(labelText: 'Student ID'),
                keyboardType: TextInputType.number,
                onSaved: (value) {
                  this.id = value;
                },
                focusNode: this._idFocusNode,
              ),
              Container(
                padding: EdgeInsets.all(50),
                child: Column(
                  children: <Widget>[
                    RaisedButton(
                      color: Colors.amber,
                      onPressed: _saveForm,
                      child: Text('submit'),
                      shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(15),
                      ),
                    )
                  ],
                ),
              )
            ],
          ),
        ),
      ),
    );
  }
}
