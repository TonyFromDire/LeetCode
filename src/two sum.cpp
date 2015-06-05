class Solution {
public:
    vector<int> twoSum(vector<int> &numbers, int target) {
        vector<int> ret;
        // key is the second number, value is the first number's position
        map<int, int> secVal_firPos;
        int pos = 0;
        for (auto elem : numbers) {
            // not found
            if (secVal_firPos.find(elem) == secVal_firPos.end())
                secVal_firPos[target - elem] = pos;
            else {// found
                ret.push_back(secVal_firPos[elem] + 1);
                ret.push_back(pos + 1);
                break;
            }
            ++pos;
        }
        return ret;
    }
};