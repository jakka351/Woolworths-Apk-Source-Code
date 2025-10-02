package com.woolworths.shop.modeselector.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter;", "", "ModeSelectorV1AddressDetailsPickupFragment", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter$ModeSelectorV1AddressDetailsPickupFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/fragment/ModeSelectorV1AddressDetailsPickupFragment;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ModeSelectorV1AddressDetailsPickupFragment implements Adapter<com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsPickupFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23359a = CollectionsKt.R("modeId", "storeId", "addressId", "addressText", "displayName", AnnotatedPrivateKey.LABEL);

        public static com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsPickupFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(f23359a);
                if (iO2 == 0) {
                    num = num2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = num2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num = num2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    num = num2;
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    num = num2;
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
                num2 = num;
            }
            Integer num3 = num2;
            if (str == null) {
                Assertions.a(reader, "modeId");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "storeId");
                throw null;
            }
            if (num3 == null) {
                Assertions.a(reader, "addressId");
                throw null;
            }
            int iIntValue = num3.intValue();
            if (str3 == null) {
                Assertions.a(reader, "addressText");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "displayName");
                throw null;
            }
            if (str5 != null) {
                return new com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsPickupFragment(str, str2, iIntValue, str3, str4, str5);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsPickupFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("modeId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23358a);
            writer.F1("storeId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("addressId");
            d.y(value.c, Adapters.b, writer, customScalarAdapters, "addressText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("displayName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsPickupFragment) obj);
        }
    }
}
