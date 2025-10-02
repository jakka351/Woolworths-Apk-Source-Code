package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.foundation.color.ContentColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class IconKt {
    public static final void a(Painter painter, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        Intrinsics.h(painter, "painter");
        composer.o(2111119372);
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 8) != 0) {
            j = ((Color) composer.x(ContentColorKt.f4780a)).f1766a;
        }
        androidx.compose.material3.IconKt.a(painter, str, modifier2, j, composer, i & 8190);
        composer.l();
    }

    public static final void b(ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        Intrinsics.h(imageVector, "imageVector");
        composer.o(-718563777);
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 8) != 0) {
            j = ((Color) composer.x(ContentColorKt.f4780a)).f1766a;
        }
        androidx.compose.material3.IconKt.b(imageVector, str, modifier2, j, composer, i & 8190, 0);
        composer.l();
    }
}
