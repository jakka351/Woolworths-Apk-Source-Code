package au.com.woolworths.feature.rewards.offers.provider;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCardRow;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.LocalAssetIconName;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsInfoItemProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$OfferDetailsInfoItem;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsInfoItemProvider implements PreviewParameterProvider<OfferDetailsCardRow.OfferDetailsInfoItem> {

    /* renamed from: a, reason: collision with root package name */
    public static final OfferDetailsCardRow.OfferDetailsInfoItem f6389a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsInfoItemProvider$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        LocalAssetIconName localAssetIconName = LocalAssetIconName.INFO;
        f6389a = new OfferDetailsCardRow.OfferDetailsInfoItem(new IconAsset.LocalAsset(localAssetIconName), "Any online spend will show in the tracker after the order is fulfilled");
        new IconAsset.LocalAsset(localAssetIconName);
        new IconAsset.LocalAsset(localAssetIconName);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
