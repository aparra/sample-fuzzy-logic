1) Download jFuzzyLogic_core.jar from http://jfuzzylogic.sourceforge.net/html/index.html

2) Install jar into maven repository using this command:
```cli
mvn install:install-file \
  -Dfile=jFuzzyLogic_core.jar \
  -DgroupId=net.sourceforge.jFuzzyLogic \
  -DartifactId=jFuzzyLogicCore \
  -Dversion=1.0 \
  -Dpackaging=jar
  ```

3) Create a eclipse project ```sbt eclipse```
