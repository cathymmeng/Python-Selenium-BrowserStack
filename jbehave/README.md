### Example of tests that use Selenium
https://github.com/jbehave/jbehave-tutorial

### Run tests with the following command:

```bash
mvn clean test
```

### View test results, by loading the following in a browser
- target/jbehave/view/reports.html

### Defining Stories

- The stories can be found in the src/test/resource directory.
- The file names need to have not spaces, but can have underscores.
- The stories are mapped to Step implementation in the StorySuite class.
- Step classes are just POJOs with methods annotated with jBehave annotations.
- Step implementation classes can be found within the src/test/java folder.
