package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraChoosePlanItem;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EverydayExtraChoosePlanItem {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f9522a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraChoosePlanItem$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = SmallAppIconListItem.f9904a;
        int i2 = TitleTextItem.f9932a;
        int i3 = Spacer.f9906a;
        ObjectType objectType = EverydayExtraButton.f9517a;
        int i4 = EverydayExtraSubscribePlan.f9553a;
        f9522a = new UnionType("EverydayExtraChoosePlanItem");
    }
}
