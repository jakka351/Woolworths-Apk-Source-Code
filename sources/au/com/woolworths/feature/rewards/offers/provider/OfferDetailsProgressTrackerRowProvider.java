package au.com.woolworths.feature.rewards.offers.provider;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.foundation.rewards.offers.model.CircularProgressIndicator;
import au.com.woolworths.foundation.rewards.offers.model.CircularProgressRing;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsTrackerProgressRow;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsProgressTrackerRowProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerProgressRow;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsProgressTrackerRowProvider implements PreviewParameterProvider<OfferDetailsTrackerProgressRow> {

    /* renamed from: a, reason: collision with root package name */
    public static final OfferDetailsTrackerProgressRow f6390a;
    public static final OfferDetailsTrackerProgressRow b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsProgressTrackerRowProvider$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new CircularProgressIndicator(new CircularProgressRing(0.0d, "#00000000"));
        f6390a = new OfferDetailsTrackerProgressRow("$80.99", "left to spend", new CircularProgressIndicator(new CircularProgressRing(0.25d, "#126C34")));
        b = new OfferDetailsTrackerProgressRow("Spend completed!", "$80.00/$80.00", new CircularProgressIndicator(new CircularProgressRing(1.0d, "#126C34")));
        new CircularProgressIndicator(new CircularProgressRing(1.0d, "#126C34"));
        new CircularProgressIndicator(new CircularProgressRing(1.0d, "#126C34"));
        new CircularProgressIndicator(new CircularProgressRing(1.0d, "#126C34"));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
