row = int(input())
colum = int(input())
Matrix = [[0 for _ in range(row)] for _ in range(colum)]
for i in range(row):
    for j in range(colum):
        Matrix[i][j] = int(input())
check = int(input())
flag = 0
for z in range(row):
    for k in range(colum):
        if Matrix[z][k] == check:
            flag = 1
            break
if flag == 1:
    print('will not take number') 
else:
    print('will take number')       

