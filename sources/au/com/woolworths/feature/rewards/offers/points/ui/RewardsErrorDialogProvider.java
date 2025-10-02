package au.com.woolworths.feature.rewards.offers.points.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.data.RewardsErrorDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/ui/RewardsErrorDialogProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/offers/data/RewardsErrorDialog;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsErrorDialogProvider implements PreviewParameterProvider<RewardsErrorDialog> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/ui/RewardsErrorDialogProvider$Companion;", "", "Lau/com/woolworths/feature/rewards/offers/data/RewardsErrorDialog;", "autoBoost", "Lau/com/woolworths/feature/rewards/offers/data/RewardsErrorDialog;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new RewardsErrorDialog("We’re having trouble boosting your weekly offers", "Please wait a few moments before trying again. Alternatively, you can manually boost offers by tapping ‘boost all’.", new ContentCta("ok", (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null), new ContentCta("try again", (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
