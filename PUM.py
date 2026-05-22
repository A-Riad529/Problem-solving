num = int(input())
count = 1
for i in range(1,num+1):
    for _ in range(3):
        print(count,"",end='')
        count += 1
    if count % 4 == 0:
        print("PUM")
        count += 1