package androidx.camera.core;

import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* loaded from: classes2.dex */
public interface ImageInfo {
    TagBundle a();

    void b(ExifData.Builder builder);

    int c();

    long getTimestamp();
}
