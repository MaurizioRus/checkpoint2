class fork implements washable {

private int cleaniness;
    @Override
    public void onWash() {
        cleaniness +=20;
    }

    @Override
    public boolean isDirty() {
        return cleaniness <= 90;
    }

    public fork(int cleaniness){
        this.cleaniness = cleaniness;
    }
}
