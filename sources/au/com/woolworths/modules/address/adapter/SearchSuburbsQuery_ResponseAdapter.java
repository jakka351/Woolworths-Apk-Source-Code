package au.com.woolworths.modules.address.adapter;

import au.com.woolworths.modules.address.SearchSuburbsQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/modules/address/adapter/SearchSuburbsQuery_ResponseAdapter;", "", "Data", "SearchSuburb", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchSuburbsQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/address/adapter/SearchSuburbsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/address/SearchSuburbsQuery$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SearchSuburbsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f9074a = new Data();
        public static final List b = CollectionsKt.Q("searchSuburbs");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            List list = null;
            while (reader.o2(b) == 0) {
                list = (List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(SearchSuburb.f9075a, false)))).fromJson(reader, customScalarAdapters);
            }
            return new SearchSuburbsQuery.Data(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SearchSuburbsQuery.Data value = (SearchSuburbsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("searchSuburbs");
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(SearchSuburb.f9075a, false)))).toJson(writer, customScalarAdapters, value.f9065a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/address/adapter/SearchSuburbsQuery_ResponseAdapter$SearchSuburb;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/address/SearchSuburbsQuery$SearchSuburb;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchSuburb implements Adapter<SearchSuburbsQuery.SearchSuburb> {

        /* renamed from: a, reason: collision with root package name */
        public static final SearchSuburb f9075a = new SearchSuburb();
        public static final List b = CollectionsKt.R("id", TextBundle.TEXT_ENTRY, "postcode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new SearchSuburbsQuery.SearchSuburb(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SearchSuburbsQuery.SearchSuburb value = (SearchSuburbsQuery.SearchSuburb) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f9066a);
            writer.F1(TextBundle.TEXT_ENTRY);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("postcode");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
