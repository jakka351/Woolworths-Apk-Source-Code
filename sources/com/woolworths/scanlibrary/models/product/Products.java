package com.woolworths.scanlibrary.models.product;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/Products;", "", "productType", "", "items", "Ljava/util/ArrayList;", "Lcom/woolworths/scanlibrary/models/product/Item;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getProductType", "()Ljava/lang/String;", "getItems", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Products {
    public static final int $stable = 8;

    @SerializedName("items")
    @NotNull
    private final ArrayList<Item> items;

    @SerializedName("producttype")
    @NotNull
    private final String productType;

    public Products(@NotNull String productType, @NotNull ArrayList<Item> items) {
        Intrinsics.h(productType, "productType");
        Intrinsics.h(items, "items");
        this.productType = productType;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Products copy$default(Products products, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = products.productType;
        }
        if ((i & 2) != 0) {
            arrayList = products.items;
        }
        return products.copy(str, arrayList);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    public final ArrayList<Item> component2() {
        return this.items;
    }

    @NotNull
    public final Products copy(@NotNull String productType, @NotNull ArrayList<Item> items) {
        Intrinsics.h(productType, "productType");
        Intrinsics.h(items, "items");
        return new Products(productType, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Products)) {
            return false;
        }
        Products products = (Products) other;
        return Intrinsics.c(this.productType, products.productType) && Intrinsics.c(this.items, products.items);
    }

    @NotNull
    public final ArrayList<Item> getItems() {
        return this.items;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.productType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return d.q("Products(productType=", this.productType, ", items=", ")", this.items);
    }
}
