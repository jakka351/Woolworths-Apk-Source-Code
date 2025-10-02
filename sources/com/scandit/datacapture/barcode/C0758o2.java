package com.scandit.datacapture.barcode;

import android.graphics.drawable.Drawable;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.o2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0758o2 {

    /* renamed from: a, reason: collision with root package name */
    private final K8 f17867a;
    private final AbstractC0945z6 b;
    private final AbstractC0945z6 c;
    private final AbstractC0945z6 d;
    private final TrackedObject e;
    private final Drawable f;

    public C0758o2(K8 k8, AbstractC0945z6 drawData, C0669i9 c0669i9, C0669i9 boundingBoxData, TrackedObject trackedObject, Drawable drawable) {
        Intrinsics.h(drawData, "drawData");
        Intrinsics.h(boundingBoxData, "boundingBoxData");
        Intrinsics.h(trackedObject, "trackedObject");
        this.f17867a = k8;
        this.b = drawData;
        this.c = c0669i9;
        this.d = boundingBoxData;
        this.e = trackedObject;
        this.f = drawable;
    }

    public final AbstractC0945z6 a() {
        return this.d;
    }

    public final AbstractC0945z6 b() {
        return this.b;
    }

    public final Drawable c() {
        return this.f;
    }

    public final K8 d() {
        return this.f17867a;
    }

    public final AbstractC0945z6 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0758o2)) {
            return false;
        }
        C0758o2 c0758o2 = (C0758o2) obj;
        return Intrinsics.c(this.f17867a, c0758o2.f17867a) && Intrinsics.c(this.b, c0758o2.b) && Intrinsics.c(this.c, c0758o2.c) && Intrinsics.c(this.d, c0758o2.d) && Intrinsics.c(this.e, c0758o2.e) && Intrinsics.c(this.f, c0758o2.f);
    }

    public final TrackedObject f() {
        return this.e;
    }

    public final int hashCode() {
        K8 k8 = this.f17867a;
        int iHashCode = (this.b.hashCode() + ((k8 == null ? 0 : k8.hashCode()) * 31)) * 31;
        AbstractC0945z6 abstractC0945z6 = this.c;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (abstractC0945z6 == null ? 0 : abstractC0945z6.hashCode())) * 31)) * 31)) * 31;
        Drawable drawable = this.f;
        return iHashCode2 + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "BarcodePickBrushDrawData(paints=" + this.f17867a + ", drawData=" + this.b + ", tapData=" + this.c + ", boundingBoxData=" + this.d + ", trackedObject=" + this.e + ", imageDrawable=" + this.f + ')';
    }
}
