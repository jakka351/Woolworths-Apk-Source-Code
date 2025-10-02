package com.woolworths.scanlibrary.di.module;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScanAndGoConfigKt {
    public static final String a(ScanAndGoConfig scanAndGoConfig, String encodedKey) {
        Intrinsics.h(scanAndGoConfig, "<this>");
        Intrinsics.h(encodedKey, "encodedKey");
        byte[] bArrDecode = Base64.decode(encodedKey, 2);
        Intrinsics.g(bArrDecode, "decode(...)");
        return new String(bArrDecode, Charsets.f24671a);
    }
}
