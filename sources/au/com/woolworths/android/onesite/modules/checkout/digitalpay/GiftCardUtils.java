package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.models.checkout.NewGiftCardData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.GiftCardNumberStatus;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.GiftCardPinStatus;
import au.com.woolworths.android.onesite.utils.Strings;
import com.medallia.digital.mobilesdk.q2;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class GiftCardUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4285a = Pattern.compile("^\\d{1,18}$");
    public static final Pattern b = Pattern.compile("\\d{19}");
    public static final Pattern c = Pattern.compile("^\\d{1,3}$");
    public static final Pattern d = Pattern.compile("\\d{4}");

    public static String a(String str) {
        if (Strings.b(str)) {
            return str;
        }
        if (str.equals("$")) {
            return "";
        }
        String strReplaceFirst = str.replace("$", "").replaceFirst("^0+(?!$)", "");
        if (strReplaceFirst.equals("0")) {
            strReplaceFirst = "$0";
        } else if (strReplaceFirst.equals(".")) {
            strReplaceFirst = "$0".concat(strReplaceFirst);
        } else if (strReplaceFirst.contains(".") && strReplaceFirst.substring(strReplaceFirst.indexOf(".")).length() > 3) {
            strReplaceFirst = androidx.compose.ui.input.pointer.a.h(1, 0, strReplaceFirst);
        }
        if (strReplaceFirst.startsWith("$")) {
            return strReplaceFirst;
        }
        if (strReplaceFirst.startsWith(".")) {
            strReplaceFirst = "0".concat(strReplaceFirst);
        }
        return YU.a.A("$", strReplaceFirst);
    }

    public static GiftCardNumberStatus b(String str, String[] strArr, List list) {
        if (Strings.b(str)) {
            return GiftCardNumberStatus.d;
        }
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((NewGiftCardData) it.next()).getCardNumber().equals(str)) {
                    return GiftCardNumberStatus.k;
                }
            }
        }
        for (String str2 : strArr) {
            if (str.startsWith(str2) || str2.startsWith(str)) {
                return f4285a.matcher(str).matches() ? GiftCardNumberStatus.e : !b.matcher(str).matches() ? GiftCardNumberStatus.f : GiftCardNumberStatus.l;
            }
        }
        return GiftCardNumberStatus.g;
    }

    public static GiftCardPinStatus c(String str) {
        return Strings.b(str) ? GiftCardPinStatus.d : c.matcher(str).matches() ? GiftCardPinStatus.e : !d.matcher(str).matches() ? GiftCardPinStatus.h : GiftCardPinStatus.j;
    }

    public static String d(String str, String str2) {
        if (Strings.b(str) || Strings.b(str2)) {
            return "";
        }
        StringBuilder sbU = YU.a.u("Exp ", str2, q2.c);
        sbU.append(str.substring(2));
        return sbU.toString();
    }
}
