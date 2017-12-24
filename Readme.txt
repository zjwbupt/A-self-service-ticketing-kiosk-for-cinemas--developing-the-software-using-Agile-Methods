Compile&Run:
input these commands in cmd:
javac -d bin -cp src;lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar src/*.java
java -cp bin Start


Test:
input these commands in cmd:
java -cp bin;lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestFilm
