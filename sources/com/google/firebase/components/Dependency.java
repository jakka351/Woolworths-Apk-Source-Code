package com.google.firebase.components;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* loaded from: classes.dex */
public final class Dependency {

    /* renamed from: a, reason: collision with root package name */
    public final Qualified f15230a;
    public final int b;
    public final int c;

    public Dependency(int i, int i2, Class cls) {
        this(Qualified.a(cls), i, i2);
    }

    public static Dependency a(Class cls) {
        return new Dependency(0, 1, cls);
    }

    public static Dependency b(Qualified qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency c(Class cls) {
        return new Dependency(1, 0, cls);
    }

    public static Dependency d(Class cls) {
        return new Dependency(1, 1, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return this.f15230a.equals(dependency.f15230a) && this.b == dependency.b && this.c == dependency.c;
    }

    public final int hashCode() {
        return ((((this.f15230a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f15230a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = DevicePublicKeyStringDef.DIRECT;
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(YU.a.d(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return YU.a.o(sb, str, "}");
    }

    public Dependency(Qualified qualified, int i, int i2) {
        Preconditions.a(qualified, "Null dependency anInterface.");
        this.f15230a = qualified;
        this.b = i;
        this.c = i2;
    }
}
