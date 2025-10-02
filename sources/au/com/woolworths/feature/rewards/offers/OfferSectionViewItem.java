package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/OfferSectionViewItem;", "Lau/com/woolworths/feature/rewards/offers/SectionViewItem;", "Lau/com/woolworths/feature/rewards/offers/ProductSectionViewItem;", "Lau/com/woolworths/feature/rewards/offers/StandardSectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OfferSectionViewItem extends SectionViewItem {
    public final String b;

    public OfferSectionViewItem(String str) {
        super(str);
        this.b = str;
    }

    @Override // au.com.woolworths.feature.rewards.offers.SectionViewItem
    /* renamed from: a, reason: from getter */
    public String getB() {
        return this.b;
    }

    public ContentCta b() {
        return null;
    }
}
