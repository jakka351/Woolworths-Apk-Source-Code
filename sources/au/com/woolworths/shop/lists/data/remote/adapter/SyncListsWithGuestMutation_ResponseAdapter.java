package au.com.woolworths.shop.lists.data.remote.adapter;

import au.com.woolworths.shop.lists.data.remote.MapGuestListToOwnerMutation;
import au.com.woolworths.shop.lists.data.remote.SyncListsMutation;
import au.com.woolworths.shop.lists.data.remote.SyncListsWithGuestMutation;
import au.com.woolworths.shop.lists.data.remote.fragment.SyncListsResponseFragment;
import au.com.woolworths.shop.lists.data.remote.fragment.SyncListsResponseFragmentImpl_ResponseAdapter;
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
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SyncListsWithGuestMutation_ResponseAdapter;", "", "<init>", "()V", "Data", MapGuestListToOwnerMutation.OPERATION_NAME, SyncListsMutation.OPERATION_NAME, "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncListsWithGuestMutation_ResponseAdapter {

    @NotNull
    public static final SyncListsWithGuestMutation_ResponseAdapter INSTANCE = new SyncListsWithGuestMutation_ResponseAdapter();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SyncListsWithGuestMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$Data;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SyncListsWithGuestMutation.Data> {

        @NotNull
        public static final Data INSTANCE = new Data();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("mapGuestListToOwner", "syncLists");

        private Data() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public SyncListsWithGuestMutation.Data fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SyncListsWithGuestMutation.MapGuestListToOwner mapGuestListToOwner = null;
            SyncListsWithGuestMutation.SyncLists syncLists = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    mapGuestListToOwner = (SyncListsWithGuestMutation.MapGuestListToOwner) Adapters.c(MapGuestListToOwner.INSTANCE, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    syncLists = (SyncListsWithGuestMutation.SyncLists) Adapters.c(SyncLists.INSTANCE, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (mapGuestListToOwner == null) {
                Assertions.a(reader, "mapGuestListToOwner");
                throw null;
            }
            if (syncLists != null) {
                return new SyncListsWithGuestMutation.Data(mapGuestListToOwner, syncLists);
            }
            Assertions.a(reader, "syncLists");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull SyncListsWithGuestMutation.Data value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("mapGuestListToOwner");
            Adapters.c(MapGuestListToOwner.INSTANCE, false).toJson(writer, customScalarAdapters, value.getMapGuestListToOwner());
            writer.F1("syncLists");
            Adapters.c(SyncLists.INSTANCE, true).toJson(writer, customScalarAdapters, value.getSyncLists());
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SyncListsWithGuestMutation_ResponseAdapter$MapGuestListToOwner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$MapGuestListToOwner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MapGuestListToOwner implements Adapter<SyncListsWithGuestMutation.MapGuestListToOwner> {

        @NotNull
        public static final MapGuestListToOwner INSTANCE = new MapGuestListToOwner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("success");

        private MapGuestListToOwner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public SyncListsWithGuestMutation.MapGuestListToOwner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
            }
            if (bool != null) {
                return new SyncListsWithGuestMutation.MapGuestListToOwner(bool.booleanValue());
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull SyncListsWithGuestMutation.MapGuestListToOwner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getSuccess()));
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SyncListsWithGuestMutation_ResponseAdapter$SyncLists;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$SyncLists;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SyncLists implements Adapter<SyncListsWithGuestMutation.SyncLists> {

        @NotNull
        public static final SyncLists INSTANCE = new SyncLists();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");

        private SyncLists() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public SyncListsWithGuestMutation.SyncLists fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            SyncListsResponseFragment syncListsResponseFragmentFromJson = SyncListsResponseFragmentImpl_ResponseAdapter.SyncListsResponseFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new SyncListsWithGuestMutation.SyncLists(str, syncListsResponseFragmentFromJson);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull SyncListsWithGuestMutation.SyncLists value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            SyncListsResponseFragmentImpl_ResponseAdapter.SyncListsResponseFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getSyncListsResponseFragment());
        }
    }

    private SyncListsWithGuestMutation_ResponseAdapter() {
    }
}
