package androidx.camera.core;

import android.media.ImageReader;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

@RestrictTo
/* loaded from: classes2.dex */
public final class ImageReaderProxys {
    public static ImageReaderProxy a(int i, int i2, int i3, int i4) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i, i2, i3, i4));
    }
}
