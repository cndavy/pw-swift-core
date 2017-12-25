package han;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by han on 2017/12/22.
 */
public class RegUtils {
    public static final String STR = "\"账号\",\"账户名称\",\"交易时间\",\"借方发生额（支取）\",\"贷方发生额（收入）\",\"余额\",\"币种\",\"对方户名\",\"对方账号\",\"对方开户机构\",\"记账日期\",\"摘要\",\"备注\",\"账户明细编号-交易流水号\",\"企业流水号\",\"凭证种类\",\"凭证号\",\"个性化信息名称1\",\"个性化信息名称2\",\"个性化信息名称3\",\"个性化信息名称4\",\"个性化信息名称5\",\"个性化信息名称6\",\"个性化信息名称7\",\"个性化信息名称8\",\"个性化信息名称9\",\"个性化信息名称10\",\"个性化信息1\",\"个性化信息2\",\"个性化信息3\",\"个性化信息4\",\"个性化信息5\",\"个性化信息6\",\"个性化信息7\",\"个性化信息8\",\"个性化信息9\",\"个性化信息10\"\n";
    private static RegUtils ourInstance = new RegUtils();

    public static RegUtils getInstance() {
        return ourInstance;
    }
    private final String Reg20="\\G(?:^|,)(?:\"([^\"]*+(?:\"\"[^\"]*+)*+)\"|([^\",]*+))";
    private final Pattern  P20= Pattern.compile(Reg20);
    private final String Reg25="";
    private final Pattern  P25= Pattern.compile(Reg25);
    private final String Reg28C="";
    private final Pattern  P28C= Pattern.compile(Reg28C);
    private final String Reg60F="";
    private final Pattern  P60F= Pattern.compile(Reg60F);
    private final String Reg61="";
    private final Pattern  P61= Pattern.compile(Reg61);
    private final String Reg86="";
    private final Pattern  P86= Pattern.compile(Reg86);
    private final String Reg62F="";
    private final Pattern  P62F= Pattern.compile(Reg62F);

    private RegUtils() {

    }
    public Matcher match20(String str){
        return   P20.matcher(str);
    }
    public Matcher match25(String str){
        return   P25.matcher(str);
    }
    public Matcher match28C(String str){
        return   P28C.matcher(str);
    }
    public Matcher match60F(String str){
        return   P60F.matcher(str);
    }
    public Matcher match61(String str){
        return   P61.matcher(str);
    }
    public Matcher match86(String str){
        return   P86.matcher(str);
    }
    public Matcher match62F(String str){
        return   P62F.matcher(str);
    }
    public static void  main(String[] args){
        RegUtils reg= RegUtils.getInstance();
        Matcher m=reg.match20(STR);
        System.out.print(m.group());
    }
}
