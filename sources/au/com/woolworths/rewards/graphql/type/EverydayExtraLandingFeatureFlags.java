package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraLandingFeatureFlags;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EverydayExtraLandingFeatureFlags {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f9541a;

    public EverydayExtraLandingFeatureFlags(Optional.Present present) {
        this.f9541a = present;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EverydayExtraLandingFeatureFlags) && this.f9541a.equals(((EverydayExtraLandingFeatureFlags) obj).f9541a);
    }

    public final int hashCode() {
        return this.f9541a.hashCode();
    }

    public final String toString() {
        return "EverydayExtraLandingFeatureFlags(swop=" + this.f9541a + ")";
    }
}
