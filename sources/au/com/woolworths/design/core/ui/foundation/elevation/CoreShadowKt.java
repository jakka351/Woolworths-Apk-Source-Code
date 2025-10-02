package au.com.woolworths.design.core.ui.foundation.elevation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreShadowKt {
    public static final Modifier a(Modifier modifier, CoreElevation elevation, Shape shape) {
        Intrinsics.h(modifier, "<this>");
        Intrinsics.h(elevation, "elevation");
        Intrinsics.h(shape, "shape");
        return ShadowKt.a(modifier, elevation.f4875a, shape, false, elevation.b, elevation.c, 4);
    }
}
