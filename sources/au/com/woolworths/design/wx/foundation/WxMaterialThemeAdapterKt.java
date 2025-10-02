package au.com.woolworths.design.wx.foundation;

import androidx.compose.material.Colors;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WxMaterialThemeAdapterKt {
    public static final Colors a(ColorScheme colorScheme, Composer composer) {
        Intrinsics.h(colorScheme, "<this>");
        composer.o(1813606865);
        Colors colorsA = MaterialTheme.a(composer);
        long jH = colorScheme.h();
        long jI = colorScheme.i();
        long jH2 = colorScheme.h();
        long jI2 = colorScheme.i();
        long jA = colorScheme.a();
        Colors colorsA2 = Colors.a(colorsA, jH, jI, jH2, jI2, colorScheme.a(), jA, colorScheme.g(), colorScheme.e(), colorScheme.e(), colorScheme.f(), colorScheme.e(), 4608);
        composer.l();
        return colorsA2;
    }
}
