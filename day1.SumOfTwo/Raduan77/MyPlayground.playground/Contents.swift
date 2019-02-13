import UIKit
// simple solution with use of hashtable
func SumOfTwo(array: [Int], result: Int) -> Bool {
    var storage: [Int: Any] = Dictionary()
    for i in 0..<array.count {
        if let _ = storage[result - array[i]] {
            return true
        }
        storage[array[i]] = true
    }
    return false
}
assert(SumOfTwo(array: [10, 5, 17, 2, 15], result: 15) == true, "Test 1 failed")
assert(SumOfTwo(array: [5], result: 10) == false, "Test 2 failed")
assert(SumOfTwo(array: [5, 9, 3, 3, 4, 8, 15, 32, 10, 12], result: 10) == false, "Test 3 failed")
assert(SumOfTwo(array: [], result: 4) == false, "Test 4 failed")
print("All tests passed!")
