package com.study.designpattern.bridge;

public class DefaultChampion implements Champion {
    //핵심은 skin을 따로 분리하므로써 주입받아 여러가지 스킨을 갈아끼울 수 있도록했다.
    //이러면 KDAAriChampion라는 클래스를 만들지 않아도 될뿐더러
    //Party 스킨이 나올경우 PartyAriChampion을 또 만들지 않고 skin을 구현한 Party스킨을 만든뒤에 주입해주면된다.
    //고로 champion은 champion대로 계층을 만들어 쭉쭉 확장하고 Skin은 Skin대로 계층을 만들어 쭉쭉 확장가능하고 둘을 조합해주면 된다.
    //추상에 의존하기때문에 가능한것이며 추상을 구현한것을 주입하므로써 동적으로 조합가능하다
    //무엇인가 상태가 동적으로 바뀌어야한다면 필드로 가지거나 파라미터로 받는걸 생각하자
    // 즉 서로 다른 두개를 영역을 연결해주는것이다.(고로 서로 영향없이 확장 가능함,) 따라서 브릿지라고 불리는것

    private Skin skin;
    private String name;

    public DefaultChampion(String name, Skin skin) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(skin.getName() + name + "move");
    }

    @Override
    public void skillQ() {
        System.out.println(skin.getName() + name + "q");
    }

    @Override
    public void skillW() {
        System.out.println(skin.getName() + name + "w");
    }

    @Override
    public void skillE() {
        System.out.println(skin.getName() + name + "e");
    }

    @Override
    public void skillR() {
        System.out.println(skin.getName() + name + "r");
    }
}
