package coil3.compose;

import android.content.Context;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import coil3.BitmapImage;
import coil3.DrawableImage;
import coil3.Image;
import coil3.Image_androidKt;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImagePainter_androidKt {
    public static final Painter a(Image image, Context context, int i) {
        return image instanceof BitmapImage ? BitmapPainterKt.a(new AndroidImageBitmap(((BitmapImage) image).f13038a), i) : image instanceof DrawableImage ? new DrawablePainter(Image_androidKt.a(image, context.getResources()).mutate()) : new ImagePainter(image);
    }
}
