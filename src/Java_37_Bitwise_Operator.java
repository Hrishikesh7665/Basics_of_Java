/*
BitWise and &
BitWise or |

In BitWise & if booth  are 1 then 1 (1 1 > 1) (if 1 0 > 0)

In BitWise | if any of the value are 1 then answer is 1

And
-------
5 = 0 1 0 1
6 = 0 1 1 0
-----------
    0 1 0 0 == 4

Or
---
-------
5 = 0 1 0 1
6 = 0 1 1 0
-----------
    0 1 1 1 == 7

 */

public class Java_37_Bitwise_Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println((a&b));  // > Bitwise And
        System.out.println((a|b));  // > Bitwise Or

    }
}
