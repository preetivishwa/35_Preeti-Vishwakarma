                 


#Import lpslove package

library(lpSolve)
      
f.obj<-c(40,50)

#SET TRANSPORTATION COSTS MATRIX
f.con <- matrix(c(2,3,
                 8,4 ), nrow=2, byrow = TRUE)

f.dir<-c("<=",
         "<=")

f.rhs<-c(3,5)

lp("max", f.obj, f.con, f.dir, f.rhs)

lp("max", f.obj,f.con,f.dir,f.rhs)$solution


lp("max",f.obj,f.con,f.dir,f.rhs, compute.sens = TRUE)$sens.coef.from

lp("max", f.obj,f.con,f.dir,f.rhs, compute.sens = TRUE)$sens.coef.to

lp("max", f.obj,f.con,f.dir,f.rhs, compute.sens = TRUE)$duals

lp("max", f.obj,f.con,f.dir,f.rhs, compute.sens = TRUE)$duals.from
lp("max", f.obj,f.con,f.dir,f.rhs, compute.sens = TRUE)$duals.to






