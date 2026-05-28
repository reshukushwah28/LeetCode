class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int gasTotal = 0;
        int costTotal = 0;

        // total gas and cost
        for(int i = 0; i < gas.length; i++) {

            gasTotal += gas[i];
            costTotal += cost[i];
        }

        // impossible case
        if(gasTotal < costTotal) {
            return -1;
        }

        int tank = 0;
        int startStation = 0;

        for(int i = 0; i < gas.length; i++) {

            // current petrol
            tank += gas[i] - cost[i];

            // cannot reach next station
            if(tank < 0) {

                // next station new start
                startStation = i + 1;

                // reset tank
                tank = 0;
            }
        }

        return startStation;
    }
}