package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.sequences.MergingSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/ui/OfferViewItemPairProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lkotlin/Pair;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferViewItem;", "offers-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferViewItemPairProvider implements PreviewParameterProvider<Pair<? extends OfferViewItem, ? extends OfferViewItem>> {
    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        Sequence values = new OfferViewItemProvider().getValues();
        return new MergingSequence(SequencesKt.e(values, 1), values, new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(21));
    }
}
