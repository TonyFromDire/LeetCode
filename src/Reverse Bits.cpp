class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
     
    const uint32_t BITS_OF_BYTE = 8; // ÿ���ֽڶ��ٱ���
    uint32_t result = 0;             // ������������
    // ����ѭ������ÿ������
    for (uint32_t i = 0; i < sizeof(n) * BITS_OF_BYTE; i++) {
        // ȡ����������һλ���� result������λ��������
        result = (result << 1) | (n & 1);
        n >>= 1;         // �������������һλ
    }
    return result;

        
    }
};