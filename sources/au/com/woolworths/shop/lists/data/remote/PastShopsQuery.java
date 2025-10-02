package au.com.woolworths.shop.lists.data.remote;

import android.support.v4.media.session.a;
import au.com.woolworths.shop.lists.data.remote.adapter.PastShopsQuery_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.adapter.PastShopsQuery_VariablesAdapter;
import au.com.woolworths.shop.lists.data.remote.selections.PastShopsQuerySelections;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004$%&'B+\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0011\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J-\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006("}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$Data;", "pageNumber", "Lcom/apollographql/apollo/api/Optional;", "", "pageSize", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "getPageNumber", "()Lcom/apollographql/apollo/api/Optional;", "getPageSize", "id", "", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "Data", "PastshopEvent", "Item", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PastShopsQuery implements Query<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OPERATION_ID = "d930a081c1d741d3792c2738d3dd3ab9414f96e85654c31add72c23afc475b19";

    @NotNull
    public static final String OPERATION_NAME = "PastShops";

    @NotNull
    private final Optional<Integer> pageNumber;

    @NotNull
    private final Optional<Integer> pageSize;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query PastShops($pageNumber: Int, $pageSize: Int) { pastshopEvent(pageNumber: $pageNumber, pageSize: $pageSize) { totalItemCount nextPage items { id title } } }";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "pastshopEvent", "Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$PastshopEvent;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$PastshopEvent;)V", "getPastshopEvent", "()Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$PastshopEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        @Nullable
        private final PastshopEvent pastshopEvent;

        public Data(@Nullable PastshopEvent pastshopEvent) {
            this.pastshopEvent = pastshopEvent;
        }

        public static /* synthetic */ Data copy$default(Data data, PastshopEvent pastshopEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                pastshopEvent = data.pastshopEvent;
            }
            return data.copy(pastshopEvent);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final PastshopEvent getPastshopEvent() {
            return this.pastshopEvent;
        }

        @NotNull
        public final Data copy(@Nullable PastshopEvent pastshopEvent) {
            return new Data(pastshopEvent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.pastshopEvent, ((Data) other).pastshopEvent);
        }

        @Nullable
        public final PastshopEvent getPastshopEvent() {
            return this.pastshopEvent;
        }

        public int hashCode() {
            PastshopEvent pastshopEvent = this.pastshopEvent;
            if (pastshopEvent == null) {
                return 0;
            }
            return pastshopEvent.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(pastshopEvent=" + this.pastshopEvent + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$Item;", "", "id", "", "title", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$Item;", "equals", "", "other", "hashCode", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        @Nullable
        private final Integer id;

        @NotNull
        private final String title;

        public Item(@Nullable Integer num, @NotNull String title) {
            Intrinsics.h(title, "title");
            this.id = num;
            this.title = title;
        }

        public static /* synthetic */ Item copy$default(Item item, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = item.id;
            }
            if ((i & 2) != 0) {
                str = item.title;
            }
            return item.copy(num, str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Item copy(@Nullable Integer id, @NotNull String title) {
            Intrinsics.h(title, "title");
            return new Item(id, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.c(this.id, item.id) && Intrinsics.c(this.title, item.title);
        }

        @Nullable
        public final Integer getId() {
            return this.id;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Integer num = this.id;
            return this.title.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Item(id=" + this.id + ", title=" + this.title + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$PastshopEvent;", "", "totalItemCount", "", "nextPage", "items", "", "Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$Item;", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "getTotalItemCount", "()I", "getNextPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery$PastshopEvent;", "equals", "", "other", "hashCode", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PastshopEvent {

        @NotNull
        private final List<Item> items;

        @Nullable
        private final Integer nextPage;
        private final int totalItemCount;

        public PastshopEvent(int i, @Nullable Integer num, @NotNull List<Item> items) {
            Intrinsics.h(items, "items");
            this.totalItemCount = i;
            this.nextPage = num;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PastshopEvent copy$default(PastshopEvent pastshopEvent, int i, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pastshopEvent.totalItemCount;
            }
            if ((i2 & 2) != 0) {
                num = pastshopEvent.nextPage;
            }
            if ((i2 & 4) != 0) {
                list = pastshopEvent.items;
            }
            return pastshopEvent.copy(i, num, list);
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
        public final PastshopEvent copy(int totalItemCount, @Nullable Integer nextPage, @NotNull List<Item> items) {
            Intrinsics.h(items, "items");
            return new PastshopEvent(totalItemCount, nextPage, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PastshopEvent)) {
                return false;
            }
            PastshopEvent pastshopEvent = (PastshopEvent) other;
            return this.totalItemCount == pastshopEvent.totalItemCount && Intrinsics.c(this.nextPage, pastshopEvent.nextPage) && Intrinsics.c(this.items, pastshopEvent.items);
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
            StringBuilder sb = new StringBuilder("PastshopEvent(totalItemCount=");
            sb.append(i);
            sb.append(", nextPage=");
            sb.append(num);
            sb.append(", items=");
            return a.t(sb, list, ")");
        }
    }

    public PastShopsQuery() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PastShopsQuery copy$default(PastShopsQuery pastShopsQuery, Optional optional, Optional optional2, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = pastShopsQuery.pageNumber;
        }
        if ((i & 2) != 0) {
            optional2 = pastShopsQuery.pageSize;
        }
        return pastShopsQuery.copy(optional, optional2);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(PastShopsQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    public final Optional<Integer> component1() {
        return this.pageNumber;
    }

    @NotNull
    public final Optional<Integer> component2() {
        return this.pageSize;
    }

    @NotNull
    public final PastShopsQuery copy(@NotNull Optional<Integer> pageNumber, @NotNull Optional<Integer> pageSize) {
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(pageSize, "pageSize");
        return new PastShopsQuery(pageNumber, pageSize);
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
        if (!(other instanceof PastShopsQuery)) {
            return false;
        }
        PastShopsQuery pastShopsQuery = (PastShopsQuery) other;
        return Intrinsics.c(this.pageNumber, pastShopsQuery.pageNumber) && Intrinsics.c(this.pageSize, pastShopsQuery.pageSize);
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
        return this.pageSize.hashCode() + (this.pageNumber.hashCode() * 31);
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
        builder.e(PastShopsQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        PastShopsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        return "PastShopsQuery(pageNumber=" + this.pageNumber + ", pageSize=" + this.pageSize + ")";
    }

    public PastShopsQuery(@NotNull Optional<Integer> pageNumber, @NotNull Optional<Integer> pageSize) {
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(pageSize, "pageSize");
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PastShopsQuery(Optional optional, Optional optional2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        Optional.Absent absent = Optional.Absent.f13523a;
        this(i2 != 0 ? absent : optional, (i & 2) != 0 ? absent : optional2);
    }
}
