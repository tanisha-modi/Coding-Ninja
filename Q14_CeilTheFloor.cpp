// link to the question --> https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

pair<int, int> getFloorAndCeil(int arr[], int n, int x) {
	// Write your code here.
	   sort(arr,arr+n);

    int floor;

    int ceiling;

    int low=0;

    int high=n-1;

    int mid;

    while(low<=high){

        mid=(low+high)/2;

        if(arr[mid]==x){

            return make_pair(arr[mid],arr[mid]);

        }

        else if(arr[mid]>x){

            high=mid-1;

        }

        else if(arr[mid]<x){

            low=mid+1;

        }

    }

    if(arr[mid]<x){

        floor=arr[mid];

        ceiling=arr[mid+1];

    }

    else if(arr[mid]>x){

        ceiling=arr[mid];

        floor=arr[mid-1];

    }

    if(mid==0){

        floor=-1;

    }

    else if(mid==n-1){

        ceiling=-1;

    }

    return make_pair(floor,ceiling);

 

    
}
