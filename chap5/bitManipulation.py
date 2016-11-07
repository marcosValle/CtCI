# Some useful tricks for dealing with bit manipulations

import sys
# Bits are represented as integers
# Print bit by bit from least to most significative
def loopBits(n):
    for i in range(n.bit_length()):
        bit = (n & (1<<i)) != 0
        print(int(bit)) #visit the bit
        
def checkPowerOfTwo(n):
    if (n & (n-1) == 0):
        return True
    return False

def getBit(n, i):
    return int(n & (1<<i) != 0)

def setBit(n, i):
    return (n | (1<<i))

def unsetBit(n, i):
    return (n & ~(1<<i))

def toggleBit(n, i):
    return (n ^ (1<<i))

def int2bin(n, bits=8):
    r = ''
    while bits:
        r = ('1' if (n & 1) else '0') + r
        bits = bits - 1
        n = n >> 1
    print(r)

#loopBits(320)
#print(checkPowerOfTwo(64))
#print(getBit(33, 1))
#print(setBit(32, 4))
#print(unsetBit(33, 0))
#print(toggleBit(33, 0))
int2bin(32)

