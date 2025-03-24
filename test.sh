# Compile your java code
javac -cp "./lib/hamcrest-core-1.3.jar:./lib/junit-4.13.2.jar:" -d ./bin ./src/*.java ./src/dealership/*.java
# Run tests
java -cp "./bin:./lib/hamcrest-core-1.3.jar:./lib/junit-4.13.2.jar:" org.junit.runner.JUnitCore CarTest 