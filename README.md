# yaerrors
Yet another collection of commonly used exceptions for java applications.

Note that all of these exceptions are _unchecked_. This is on [purpose](https://gpcoder.gitbook.io/clean-code/the-key-principles-of-clean-code/error-handling), but we strongly encourage you to write javadoc strings on your functions that may throw these exceptions, so that it's still transparent.

All exceptions can be trivially constructed with no arguments, but underlying exception and error messages can also be provided.

## Usage
First, you need to add the library to your project:

```gradle
// Add mavenCentral to your repositories
repositories {
    mavenCentral();
}

// Add the library (NOTE: Check the latest version on github)
depdendencies {
    implementation group: 'dk.yalibs', name: 'yaerrors', version: '1.0.0';
}
```

Now you can access the exceptions like so:

```java
import dk.yalibs.yaerrors.NotFoundException; // Import it

public class Main {
    public static void main(String[] argv) throws Exception {
        throw NotFoundException(); // Use it
    }
}
```

