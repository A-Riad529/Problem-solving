base = int(input())
val1 = int(input())
val2 = int(input())
sum = 0
for i in range(1,base+1):
    if int(i/10) == 0:
        if val1 <= i <= val2:
            sum += i
    else:
        container = i
        newsum = 0
        while int(container) != 0:
            digit = int(container % 10)
            newsum += digit
            container = int(container / 10)
        if val1 <= newsum <= val2:
            sum += i
print(sum)
