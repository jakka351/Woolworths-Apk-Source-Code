package com.woolworths.shop.cart;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.CartInfoQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/CartInfoQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/cart/CartInfoQuery$Data;", "Data", "CartInfo", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CartInfoQuery implements Query<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/CartInfoQuery$CartInfo;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f21525a;

        public CartInfo(int i) {
            this.f21525a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CartInfo) && this.f21525a == ((CartInfo) obj).f21525a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f21525a);
        }

        public final String toString() {
            return a.e(this.f21525a, "CartInfo(totalProductCount=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/CartInfoQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/CartInfoQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CartInfo f21526a;

        public Data(CartInfo cartInfo) {
            this.f21526a = cartInfo;
        }

        /* renamed from: a, reason: from getter */
        public final CartInfo getF21526a() {
            return this.f21526a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21526a, ((Data) obj).f21526a);
        }

        public final int hashCode() {
            CartInfo cartInfo = this.f21526a;
            if (cartInfo == null) {
                return 0;
            }
            return Integer.hashCode(cartInfo.f21525a);
        }

        public final String toString() {
            return "Data(cartInfo=" + this.f21526a + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CartInfoQuery_ResponseAdapter.Data.f21587a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CartInfo { cartInfo { totalProductCount } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == CartInfoQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(CartInfoQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "1e16155bda723519ef2f8038081009fd51913bb489e3f7d03066d39a8e6772c5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CartInfo";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
