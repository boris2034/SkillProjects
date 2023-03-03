package Module5.vebinar2;

public class Phone {
    private String model;
    private String number;
    private Phone currentPhone;

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
        this.currentPhone = null;
    }

    public void call(Phone phone) {
        if (this.currentPhone == null && phone.getCurrentPhone() == null) {
            this.setCurrentPhone(phone);
            phone.setCurrentPhone(this);
            System.out.println("Calling to number " + phone.getNumber());
        } else if (phone.getCurrentPhone() != null ) {
            System.out.println("The subscriber is busy");
        } else {
            System.out.println("Your phone is busy");
        }
    }

    public void hangCall() {
        this.getCurrentPhone().setCurrentPhone(null);
        this.setCurrentPhone(null);
    }

    public void sendMessage(Phone phone, String message) {
        System.out.println("Sending message " + message + " to number " + phone.getNumber() );
    }

    public String getModel() {
        return model;
    }
    public String getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Phone getCurrentPhone() {
        return currentPhone;
    }

    public void setCurrentPhone(Phone currentPhone) {
        this.currentPhone = currentPhone;
    }
}
