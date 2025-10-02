package au.com.woolworths.product.composeui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductCardHorizontalUiKt$lambda$-1969146958$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductCardHorizontalUiKt$lambda$1969146958$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductCardHorizontalUiKt$lambda$1969146958$1 d = new ComposableSingletons$ProductCardHorizontalUiKt$lambda$1969146958$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCardHorizontalUiKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -30415377, 3), true, false, PaddingKt.f(Modifier.Companion.d, 16), false, true, false, null, false, false, false, false, false, false, null, null, null, null, composer, 200112, 0, 262096);
        }
        return Unit.f24250a;
    }
}
