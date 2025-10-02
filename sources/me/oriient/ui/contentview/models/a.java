package me.oriient.ui.contentview.models;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.utils.ExtensionsKt;

/* loaded from: classes8.dex */
public final class a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final float f26623a;

    public a(float f) {
        this.f26623a = f;
    }

    public final float a() {
        return this.f26623a;
    }

    public final a b(a other) {
        Intrinsics.h(other, "other");
        return ExtensionsKt.getX(this.f26623a * other.f26623a);
    }

    public String toString() {
        return android.support.v4.media.session.a.r(new StringBuilder("Scale(value="), this.f26623a, ')');
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        Intrinsics.h(other, "other");
        return Float.compare(this.f26623a, other.f26623a);
    }
}
