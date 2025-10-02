package com.woolworths.shop.modeselector.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter;", "", "ModeSelectorV1AddressDetailsDeliveryFragment", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter$ModeSelectorV1AddressDetailsDeliveryFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/fragment/ModeSelectorV1AddressDetailsDeliveryFragment;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ModeSelectorV1AddressDetailsDeliveryFragment implements Adapter<com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsDeliveryFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23357a = CollectionsKt.R("modeId", "addressId", "addressText", "isPrimary", "postcode", "street1", "street2", "suburbId", "suburbName");

        public static com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsDeliveryFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            Integer num3 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(f23357a)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num = num2;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        num = num2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = num2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num4 = num2;
                        if (str == null) {
                            Assertions.a(reader, "modeId");
                            throw null;
                        }
                        if (num4 == null) {
                            Assertions.a(reader, "addressId");
                            throw null;
                        }
                        Boolean bool2 = bool;
                        int iIntValue = num4.intValue();
                        if (str2 == null) {
                            Assertions.a(reader, "addressText");
                            throw null;
                        }
                        if (bool2 == null) {
                            Assertions.a(reader, "isPrimary");
                            throw null;
                        }
                        Integer num5 = num3;
                        boolean zBooleanValue = bool2.booleanValue();
                        if (str3 == null) {
                            Assertions.a(reader, "postcode");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "street1");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "street2");
                            throw null;
                        }
                        if (num5 == null) {
                            Assertions.a(reader, "suburbId");
                            throw null;
                        }
                        int iIntValue2 = num5.intValue();
                        if (str6 != null) {
                            return new com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsDeliveryFragment(str, iIntValue, str2, zBooleanValue, str3, str4, str5, iIntValue2, str6);
                        }
                        Assertions.a(reader, "suburbName");
                        throw null;
                }
                num2 = num;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsDeliveryFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("modeId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23356a);
            writer.F1("addressId");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "addressText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("isPrimary");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "postcode");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("street1");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("street2");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("suburbId");
            d.y(value.h, adapters$IntAdapter$1, writer, customScalarAdapters, "suburbName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsDeliveryFragment) obj);
        }
    }
}
