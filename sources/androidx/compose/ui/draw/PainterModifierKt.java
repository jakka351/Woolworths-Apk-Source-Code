package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PainterModifierKt {
    public static Modifier a(Modifier modifier, Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i) {
        if ((i & 4) != 0) {
            alignment = Alignment.Companion.e;
        }
        Alignment alignment2 = alignment;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return modifier.x0(new PainterElement(painter, alignment2, contentScale, f, colorFilter));
    }
}
