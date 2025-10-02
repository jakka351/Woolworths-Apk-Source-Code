package com.scandit.datacapture.barcode;

/* loaded from: classes6.dex */
public final class L6 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17226a;

    public L6(boolean z) {
        this.f17226a = z;
    }

    public final boolean a() {
        return this.f17226a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L6) && this.f17226a == ((L6) obj).f17226a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.f17226a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 961) + 1;
    }

    public final String toString() {
        return YU.a.k(", shouldShowLabel=false, isLightBackground=true)", new StringBuilder("SetupData(isVisible="), this.f17226a);
    }
}
