# AdAction-demo

I just want to explain here why I wrote static methods.

With dependency inject, the only way I've done it in Java was with spring.  Since this projcet is supposed to work in any IDE, that means that I couldn't use spring, since spring is not supported in Intellij Community Edition. For me this meant that I had to write all my methods as static.

Writing static methods is something that I rarely do since static methods should be avoided in general, and most importantly, they are hard to test.

So try not to hold the static methods against me, haha!
