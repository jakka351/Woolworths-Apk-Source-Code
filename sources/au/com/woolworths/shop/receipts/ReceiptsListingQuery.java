package au.com.woolworths.shop.receipts;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.receipts.adapter.ReceiptsListingQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptsListingQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$Data;", "Data", "Receipts", "Item", "OnReceiptFeedGroupHeader", "OnReceiptItem", "PageInfo", "Companion", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReceiptsListingQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f12826a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Receipts f12827a;

        public Data(Receipts receipts) {
            this.f12827a = receipts;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12827a, ((Data) obj).f12827a);
        }

        public final int hashCode() {
            Receipts receipts = this.f12827a;
            if (receipts == null) {
                return 0;
            }
            return receipts.hashCode();
        }

        public final String toString() {
            return "Data(receipts=" + this.f12827a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$Item;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f12828a;
        public final OnReceiptFeedGroupHeader b;
        public final OnReceiptItem c;

        public Item(String __typename, OnReceiptFeedGroupHeader onReceiptFeedGroupHeader, OnReceiptItem onReceiptItem) {
            Intrinsics.h(__typename, "__typename");
            this.f12828a = __typename;
            this.b = onReceiptFeedGroupHeader;
            this.c = onReceiptItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f12828a, item.f12828a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c);
        }

        public final int hashCode() {
            int iHashCode = this.f12828a.hashCode() * 31;
            OnReceiptFeedGroupHeader onReceiptFeedGroupHeader = this.b;
            int iHashCode2 = (iHashCode + (onReceiptFeedGroupHeader == null ? 0 : onReceiptFeedGroupHeader.f12829a.hashCode())) * 31;
            OnReceiptItem onReceiptItem = this.c;
            return iHashCode2 + (onReceiptItem != null ? onReceiptItem.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f12828a + ", onReceiptFeedGroupHeader=" + this.b + ", onReceiptItem=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$OnReceiptFeedGroupHeader;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptFeedGroupHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f12829a;

        public OnReceiptFeedGroupHeader(String str) {
            this.f12829a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnReceiptFeedGroupHeader) && Intrinsics.c(this.f12829a, ((OnReceiptFeedGroupHeader) obj).f12829a);
        }

        public final int hashCode() {
            return this.f12829a.hashCode();
        }

        public final String toString() {
            return a.h("OnReceiptFeedGroupHeader(title=", this.f12829a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$OnReceiptItem;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f12830a;
        public final String b;
        public final String c;

        public OnReceiptItem(String str, String str2, String str3) {
            this.f12830a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnReceiptItem)) {
                return false;
            }
            OnReceiptItem onReceiptItem = (OnReceiptItem) obj;
            return Intrinsics.c(this.f12830a, onReceiptItem.f12830a) && Intrinsics.c(this.b, onReceiptItem.b) && Intrinsics.c(this.c, onReceiptItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f12830a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("OnReceiptItem(id=", this.f12830a, ", displayDate=", this.b, ", displayValue="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$PageInfo;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PageInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f12831a;

        public PageInfo(Integer num) {
            this.f12831a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageInfo) && Intrinsics.c(this.f12831a, ((PageInfo) obj).f12831a);
        }

        public final int hashCode() {
            Integer num = this.f12831a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "PageInfo(nextPage=" + this.f12831a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptsListingQuery$Receipts;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Receipts {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12832a;
        public final PageInfo b;

        public Receipts(ArrayList arrayList, PageInfo pageInfo) {
            this.f12832a = arrayList;
            this.b = pageInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Receipts)) {
                return false;
            }
            Receipts receipts = (Receipts) obj;
            return this.f12832a.equals(receipts.f12832a) && this.b.equals(receipts.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12832a.hashCode() * 31);
        }

        public final String toString() {
            return "Receipts(items=" + this.f12832a + ", pageInfo=" + this.b + ")";
        }
    }

    public ReceiptsListingQuery(Optional optional) {
        this.f12826a = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ReceiptsListingQuery_ResponseAdapter.Data.f12862a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query receiptsListing($pageNumber: Int) { receipts(pageNumber: $pageNumber) { items { __typename ... on ReceiptFeedGroupHeader { title } ... on ReceiptItem { id displayDate displayValue } } pageInfo { nextPage } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiptsListingQuery) && Intrinsics.c(this.f12826a, ((ReceiptsListingQuery) obj).f12826a);
    }

    public final int hashCode() {
        return this.f12826a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "effbb47281cd7ff2a2c99efc15c70f36bc5d9d5ca2cad27ddc542647d2393b66";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "receiptsListing";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f12826a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "ReceiptsListingQuery(pageNumber=" + this.f12826a + ")";
    }
}
