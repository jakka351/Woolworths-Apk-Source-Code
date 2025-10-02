package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Verify {
    public static void a(String str, Object obj, boolean z) {
        if (!z) {
            throw new VerifyException(Strings.b(str, obj));
        }
    }
}
