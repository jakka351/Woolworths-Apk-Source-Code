package com.woolworths.scanlibrary.util.extensions;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BigDecimalExtKt {
    public static final String a(BigDecimal bigDecimal) {
        Intrinsics.h(bigDecimal, "<this>");
        return NumberFormat.getCurrencyInstance(new Locale("en", "AU")).format(bigDecimal.doubleValue());
    }
}
