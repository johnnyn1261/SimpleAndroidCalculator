# SimpleAndroidCalculator
A simple android calculator application

For this app, I followed the beginner's tutorial, linked below, by Bill Butterfield. As a first time
Android developer, I was able to learn the very basics of textViews, buttons and even some debugging.

The functionality of the example app is very simple: enter 2 numbers and push a button to add them up.
To challenge myself a bit more, I added extra functionality via additional buttons to subtract, multiply
and divide the two numbers, as well as perform the modulus of the first number with the second as the
divisor. An issue that I ran into when implementing these additional buttons was decimals and rounding.

Finally, as Bill leaves the app, there are a number of bugs that are not caught and dealt with. For
instance, if only 1 of the 2 number fields are entered, pushing a button will cause the app to crash and
exit. The same can be said about leaving both fields blank or using a non-number (i.e. a period or dash)
in either or both fields.  To fix this issue, I incorporated try-catch blocks in conjunction with toast
messages to display an error. This process was also used to catch arithmetic exceptions such as divideByZero.
