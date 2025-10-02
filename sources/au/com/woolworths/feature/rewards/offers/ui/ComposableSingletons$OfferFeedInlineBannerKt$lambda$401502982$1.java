package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.rewards.offers.ui.ComposableSingletons$OfferFeedInlineBannerKt$lambda$-401502982$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$OfferFeedInlineBannerKt$lambda$401502982$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OfferFeedInlineBannerKt$lambda$401502982$1 d = new ComposableSingletons$OfferFeedInlineBannerKt$lambda$401502982$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TextKt.b(StringResources_androidKt.c(composer, R.string.offer_feed_inline_banner_new), PaddingKt.g(Modifier.Companion.d, 5, 2), ToneColors.k, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 1, 0, null, TextStyle.a(WxTheme.b(composer).B, 0L, 0L, null, null, TextUnitKt.b(0.37d), 0L, null, null, 0, 16777087), composer, 48, 3072, 56824);
        }
        return Unit.f24250a;
    }
}
