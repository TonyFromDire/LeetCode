class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
     
    const uint32_t BITS_OF_BYTE = 8; // 每个字节多少比特
    uint32_t result = 0;             // 结果存放在这里
    // 以下循环处理每个比特
    for (uint32_t i = 0; i < sizeof(n) * BITS_OF_BYTE; i++) {
        // 取出输入的最后一位加入 result，其他位依次左移
        result = (result << 1) | (n & 1);
        n >>= 1;         // 右移抛弃掉最后一位
    }
    return result;

        
    }
};