package com.airbnb.epoxy;

/* loaded from: classes4.dex */
public final class IdUtils {
    public static long a(CharSequence charSequence) {
        if (charSequence == null) {
            return 0L;
        }
        long jCharAt = -3750763034362895579L;
        for (int i = 0; i < charSequence.length(); i++) {
            jCharAt = (jCharAt ^ charSequence.charAt(i)) * 1099511628211L;
        }
        return jCharAt;
    }
}
