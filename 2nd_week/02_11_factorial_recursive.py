# 팩토리얼
# n! = n * factorial(n-1)
# 재귀함수는 항상 탈출구를 잘 만들어줘야 한다.

def factorial(n):
    if n == 1:
        return 1
    return n * factorial(n - 1)


print(factorial(5))
