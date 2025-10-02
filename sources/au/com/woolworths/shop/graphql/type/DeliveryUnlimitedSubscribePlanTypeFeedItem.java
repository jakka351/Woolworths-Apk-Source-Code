package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryUnlimitedSubscribePlanTypeFeedItem;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedSubscribePlanTypeFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11333a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryUnlimitedSubscribePlanTypeFeedItem$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ObjectType objectType = InsetBanner.f11509a;
        ObjectType objectType2 = DeliveryUnlimitedSubscribeFeature.f11326a;
        int i = DeliveryUnlimitedSubscribePlan.f11331a;
        int i2 = Spacer.f11925a;
        f11333a = new UnionType("DeliveryUnlimitedSubscribePlanTypeFeedItem");
    }
}
