package au.com.woolworths.foundation.rewards.cart.update.data;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.foundation.rewards.cart.update.data.adapter.UpdateCartQuantitiesMutation_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.UpdateCartQuantitiesPageInput;
import au.com.woolworths.rewards.graphql.type.adapter.UpdateCartQuantitiesPageInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$Data;", "Data", "UpdateCartQuantitiesPage", "UpdateCartQuantitiesPage1", "UpdatedCartQuantity", "Companion", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateCartQuantitiesMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final UpdateCartQuantitiesPageInput f8557a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateCartQuantitiesPage f8558a;

        public Data(UpdateCartQuantitiesPage updateCartQuantitiesPage) {
            this.f8558a = updateCartQuantitiesPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8558a, ((Data) obj).f8558a);
        }

        public final int hashCode() {
            return this.f8558a.hashCode();
        }

        public final String toString() {
            return "Data(updateCartQuantitiesPage=" + this.f8558a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$UpdateCartQuantitiesPage;", "", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateCartQuantitiesPage {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateCartQuantitiesPage1 f8559a;

        public UpdateCartQuantitiesPage(UpdateCartQuantitiesPage1 updateCartQuantitiesPage1) {
            this.f8559a = updateCartQuantitiesPage1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCartQuantitiesPage) && Intrinsics.c(this.f8559a, ((UpdateCartQuantitiesPage) obj).f8559a);
        }

        public final int hashCode() {
            UpdateCartQuantitiesPage1 updateCartQuantitiesPage1 = this.f8559a;
            if (updateCartQuantitiesPage1 == null) {
                return 0;
            }
            return updateCartQuantitiesPage1.hashCode();
        }

        public final String toString() {
            return "UpdateCartQuantitiesPage(updateCartQuantitiesPage=" + this.f8559a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$UpdateCartQuantitiesPage1;", "", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateCartQuantitiesPage1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f8560a;
        public final List b;
        public final int c;
        public final String d;
        public final Object e;

        public UpdateCartQuantitiesPage1(int i, List list, int i2, String str, Object obj) {
            this.f8560a = i;
            this.b = list;
            this.c = i2;
            this.d = str;
            this.e = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateCartQuantitiesPage1)) {
                return false;
            }
            UpdateCartQuantitiesPage1 updateCartQuantitiesPage1 = (UpdateCartQuantitiesPage1) obj;
            return this.f8560a == updateCartQuantitiesPage1.f8560a && Intrinsics.c(this.b, updateCartQuantitiesPage1.b) && this.c == updateCartQuantitiesPage1.c && Intrinsics.c(this.d, updateCartQuantitiesPage1.d) && Intrinsics.c(this.e, updateCartQuantitiesPage1.e);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f8560a) * 31;
            List list = this.b;
            return this.e.hashCode() + b.c(b.a(this.c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateCartQuantitiesPage1(productCount=");
            sb.append(this.f8560a);
            sb.append(", updatedCartQuantities=");
            sb.append(this.b);
            sb.append(", totalProductCount=");
            a.u(this.c, ", totalProductCountAltText=", this.d, ", totalPrice=", sb);
            return android.support.v4.media.session.a.o(this.e, ")", sb);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$UpdatedCartQuantity;", "", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatedCartQuantity {

        /* renamed from: a, reason: collision with root package name */
        public final String f8561a;
        public final int b;
        public final boolean c;

        public UpdatedCartQuantity(String str, int i, boolean z) {
            this.f8561a = str;
            this.b = i;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatedCartQuantity)) {
                return false;
            }
            UpdatedCartQuantity updatedCartQuantity = (UpdatedCartQuantity) obj;
            return Intrinsics.c(this.f8561a, updatedCartQuantity.f8561a) && this.b == updatedCartQuantity.b && this.c == updatedCartQuantity.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.a(this.b, this.f8561a.hashCode() * 31, 31);
        }

        public final String toString() {
            return YU.a.k(")", b.u("UpdatedCartQuantity(productId=", this.b, this.f8561a, ", updatedQuantity=", ", success="), this.c);
        }
    }

    public UpdateCartQuantitiesMutation(UpdateCartQuantitiesPageInput updateCartQuantitiesPageInput) {
        this.f8557a = updateCartQuantitiesPageInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateCartQuantitiesMutation_ResponseAdapter.Data.f8562a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateCartQuantities($input: UpdateCartQuantitiesPageInput!) { updateCartQuantitiesPage(input: $input) { updateCartQuantitiesPage { productCount updatedCartQuantities { productId updatedQuantity success } totalProductCount totalProductCountAltText totalPrice } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCartQuantitiesMutation) && Intrinsics.c(this.f8557a, ((UpdateCartQuantitiesMutation) obj).f8557a);
    }

    public final int hashCode() {
        return this.f8557a.f9935a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "32b5d2cf0ae9676c9983e41763a73e38834728d5c354947e4faf73ce21dab194";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateCartQuantities";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(UpdateCartQuantitiesPageInput_InputAdapter.f9964a, false).toJson(jsonWriter, customScalarAdapters, this.f8557a);
    }

    public final String toString() {
        return "UpdateCartQuantitiesMutation(input=" + this.f8557a + ")";
    }
}
