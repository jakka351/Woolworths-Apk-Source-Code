package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PersonalisedOffersPage;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PersonalisedOffersPage {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f9738a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PersonalisedOffersPage$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = AvailablePersonalisedOffers.f9431a;
        int i2 = BoostedPersonalisedOffers.f9442a;
        int i3 = EndedPersonalisedOffers.f9502a;
        f9738a = new UnionType("PersonalisedOffersPage");
    }
}
