package com.woolworths.scanlibrary.util.extensions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DateExtKt {
    public static final String a(String str, Date date) {
        Intrinsics.h(date, "<this>");
        String str2 = new SimpleDateFormat(str, Locale.US).format(date);
        Intrinsics.g(str2, "format(...)");
        return str2;
    }
}
