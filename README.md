# Kata

## String Calculator

 The following is a TDD Kata- an exercise in coding, refactoring and test-first, that you should apply daily for at least 15 minutes (I do 30).

 Before you start: 

  * Try not to read ahead.
  * Do one task at a time. The trick is to learn to work incrementally.
  * Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata

### Requirements

 1. Create a simple String calculator with a method ```int add(string numbers)```

  a. The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or “1” or “1,2”

  b. Start with the simplest test case of an empty string and move to 1 and two numbers

  c. Remember to solve things as simply as possible so that you force yourself to write tests you did not think about

  d. Remember to refactor after each passing test

 2. Allow the Add method to handle an unknown amount of numbers

 3. Allow the Add method to handle new lines between numbers (instead of commas).

  a. the following input is ok:  ```1\n2,3```  (will equal 6)

  b. the following input is NOT ok:  ```1,\n``` (not need to prove it - just clarifying)

 4. Support different delimiters

  a. to change a delimiter, the beginning of the string will contain a separate line that looks like this: ```//[delimiter]\n[numbers…]``` for example ```//;\n1;2``` should return three where the default delimiter is ‘;’.

  b. the first line is optional. all existing scenarios should still be supported

 5. Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.if there are multiple negatives, show all of them in the exception message

 ---
stop here if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.
 ---

 6. Numbers bigger than 1000 should be ignored, so adding 2 + 1001  = 2

 7. Delimiters can be of any length with the following format:  ```//[delimiter]\n``` for example: ```//[***]\n1***2***3``` should return 6

 8. Allow multiple delimiters like this:  ```//[delim1][delim2]\n``` for example ```//[*][%]\n1*2%3``` should return 6.

 9. make sure you can also handle multiple delimiters with length longer than one char


## Backend

 The backend for this project was generated with [Spring Initializr](https://start.spring.io/)

## Frontend

This frontend for this project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 7.1.0.

 ```
npm install -g @angular/cli
 ```

 ```
ng --version

     _                      _                 ____ _     ___
    / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
   / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
  / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
 /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
                |___/


Angular CLI: 7.1.0
Node: 8.11.0
OS: darwin x64
Angular:
...

Package                      Version
------------------------------------------------------
@angular-devkit/architect    0.11.0
@angular-devkit/core         7.1.0
@angular-devkit/schematics   7.1.0
@schematics/angular          7.1.0
@schematics/update           0.11.0
rxjs                         6.3.3
typescript                   3.1.6
 ```

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `-prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
Before running the tests make sure you are serving the app via `ng serve`.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

	