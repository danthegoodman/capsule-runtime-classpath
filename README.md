# capsule-runtime-classpath

A caplet that wraps a [Capsule] and allows the classpath to be configured via a system property

[Capsule]:https://github.com/puniverse/capsule

# Quick Start

Command Line Example ([download from bintray][dl])

    java -Dcaplet.runtime.classpath=dependency.jar -jar capsule-runtime-classpath.jar your-capsule.jar

[dl]:https://bintray.com/artifact/download/danthegoodman/maven/us/kirchmeier/gradle-capsule-plugin/0.10.0/gradle-capsule-plugin-0.10.0.jar

Maven Artifact:

    repositories {
        jcenter()
    }

    dependencies {
        compile 'us.kirchmeier:capsule-runtime-classpath:0.10.0'
    }


# Documentation

Use the system property `caplet.runtime.classpath` to add additional files to the classpath.

    java -Dcaplet.runtime.classpath=dependency.jar ...

Multiple files may be included by using the classpath separator, `:` on unix, `;` on windows

    java -Dcaplet.runtime.classpath=dep1.jar:dep2.jar ...
