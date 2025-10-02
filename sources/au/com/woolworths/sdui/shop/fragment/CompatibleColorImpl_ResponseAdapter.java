package au.com.woolworths.sdui.shop.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CompatibleColorImpl_ResponseAdapter;", "", "CompatibleColor", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompatibleColorImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CompatibleColorImpl_ResponseAdapter$CompatibleColor;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CompatibleColor;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompatibleColor implements Adapter<au.com.woolworths.sdui.shop.fragment.CompatibleColor> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10043a = CollectionsKt.Q("lightHexCode");

        public static au.com.woolworths.sdui.shop.fragment.CompatibleColor a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10043a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new au.com.woolworths.sdui.shop.fragment.CompatibleColor(str);
            }
            Assertions.a(reader, "lightHexCode");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.sdui.shop.fragment.CompatibleColor value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("lightHexCode");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10042a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.sdui.shop.fragment.CompatibleColor) obj);
        }
    }
}
