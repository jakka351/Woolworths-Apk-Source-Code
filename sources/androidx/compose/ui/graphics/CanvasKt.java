package androidx.compose.ui.graphics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CanvasKt {
    public static final AndroidCanvas a(AndroidImageBitmap androidImageBitmap) {
        android.graphics.Canvas canvas = AndroidCanvas_androidKt.f1756a;
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.f1755a = new android.graphics.Canvas(AndroidImageBitmap_androidKt.a(androidImageBitmap));
        return androidCanvas;
    }
}
