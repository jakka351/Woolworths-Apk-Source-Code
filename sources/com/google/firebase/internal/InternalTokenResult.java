package com.google.firebase.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

@KeepForSdk
/* loaded from: classes6.dex */
public class InternalTokenResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f15631a;

    public InternalTokenResult(String str) {
        this.f15631a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InternalTokenResult) {
            return Objects.equal(this.f15631a, ((InternalTokenResult) obj).f15631a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f15631a);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("token", this.f15631a).toString();
    }
}
