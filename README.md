Seesaw
====
Seesaw is MVVM (Model-View-ViewModel) helper to hasten app development.

![](static/seesaw.png)

Nexus Publish
--------
- Pull the latest stable source code from GitHub's [repository][1].
- Set up JAVA_HOME and Java's Path in system environment variable.
- Set up Nexus' Path in system environment variable.
- Open Command Prompt as administrator.
- Run command "nexus /install" to first installed nexus.
- Run command "nexus /start" to start the service.
- Open "http://localhost:8081/" and change admin password.
- Add username and password in local.properties.
- Run command "gradlew build publish" to build and publish.

Download
--------
Check the latest version in Nexus Repository Manager ("http://localhost:8081/").

Gradle (Project):

```gradle
// Using Gradle Groovy DSL
File secretPropsFile = file('./local.properties')
if (secretPropsFile.exists()) {
    Properties p = new Properties()
    p.load(new FileInputStream(secretPropsFile))
    p.each { name, value ->
        ext[name] = value
    }
} else {
    throw new IllegalStateException("secret.properties could not be located for build process")
}

// Using Gradle Kotlin DSL
// val nexusUsername: String = gradleLocalProperties(rootDir).getProperty("nexusUsername")
// val nexusPassword: String = gradleLocalProperties(rootDir).getProperty("nexusPassword")

// ..

allprojects {
    repositories {
        maven {
            url = uri("http://localhost:8081/repository/maven-releases/")
            credentials {
                // Set up nexusUsername & nexusPassword in local.properties
                username = nexusUsername
                password = nexusPassword
            }
        }
        maven {
            url = uri("http://localhost:8081/repository/maven-snapshots/")
            credentials {
                // Set up nexusUsername & nexusPassword in local.properties
                username = nexusUsername
                password = nexusPassword
            }
        }
        // ..
    }
}
```

then, add Seesaw in Gradle (Module):

```gradle
dependencies {
    // Using Gradle Groovy DSL
    implementation 'com.github.suganda8:seesaw:latest'

    // Using Gradle Kotlin DSL
    // implementation("com.github.suganda8:seesaw:latest")
}
```

Features
-----
- Resource & Status
- Single Live Event
- Auto Cleared Value Lifecycle
- Fragment View Binding Delegate
- Base Response & Error Response
- Error Message Handler
- Error Response Handler

Usage
-----

Status
------
Version 1.0.0 is released now.

Developer
------
```
Tegar Bangun Suganda
```

[@canaryv8][2] (Twitter)\
[@suganda8][3] (Github)

License
-------
```
MIT License

Copyright (c) 2021 Tegar Bangun Suganda

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

[1]: https://github.com/suganda8/seesaw/tree/master
[2]: https://twitter.com/canaryv8
[3]: https://github.com/suganda8
