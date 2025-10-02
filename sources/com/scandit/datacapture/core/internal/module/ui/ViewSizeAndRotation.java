package com.scandit.datacapture.core.internal.module.ui;

/* loaded from: classes6.dex */
public final class ViewSizeAndRotation {

    /* renamed from: a, reason: collision with root package name */
    private final int f18616a;
    private final int b;
    private final int c;

    public ViewSizeAndRotation(int i, int i2, int i3) {
        this.f18616a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.f18616a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewSizeAndRotation)) {
            return false;
        }
        ViewSizeAndRotation viewSizeAndRotation = (ViewSizeAndRotation) obj;
        return this.f18616a == viewSizeAndRotation.f18616a && this.b == viewSizeAndRotation.b && this.c == viewSizeAndRotation.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f18616a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewSizeAndRotation(x=");
        sb.append(this.f18616a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", rotation=");
        return YU.a.l(sb, this.c, ')');
    }
}
