#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

int main() {
    // Create nodes
    struct Node *head = NULL;       // Head node pointer
    struct Node *second = NULL;     // Second node pointer
    struct Node *third = NULL;      // Third node pointer
    struct Node *fourth = NULL;     // Fourth node pointer

    // Assign data values
    head = (struct Node*)malloc(sizeof(struct Node));    // Allocate memory for head node
    head->data = 1;                                      // Assign data value to head node

    second = (struct Node*)malloc(sizeof(struct Node));  // Allocate memory for second node
    second->data = 2;                                    // Assign data value to second node

    third = (struct Node*)malloc(sizeof(struct Node));   // Allocate memory for third node
    third->data = 3;                                     // Assign data value to third node

    fourth = (struct Node*)malloc(sizeof(struct Node));  // Allocate memory for fourth node
    fourth->data = 4;                                    // Assign data value to fourth node

    // Link nodes
    head->next = second;    // Link head node to second node
    second->next = third;   // Link second node to third node
    third->next = fourth;   // Link third node to fourth node
    fourth->next = NULL;    // Mark end of the linked list by setting next of the fourth node to NULL

    // Start pointing to the first node
    struct Node* current = head;

    // Print linked list
    while (current != NULL) {
        printf("%d ", current->data);   // Print the data value of the current node
        current = current->next;        // Move to the next node
    }
    printf("\n");

    return 0;
}
