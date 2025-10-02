package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutProductRow;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutProductRow {

    /* renamed from: a, reason: collision with root package name */
    public static final ObjectType f11234a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutProductRow$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ObjectType a() {
            return CheckoutProductRow.f11234a;
        }
    }

    static {
        ObjectType.Builder builder = new ObjectType.Builder("CheckoutProductRow");
        builder.b = CollectionsKt.Q(ProductRow.f11782a);
        f11234a = builder.a();
    }
}
