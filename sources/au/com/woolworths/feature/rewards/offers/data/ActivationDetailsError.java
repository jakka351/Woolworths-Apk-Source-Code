package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/ActivationDetailsError;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationDetails;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActivationDetailsError extends ActivationDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f6266a;

    public ActivationDetailsError(String str) {
        this.f6266a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActivationDetailsError) && Intrinsics.c(this.f6266a, ((ActivationDetailsError) obj).f6266a);
    }

    public final int hashCode() {
        return this.f6266a.hashCode();
    }

    public final String toString() {
        return a.h("ActivationDetailsError(errorMessage=", this.f6266a, ")");
    }
}
