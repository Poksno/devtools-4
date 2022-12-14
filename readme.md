# ReBase64

Library for encoding and decoding base64 strings.

## How to use

To work with the library, you need to import it into your project.

gradle:

```groovy
implementation 'com.example:rebase64:1.0.0'
```

maven:

```xml
<dependency>
  <groupId>com.example</groupId>
  <artifactId>rebase64</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

### encode

```java 
String encoded = ReBase64.encode("Hello World!");
```

### decode

```java
String decoded = ReBase64.decode("SGVsbG8gV29ybGQh");
```