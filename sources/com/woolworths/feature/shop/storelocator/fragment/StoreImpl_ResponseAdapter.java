package com.woolworths.feature.shop.storelocator.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.PickupOption;
import au.com.woolworths.shop.graphql.type.adapter.PickupOption_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.h;
import com.woolworths.feature.shop.storelocator.fragment.Store;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/StoreImpl_ResponseAdapter;", "", "Store", "InstoreTradingHour", "PickupType", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/StoreImpl_ResponseAdapter$InstoreTradingHour;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/storelocator/fragment/Store$InstoreTradingHour;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InstoreTradingHour implements Adapter<Store.InstoreTradingHour> {

        /* renamed from: a, reason: collision with root package name */
        public static final InstoreTradingHour f20345a = new InstoreTradingHour();
        public static final List b = CollectionsKt.R("dayLabel", "hoursLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "dayLabel");
                throw null;
            }
            if (str2 != null) {
                return new Store.InstoreTradingHour(str, str2);
            }
            Assertions.a(reader, "hoursLabel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Store.InstoreTradingHour value = (Store.InstoreTradingHour) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("dayLabel");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20343a);
            writer.F1("hoursLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/StoreImpl_ResponseAdapter$PickupType;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/storelocator/fragment/Store$PickupType;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PickupType implements Adapter<Store.PickupType> {

        /* renamed from: a, reason: collision with root package name */
        public static final PickupType f20346a = new PickupType();
        public static final List b = CollectionsKt.R("addressId", "shoppingModeId", "type", AnnotatedPrivateKey.LABEL, TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            String str = null;
            PickupOption pickupOptionA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    pickupOptionA = PickupOption_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "addressId");
                throw null;
            }
            int iIntValue = num.intValue();
            if (str == null) {
                Assertions.a(reader, "shoppingModeId");
                throw null;
            }
            if (pickupOptionA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str3 != null) {
                return new Store.PickupType(iIntValue, str, pickupOptionA, str2, str3);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Store.PickupType value = (Store.PickupType) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("addressId");
            d.y(value.f20344a, Adapters.b, writer, customScalarAdapters, "shoppingModeId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            writer.v0(value.c.d);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/StoreImpl_ResponseAdapter$Store;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/storelocator/fragment/Store;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Store implements Adapter<com.woolworths.feature.shop.storelocator.fragment.Store> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20347a = CollectionsKt.R("__typename", "id", AppMeasurementSdk.ConditionalUserProperty.NAME, "address", "facilities", "phone", "instoreTradingHours", h.a.b, h.a.c, "distanceInKm", "supportedShoppingModes", "pickupTypes");

        public static com.woolworths.feature.shop.storelocator.fragment.Store a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            String str5 = null;
            ArrayList arrayListFromJson2 = null;
            Double d3 = null;
            Double d4 = null;
            ArrayList arrayListFromJson3 = null;
            ArrayList arrayListFromJson4 = null;
            while (true) {
                switch (reader.o2(f20347a)) {
                    case 0:
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        d = d2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        d = d2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        d = d2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        d = d2;
                        arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d = d2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        d = d2;
                        arrayListFromJson2 = Adapters.a(Adapters.c(InstoreTradingHour.f20345a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        d = d2;
                        d3 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        d = d2;
                        d4 = (Double) Adapters.j.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        d = d2;
                        arrayListFromJson3 = Adapters.a(ShoppingModeId_ResponseAdapter.f12117a).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        d = d2;
                        arrayListFromJson4 = Adapters.a(Adapters.c(PickupType.f20346a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d5 = d2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "address");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "facilities");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "instoreTradingHours");
                            throw null;
                        }
                        if (d5 == null) {
                            Assertions.a(reader, h.a.b);
                            throw null;
                        }
                        Double d6 = d3;
                        double dDoubleValue = d5.doubleValue();
                        if (d6 == null) {
                            Assertions.a(reader, h.a.c);
                            throw null;
                        }
                        double dDoubleValue2 = d6.doubleValue();
                        if (arrayListFromJson3 == null) {
                            Assertions.a(reader, "supportedShoppingModes");
                            throw null;
                        }
                        if (arrayListFromJson4 != null) {
                            return new com.woolworths.feature.shop.storelocator.fragment.Store(str, str2, str3, str4, arrayListFromJson, str5, arrayListFromJson2, dDoubleValue, dDoubleValue2, d4, arrayListFromJson3, arrayListFromJson4);
                        }
                        Assertions.a(reader, "pickupTypes");
                        throw null;
                }
                d2 = d;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.feature.shop.storelocator.fragment.Store value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20342a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("address");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("facilities");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.e);
            writer.F1("phone");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("instoreTradingHours");
            Adapters.a(Adapters.c(InstoreTradingHour.f20345a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1(h.a.b);
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.h));
            writer.F1(h.a.c);
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.i));
            writer.F1("distanceInKm");
            Adapters.j.toJson(writer, customScalarAdapters, value.j);
            writer.F1("supportedShoppingModes");
            Adapters.a(ShoppingModeId_ResponseAdapter.f12117a).toJson(writer, customScalarAdapters, value.k);
            writer.F1("pickupTypes");
            Adapters.a(Adapters.c(PickupType.f20346a, false)).toJson(writer, customScalarAdapters, value.l);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.feature.shop.storelocator.fragment.Store) obj);
        }
    }
}
