package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelperV34;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ColorSpaceVerificationHelperV34 {
    public static final ColorSpace a(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        if (Intrinsics.c(colorSpace, ColorSpaces.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (Intrinsics.c(colorSpace, ColorSpaces.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
