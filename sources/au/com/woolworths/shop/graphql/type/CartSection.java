package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CartSection;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartSection {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11124a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CartSection$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = CartProductSection.f11118a;
        int i2 = CartPromotionSection.f11120a;
        int i3 = CartMarketProductSection.f11108a;
        ObjectType objectType = InlineMessage.f11507a;
        int i4 = ImageTextBanner.f11486a;
        int i5 = CartAvailableProductSection.f11101a;
        int i6 = CartBanner.f11102a;
        ObjectType objectType2 = CouponBanner.f11295a;
        f11124a = new UnionType("CartSection");
    }
}
