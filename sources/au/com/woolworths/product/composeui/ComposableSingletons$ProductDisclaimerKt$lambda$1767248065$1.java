package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductDisclaimerKt$lambda$-1767248065$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductDisclaimerKt$lambda$1767248065$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductDisclaimerKt$lambda$1767248065$1 d = new ComposableSingletons$ProductDisclaimerKt$lambda$1767248065$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductDisclaimerKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3).getDisclaimer(), null, 0, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
