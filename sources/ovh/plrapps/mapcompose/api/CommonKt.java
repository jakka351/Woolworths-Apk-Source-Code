package ovh.plrapps.mapcompose.api;

import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ovh.plrapps.mapcompose.ui.state.VisibleAreaPadding;
import ovh.plrapps.mapcompose.utils.RotationUtilsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CommonKt {
    public static final long a(VisibleAreaPadding visibleAreaPadding, float f) {
        Intrinsics.h(visibleAreaPadding, "<this>");
        float f2 = -(f * 0.017453292f);
        int i = visibleAreaPadding.f26959a;
        int i2 = visibleAreaPadding.c;
        int i3 = visibleAreaPadding.b;
        int i4 = visibleAreaPadding.d;
        return IntOffsetKt.a((int) RotationUtilsKt.c((i - i2) / 2.0d, (i3 - i4) / 2.0d, f2), (int) RotationUtilsKt.d((i - i2) / 2.0d, (i3 - i4) / 2.0d, f2));
    }
}
