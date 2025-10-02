package au.com.woolworths.marketing.data;

import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.marketing.SwrveUserProperty;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/marketing/data/RewardLinkedSwrveUserProp;", "Lau/com/woolworths/marketing/SwrveUserProperty;", "marketing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardLinkedSwrveUserProp implements SwrveUserProperty {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9050a;

    public RewardLinkedSwrveUserProp(boolean z) {
        this.f9050a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardLinkedSwrveUserProp) && this.f9050a == ((RewardLinkedSwrveUserProp) obj).f9050a;
    }

    @Override // au.com.woolworths.marketing.SwrveUserProperty
    public final String getKey() {
        return "is_rewards_linked";
    }

    @Override // au.com.woolworths.marketing.SwrveUserProperty
    /* renamed from: getValue */
    public final String getF9051a() {
        return String.valueOf(this.f9050a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9050a);
    }

    public final String toString() {
        return a.n("RewardLinkedSwrveUserProp(rewardLinkStatus=", ")", this.f9050a);
    }
}
