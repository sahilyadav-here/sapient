# Date Time calculator in NodeJS with ES6 and Docker


## Installation
Command to run this file.

```bash
docker build -t calc_pjp2_sahil .
```

```bash
docker run -d -p 8080:8080 --name week3_sahil calc_pjp2_sahil
```

## endpoints
[http://localhost:8080/](http://localhost:8080/) => GET form for nodejs, request made using action attribute

[http://localhost:8080/ajax](http://localhost:8080/ajax) => GET form for nodejs request made via ajax

[http://localhost:8080/post-datequery](http://localhost:8080/post-datequery) => the POST url