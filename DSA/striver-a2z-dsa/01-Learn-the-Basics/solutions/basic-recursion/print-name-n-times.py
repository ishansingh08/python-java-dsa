def print_name(n):
    if n == 0:
        return
    
    print("Ishan")
    print_name(n - 1)

print_name(5)
