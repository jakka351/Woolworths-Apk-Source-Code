package com.woolworths.scanlibrary.util.discount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiscountUtilKt {
    public static final String a(String name) {
        Intrinsics.h(name, "name");
        if (!name.equals("REWARDS SAVINGS")) {
            return name;
        }
        List listT = StringsKt.T(name, new String[]{" "}, 6);
        StringBuffer stringBuffer = new StringBuffer();
        List<String> list = listT;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (String str : list) {
            Intrinsics.h(str, "<this>");
            StringBuilder sb = new StringBuilder(str.length());
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            int length = lowerCase.length();
            char c = ' ';
            for (int i = 0; i < length; i++) {
                char cCharAt = lowerCase.charAt(i);
                sb.append((c != ' ' || 'a' > cCharAt || cCharAt >= '{') ? cCharAt : (char) (cCharAt - ' '));
                c = ('1' > cCharAt || cCharAt >= ':') ? cCharAt : ' ';
                if (cCharAt == '/') {
                    c = ' ';
                }
            }
            String string = sb.toString();
            Intrinsics.g(string, "toString(...)");
            arrayList.add(string);
        }
        CollectionsKt.L(arrayList, stringBuffer, " ", null, null, null, 124);
        String string2 = stringBuffer.toString();
        Intrinsics.g(string2, "toString(...)");
        return string2;
    }
}
