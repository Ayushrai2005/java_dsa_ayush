#include <stdio.h>

struct Student
{

    int id;
    int marks;
    char fav_char;
};

int main()
{

    struct Student harry, ravi, shubham;

    harry.id = 1;
    ravi.id = 2;
    shubham.id = 3;

    harry.marks = 455;
    ravi.marks = 495;
    shubham.marks = 496;

    harry.fav_char = 'h';
    ravi.fav_char = 'h';
    shubham.fav_char = 'h';

    printf("%d\n", harry.id);

    return 0;
}
