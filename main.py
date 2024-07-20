a, b = map(int, input().split())
s = ''

while a != 0:
    c = a % b
    if c < 10:
        s += chr(c + 48)
        
    else:
        s += chr(c + 55)
    
    a //= b
    
print(s[::-1])
    