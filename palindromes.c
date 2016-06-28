#include <string.h>
#include <stdio.h>

int main()
{
    char str[100];
    printf( "Enter a string (char/value) :");
    fgets (str, 100, stdin);
    int i=0;
    int n;
    n = strlen(str)-1;

    while (i<n)
    {
        if (str[i++] != str[n--])
        {
            printf("%s is Not palidrome\n", str);
            return 0;
        }
    }
    printf("%s is palidrome\n", str);
    return 0;
}