class Knife implements washable{
    private int cleaniness;
    private boolean broken;

    @Override
    public void onWash() {
        cleaniness += 20;

        if(Math.random() <= 0.3) broken = true;

    }

    @Override
    public boolean isDirty() {
        return cleaniness <=90 && !broken;
    }

    public Knife(int cleaniness , boolean broken ){
        this.cleaniness = cleaniness;
        this.broken = broken;
    }
}
