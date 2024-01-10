#include <stdio.h>


int linearSearch(int arr[] , int size , int key){

    for(int i = 0 ; i<size ; i++){

        if(arr[i] == key){
            return i ;
        }
    }

    return -1 ;

}

int binSearch(int arr[] , int size , int key){

    int si = 0 ;
    int ei = size-1 ;

    while(si<ei){

        int mid = (si=ei)/2 ;
        

        if(arr[mid]  == key){
            return mid ;
        }

        if(arr[mid]< key){
            si = mid + 1;
        }else{
            ei = mid-1;
        }


    }
}



int main(){
    int list[] = {25 , 29 , 12 , 17 , 8 };
    int size = sizeof(list)/sizeof(list[0]);
    int key = 17 ;

    // for(int i = 0 ;i<size ; i++){
        
    //     if(list[i] == key){
    //         printf("key is at index %d " . i);
    //     }
    // }

    int index = binSearch(list, size , key );

    if(index== -1){

        printf("Key not found");
    }

    printf("key is at index %d" , index);







}