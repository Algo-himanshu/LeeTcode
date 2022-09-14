class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
int gassum=0,costsum=0;
int n=gas.length;
for(int i=0;i<n;i++) {
gassum+=gas[i];
costsum+=cost[i];
}
if(gassum<costsum) return -1;

    int total=0;
    int pos=0;
    for(int i=0;i<n;i++) {
        total+=gas[i]-cost[i];
        if(total < 0){
            total=0;
            pos=i+1;
        }
    }
   return pos; 
}
}