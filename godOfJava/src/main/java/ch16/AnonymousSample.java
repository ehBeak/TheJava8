package ch16;

public class AnonymousSample {

    public static void main(String[] args) {
        AnonymousSample anonymousSample = new AnonymousSample();
        anonymousSample.setButtonListener();
    }

    public void setButtonListener() {
        MagicButton magicButton = new MagicButton();
        MagicButtonListener magicButtonListener = new MagicButtonListener(); // 리스너 전달을 위한 객체 생성
        magicButton.setEventListener(magicButtonListener);
        magicButton.onClickProcess();
    }

    public void setButtonListenerAnonymous() {
        MagicButton magicButton = new MagicButton();
        magicButton.setEventListener(new EventListener() { // 익명 객체- 재사용 불가(메모리에서 사라짐)
            @Override
            public void onClick() {
                System.out.println("AnonymousSample.onClick");
            }
        });
        magicButton.onClickProcess();
    }

    public void setButtonListenerAnonymousObject() {
        MagicButton magicButton = new MagicButton();
        EventListener eventListener = new EventListener() { // 익명객체 참조 - 재사용 가능
            @Override
            public void onClick() {
                System.out.println("AnonymousSample.onClickObject");
            }
        };

        magicButton.setEventListener(eventListener);
        magicButton.onClickProcess();
    }
}
