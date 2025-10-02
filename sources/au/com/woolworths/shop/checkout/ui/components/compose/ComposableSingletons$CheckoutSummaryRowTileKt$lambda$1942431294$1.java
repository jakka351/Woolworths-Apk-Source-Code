package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$CheckoutSummaryRowTileKt$lambda$1942431294$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CheckoutSummaryRowTileKt.a("Title", "Subtitle", false, null, CoreTheme.e(composer).g.U, new Color(CoreTheme.a(composer).f4774a.b.b), null, null, null, CoreTheme.e(composer).e.n, composer, 438, 456);
        }
        return Unit.f24250a;
    }
}
