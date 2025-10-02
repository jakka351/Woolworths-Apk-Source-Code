package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PropertiesConventionUtilKt {
    public static Name a(Name name, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!name.e) {
            String strC = name.c();
            if (StringsKt.W(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return Name.e(str2.concat(StringsKt.L(str, strC)));
                }
                if (!z) {
                    return name;
                }
                String strL = StringsKt.L(str, strC);
                if (strL.length() != 0 && CapitalizeDecapitalizeKt.b(0, strL)) {
                    if (strL.length() != 1 && CapitalizeDecapitalizeKt.b(1, strL)) {
                        IntProgressionIterator it = new IntRange(0, strL.length() - 1, 1).iterator();
                        while (true) {
                            if (!it.f) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (!CapitalizeDecapitalizeKt.b(((Number) next).intValue(), strL)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strL.substring(0, iIntValue);
                            Intrinsics.g(strSubstring, "substring(...)");
                            String strC2 = CapitalizeDecapitalizeKt.c(strSubstring);
                            String strSubstring2 = strL.substring(iIntValue);
                            Intrinsics.g(strSubstring2, "substring(...)");
                            strL = strC2.concat(strSubstring2);
                        } else {
                            strL = CapitalizeDecapitalizeKt.c(strL);
                        }
                    } else if (strL.length() != 0 && 'A' <= (cCharAt2 = strL.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strL.substring(1);
                        Intrinsics.g(strSubstring3, "substring(...)");
                        strL = lowerCase + strSubstring3;
                    }
                }
                if (Name.f(strL)) {
                    return Name.e(strL);
                }
            }
        }
        return null;
    }
}
