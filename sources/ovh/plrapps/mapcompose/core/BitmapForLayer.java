package ovh.plrapps.mapcompose.core;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/core/BitmapForLayer;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class BitmapForLayer {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f26934a;
    public final Layer b;

    public BitmapForLayer(Bitmap bitmap, Layer layer) {
        Intrinsics.h(layer, "layer");
        this.f26934a = bitmap;
        this.b = layer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapForLayer)) {
            return false;
        }
        BitmapForLayer bitmapForLayer = (BitmapForLayer) obj;
        return Intrinsics.c(this.f26934a, bitmapForLayer.f26934a) && Intrinsics.c(this.b, bitmapForLayer.b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f26934a;
        if (bitmap != null) {
            bitmap.hashCode();
        }
        this.b.getClass();
        throw null;
    }

    public final String toString() {
        return "BitmapForLayer(bitmap=" + this.f26934a + ", layer=" + this.b + ")";
    }
}
