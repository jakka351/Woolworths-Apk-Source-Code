package au.com.woolworths.android.onesite.common.imageloading;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/common/imageloading/RatioScaleTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RatioScaleTransformation extends BitmapTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final RatioScaleTransformation f4238a = new RatioScaleTransformation();
    public static final byte[] c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.g(charsetForName, "forName(...)");
        byte[] bytes = "com.wow.RatioScaleTransformation".getBytes(charsetForName);
        Intrinsics.g(bytes, "getBytes(...)");
        c = bytes;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap b(BitmapPool pool, Bitmap toTransform, int i, int i2) {
        Intrinsics.h(pool, "pool");
        Intrinsics.h(toTransform, "toTransform");
        return toTransform.getWidth() > toTransform.getHeight() ? TransformationUtils.b(pool, toTransform, i, i2) : TransformationUtils.c(pool, toTransform, i, i2);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return 2115208388;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.h(messageDigest, "messageDigest");
        messageDigest.update(c);
    }
}
