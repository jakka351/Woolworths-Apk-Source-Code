package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class K7 implements L7 {

    /* renamed from: a, reason: collision with root package name */
    private final NativeHttpsResponse f18339a;

    public K7(NativeHttpsResponse response) {
        Intrinsics.h(response, "response");
        this.f18339a = response;
    }

    public final NativeHttpsResponse a() {
        return this.f18339a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K7) && Intrinsics.c(this.f18339a, ((K7) obj).f18339a);
    }

    public final int hashCode() {
        return this.f18339a.hashCode();
    }

    public final String toString() {
        return "Success(response=" + this.f18339a + ')';
    }
}
