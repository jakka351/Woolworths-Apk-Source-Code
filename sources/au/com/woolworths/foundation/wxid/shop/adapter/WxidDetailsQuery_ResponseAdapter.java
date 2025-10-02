package au.com.woolworths.foundation.wxid.shop.adapter;

import au.com.woolworths.foundation.wxid.shop.WxidDetailsQuery;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/wxid/shop/adapter/WxidDetailsQuery_ResponseAdapter;", "", "Data", "WxidDetails", "wxid-data-shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WxidDetailsQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/wxid/shop/adapter/WxidDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/wxid/shop/WxidDetailsQuery$Data;", "wxid-data-shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<WxidDetailsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8942a = new Data();
        public static final List b = CollectionsKt.Q("wxidDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            WxidDetailsQuery.WxidDetails wxidDetails = null;
            while (reader.o2(b) == 0) {
                wxidDetails = (WxidDetailsQuery.WxidDetails) Adapters.c(WxidDetails.f8943a, false).fromJson(reader, customScalarAdapters);
            }
            if (wxidDetails != null) {
                return new WxidDetailsQuery.Data(wxidDetails);
            }
            Assertions.a(reader, "wxidDetails");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            WxidDetailsQuery.Data value = (WxidDetailsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("wxidDetails");
            Adapters.c(WxidDetails.f8943a, false).toJson(writer, customScalarAdapters, value.f8940a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/wxid/shop/adapter/WxidDetailsQuery_ResponseAdapter$WxidDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/wxid/shop/WxidDetailsQuery$WxidDetails;", "wxid-data-shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WxidDetails implements Adapter<WxidDetailsQuery.WxidDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final WxidDetails f8943a = new WxidDetails();
        public static final List b = CollectionsKt.R("wxid", "nextFetchTime");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Double d = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                }
            }
            if (d != null) {
                return new WxidDetailsQuery.WxidDetails(str, d.doubleValue());
            }
            Assertions.a(reader, "nextFetchTime");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            WxidDetailsQuery.WxidDetails value = (WxidDetailsQuery.WxidDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("wxid");
            Adapters.i.toJson(writer, customScalarAdapters, value.f8941a);
            writer.F1("nextFetchTime");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
        }
    }
}
