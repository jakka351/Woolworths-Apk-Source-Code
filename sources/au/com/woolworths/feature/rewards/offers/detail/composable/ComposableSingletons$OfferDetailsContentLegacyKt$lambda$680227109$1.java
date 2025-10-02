package au.com.woolworths.feature.rewards.offers.detail.composable;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$OfferDetailsContentLegacyKt$lambda$680227109$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$OfferDetailsContentLegacyKt$lambda$680227109$1 d = new ComposableSingletons$OfferDetailsContentLegacyKt$lambda$680227109$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            TextKt.b(StringResources_androidKt.c(composer, R.string.rewards_offer_terms_and_conditions), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer).o, composer, 0, 0, 65534);
        }
        return Unit.f24250a;
    }
}
