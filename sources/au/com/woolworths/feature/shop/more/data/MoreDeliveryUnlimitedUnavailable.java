package au.com.woolworths.feature.shop.more.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreDeliveryUnlimitedUnavailable;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreDeliveryUnlimitedUnavailable {

    /* renamed from: a, reason: collision with root package name */
    public final ResText f7630a;

    public MoreDeliveryUnlimitedUnavailable(ResText resText) {
        this.f7630a = resText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoreDeliveryUnlimitedUnavailable) && this.f7630a.equals(((MoreDeliveryUnlimitedUnavailable) obj).f7630a);
    }

    public final int hashCode() {
        return this.f7630a.hashCode();
    }

    public final String toString() {
        return "MoreDeliveryUnlimitedUnavailable(title=" + this.f7630a + ")";
    }
}
