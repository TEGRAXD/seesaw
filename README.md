Seesaw
====
Seesaw is MVVM (Model-View-ViewModel) helper to hasten app development.

![](static/seesaw.png)

Publish
--------
- Pull the latest stable source code from GitHub's [repository][1].
- Set up JAVA_HOME and Java's Path in system environment variable.
- Set up Nexus' Path in system environment variable.
- Open Command Prompt as administrator.
- Run command "nexus /install" to first install nexus.
- Run command "nexus /start" to start the service.
- Open "http://localhost:8081/" and change admin password.
- Add username and password in local.properties.
- Run command "gradlew build publish" to build and publish.

Download
--------
Check the latest version in Nexus Repository Manager ("http://localhost:8081/").

Using Gradle (Project):

```gradle
```

then, add Seesaw in Gradle (Module):

```gradle
```

Using Maven:

```xml
```

Usage
-----

Status
------
Version 1.0.0 is being developed.

Developer
------
```
Tegar Bangun Suganda
```

[@canaryv8][2] (Twitter)\
[@suganda8][3] (Github)

[1]: https://github.com/suganda8/seesaw/releases
[2]: https://twitter.com/canaryv8
[3]: https://github.com/suganda8
