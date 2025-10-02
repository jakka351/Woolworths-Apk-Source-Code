package com.apollographql.apollo.api.http.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class UrlEncodeKt {
    public static final String a(String str) {
        Intrinsics.h(str, "<this>");
        StringBuilder sb = new StringBuilder();
        for (byte b : StringsKt.u(str)) {
            int i = b & 255;
            if ((97 > i || i >= 123) && ((65 > i || i >= 91) && !((48 <= i && i < 58) || i == 45 || i == 46 || i == 95 || i == 126))) {
                CharsKt.b(16);
                String string = Integer.toString(i, 16);
                Intrinsics.g(string, "toString(...)");
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.g(upperCase, "toUpperCase(...)");
                if (upperCase.length() == 1) {
                    upperCase = "0".concat(upperCase);
                }
                sb.append("%" + upperCase);
            } else {
                sb.append((char) i);
            }
        }
        String string2 = sb.toString();
        Intrinsics.g(string2, "toString(...)");
        return string2;
    }
}
