package com.scandit.datacapture.barcode;

/* loaded from: classes6.dex */
public final class G9 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17171a;

    public G9(boolean z) {
        this.f17171a = z;
    }

    public final boolean a() {
        return this.f17171a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G9) && this.f17171a == ((G9) obj).f17171a;
    }

    public final int hashCode() {
        boolean z = this.f17171a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return androidx.camera.core.impl.b.s(new StringBuilder("SetupData(isVisible="), this.f17171a, ')');
    }
}
