package Algorithym_And_Structure.Stack;

import javax.lang.model.element.NestingKind;

public class NhiPhan {
    static  public StringBuffer tinhNhiPhan(int intput){
        ArrayStack<String> stack = new ArrayStack<>();
        StringBuffer rs = new StringBuffer();
        while(intput!=0){
            rs.append(intput % 2);
            intput = intput / 2;
        }
        return rs;
    }
}
