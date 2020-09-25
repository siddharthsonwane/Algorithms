def eqlibriunIndex(arr):
    leftSum = 0
    rightSum = 0
    n = len(arr)


    for i in range(n):
        leftSum = 0
        rightSum = 0

        for j in range(i):
            leftSum += arr[j]


        for j in range(i +1 ,n):
            rightSum += arr[j]


        if leftSum == rightSum:
            return  i



    return -1


arr = [-7, 1, 5, 2, -4, 3, 0]
print (eqlibriunIndex(arr))