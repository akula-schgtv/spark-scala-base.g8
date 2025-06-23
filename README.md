The template project aims to setup a simplified porject scaffolding to develop a Spark Project using the Scala API



The Project requires the installation of the command line tool called **g8** so that the users can simply setup their project
and use it with IntelliJ/Eclipse/IDE of their choice.
The tool can be installed in the following way. Please note the installation is targeted currently for MacOS/Linux users

```
$ mkdir $HOME/app
$ curl https://repo1.maven.org/maven2/org/foundweekends/giter8/giter8-bootstrap_2.12/0.16.2/giter8-bootstrap_2.12-0.16.2.sh > ~/app/giter8/bin/g8
$ chmod +x ~/app/giter8/bin/g8
// Setup project as follows:
cd to/your/project/directory && ~/app/giter8/bin/g8 https://github.com/akula-schgtv/spark-scala-base.g8.git
```

The final command shall setup the project post the user provides necessary information else the project assumes suitable defaults.
