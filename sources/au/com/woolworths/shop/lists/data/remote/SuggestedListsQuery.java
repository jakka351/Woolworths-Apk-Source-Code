package au.com.woolworths.shop.lists.data.remote;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.shop.lists.data.remote.adapter.SuggestedListsQuery_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.adapter.SuggestedListsQuery_VariablesAdapter;
import au.com.woolworths.shop.lists.data.remote.selections.SuggestedListsQuerySelections;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004$%&'B+\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0011\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J-\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006("}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$Data;", "pageSize", "Lcom/apollographql/apollo/api/Optional;", "", "pageNumber", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "getPageSize", "()Lcom/apollographql/apollo/api/Optional;", "getPageNumber", "id", "", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "Data", "SuggestedLists", "Item", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestedListsQuery implements Query<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OPERATION_ID = "dff66d7ab5752d2973e68aa51b2ddc110eedd2a81381ff0b6350552ffc7eded0";

    @NotNull
    public static final String OPERATION_NAME = "suggestedLists";

    @NotNull
    private final Optional<Integer> pageNumber;

    @NotNull
    private final Optional<Integer> pageSize;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query suggestedLists($pageSize: Int, $pageNumber: Int) { suggestedLists(pageSize: $pageSize, pageNumber: $pageNumber) { totalItemCount nextPage items { id name image } } }";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", SuggestedListsQuery.OPERATION_NAME, "Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$SuggestedLists;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$SuggestedLists;)V", "getSuggestedLists", "()Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$SuggestedLists;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        @Nullable
        private final SuggestedLists suggestedLists;

        public Data(@Nullable SuggestedLists suggestedLists) {
            this.suggestedLists = suggestedLists;
        }

        public static /* synthetic */ Data copy$default(Data data, SuggestedLists suggestedLists, int i, Object obj) {
            if ((i & 1) != 0) {
                suggestedLists = data.suggestedLists;
            }
            return data.copy(suggestedLists);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final SuggestedLists getSuggestedLists() {
            return this.suggestedLists;
        }

        @NotNull
        public final Data copy(@Nullable SuggestedLists suggestedLists) {
            return new Data(suggestedLists);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.suggestedLists, ((Data) other).suggestedLists);
        }

        @Nullable
        public final SuggestedLists getSuggestedLists() {
            return this.suggestedLists;
        }

        public int hashCode() {
            SuggestedLists suggestedLists = this.suggestedLists;
            if (suggestedLists == null) {
                return 0;
            }
            return suggestedLists.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(suggestedLists=" + this.suggestedLists + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$Item;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "image", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getImage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {
        private final int id;

        @Nullable
        private final String image;

        @NotNull
        private final String name;

        public Item(int i, @NotNull String name, @Nullable String str) {
            Intrinsics.h(name, "name");
            this.id = i;
            this.name = name;
            this.image = str;
        }

        public static /* synthetic */ Item copy$default(Item item, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = item.id;
            }
            if ((i2 & 2) != 0) {
                str = item.name;
            }
            if ((i2 & 4) != 0) {
                str2 = item.image;
            }
            return item.copy(i, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final Item copy(int id, @NotNull String name, @Nullable String image) {
            Intrinsics.h(name, "name");
            return new Item(id, name, image);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.id == item.id && Intrinsics.c(this.name, item.name) && Intrinsics.c(this.image, item.image);
        }

        public final int getId() {
            return this.id;
        }

        @Nullable
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int iC = b.c(Integer.hashCode(this.id) * 31, 31, this.name);
            String str = this.image;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            int i = this.id;
            String str = this.name;
            return a.o(androidx.constraintlayout.core.state.a.p("Item(id=", i, ", name=", str, ", image="), this.image, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$SuggestedLists;", "", "totalItemCount", "", "nextPage", "items", "", "Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$Item;", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "getTotalItemCount", "()I", "getNextPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$SuggestedLists;", "equals", "", "other", "hashCode", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SuggestedLists {

        @NotNull
        private final List<Item> items;

        @Nullable
        private final Integer nextPage;
        private final int totalItemCount;

        public SuggestedLists(int i, @Nullable Integer num, @NotNull List<Item> items) {
            Intrinsics.h(items, "items");
            this.totalItemCount = i;
            this.nextPage = num;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SuggestedLists copy$default(SuggestedLists suggestedLists, int i, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = suggestedLists.totalItemCount;
            }
            if ((i2 & 2) != 0) {
                num = suggestedLists.nextPage;
            }
            if ((i2 & 4) != 0) {
                list = suggestedLists.items;
            }
            return suggestedLists.copy(i, num, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalItemCount() {
            return this.totalItemCount;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getNextPage() {
            return this.nextPage;
        }

        @NotNull
        public final List<Item> component3() {
            return this.items;
        }

        @NotNull
        public final SuggestedLists copy(int totalItemCount, @Nullable Integer nextPage, @NotNull List<Item> items) {
            Intrinsics.h(items, "items");
            return new SuggestedLists(totalItemCount, nextPage, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestedLists)) {
                return false;
            }
            SuggestedLists suggestedLists = (SuggestedLists) other;
            return this.totalItemCount == suggestedLists.totalItemCount && Intrinsics.c(this.nextPage, suggestedLists.nextPage) && Intrinsics.c(this.items, suggestedLists.items);
        }

        @NotNull
        public final List<Item> getItems() {
            return this.items;
        }

        @Nullable
        public final Integer getNextPage() {
            return this.nextPage;
        }

        public final int getTotalItemCount() {
            return this.totalItemCount;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.totalItemCount) * 31;
            Integer num = this.nextPage;
            return this.items.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            int i = this.totalItemCount;
            Integer num = this.nextPage;
            List<Item> list = this.items;
            StringBuilder sb = new StringBuilder("SuggestedLists(totalItemCount=");
            sb.append(i);
            sb.append(", nextPage=");
            sb.append(num);
            sb.append(", items=");
            return android.support.v4.media.session.a.t(sb, list, ")");
        }
    }

    public SuggestedListsQuery() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestedListsQuery copy$default(SuggestedListsQuery suggestedListsQuery, Optional optional, Optional optional2, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = suggestedListsQuery.pageSize;
        }
        if ((i & 2) != 0) {
            optional2 = suggestedListsQuery.pageNumber;
        }
        return suggestedListsQuery.copy(optional, optional2);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(SuggestedListsQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    public final Optional<Integer> component1() {
        return this.pageSize;
    }

    @NotNull
    public final Optional<Integer> component2() {
        return this.pageNumber;
    }

    @NotNull
    public final SuggestedListsQuery copy(@NotNull Optional<Integer> pageSize, @NotNull Optional<Integer> pageNumber) {
        Intrinsics.h(pageSize, "pageSize");
        Intrinsics.h(pageNumber, "pageNumber");
        return new SuggestedListsQuery(pageSize, pageNumber);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedListsQuery)) {
            return false;
        }
        SuggestedListsQuery suggestedListsQuery = (SuggestedListsQuery) other;
        return Intrinsics.c(this.pageSize, suggestedListsQuery.pageSize) && Intrinsics.c(this.pageNumber, suggestedListsQuery.pageNumber);
    }

    @NotNull
    public final Optional<Integer> getPageNumber() {
        return this.pageNumber;
    }

    @NotNull
    public final Optional<Integer> getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        return this.pageNumber.hashCode() + (this.pageSize.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return OPERATION_NAME;
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Query.H2);
        builder.e(SuggestedListsQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        SuggestedListsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        return "SuggestedListsQuery(pageSize=" + this.pageSize + ", pageNumber=" + this.pageNumber + ")";
    }

    public SuggestedListsQuery(@NotNull Optional<Integer> pageSize, @NotNull Optional<Integer> pageNumber) {
        Intrinsics.h(pageSize, "pageSize");
        Intrinsics.h(pageNumber, "pageNumber");
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SuggestedListsQuery(Optional optional, Optional optional2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        Optional.Absent absent = Optional.Absent.f13523a;
        this(i2 != 0 ? absent : optional, (i & 2) != 0 ? absent : optional2);
    }
}
