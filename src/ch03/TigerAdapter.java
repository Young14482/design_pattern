package ch03;

// OuterTiger와 Cat,Mouse 등과의 이질적인 것을 동일하게 맞추는 역할
public class TigerAdapter extends Animal{
    private  OuterTiger outerTiger;

    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    @Override
    public String getName() {
        return outerTiger.getFullname();
    }
}
