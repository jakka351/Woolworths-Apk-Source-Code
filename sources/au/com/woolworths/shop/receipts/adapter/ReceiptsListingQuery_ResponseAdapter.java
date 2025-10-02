package au.com.woolworths.shop.receipts.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.receipts.ReceiptsListingQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/ReceiptsListingQuery_ResponseAdapter;", "", "Data", "Receipts", "Item", "OnReceiptFeedGroupHeader", "OnReceiptItem", "PageInfo", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReceiptsListingQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/ReceiptsListingQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$Data;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ReceiptsListingQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12862a = new Data();
        public static final List b = CollectionsKt.Q("receipts");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ReceiptsListingQuery.Receipts receipts = null;
            while (reader.o2(b) == 0) {
                receipts = (ReceiptsListingQuery.Receipts) Adapters.b(Adapters.c(Receipts.f12867a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ReceiptsListingQuery.Data(receipts);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ReceiptsListingQuery.Data value = (ReceiptsListingQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("receipts");
            Adapters.b(Adapters.c(Receipts.f12867a, false)).toJson(writer, customScalarAdapters, value.f12827a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/ReceiptsListingQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$Item;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<ReceiptsListingQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f12863a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ReceiptsListingQuery.OnReceiptFeedGroupHeader onReceiptFeedGroupHeaderA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ReceiptsListingQuery.OnReceiptItem onReceiptItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptFeedGroupHeader"))) {
                reader.o();
                onReceiptFeedGroupHeaderA = OnReceiptFeedGroupHeader.a(reader, customScalarAdapters);
            } else {
                onReceiptFeedGroupHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptItem"))) {
                reader.o();
                onReceiptItemA = OnReceiptItem.a(reader, customScalarAdapters);
            }
            return new ReceiptsListingQuery.Item(str, onReceiptFeedGroupHeaderA, onReceiptItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ReceiptsListingQuery.Item value = (ReceiptsListingQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12828a);
            ReceiptsListingQuery.OnReceiptFeedGroupHeader onReceiptFeedGroupHeader = value.b;
            if (onReceiptFeedGroupHeader != null) {
                OnReceiptFeedGroupHeader.b(writer, customScalarAdapters, onReceiptFeedGroupHeader);
            }
            ReceiptsListingQuery.OnReceiptItem onReceiptItem = value.c;
            if (onReceiptItem != null) {
                OnReceiptItem.b(writer, customScalarAdapters, onReceiptItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/ReceiptsListingQuery_ResponseAdapter$OnReceiptFeedGroupHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$OnReceiptFeedGroupHeader;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptFeedGroupHeader implements Adapter<ReceiptsListingQuery.OnReceiptFeedGroupHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12864a = CollectionsKt.Q("title");

        public static ReceiptsListingQuery.OnReceiptFeedGroupHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12864a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ReceiptsListingQuery.OnReceiptFeedGroupHeader(str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ReceiptsListingQuery.OnReceiptFeedGroupHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12829a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ReceiptsListingQuery.OnReceiptFeedGroupHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/ReceiptsListingQuery_ResponseAdapter$OnReceiptItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$OnReceiptItem;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptItem implements Adapter<ReceiptsListingQuery.OnReceiptItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12865a = CollectionsKt.R("id", "displayDate", "displayValue");

        public static ReceiptsListingQuery.OnReceiptItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f12865a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "displayDate");
                throw null;
            }
            if (str3 != null) {
                return new ReceiptsListingQuery.OnReceiptItem(str, str2, str3);
            }
            Assertions.a(reader, "displayValue");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ReceiptsListingQuery.OnReceiptItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12830a);
            writer.F1("displayDate");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("displayValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ReceiptsListingQuery.OnReceiptItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/ReceiptsListingQuery_ResponseAdapter$PageInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$PageInfo;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageInfo implements Adapter<ReceiptsListingQuery.PageInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final PageInfo f12866a = new PageInfo();
        public static final List b = CollectionsKt.Q("nextPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            while (reader.o2(b) == 0) {
                num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
            }
            return new ReceiptsListingQuery.PageInfo(num);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ReceiptsListingQuery.PageInfo value = (ReceiptsListingQuery.PageInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("nextPage");
            Adapters.k.toJson(writer, customScalarAdapters, value.f12831a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/ReceiptsListingQuery_ResponseAdapter$Receipts;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$Receipts;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Receipts implements Adapter<ReceiptsListingQuery.Receipts> {

        /* renamed from: a, reason: collision with root package name */
        public static final Receipts f12867a = new Receipts();
        public static final List b = CollectionsKt.R("items", "pageInfo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ReceiptsListingQuery.PageInfo pageInfo = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f12863a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    pageInfo = (ReceiptsListingQuery.PageInfo) Adapters.c(PageInfo.f12866a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "items");
                throw null;
            }
            if (pageInfo != null) {
                return new ReceiptsListingQuery.Receipts(arrayListFromJson, pageInfo);
            }
            Assertions.a(reader, "pageInfo");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ReceiptsListingQuery.Receipts value = (ReceiptsListingQuery.Receipts) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f12863a, true)).toJson(writer, customScalarAdapters, value.f12832a);
            writer.F1("pageInfo");
            Adapters.c(PageInfo.f12866a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }
}
