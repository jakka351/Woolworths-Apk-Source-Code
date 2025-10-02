package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraSummaryItem;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EverydayExtraSummaryItem {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f9560a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraSummaryItem$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = TitleTextItem.f9932a;
        int i2 = Divider.f9498a;
        int i3 = EverydayExtraSelectedPlan.f9550a;
        int i4 = SubheadTextItem.f9916a;
        int i5 = ParagraphTextItem.f9724a;
        int i6 = CheckableTextItem.f9463a;
        int i7 = EverydayExtraWpayPayment.f9566a;
        int i8 = SmallAppIconListItem.f9904a;
        f9560a = new UnionType("EverydayExtraSummaryItem");
    }
}
