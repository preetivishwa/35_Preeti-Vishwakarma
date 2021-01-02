#load package
require(lpSolve)

c<-c(3,5)

A <-matrix(c(1,2,
             1,1,
             0,1), nrow=3, byrow=TRUE)

B <-c (2000,1500,600)

cs<-c("<=","<=","<=")

plot.new()
plot.window(xlim=c(0,2000),ylim=c(0,2000))
axis(1)
axis(2)
title(main="LPP using Graphical method")
title(xlab="X axis")
title=(ylab="Y axis")
box()

segments(x0 = 2000, y0=0, x1=0, y1=1000,col="green")
segments(x0 = 1500, y0=0, x1=0, y1=1500,col="green")
segments(x0 = 0, y0=0, x1=600, y1=0,col="green")

optimum<-lp(direction = "max",
            objective.in = c,
            const.mat = A,
            const.dir = cs,
            const.rhs = B,
            all.int = T)

print(optimum$status)


best_sol<-optimum$solution
names(best_sol)<-c("x1","x2")
print(best_sol)

print(paste("Total cost: ",optimum$objval, sep=""))
