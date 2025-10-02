package au.com.woolworths.foundation.rewards.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.rewards.cart.adapter.CartInfoQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/CartInfoQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/foundation/rewards/cart/CartInfoQuery$Data;", "Data", "CartInfo", "Companion", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CartInfoQuery implements Query<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/CartInfoQuery$CartInfo;", "", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class CartInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f8546a;
        public final String b;

        public CartInfo(int i, String str) {
            this.f8546a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartInfo)) {
                return false;
            }
            CartInfo cartInfo = (CartInfo) obj;
            return this.f8546a == cartInfo.f8546a && Intrinsics.c(this.b, cartInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.f8546a) * 31);
        }

        public final String toString() {
            return "CartInfo(totalQuantity=" + this.f8546a + ", altText=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/CartInfoQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/CartInfoQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CartInfo f8547a;

        public Data(CartInfo cartInfo) {
            this.f8547a = cartInfo;
        }

        /* renamed from: a, reason: from getter */
        public final CartInfo getF8547a() {
            return this.f8547a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8547a, ((Data) obj).f8547a);
        }

        public final int hashCode() {
            CartInfo cartInfo = this.f8547a;
            if (cartInfo == null) {
                return 0;
            }
            return cartInfo.hashCode();
        }

        public final String toString() {
            return "Data(cartInfo=" + this.f8547a + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CartInfoQuery_ResponseAdapter.Data.f8549a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CartInfo { cartInfo { totalQuantity altText } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == CartInfoQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(CartInfoQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "6b18b8954c8f8bf0b4bf1aca7dbd67a865348e3b0624b32bfbdc62f415848d99";
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
