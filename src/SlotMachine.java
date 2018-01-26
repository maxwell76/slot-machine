
public class SlotMachine {

    int payoutcycle, payoutamt, timetillnextpay;

    public SlotMachine(int c, int a) {
        payoutcycle = c;
        payoutamt = a;
        timetillnextpay = c;
    }

    public int play() {
        if (timetillnextpay == 0) {

            return payoutamt;

        } else {
            timetillnextpay--;
            return 0;
        }
        
    }

}
