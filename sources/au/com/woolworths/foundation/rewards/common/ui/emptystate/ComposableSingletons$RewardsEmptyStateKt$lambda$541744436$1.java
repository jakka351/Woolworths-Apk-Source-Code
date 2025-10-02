package au.com.woolworths.foundation.rewards.common.ui.emptystate;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateSpec;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.LocalAssetIconName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$RewardsEmptyStateKt$lambda$541744436$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RewardsEmptyStateKt.a(RewardsEmptyStateSpec.Companion.a(new IconAsset.LocalAsset(LocalAssetIconName.REWARDS), "No recent activity", "Shop and scan your Everyday Rewards Card in-store or link your card to your online account to enjoy a little more everyday.\n\nLooking for older activity?", CoreTheme.e(composer).j.f, null, 226), null, null, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
