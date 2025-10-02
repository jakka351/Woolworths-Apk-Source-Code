package com.google.firebase.firestore;

import java.util.Arrays;

/* loaded from: classes6.dex */
public class VectorValue {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f15432a;

    public VectorValue(double[] dArr) {
        this.f15432a = (double[]) dArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f15432a, ((VectorValue) obj).f15432a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15432a);
    }
}
