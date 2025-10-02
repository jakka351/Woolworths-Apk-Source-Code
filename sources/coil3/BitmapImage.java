package coil3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/BitmapImage;", "Lcoil3/Image;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitmapImage implements Image {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f13038a;

    public BitmapImage(Bitmap bitmap) {
        this.f13038a = bitmap;
    }

    @Override // coil3.Image
    public final boolean a() {
        return true;
    }

    @Override // coil3.Image
    public final void b(Canvas canvas) {
        canvas.drawBitmap(this.f13038a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitmapImage) && Intrinsics.c(this.f13038a, ((BitmapImage) obj).f13038a);
    }

    @Override // coil3.Image
    public final int getHeight() {
        return this.f13038a.getHeight();
    }

    @Override // coil3.Image
    public final long getSize() {
        int allocationByteCount;
        Bitmap bitmap = this.f13038a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                allocationByteCount = (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4) * height;
            }
            return allocationByteCount;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    @Override // coil3.Image
    public final int getWidth() {
        return this.f13038a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f13038a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f13038a + ", shareable=true)";
    }
}
