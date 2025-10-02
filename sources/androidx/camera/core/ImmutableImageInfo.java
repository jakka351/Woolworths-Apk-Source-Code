package androidx.camera.core;

import android.graphics.Matrix;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import com.google.auto.value.AutoValue;

@AutoValue
@RestrictTo
/* loaded from: classes2.dex */
public abstract class ImmutableImageInfo implements ImageInfo {
    public static ImageInfo d(TagBundle tagBundle, long j, int i, Matrix matrix) {
        return new AutoValue_ImmutableImageInfo(tagBundle, j, i, matrix);
    }

    @Override // androidx.camera.core.ImageInfo
    public final void b(ExifData.Builder builder) {
        builder.e(((AutoValue_ImmutableImageInfo) this).c);
    }

    public abstract Matrix e();
}
