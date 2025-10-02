package com.woolworths.shop.checkout.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.CollectionModeId;
import au.com.woolworths.shop.graphql.type.adapter.CollectionModeId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutCollectionAddressDeliveryImpl_ResponseAdapter;", "", "CheckoutCollectionAddressDelivery", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CheckoutCollectionAddressDeliveryImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutCollectionAddressDeliveryImpl_ResponseAdapter$CheckoutCollectionAddressDelivery;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutCollectionAddressDelivery;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutCollectionAddressDelivery implements Adapter<com.woolworths.shop.checkout.fragment.CheckoutCollectionAddressDelivery> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22061a = CollectionsKt.R("title", "modeId", "addressId", "displayName", "addressImageUrl", "buttonText", "expressDeliveryStoreId");

        public static com.woolworths.shop.checkout.fragment.CheckoutCollectionAddressDelivery a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            CollectionModeId collectionModeIdA = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num3 = null;
            while (true) {
                switch (reader.o2(f22061a)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        collectionModeIdA = CollectionModeId_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 2:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        num = num2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        num3 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num4 = num2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (collectionModeIdA == null) {
                            Assertions.a(reader, "modeId");
                            throw null;
                        }
                        if (num4 == null) {
                            Assertions.a(reader, "addressId");
                            throw null;
                        }
                        int iIntValue = num4.intValue();
                        if (str2 == null) {
                            Assertions.a(reader, "displayName");
                            throw null;
                        }
                        if (str4 != null) {
                            return new com.woolworths.shop.checkout.fragment.CheckoutCollectionAddressDelivery(str, collectionModeIdA, iIntValue, str2, str3, str4, num3);
                        }
                        Assertions.a(reader, "buttonText");
                        throw null;
                }
                num2 = num;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.checkout.fragment.CheckoutCollectionAddressDelivery value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22060a);
            writer.F1("modeId");
            CollectionModeId_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("addressId");
            d.y(value.c, Adapters.b, writer, customScalarAdapters, "displayName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("addressImageUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("buttonText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("expressDeliveryStoreId");
            Adapters.k.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.checkout.fragment.CheckoutCollectionAddressDelivery) obj);
        }
    }
}
