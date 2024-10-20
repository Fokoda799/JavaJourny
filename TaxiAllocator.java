public class TaxiAllocator {
    public static int minNumTaxis(int[][] requests) {
        int numTaxi = 1;
        long len = requests.length;
      
        if (len == 0) {
          return 0;
        }
      
        int PU = requests[0][0];
        int DO = requests[0][1];

        if (PU > DO) {
          return -1;
        }

        for (long j = 1; j < len; j++) {
          if (requests[(int) j][0] < DO) {
            numTaxi++;
          }
        }
      
        return numTaxi;
    }
}