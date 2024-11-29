# 정수를 입력했을 때, 그 정수 이하의 소수를 모두 반환하시오.
# 20이 입력된다면, [2, 3, 5, 7, 11, 13, 17, 19] 반환
# ==============================================
# 소수: 1과 자신으로만 나눠지는 수
# 2 ~ 자기 자신까지 나눠보고, 나머지가 나오지 않으면 소수 배열에 추가
# ++) n보다 작은 모든 숫자에 대해 비교하지 말고, n보다 작은 모든 소수에 대해 비교하면 더 효율적
# +++) N의 제곱근보다 크지 않은 어떤 소수로도 나누어 떨어지지 않는다.

input = 20


def find_prime_list_under_number(number):
    prime_list = []
    for n in range(2, number + 1):
        for i in prime_list:
            if i * i <= n and n % i == 0:
                break
        else:
            prime_list.append(n)
    return prime_list


def find_prime_list_under_number2(number):
    prime_list = []
    for n in range(2, number + 1):
        for i in range(2, n):
            if n % i == 0:
                break
        else:
            prime_list.append(n)
    return prime_list


def find_prime_list_under_number3(number):
    prime_list = []
    for n in range(2, number + 1):
        for i in prime_list:
            if n % i == 0:
                break
        else:
            prime_list.append(n)
    return prime_list


result = find_prime_list_under_number(input)
print(result)
