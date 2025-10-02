package au.com.woolworths.shop.lists.data.remote;

import YU.a;
import au.com.woolworths.shop.lists.data.remote.adapter.PurchaseHistoryQuery_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.adapter.PurchaseHistoryQuery_VariablesAdapter;
import au.com.woolworths.shop.lists.data.remote.selections.PurchaseHistoryQuerySelections;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004$%&'B+\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0011\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J-\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006("}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$Data;", "pageNumber", "Lcom/apollographql/apollo/api/Optional;", "", "pageSize", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "getPageNumber", "()Lcom/apollographql/apollo/api/Optional;", "getPageSize", "id", "", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "Data", "PurchaseHistoryEvent", "Item", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PurchaseHistoryQuery implements Query<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OPERATION_ID = "76fdc84d290cc734af9e1052ab6cdc0da1efc60617954540f8a28fa2aa6ac977";

    @NotNull
    public static final String OPERATION_NAME = "PurchaseHistory";

    @NotNull
    private final Optional<Integer> pageNumber;

    @NotNull
    private final Optional<Integer> pageSize;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query PurchaseHistory($pageNumber: Int, $pageSize: Int) { purchaseHistoryEvent(pageNumber: $pageNumber, pageSize: $pageSize) { totalItemCount nextPage items { basketId: basketID title } } }";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "purchaseHistoryEvent", "Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$PurchaseHistoryEvent;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$PurchaseHistoryEvent;)V", "getPurchaseHistoryEvent", "()Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$PurchaseHistoryEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        @Nullable
        private final PurchaseHistoryEvent purchaseHistoryEvent;

        public Data(@Nullable PurchaseHistoryEvent purchaseHistoryEvent) {
            this.purchaseHistoryEvent = purchaseHistoryEvent;
        }

        public static /* synthetic */ Data copy$default(Data data, PurchaseHistoryEvent purchaseHistoryEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                purchaseHistoryEvent = data.purchaseHistoryEvent;
            }
            return data.copy(purchaseHistoryEvent);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final PurchaseHistoryEvent getPurchaseHistoryEvent() {
            return this.purchaseHistoryEvent;
        }

        @NotNull
        public final Data copy(@Nullable PurchaseHistoryEvent purchaseHistoryEvent) {
            return new Data(purchaseHistoryEvent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.purchaseHistoryEvent, ((Data) other).purchaseHistoryEvent);
        }

        @Nullable
        public final PurchaseHistoryEvent getPurchaseHistoryEvent() {
            return this.purchaseHistoryEvent;
        }

        public int hashCode() {
            PurchaseHistoryEvent purchaseHistoryEvent = this.purchaseHistoryEvent;
            if (purchaseHistoryEvent == null) {
                return 0;
            }
            return purchaseHistoryEvent.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(purchaseHistoryEvent=" + this.purchaseHistoryEvent + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$Item;", "", "basketId", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBasketId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        @Nullable
        private final String basketId;

        @NotNull
        private final String title;

        public Item(@Nullable String str, @NotNull String title) {
            Intrinsics.h(title, "title");
            this.basketId = str;
            this.title = title;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.basketId;
            }
            if ((i & 2) != 0) {
                str2 = item.title;
            }
            return item.copy(str, str2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getBasketId() {
            return this.basketId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Item copy(@Nullable String basketId, @NotNull String title) {
            Intrinsics.h(title, "title");
            return new Item(basketId, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.c(this.basketId, item.basketId) && Intrinsics.c(this.title, item.title);
        }

        @Nullable
        public final String getBasketId() {
            return this.basketId;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.basketId;
            return this.title.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return a.j("Item(basketId=", this.basketId, ", title=", this.title, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$PurchaseHistoryEvent;", "", "totalItemCount", "", "nextPage", "items", "", "Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$Item;", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "getTotalItemCount", "()I", "getNextPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lau/com/woolworths/shop/lists/data/remote/PurchaseHistoryQuery$PurchaseHistoryEvent;", "equals", "", "other", "hashCode", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PurchaseHistoryEvent {

        @NotNull
        private final List<Item> items;

        @Nullable
        private final Integer nextPage;
        private final int totalItemCount;

        public PurchaseHistoryEvent(int i, @Nullable Integer num, @NotNull List<Item> items) {
            Intrinsics.h(items, "items");
            this.totalItemCount = i;
            this.nextPage = num;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PurchaseHistoryEvent copy$default(PurchaseHistoryEvent purchaseHistoryEvent, int i, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = purchaseHistoryEvent.totalItemCount;
            }
            if ((i2 & 2) != 0) {
                num = purchaseHistoryEvent.nextPage;
            }
            if ((i2 & 4) != 0) {
                list = purchaseHistoryEvent.items;
            }
            return purchaseHistoryEvent.copy(i, num, list);
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
        public final PurchaseHistoryEvent copy(int totalItemCount, @Nullable Integer nextPage, @NotNull List<Item> items) {
            Intrinsics.h(items, "items");
            return new PurchaseHistoryEvent(totalItemCount, nextPage, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PurchaseHistoryEvent)) {
                return false;
            }
            PurchaseHistoryEvent purchaseHistoryEvent = (PurchaseHistoryEvent) other;
            return this.totalItemCount == purchaseHistoryEvent.totalItemCount && Intrinsics.c(this.nextPage, purchaseHistoryEvent.nextPage) && Intrinsics.c(this.items, purchaseHistoryEvent.items);
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
            StringBuilder sb = new StringBuilder("PurchaseHistoryEvent(totalItemCount=");
            sb.append(i);
            sb.append(", nextPage=");
            sb.append(num);
            sb.append(", items=");
            return android.support.v4.media.session.a.t(sb, list, ")");
        }
    }

    public PurchaseHistoryQuery() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseHistoryQuery copy$default(PurchaseHistoryQuery purchaseHistoryQuery, Optional optional, Optional optional2, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = purchaseHistoryQuery.pageNumber;
        }
        if ((i & 2) != 0) {
            optional2 = purchaseHistoryQuery.pageSize;
        }
        return purchaseHistoryQuery.copy(optional, optional2);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(PurchaseHistoryQuery_ResponseAdapter.Data.INSTANCE, false);
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
    public final PurchaseHistoryQuery copy(@NotNull Optional<Integer> pageNumber, @NotNull Optional<Integer> pageSize) {
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(pageSize, "pageSize");
        return new PurchaseHistoryQuery(pageNumber, pageSize);
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
        if (!(other instanceof PurchaseHistoryQuery)) {
            return false;
        }
        PurchaseHistoryQuery purchaseHistoryQuery = (PurchaseHistoryQuery) other;
        return Intrinsics.c(this.pageNumber, purchaseHistoryQuery.pageNumber) && Intrinsics.c(this.pageSize, purchaseHistoryQuery.pageSize);
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
        builder.e(PurchaseHistoryQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        PurchaseHistoryQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        return "PurchaseHistoryQuery(pageNumber=" + this.pageNumber + ", pageSize=" + this.pageSize + ")";
    }

    public PurchaseHistoryQuery(@NotNull Optional<Integer> pageNumber, @NotNull Optional<Integer> pageSize) {
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(pageSize, "pageSize");
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PurchaseHistoryQuery(Optional optional, Optional optional2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        Optional.Absent absent = Optional.Absent.f13523a;
        this(i2 != 0 ? absent : optional, (i & 2) != 0 ? absent : optional2);
    }
}
