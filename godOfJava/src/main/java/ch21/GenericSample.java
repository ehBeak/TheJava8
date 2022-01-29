package ch21;

public class GenericSample {

    public static void main(String[] args) {

        GenericSample genericSample = new GenericSample();
        genericSample.checkGenericDTO();

    }

    public void checkGenericDTO() {

        CastingGenericDTO<String> dto1 = new CastingGenericDTO<>();
        dto1.setObject(new String("String"));
        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<>();
        dto2.setObject(new StringBuffer("StringBuffer"));
        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<>();
        dto3.setObject(new StringBuilder("StringBuilder"));

        System.out.println(dto1.getObject());
        System.out.println(dto2.getObject());
        System.out.println(dto3.getObject());

    }
}
