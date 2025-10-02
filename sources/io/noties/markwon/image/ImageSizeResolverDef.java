package io.noties.markwon.image;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.noties.markwon.image.ImageSize;

/* loaded from: classes7.dex */
public class ImageSizeResolverDef extends ImageSizeResolver {
    public static int b(ImageSize.Dimension dimension, float f) {
        dimension.getClass();
        boolean zEquals = "em".equals(null);
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (zEquals) {
            f2 = BitmapDescriptorFactory.HUE_RED * f;
        }
        return (int) (f2 + 0.5f);
    }

    @Override // io.noties.markwon.image.ImageSizeResolver
    public final Rect a(AsyncDrawable asyncDrawable) {
        ImageSize imageSize = asyncDrawable.c;
        Rect bounds = asyncDrawable.f.getBounds();
        int i = asyncDrawable.h;
        if (imageSize != null) {
            bounds.width();
            bounds.height();
            return bounds;
        }
        int iWidth = bounds.width();
        if (iWidth <= i) {
            return bounds;
        }
        return new Rect(0, 0, i, (int) ((bounds.height() / (iWidth / i)) + 0.5f));
    }
}
