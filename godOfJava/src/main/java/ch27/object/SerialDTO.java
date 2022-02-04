package ch27.object;

import java.io.Serializable;

public class SerialDTO implements Serializable { // 저장하거나 서버로 넘겨주는 객체는 Serializable을 구현해야한다.
    // 구현 안하면 NotSerializableException 발생
    private String bookName;
    transient private int bookOrder;
    private boolean bestSeller;
    private long soldPerDay;

    // 변수 추가
    private String bookType = "IT";
    //==> Serializable 객체의 형태가 변형되면 serialVersionUID가 바뀌기 때문에 InvalidClassException 예외가 발생
    // => 이를 방지하기 위해 serialVersionUID를 지정한다.
    static final long serialVersionUID = 1L;

    public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
        super();
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bestSeller = bestSeller;
        this.soldPerDay = soldPerDay;
    }

    @Override
    public String toString() {
        return "SerialDTO{" +
                "bookName='" + bookName + '\'' +
                ", bookOrder=" + bookOrder +
                ", bestSeller=" + bestSeller +
                ", soldPerDay=" + soldPerDay +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
