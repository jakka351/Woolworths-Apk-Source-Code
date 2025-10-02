package com.woolworths.scanlibrary.models.product.search;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.product.Item;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÂ\u0003J/\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/search/SearchResponse;", "", "products", "", "Lcom/woolworths/scanlibrary/models/product/Item;", "nextPageUrl", "", "productCount", "", "<init>", "(Ljava/util/List;Ljava/lang/String;I)V", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "getNextPageUrl", "()Ljava/lang/String;", "setNextPageUrl", "(Ljava/lang/String;)V", "isEmpty", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SearchResponse {
    public static final int $stable = 8;

    @SerializedName("nextpage")
    @Nullable
    private String nextPageUrl;

    @SerializedName("product_count")
    private final int productCount;

    @SerializedName("products")
    @NotNull
    private List<Item> products;

    public SearchResponse() {
        this(null, null, 0, 7, null);
    }

    /* renamed from: component3, reason: from getter */
    private final int getProductCount() {
        return this.productCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResponse copy$default(SearchResponse searchResponse, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = searchResponse.products;
        }
        if ((i2 & 2) != 0) {
            str = searchResponse.nextPageUrl;
        }
        if ((i2 & 4) != 0) {
            i = searchResponse.productCount;
        }
        return searchResponse.copy(list, str, i);
    }

    @NotNull
    public final List<Item> component1() {
        return this.products;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getNextPageUrl() {
        return this.nextPageUrl;
    }

    @NotNull
    public final SearchResponse copy(@NotNull List<Item> products, @Nullable String nextPageUrl, int productCount) {
        Intrinsics.h(products, "products");
        return new SearchResponse(products, nextPageUrl, productCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResponse)) {
            return false;
        }
        SearchResponse searchResponse = (SearchResponse) other;
        return Intrinsics.c(this.products, searchResponse.products) && Intrinsics.c(this.nextPageUrl, searchResponse.nextPageUrl) && this.productCount == searchResponse.productCount;
    }

    @Nullable
    public final String getNextPageUrl() {
        return this.nextPageUrl;
    }

    @NotNull
    public final List<Item> getProducts() {
        return this.products;
    }

    public int hashCode() {
        int iHashCode = this.products.hashCode() * 31;
        String str = this.nextPageUrl;
        return Integer.hashCode(this.productCount) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isEmpty() {
        return this.products.isEmpty();
    }

    public final void setNextPageUrl(@Nullable String str) {
        this.nextPageUrl = str;
    }

    public final void setProducts(@NotNull List<Item> list) {
        Intrinsics.h(list, "<set-?>");
        this.products = list;
    }

    @NotNull
    public String toString() {
        List<Item> list = this.products;
        String str = this.nextPageUrl;
        int i = this.productCount;
        StringBuilder sb = new StringBuilder("SearchResponse(products=");
        sb.append(list);
        sb.append(", nextPageUrl=");
        sb.append(str);
        sb.append(", productCount=");
        return a.m(sb, i, ")");
    }

    public SearchResponse(@NotNull List<Item> products, @Nullable String str, int i) {
        Intrinsics.h(products, "products");
        this.products = products;
        this.nextPageUrl = str;
        this.productCount = i;
    }

    public /* synthetic */ SearchResponse(List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EmptyList.d : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
