#include <stdio.h>

typedef  int   T;
typedef  T     *PT;
typedef  PT    *PPT;

#define SIZE 10
typedef  unsigned char A[SIZE];
typedef  A  *PA;

main() {
    T  t1, t2;
    PT pt = &t1;
    PPT ppt = &pt;
    A a;
    PA pa = &a;

    t1 = 1;
    t2 = 2;
    printf("t1 = %d, t2 = %d, *pt = %d, **ppt = %d\n",
           t1, t2, *pt, **ppt);
    pt = &t2;
    printf("t1 = %d, t2 = %d, *pt = %d, **ppt = %d\n",
           t1, t2, *pt, **ppt);
    
    a[0] = 'a';
    printf("a[0] = %c, (*pa)[0] = %c\n",
           a[0], (*pa)[0]);
}
