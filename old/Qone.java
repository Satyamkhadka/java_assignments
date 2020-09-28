class Qone{
    static int CHAREGEPERGUEST = 60,EXTRACHARGE = 200, MINIMUM_GUEST=40;
    static int INVITEDGUEST = 50, COMINGGUEST=37, NOTCOMINGGUEST=5;

    public static void main(String args[]){

        int guestNotSure = INVITEDGUEST-COMINGGUEST-NOTCOMINGGUEST;
        System.out.println("Guest who have not yet told you if they can attend the party: "+guestNotSure);

        int guestToAvoidExtraCost = MINIMUM_GUEST-COMINGGUEST;
        System.out.println("Number of guest that need to attend so as to avoid extra price: "+guestToAvoidExtraCost);

        int costNow = (COMINGGUEST*CHAREGEPERGUEST)+EXTRACHARGE;
        System.out.println("Cost if all unconfirmed guest donot come: "+costNow);

        int costIfAllCome = (COMINGGUEST+guestNotSure)*CHAREGEPERGUEST;
        System.out.println("Cost if all unconfirmed guest come: "+costIfAllCome);
    } 
;
}