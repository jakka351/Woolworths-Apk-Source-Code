package au.com.woolworths.android.onesite.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* loaded from: classes3.dex */
public class ProductInfoFormatter {

    /* renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f4598a;

    static {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locales.a());
        new DecimalFormat("$#0;-$#0", decimalFormatSymbols);
        f4598a = new DecimalFormat("$#,##0.00;-$#,##0.00", decimalFormatSymbols);
        new DecimalFormat("$#,##0;-$#,##0", decimalFormatSymbols);
        new DecimalFormat("#.##", decimalFormatSymbols);
    }

    public static String a(String str) {
        return !Strings.b(str) ? b(new BigDecimal(str.replaceAll("[$,]", ""))) : "";
    }

    public static String b(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            return f4598a.format(bigDecimal);
        }
        return null;
    }
}
