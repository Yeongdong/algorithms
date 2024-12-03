input = "abcba"


def is_palindrome(string):
    # 첫번째 글자와 마지막 글자가 같지 않다면
    if string[0] != string[-1]:
        return False

    # 한 글자인 경우
    if len(string) <= 1:
        return True

    return is_palindrome(string[1:-1])


print(is_palindrome(input))
