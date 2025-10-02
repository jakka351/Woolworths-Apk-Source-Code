package au.com.woolworths.sdui.common.corerow;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ImageUtilKt$toCoreRowImage$1 implements Function2<Composer, Integer, Color> {
    public static final ImageUtilKt$toCoreRowImage$1 d = new ImageUtilKt$toCoreRowImage$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.o(1145991006);
        long j = CoreTheme.b(composer).e.c.b;
        composer.l();
        return new Color(j);
    }
}
