package au.com.woolworths.shop.lists.data.remote.adapter;

import au.com.woolworths.shop.lists.data.remote.SuggestedListsQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SuggestedListsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "SuggestedLists", "Item", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestedListsQuery_ResponseAdapter {

    @NotNull
    public static final SuggestedListsQuery_ResponseAdapter INSTANCE = new SuggestedListsQuery_ResponseAdapter();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SuggestedListsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$Data;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SuggestedListsQuery.Data> {

        @NotNull
        public static final Data INSTANCE = new Data();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q(SuggestedListsQuery.OPERATION_NAME);

        private Data() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public SuggestedListsQuery.Data fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SuggestedListsQuery.SuggestedLists suggestedLists = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                suggestedLists = (SuggestedListsQuery.SuggestedLists) Adapters.b(Adapters.c(SuggestedLists.INSTANCE, false)).fromJson(reader, customScalarAdapters);
            }
            return new SuggestedListsQuery.Data(suggestedLists);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull SuggestedListsQuery.Data value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(SuggestedListsQuery.OPERATION_NAME);
            Adapters.b(Adapters.c(SuggestedLists.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getSuggestedLists());
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SuggestedListsQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$Item;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<SuggestedListsQuery.Item> {

        @NotNull
        public static final Item INSTANCE = new Item();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("id", AppMeasurementSdk.ConditionalUserProperty.NAME, "image");

        private Item() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public SuggestedListsQuery.Item fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            int iIntValue = num.intValue();
            if (str != null) {
                return new SuggestedListsQuery.Item(iIntValue, str, str2);
            }
            Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull SuggestedListsQuery.Item value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.getId()));
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getName());
            writer.F1("image");
            Adapters.i.toJson(writer, customScalarAdapters, value.getImage());
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SuggestedListsQuery_ResponseAdapter$SuggestedLists;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$SuggestedLists;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SuggestedLists implements Adapter<SuggestedListsQuery.SuggestedLists> {

        @NotNull
        public static final SuggestedLists INSTANCE = new SuggestedLists();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("totalItemCount", "nextPage", "items");

        private SuggestedLists() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public SuggestedListsQuery.SuggestedLists fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayListA = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListA = Adapters.a(Adapters.c(Item.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "totalItemCount");
                throw null;
            }
            int iIntValue = num.intValue();
            if (arrayListA != null) {
                return new SuggestedListsQuery.SuggestedLists(iIntValue, num2, arrayListA);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull SuggestedListsQuery.SuggestedLists value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalItemCount");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.getTotalItemCount()));
            writer.F1("nextPage");
            Adapters.k.toJson(writer, customScalarAdapters, value.getNextPage());
            writer.F1("items");
            Adapters.a(Adapters.c(Item.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getItems());
        }
    }

    private SuggestedListsQuery_ResponseAdapter() {
    }
}
