def print_numbers(i, n):
    if i < 1:
        return

    print_numbers(i - 1, n)
    print(i)

print_numbers(5, 5)
