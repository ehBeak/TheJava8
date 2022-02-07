package ch16.practice;

public class MyPage {

    private InputBox input;

    public void setUI(InputBox input) {
        this.input = input;

        input.setListener(new KeyEventListener() {

            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        });
    }

    public void pressKey() {
        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP);
    }

    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI(new InputBox());
        myPage.pressKey();
    }
}
