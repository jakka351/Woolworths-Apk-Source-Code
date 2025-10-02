package com.cisco.or.sdk.utils;

import android.util.Patterns;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/utils/ValidateUtil;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ValidateUtil {
    public static boolean a(String email) {
        Intrinsics.h(email, "email");
        return email.length() != 0 && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
