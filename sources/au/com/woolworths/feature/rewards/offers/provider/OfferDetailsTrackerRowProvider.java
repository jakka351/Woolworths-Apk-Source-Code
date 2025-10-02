package au.com.woolworths.feature.rewards.offers.provider;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsTrackerRow;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsTrackerTrailingElement;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.LocalAssetIconName;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsTrackerRowProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerRow;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsTrackerRowProvider implements PreviewParameterProvider<OfferDetailsTrackerRow> {

    /* renamed from: a, reason: collision with root package name */
    public static final OfferDetailsTrackerRow f6392a;
    public static final OfferDetailsTrackerRow b;
    public static final OfferDetailsTrackerRow c;
    public static final OfferDetailsTrackerRow d;
    public static final OfferDetailsTrackerRow e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsTrackerRowProvider$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        LocalAssetIconName localAssetIconName = LocalAssetIconName.GREEN_TICK;
        f6392a = new OfferDetailsTrackerRow(new IconAsset.LocalAsset(localAssetIconName), "Week 0", new OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementLabel("Missed by $40.20"));
        b = new OfferDetailsTrackerRow(new IconAsset.LocalAsset(localAssetIconName), "Week 1", new OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementPoints("+", "2000 pts"));
        c = new OfferDetailsTrackerRow(new IconAsset.LocalAsset(localAssetIconName), "Week 2", new OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementLabel("Ends in **7 days**"));
        d = new OfferDetailsTrackerRow(new IconAsset.LocalAsset(localAssetIconName), "Week 3", new OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementLabel("Mon 15 Nov"));
        e = new OfferDetailsTrackerRow(new IconAsset.LocalAsset(localAssetIconName), "Week 4", new OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementLabel("Mon 22 Nov"));
        new IconAsset.LocalAsset(localAssetIconName);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
