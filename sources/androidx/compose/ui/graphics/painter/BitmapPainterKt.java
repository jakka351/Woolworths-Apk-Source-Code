package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BitmapPainterKt {
    public static BitmapPainter a(ImageBitmap imageBitmap, int i) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, (imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32));
        bitmapPainter.k = i;
        return bitmapPainter;
    }
}
