package au.com.woolworths.android.onesite.models;

import YU.a;
import androidx.annotation.VisibleForTesting;
import au.com.woolworths.android.onesite.models.products.Instoreprice;
import au.com.woolworths.android.onesite.models.trolley.MarketplaceProducts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002 !B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0017\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0002\u0010\u0007J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007R&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0007R \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lau/com/woolworths/android/onesite/models/TrolleyResult;", "", "<init>", "()V", "items", "", "Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem;", "(Ljava/util/List;)V", "totalProducts", "", "getTotalProducts", "()I", "setTotalProducts", "(I)V", "trolleyItems", "getTrolleyItems", "()Ljava/util/List;", "setTrolleyItems", "errors", "Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyError;", "getErrors", "setErrors", "marketplaceProducts", "Lau/com/woolworths/android/onesite/models/trolley/MarketplaceProducts;", "getMarketplaceProducts", "()Lau/com/woolworths/android/onesite/models/trolley/MarketplaceProducts;", "setMarketplaceProducts", "(Lau/com/woolworths/android/onesite/models/trolley/MarketplaceProducts;)V", "removePaddedZeroes", "", "toString", "", "TrolleyItem", "TrolleyError", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrolleyResult {

    @SerializedName("errors")
    @Nullable
    private List<TrolleyError> errors;

    @SerializedName("marketproducts")
    @Nullable
    private MarketplaceProducts marketplaceProducts;

    @SerializedName("totalproducts")
    private int totalProducts;

    @SerializedName("items")
    @NotNull
    private List<TrolleyItem> trolleyItems;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0005H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyError;", "", "<init>", "()V", "mArticle", "", "getMArticle", "()Ljava/lang/String;", "setMArticle", "(Ljava/lang/String;)V", "mMessage", "getMMessage", "setMMessage", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class TrolleyError {

        @SerializedName("article")
        @Nullable
        private String mArticle;

        @SerializedName("message")
        @Nullable
        private String mMessage;

        @Nullable
        public final String getMArticle() {
            return this.mArticle;
        }

        @Nullable
        public final String getMMessage() {
            return this.mMessage;
        }

        public final void setMArticle(@Nullable String str) {
            this.mArticle = str;
        }

        public final void setMMessage(@Nullable String str) {
            this.mMessage = str;
        }

        @NotNull
        public String toString() {
            return a.j("TrolleyError{article='", this.mArticle, "', message='", this.mMessage, "'}");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010)\u001a\u00020\u0005H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b(\u0010\u0007¨\u0006+"}, d2 = {"Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem;", "", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "mArticle", "getMArticle", "setMArticle", "instorePrice", "Lau/com/woolworths/android/onesite/models/products/Instoreprice;", "getInstorePrice", "()Lau/com/woolworths/android/onesite/models/products/Instoreprice;", "setInstorePrice", "(Lau/com/woolworths/android/onesite/models/products/Instoreprice;)V", "itemQuantityInTrolley", "", "getItemQuantityInTrolley", "()F", "setItemQuantityInTrolley", "(F)V", "totalItemPrice", "getTotalItemPrice", "setTotalItemPrice", "isAvailable", "", "()Z", "setAvailable", "(Z)V", "marketplace", "Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem$Marketplace;", "getMarketplace", "()Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem$Marketplace;", "setMarketplace", "(Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem$Marketplace;)V", "article", "getArticle", "toString", "Marketplace", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class TrolleyItem {

        @SerializedName("instoreprice")
        @Nullable
        private Instoreprice instorePrice;

        @SerializedName("isavailable")
        private boolean isAvailable;

        @SerializedName("itemquantityintrolley")
        private float itemQuantityInTrolley;

        @SerializedName("article")
        @Nullable
        private String mArticle;

        @SerializedName("marketplace")
        @Nullable
        private Marketplace marketplace;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        @Nullable
        private String name;

        @SerializedName("totalitemprice")
        private float totalItemPrice;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem$Marketplace;", "", "<init>", "()V", "brandName", "", "getBrandName", "()Ljava/lang/String;", "setBrandName", "(Ljava/lang/String;)V", "dispatchNote", "getDispatchNote", "setDispatchNote", "sellerName", "getSellerName", "setSellerName", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Marketplace {

            @SerializedName("brandname")
            @Nullable
            private String brandName;

            @SerializedName("dispatchnote")
            @Nullable
            private String dispatchNote;

            @SerializedName("sellername")
            @Nullable
            private String sellerName;

            @Nullable
            public final String getBrandName() {
                return this.brandName;
            }

            @Nullable
            public final String getDispatchNote() {
                return this.dispatchNote;
            }

            @Nullable
            public final String getSellerName() {
                return this.sellerName;
            }

            public final void setBrandName(@Nullable String str) {
                this.brandName = str;
            }

            public final void setDispatchNote(@Nullable String str) {
                this.dispatchNote = str;
            }

            public final void setSellerName(@Nullable String str) {
                this.sellerName = str;
            }
        }

        @NotNull
        public final String getArticle() {
            String str = this.mArticle;
            Intrinsics.e(str);
            String string = Integer.toString(Integer.parseInt(str));
            Intrinsics.g(string, "trimPaddedZeroes(...)");
            return string;
        }

        @Nullable
        public final Instoreprice getInstorePrice() {
            return this.instorePrice;
        }

        public final float getItemQuantityInTrolley() {
            return this.itemQuantityInTrolley;
        }

        @Nullable
        public final String getMArticle() {
            return this.mArticle;
        }

        @Nullable
        public final Marketplace getMarketplace() {
            return this.marketplace;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final float getTotalItemPrice() {
            return this.totalItemPrice;
        }

        /* renamed from: isAvailable, reason: from getter */
        public final boolean getIsAvailable() {
            return this.isAvailable;
        }

        public final void setAvailable(boolean z) {
            this.isAvailable = z;
        }

        public final void setInstorePrice(@Nullable Instoreprice instoreprice) {
            this.instorePrice = instoreprice;
        }

        public final void setItemQuantityInTrolley(float f) {
            this.itemQuantityInTrolley = f;
        }

        public final void setMArticle(@Nullable String str) {
            this.mArticle = str;
        }

        public final void setMarketplace(@Nullable Marketplace marketplace) {
            this.marketplace = marketplace;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setTotalItemPrice(float f) {
            this.totalItemPrice = f;
        }

        @NotNull
        public String toString() {
            return a.j("TrolleyItem{name='", this.name, "', article='", getArticle(), "'}");
        }
    }

    public TrolleyResult() {
        this.trolleyItems = EmptyList.d;
    }

    @Nullable
    public final List<TrolleyError> getErrors() {
        return this.errors;
    }

    @Nullable
    public final MarketplaceProducts getMarketplaceProducts() {
        return this.marketplaceProducts;
    }

    public final int getTotalProducts() {
        return this.totalProducts;
    }

    @NotNull
    public final List<TrolleyItem> getTrolleyItems() {
        return this.trolleyItems;
    }

    public final void removePaddedZeroes() {
        for (TrolleyItem trolleyItem : TrolleyResultExtKt.getAllGroceryAndMarketItems(this)) {
            trolleyItem.setMArticle(trolleyItem.getArticle());
        }
    }

    public final void setErrors(@Nullable List<TrolleyError> list) {
        this.errors = list;
    }

    public final void setMarketplaceProducts(@Nullable MarketplaceProducts marketplaceProducts) {
        this.marketplaceProducts = marketplaceProducts;
    }

    public final void setTotalProducts(int i) {
        this.totalProducts = i;
    }

    public final void setTrolleyItems(@NotNull List<TrolleyItem> list) {
        Intrinsics.h(list, "<set-?>");
        this.trolleyItems = list;
    }

    @NotNull
    public String toString() {
        int i = this.totalProducts;
        List<TrolleyItem> list = this.trolleyItems;
        List<TrolleyError> list2 = this.errors;
        StringBuilder sb = new StringBuilder("TrolleyResult{, totalproducts=");
        sb.append(i);
        sb.append(", items=");
        sb.append(list);
        sb.append(", errors=");
        return android.support.v4.media.session.a.t(sb, list2, "}");
    }

    @VisibleForTesting
    public TrolleyResult(@NotNull List<TrolleyItem> items) {
        Intrinsics.h(items, "items");
        this.trolleyItems = items;
        removePaddedZeroes();
    }
}
