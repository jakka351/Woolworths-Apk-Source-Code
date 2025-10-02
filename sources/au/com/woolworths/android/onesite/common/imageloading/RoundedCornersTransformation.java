package au.com.woolworths.android.onesite.common.imageloading;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/common/imageloading/RoundedCornersTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "Companion", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoundedCornersTransformation extends BitmapTransformation {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/common/imageloading/RoundedCornersTransformation$Companion;", "", "", "ID", "Ljava/lang/String;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap b(BitmapPool pool, Bitmap toTransform, int i, int i2) {
        Intrinsics.h(pool, "pool");
        Intrinsics.h(toTransform, "toTransform");
        Bitmap bitmapB = TransformationUtils.b(pool, toTransform, i, i2);
        Bitmap bitmapF = pool.f(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.g(bitmapF, "get(...)");
        bitmapF.setHasAlpha(true);
        bitmapF.setDensity(bitmapB.getDensity());
        Canvas canvas = new Canvas(bitmapF);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapB, tileMode, tileMode));
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2);
        float f = 0;
        canvas.drawRoundRect(rectF, f, f, paint);
        return bitmapF;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof RoundedCornersTransformation;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return -62564202;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.h(messageDigest, "messageDigest");
        messageDigest.update((byte[]) null);
    }
}
