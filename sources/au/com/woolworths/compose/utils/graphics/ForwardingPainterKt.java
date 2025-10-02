package au.com.woolworths.compose.utils.graphics;

import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.navigation.compose.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ForwardingPainterKt {

    /* renamed from: a, reason: collision with root package name */
    public static final h f4709a = new h(9, (byte) 0);

    public static Painter a(Painter painter, BlendModeColorFilter blendModeColorFilter, Function2 onDraw, int i) {
        if ((i & 4) != 0) {
            blendModeColorFilter = null;
        }
        if ((i & 8) != 0) {
            onDraw = f4709a;
        }
        Intrinsics.h(painter, "painter");
        Intrinsics.h(onDraw, "onDraw");
        return new ForwardingPainter(painter, blendModeColorFilter, onDraw);
    }
}
