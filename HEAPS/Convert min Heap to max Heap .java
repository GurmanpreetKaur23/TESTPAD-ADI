static void maxHeapHeapify(int arr[] , int n , int i) {
    int largest = i ;
    int left = 2*i+1 ;
    int right = 2*i+2 ;
    
    if(left<n && arr[left]>arr[largest]) {
        largest = left ;
    }
    
    if(right<n && arr[right]>arr[largest]) {
       largest = right ;
    }
    
    if(largest!=i) {
        int temp = arr[i] ;
        arr[i] = arr[largest] ;
        arr[largest] = temp ;
        
        maxHeapHeapify(arr , n , largest) ;
    }
}
static void modifyMintoMax(int array[], int n)
{
    for(int i=n/2-1 ; i>=0 ; i--) {
        maxHeapHeapify(array , n , i) ;
    }
}
