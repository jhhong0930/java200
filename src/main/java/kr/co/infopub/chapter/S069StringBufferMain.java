package kr.co.infopub.chapter;

// StringBuffer로 문자열 수정, 변경, 추가하기
public class S069StringBufferMain {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        // 1. 계속 붙이는 함수 mutable
        sb.append("안녕하세요.")
                .append("반가워요.")
                .append("또 만나요.");

        System.out.println(sb.toString() + sb.hashCode());

        // 2. replace(시작 인덱스, 끝 인덱스)
        sb.replace(0, 2, "나 보기가 역겨워");
        System.out.println(sb.toString() + sb.hashCode());

        // 3. reverse
        sb.reverse();
        System.out.println(sb.toString());

        // 4. delete(시작 인덱스, 끝 인덱스)
        sb.delete(10, 15);
        System.out.println(sb.toString());

        // 5. cal by reference, shallow copy(얕은 복사)
        replaces(sb);
        System.out.println(sb.toString());
    }

    public static void replaces(StringBuffer stringBuffer) {
        stringBuffer.reverse();
        stringBuffer.replace(0, 3, "Go Go");
    }

}
