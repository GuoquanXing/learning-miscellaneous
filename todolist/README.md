## TodoList
When you run this project, it will print 4 initial todoItems in your terminal:
![initial output](https://github.com/GuoquanXing/learning-miscellaneous/blob/master/todolist/image.png)

you can add todoItem by execute:
```-sh
$ add "Todo Task Description"
``` 
you can tick todoItem whose ID is 1 as completed by executing command below:
```-sh
$ 1
```

#### Prerequisite
+ `maven` is installed:
```-sh
$ mvn --version
```
+ `docker` is installed and docker engine is running:
```-sh
$ docker images
```

#### Install
+ Open your terminal and execute command to build the project:
```
$ git clone https://github.com/GuoquanXing/learning-miscellaneous.git
$ cd todolist
$ mvn package
```
+ Build the Docker Image:
```-sh
$ docker build -t [image_name]:[tag] .
```
+ Run `docker images` the image [image_name]:[tag] shall be listed
#### Run
Execute command to run image you just build:
```-sh
$ docker run -it [image_name]:[tag]
```


