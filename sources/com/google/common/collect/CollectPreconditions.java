package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
final class CollectPreconditions {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(androidx.camera.core.impl.b.m(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(androidx.camera.core.impl.b.n(obj, "null value in entry: ", "=null"));
        }
    }

    public static void b(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void c(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i);
    }

    public static void d(boolean z) {
        Preconditions.q("no calls to next() since the last call to remove()", z);
    }
}
