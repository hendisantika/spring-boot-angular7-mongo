# Contact App Backend

Run this project by this command : `gradle clean bootRun`

Open another terminal then type this command to get Contact list from the RESTful API.

`curl -i -H "Accept: application/json" localhost:8080/contacts`

It should display a response like this.

```
HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Mon, 05 Feb 2018 12:14:39 GMT

[]
```

To add a contact, type this command to post a contact data.
```
curl -i -X POST -H "Content-Type: application/json" -d '{"name":"John Doe","address":"Jl. Cipaganti No.112","city":"Bandung","phone":"0811223112233","email":"john.doe@dummy.com"}' localhost:8080/contacts
```

It should display a response like this.
```
HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Tue, 06 Feb 2018 02:59:00 GMT

{"id":"5a7919f4b9d4f13c2cb6f539","name":"John Doe","address":"Jl. Cipaganti No.112","city":"Bandung","phone":"0811223112233","email":"john.doe@dummy.com"}
```

You can check on MongoDB console to verify that new contact data is saved. Next, to get a single contact data by ID type this command.
```
curl -i -H "Accept: application/json" localhost:8080/contacts/5a784bbfb9d4f121d9a31195
```

And here's the response.
```
HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Mon, 05 Feb 2018 12:22:49 GMT

{"id":"5a784bbfb9d4f121d9a31195","name":"John Doe","address":"Jl. Cipaganti No.112","city":"Bandung","phone":"0811223112233","email":"john.doe@dummy.com"}
```

You can test update and delete using these commands.
```
curl -i -X PUT -H "Content-Type: application/json" -d '{"name":"John Dodol"}'
curl -i -X DELETE localhost:8080/contacts/5a784bbfb9d4f121d9a31195
```