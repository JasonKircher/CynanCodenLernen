public class Bernd implements IBackfisch{
    private String name = "Bernd";

    public String getName() {
        return this.name;
    }

    @Override

    public boolean isEven(int integer) {
        return false;
    }

    @Override
    public String toString(){
        return this.name + " klaut Backfisch";
    }
}
