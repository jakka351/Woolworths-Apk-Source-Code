package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.VectorResources_androidKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.checkout.ui.components.compose.ComposableSingletons$CheckoutSummaryRowTileKt$lambda$-774506102$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CheckoutSummaryRowTileKt$lambda$774506102$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CheckoutSummaryRowTileKt.a("Title", "Subtitle", true, null, VectorResources_androidKt.b(R.drawable.ic_rewards_fill, 6, composer), null, new Color(CoreTheme.a(composer).b.f4775a.c), CoreTheme.e(composer).i.k, new Color(CoreTheme.b(composer).e.c.f4854a), CoreTheme.e(composer).e.n, composer, 438, 40);
        }
        return Unit.f24250a;
    }
}
