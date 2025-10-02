package me.oriient.ui.contentview;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private int f26616a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public f(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f26616a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final int a() {
        return this.f;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.g;
    }

    public final int d() {
        return this.b;
    }

    public final void e(int i) {
        this.f26616a = i;
    }

    public final void f(int i) {
        this.c = i;
    }

    public final void g(int i) {
        this.e = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatData(totalContent=");
        sb.append(this.f26616a);
        sb.append(", shouldDraw=");
        sb.append(this.b);
        sb.append(", withImage=");
        sb.append(this.c);
        sb.append(", imageNotProvided=");
        sb.append(this.d);
        sb.append(", withoutImage=");
        sb.append(this.e);
        sb.append(", deferred=");
        sb.append(this.f);
        sb.append(", notLoaded=");
        return YU.a.l(sb, this.g, ')');
    }

    public final void a(int i) {
        this.f = i;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final void c(int i) {
        this.g = i;
    }

    public final void d(int i) {
        this.b = i;
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return this.e;
    }

    public final void g() {
        this.f26616a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public /* synthetic */ f(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }
}
