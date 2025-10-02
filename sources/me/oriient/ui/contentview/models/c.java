package me.oriient.ui.contentview.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f26624a;
    private final Degrees b;
    private final PixelCoordinate c;
    private final float d;
    private final float e;
    private final PixelCoordinate f;

    public /* synthetic */ c(a aVar, Degrees degrees, PixelCoordinate pixelCoordinate, float f, float f2, PixelCoordinate pixelCoordinate2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, degrees, pixelCoordinate, f, f2, pixelCoordinate2);
    }

    public final PixelCoordinate a() {
        return this.c;
    }

    public final float b() {
        return this.e;
    }

    public final PixelCoordinate c() {
        return this.f;
    }

    public final Degrees d() {
        return this.b;
    }

    public final a e() {
        return this.f26624a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.c(this.f26624a, cVar.f26624a) && Intrinsics.c(this.b, cVar.b) && Intrinsics.c(this.c, cVar.c) && Pixel.m540equalsimpl0(this.d, cVar.d) && Pixel.m540equalsimpl0(this.e, cVar.e) && Intrinsics.c(this.f, cVar.f);
    }

    public final float f() {
        return this.d;
    }

    public int hashCode() {
        return this.f.hashCode() + ((Pixel.m541hashCodeimpl(this.e) + ((Pixel.m541hashCodeimpl(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f26624a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ViewFocusState(scale=" + this.f26624a + ", rotation=" + this.b + ", center=" + this.c + ", width=" + ((Object) Pixel.m548toStringimpl(this.d)) + ", height=" + ((Object) Pixel.m548toStringimpl(this.e)) + ", offset=" + this.f + ')';
    }

    private c(a scale, Degrees rotation, PixelCoordinate center, float f, float f2, PixelCoordinate offset) {
        Intrinsics.h(scale, "scale");
        Intrinsics.h(rotation, "rotation");
        Intrinsics.h(center, "center");
        Intrinsics.h(offset, "offset");
        this.f26624a = scale;
        this.b = rotation;
        this.c = center;
        this.d = f;
        this.e = f2;
        this.f = offset;
    }
}
