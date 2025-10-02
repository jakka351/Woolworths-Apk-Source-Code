package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class Visibility {

    /* renamed from: a, reason: collision with root package name */
    public final String f24347a;
    public final boolean b;

    public Visibility(String str, boolean z) {
        this.f24347a = str;
        this.b = z;
    }

    public Integer a(Visibility visibility) {
        Intrinsics.h(visibility, "visibility");
        return Visibilities.a(this, visibility);
    }

    public String b() {
        return this.f24347a;
    }

    public Visibility c() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
