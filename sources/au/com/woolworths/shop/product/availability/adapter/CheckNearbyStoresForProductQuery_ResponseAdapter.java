package au.com.woolworths.shop.product.availability.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.product.availability.CheckNearbyStoresForProductQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/product/availability/adapter/CheckNearbyStoresForProductQuery_ResponseAdapter;", "", "Data", "CheckNearbyStoresForProduct", "Store", "Address", "Geo", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckNearbyStoresForProductQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/availability/adapter/CheckNearbyStoresForProductQuery_ResponseAdapter$Address;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Address;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Address implements Adapter<CheckNearbyStoresForProductQuery.Address> {

        /* renamed from: a, reason: collision with root package name */
        public static final Address f12543a = new Address();
        public static final List b = CollectionsKt.Q("line1");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CheckNearbyStoresForProductQuery.Address(str);
            }
            Assertions.a(reader, "line1");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckNearbyStoresForProductQuery.Address value = (CheckNearbyStoresForProductQuery.Address) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("line1");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12538a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/availability/adapter/CheckNearbyStoresForProductQuery_ResponseAdapter$CheckNearbyStoresForProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$CheckNearbyStoresForProduct;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckNearbyStoresForProduct implements Adapter<CheckNearbyStoresForProductQuery.CheckNearbyStoresForProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final CheckNearbyStoresForProduct f12544a = new CheckNearbyStoresForProduct();
        public static final List b = CollectionsKt.Q("stores");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Store.f12547a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new CheckNearbyStoresForProductQuery.CheckNearbyStoresForProduct(arrayListFromJson);
            }
            Assertions.a(reader, "stores");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckNearbyStoresForProductQuery.CheckNearbyStoresForProduct value = (CheckNearbyStoresForProductQuery.CheckNearbyStoresForProduct) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("stores");
            Adapters.a(Adapters.c(Store.f12547a, false)).toJson(writer, customScalarAdapters, value.f12539a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/availability/adapter/CheckNearbyStoresForProductQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Data;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CheckNearbyStoresForProductQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12545a = new Data();
        public static final List b = CollectionsKt.Q("checkNearbyStoresForProduct");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CheckNearbyStoresForProductQuery.CheckNearbyStoresForProduct checkNearbyStoresForProduct = null;
            while (reader.o2(b) == 0) {
                checkNearbyStoresForProduct = (CheckNearbyStoresForProductQuery.CheckNearbyStoresForProduct) Adapters.b(Adapters.c(CheckNearbyStoresForProduct.f12544a, false)).fromJson(reader, customScalarAdapters);
            }
            return new CheckNearbyStoresForProductQuery.Data(checkNearbyStoresForProduct);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckNearbyStoresForProductQuery.Data value = (CheckNearbyStoresForProductQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("checkNearbyStoresForProduct");
            Adapters.b(Adapters.c(CheckNearbyStoresForProduct.f12544a, false)).toJson(writer, customScalarAdapters, value.f12540a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/availability/adapter/CheckNearbyStoresForProductQuery_ResponseAdapter$Geo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Geo;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Geo implements Adapter<CheckNearbyStoresForProductQuery.Geo> {

        /* renamed from: a, reason: collision with root package name */
        public static final Geo f12546a = new Geo();
        public static final List b = CollectionsKt.Q("distance");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            while (reader.o2(b) == 0) {
                d = (Double) Adapters.j.fromJson(reader, customScalarAdapters);
            }
            return new CheckNearbyStoresForProductQuery.Geo(d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckNearbyStoresForProductQuery.Geo value = (CheckNearbyStoresForProductQuery.Geo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("distance");
            Adapters.j.toJson(writer, customScalarAdapters, value.f12541a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/availability/adapter/CheckNearbyStoresForProductQuery_ResponseAdapter$Store;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/product/availability/CheckNearbyStoresForProductQuery$Store;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Store implements Adapter<CheckNearbyStoresForProductQuery.Store> {

        /* renamed from: a, reason: collision with root package name */
        public static final Store f12547a = new Store();
        public static final List b = CollectionsKt.R("storeId", AppMeasurementSdk.ConditionalUserProperty.NAME, "address", "geo", "isProductAvailable");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            CheckNearbyStoresForProductQuery.Address address = null;
            CheckNearbyStoresForProductQuery.Geo geo = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    address = (CheckNearbyStoresForProductQuery.Address) Adapters.c(Address.f12543a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    geo = (CheckNearbyStoresForProductQuery.Geo) Adapters.c(Geo.f12546a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "storeId");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
                throw null;
            }
            if (address == null) {
                Assertions.a(reader, "address");
                throw null;
            }
            if (geo == null) {
                Assertions.a(reader, "geo");
                throw null;
            }
            if (bool3 != null) {
                return new CheckNearbyStoresForProductQuery.Store(str, str2, address, geo, bool3.booleanValue());
            }
            Assertions.a(reader, "isProductAvailable");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckNearbyStoresForProductQuery.Store value = (CheckNearbyStoresForProductQuery.Store) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("storeId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12542a);
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("address");
            Adapters.c(Address.f12543a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("geo");
            Adapters.c(Geo.f12546a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("isProductAvailable");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.e));
        }
    }
}
