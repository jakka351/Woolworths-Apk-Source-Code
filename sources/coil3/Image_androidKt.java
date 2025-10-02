package coil3;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\n\u0010\u0003\"\u00020\u00022\u00020\u0002¨\u0006\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "Bitmap", "Landroid/graphics/Canvas;", "Canvas", "coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Image_androidKt {
    public static final Drawable a(Image image, Resources resources) {
        return image instanceof DrawableImage ? ((DrawableImage) image).getF13041a() : image instanceof BitmapImage ? new BitmapDrawable(resources, ((BitmapImage) image).f13038a) : new ImageDrawable(image);
    }

    public static final Image b(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new BitmapImage(((BitmapDrawable) drawable).getBitmap()) : new DrawableImage(drawable);
    }
}
