package au.com.woolworths.modules.address.adapter;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.modules.address.SaveAddressMutation;
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
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/modules/address/adapter/SaveAddressMutation_ResponseAdapter;", "", "Data", "SaveAddress", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SaveAddressMutation_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/address/adapter/SaveAddressMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/address/SaveAddressMutation$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SaveAddressMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f9070a = new Data();
        public static final List b = CollectionsKt.Q("saveAddress");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SaveAddressMutation.SaveAddress saveAddress = null;
            while (reader.o2(b) == 0) {
                saveAddress = (SaveAddressMutation.SaveAddress) Adapters.b(Adapters.c(SaveAddress.f9071a, false)).fromJson(reader, customScalarAdapters);
            }
            return new SaveAddressMutation.Data(saveAddress);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SaveAddressMutation.Data value = (SaveAddressMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("saveAddress");
            Adapters.b(Adapters.c(SaveAddress.f9071a, false)).toJson(writer, customScalarAdapters, value.f9059a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/address/adapter/SaveAddressMutation_ResponseAdapter$SaveAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/address/SaveAddressMutation$SaveAddress;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SaveAddress implements Adapter<SaveAddressMutation.SaveAddress> {

        /* renamed from: a, reason: collision with root package name */
        public static final SaveAddress f9071a = new SaveAddress();
        public static final List b = CollectionsKt.R("id", TextBundle.TEXT_ENTRY, "isPrimary", "postalCode", "street1", "street2", "suburbId", "suburbName");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool2 = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (num == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        Integer num3 = num2;
                        int iIntValue = num.intValue();
                        if (str == null) {
                            Assertions.a(reader, TextBundle.TEXT_ENTRY);
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "isPrimary");
                            throw null;
                        }
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str2 == null) {
                            Assertions.a(reader, "postalCode");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "street1");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "street2");
                            throw null;
                        }
                        if (num3 == null) {
                            Assertions.a(reader, "suburbId");
                            throw null;
                        }
                        int iIntValue2 = num3.intValue();
                        if (str5 != null) {
                            return new SaveAddressMutation.SaveAddress(iIntValue, str, zBooleanValue, str2, str3, str4, iIntValue2, str5);
                        }
                        Assertions.a(reader, "suburbName");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SaveAddressMutation.SaveAddress value = (SaveAddressMutation.SaveAddress) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f9060a, adapters$IntAdapter$1, writer, customScalarAdapters, TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isPrimary");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "postalCode");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("street1");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("street2");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("suburbId");
            d.y(value.g, adapters$IntAdapter$1, writer, customScalarAdapters, "suburbName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
        }
    }
}
