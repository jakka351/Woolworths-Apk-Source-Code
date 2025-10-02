package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsSummaryCta;", "Lau/com/woolworths/feature/rewards/offers/data/RewardsSummaryContent;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsSummaryCta implements RewardsSummaryContent {

    /* renamed from: a, reason: collision with root package name */
    public final ContentCta f6295a;

    public RewardsSummaryCta(ContentCta contentCta) {
        this.f6295a = contentCta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsSummaryCta) && Intrinsics.c(this.f6295a, ((RewardsSummaryCta) obj).f6295a);
    }

    public final int hashCode() {
        return this.f6295a.hashCode();
    }

    public final String toString() {
        return "RewardsSummaryCta(contentCta=" + this.f6295a + ")";
    }
}
