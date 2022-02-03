package ch26;

public class Chapter26 {
    public static void main(String[] args) {

    }

    /* I/O (JVM 기준)
     *  1. Input : 읽을 때
     *  2. Output : 파일을 쓰거나 외부로 전송할 때 */

    /* I/O -> NIO */

    /* File 클래스 : 파일 및 경로 정보를 통제하기 위한 클래스 */

    /* Files 클래스 */


    /* InputStream, OutputStream : 바이트를 읽고 쓴다. */
    /* InputStream
     *  1. Closeable : close라는 메소드만 선언되
     *  => 해당 리소스를 다른 클래스에서도 작업할 수 있도록 close()로 항상 닫아주기*/

    /* OutputStream
     *  1. Closeable 인터페이스
     *  2. Flushable 인터페이스 : flush라는 메소드 선언
     *  => 현재 버퍼에 있는 내용을 저장 */


    /* Reader, Writer char기반의 문자열을 처리한다.  */

    /* Reader : close(), read() */
    /* Writer
    *  1. Appendable : 문자열을 추가하기 위한 인터페이스 */

}
