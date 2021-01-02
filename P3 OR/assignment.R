#SOLVE FOLLOWING ASSIGNMENT PROBLEM REPRESENTED IN FOLLOWING MATRIX USING R PROGRAMMING   
#ASSIGNMENT PROBLEM
#   JOB1    JOB2    JOB3
#W1  15      10       9
#W2  9       15       10
#W3  10      12        8

#Import lpslove package
library(lpSolve)

#set assignment costs matrix
costs <-matrix(c(15,10,9,
                 9,15,10,
                 10,12,8),nrow=3, byrow = TRUE)
costs
lp.assign(costs)
lp.assign(costs)$solution