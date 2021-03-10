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
Version 1.0.0 is being developed.

Developer
------
```
Tegar Bangun Suganda
```

[@canaryv8][2] (Twitter)\
[@suganda8][3] (Github)

[1]: https://github.com/suganda8/seesaw/tree/master
[2]: https://twitter.com/canaryv8
[3]: https://github.com/suganda8
