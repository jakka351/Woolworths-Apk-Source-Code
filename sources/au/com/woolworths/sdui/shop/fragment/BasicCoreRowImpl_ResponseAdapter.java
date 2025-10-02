package au.com.woolworths.sdui.shop.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.shop.fragment.BasicCoreRow;
import au.com.woolworths.sdui.shop.fragment.CoreRowUIImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/BasicCoreRowImpl_ResponseAdapter;", "", "BasicCoreRow", "Row", "Action", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BasicCoreRowImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/BasicCoreRowImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/BasicCoreRow$Action;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<BasicCoreRow.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f10039a = new Action();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new BasicCoreRow.Action(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BasicCoreRow.Action value = (BasicCoreRow.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f10037a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/BasicCoreRowImpl_ResponseAdapter$BasicCoreRow;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/BasicCoreRow;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BasicCoreRow implements Adapter<au.com.woolworths.sdui.shop.fragment.BasicCoreRow> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10040a = CollectionsKt.R("row", UrlHandler.ACTION);

        public static au.com.woolworths.sdui.shop.fragment.BasicCoreRow a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BasicCoreRow.Row row = null;
            BasicCoreRow.Action action = null;
            while (true) {
                int iO2 = reader.o2(f10040a);
                if (iO2 == 0) {
                    row = (BasicCoreRow.Row) Adapters.c(Row.f10041a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    action = (BasicCoreRow.Action) Adapters.c(Action.f10039a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (row == null) {
                Assertions.a(reader, "row");
                throw null;
            }
            if (action != null) {
                return new au.com.woolworths.sdui.shop.fragment.BasicCoreRow(row, action);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.sdui.shop.fragment.BasicCoreRow value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("row");
            Adapters.c(Row.f10041a, true).toJson(writer, customScalarAdapters, value.f10036a);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action.f10039a, false).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.sdui.shop.fragment.BasicCoreRow) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/BasicCoreRowImpl_ResponseAdapter$Row;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/BasicCoreRow$Row;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Row implements Adapter<BasicCoreRow.Row> {

        /* renamed from: a, reason: collision with root package name */
        public static final Row f10041a = new Row();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CoreRowUI coreRowUIA = CoreRowUIImpl_ResponseAdapter.CoreRowUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new BasicCoreRow.Row(str, coreRowUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BasicCoreRow.Row value = (BasicCoreRow.Row) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10038a);
            List list = CoreRowUIImpl_ResponseAdapter.CoreRowUI.f10051a;
            CoreRowUIImpl_ResponseAdapter.CoreRowUI.b(writer, customScalarAdapters, value.b);
        }
    }
}
