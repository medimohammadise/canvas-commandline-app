# CanvasCommandLine Application (Springer Nature Code Challenge)

This a sample application for exposing my programming and design skills, I hope it works.


## Dependencies

There is no specific library dependency I just used Java8 and Junit for the development. I used maven jar plugin for building jar file and for simplicity I have applied maven wrapper

**Thats it!**


## Design decisions

## Interfaces : 
    Command interface : draw (for upating canvas elements)
    Canvas  interface : display Canvas, keep commands
    Shape   interface : draw shape using Canvas
    
## Concrete Classes :  
    Command conceret classes :CreateCanvasCommandImpl,DrawLineCommandImpl,DrawRectangleCommandImpl,BucketFillCommandImpl,
    QuiteCanvasCommandImpl class names are self-explatory
    Canvas concrete classes : CanvasImpl
    Shape concrete classes : ٍRectangle and Line
    CanvasCommandFactory   : for processing command line and creating related comand class
    
## How to run

You need to do following steps for runing the project via command line :

1. after cloning go to the app directory and run ./mvnw install (Mac or Linux) or mvnw install (windows). This command will generate jar file after all test cases passed.
2. cd target  (go to target folder).
3. run this command java -jar CoavasCommandLineApp-1.0-SNAPSHOT.jar and there we go!


 
## Commands

**Application is case sensitive and all command letters should be upperCase !**

   
| Command | Description |
| ------- | ----------- |
| `C w h`     | Should create a new canvas of width w and height h. |
| `L x1 y1 x2 y2` | Should create a new line from `(x1,y1)` to `(x2,y2)`. Currently only horizontal or vertical lines are supported. Horizontal and vertical lines will be drawn using the `x` character. |
| `R x1 y1 x2 y2` | Should create a new rectangle, whose upper left corner is `(x1,y1)` and lower right corner is `(x2,y2)`. Horizontal and vertical lines will be drawn using the `x` character. |
| `B x y c` | Should fill the entire area connected to `(x,y)` with colour `'c'`. The behaviour of this is the same as that of the "bucket fill" tool in paint programs. |
| `Q` | Should quit the program. |

