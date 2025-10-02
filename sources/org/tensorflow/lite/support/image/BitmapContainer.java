package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* loaded from: classes8.dex */
final class BitmapContainer implements ImageContainer {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f26920a;

    public BitmapContainer(Bitmap bitmap) {
        SupportPreconditions.b(bitmap, "Cannot load null bitmap.");
        SupportPreconditions.a("Only supports loading ARGB_8888 bitmaps.", bitmap.getConfig().equals(Bitmap.Config.ARGB_8888));
        this.f26920a = bitmap;
    }

    public final Object clone() {
        Bitmap bitmap = this.f26920a;
        return new BitmapContainer(bitmap.copy(bitmap.getConfig(), bitmap.isMutable()));
    }
}
