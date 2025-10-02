package au.com.woolworths.shop.product.availability;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.StoresForProductInput;
import au.com.woolworths.shop.graphql.type.adapter.StoresForProductInput_InputAdapter;
import au.com.woolworths.shop.product.availability.adapter.CheckNearbyStoresForProductQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Data;", "Data", "CheckNearbyStoresForProduct", "Store", "Address", "Geo", "Companion", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckNearbyStoresForProductQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final StoresForProductInput f12537a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Address;", "", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Address {

        /* renamed from: a, reason: collision with root package name */
        public final String f12538a;

        public Address(String str) {
            this.f12538a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Address) && Intrinsics.c(this.f12538a, ((Address) obj).f12538a);
        }

        public final int hashCode() {
            return this.f12538a.hashCode();
        }

        public final String toString() {
            return a.h("Address(line1=", this.f12538a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$CheckNearbyStoresForProduct;", "", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckNearbyStoresForProduct {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12539a;

        public CheckNearbyStoresForProduct(ArrayList arrayList) {
            this.f12539a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckNearbyStoresForProduct) && this.f12539a.equals(((CheckNearbyStoresForProduct) obj).f12539a);
        }

        public final int hashCode() {
            return this.f12539a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("CheckNearbyStoresForProduct(stores=", ")", this.f12539a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CheckNearbyStoresForProduct f12540a;

        public Data(CheckNearbyStoresForProduct checkNearbyStoresForProduct) {
            this.f12540a = checkNearbyStoresForProduct;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12540a, ((Data) obj).f12540a);
        }

        public final int hashCode() {
            CheckNearbyStoresForProduct checkNearbyStoresForProduct = this.f12540a;
            if (checkNearbyStoresForProduct == null) {
                return 0;
            }
            return checkNearbyStoresForProduct.f12539a.hashCode();
        }

        public final String toString() {
            return "Data(checkNearbyStoresForProduct=" + this.f12540a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Geo;", "", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Geo {

        /* renamed from: a, reason: collision with root package name */
        public final Double f12541a;

        public Geo(Double d) {
            this.f12541a = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Geo) && Intrinsics.c(this.f12541a, ((Geo) obj).f12541a);
        }

        public final int hashCode() {
            Double d = this.f12541a;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        public final String toString() {
            return "Geo(distance=" + this.f12541a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Store;", "", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Store {

        /* renamed from: a, reason: collision with root package name */
        public final String f12542a;
        public final String b;
        public final Address c;
        public final Geo d;
        public final boolean e;

        public Store(String str, String str2, Address address, Geo geo, boolean z) {
            this.f12542a = str;
            this.b = str2;
            this.c = address;
            this.d = geo;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Store)) {
                return false;
            }
            Store store = (Store) obj;
            return Intrinsics.c(this.f12542a, store.f12542a) && Intrinsics.c(this.b, store.b) && Intrinsics.c(this.c, store.c) && Intrinsics.c(this.d, store.d) && this.e == store.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + b.c(b.c(this.f12542a.hashCode() * 31, 31, this.b), 31, this.c.f12538a)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Store(storeId=", this.f12542a, ", name=", this.b, ", address=");
            sbV.append(this.c);
            sbV.append(", geo=");
            sbV.append(this.d);
            sbV.append(", isProductAvailable=");
            return a.k(")", sbV, this.e);
        }
    }

    public CheckNearbyStoresForProductQuery(StoresForProductInput storesForProductInput) {
        this.f12537a = storesForProductInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CheckNearbyStoresForProductQuery_ResponseAdapter.Data.f12545a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query checkNearbyStoresForProduct($storesForProductInput: StoresForProductInput!) { checkNearbyStoresForProduct(storesForProductInput: $storesForProductInput) { stores { storeId name address { line1 } geo { distance } isProductAvailable } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckNearbyStoresForProductQuery) && Intrinsics.c(this.f12537a, ((CheckNearbyStoresForProductQuery) obj).f12537a);
    }

    public final int hashCode() {
        return this.f12537a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "add360bbabb9ad29165e2b7877ec3359f6695ee371aeb1ecd72e438e8bda55d7";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "checkNearbyStoresForProduct";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("storesForProductInput");
        Adapters.c(StoresForProductInput_InputAdapter.f12121a, false).toJson(jsonWriter, customScalarAdapters, this.f12537a);
    }

    public final String toString() {
        return "CheckNearbyStoresForProductQuery(storesForProductInput=" + this.f12537a + ")";
    }
}
