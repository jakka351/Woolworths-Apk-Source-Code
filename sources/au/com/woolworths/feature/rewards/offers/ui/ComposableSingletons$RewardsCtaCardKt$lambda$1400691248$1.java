package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.rewards.offers.RewardsCtaCardViewItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$RewardsCtaCardKt$lambda$1400691248$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RewardsCtaCardViewItem rewardsCtaCardViewItem = new RewardsCtaCardViewItem("1", "View ended offers", "https://google.com/");
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            RewardsCtaCardKt.a(rewardsCtaCardViewItem, (Function0) objG, PaddingKt.f(Modifier.Companion.d, 16), composer, 432);
        }
        return Unit.f24250a;
    }
}
