package au.com.woolworths.foundation.rewards.common.ui.info;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/info/FeatureInfoBulletItemProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/rewards/base/info/FeatureInfoBulletItem;", "Companion", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FeatureInfoBulletItemProvider implements PreviewParameterProvider<FeatureInfoBulletItem> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/info/FeatureInfoBulletItemProvider$Companion;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new FeatureInfoBulletItem("FuelEmpty", "Get a card number in one tap", "Start collecting points now and finish your sign up later.");
        new FeatureInfoBulletItem("CoffeeEmpty", "Start saving with Member Pricing", "You’ll get instant access to exclusive Member Prices at Woolworths.");
        new FeatureInfoBulletItem("FuelEmpty", "Five days to sign up", "Your temporary card will expire five days after creation. Don’t worry! Finish signing and your points will carry over.");
        new FeatureInfoBulletItem("FuelEmpty", "Start scanning to collect points", "Start collecting points now and finish your sign up later.");
        new FeatureInfoBulletItem("CoffeeEmpty", "30 days to sign up", "Any points and rewards you have earned will carry over to your full account.");
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
