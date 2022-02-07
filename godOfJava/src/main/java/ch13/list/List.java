package ch13.list;

public interface List {

    /*
     * 데이터 하나 추가
     * */
    public void add();

    /*
     * 특정 위치에 있는 값을 수정
     * */
    public void update(int index, Object value);

    /*
     * 특정 위치에 있는 값을 삭제
     * */
    public void remove(int index);

    /*
     * 크기 반환
     * */
    public int size();
}
