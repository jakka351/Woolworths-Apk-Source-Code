package au.com.woolworths.feature.product.list.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.data.remote.AlternativeProductsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lau/com/woolworths/feature/product/list/data/IngredientCardApiData;", "Landroid/os/Parcelable;", "ingredientDetails", "", "swapButton", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", AlternativeProductsQuery.OPERATION_NAME, "", "Lau/com/woolworths/product/models/ProductCard;", "analytics", "Lau/com/woolworths/feature/product/list/data/IngredientAnalyticsApiData;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;Ljava/util/List;Lau/com/woolworths/feature/product/list/data/IngredientAnalyticsApiData;)V", "getIngredientDetails", "()Ljava/lang/String;", "getSwapButton", "()Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "getAlternativeProducts", "()Ljava/util/List;", "getAnalytics", "()Lau/com/woolworths/feature/product/list/data/IngredientAnalyticsApiData;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IngredientCardApiData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IngredientCardApiData> CREATOR = new Creator();

    @NotNull
    private final List<ProductCard> alternativeProducts;

    @NotNull
    private final IngredientAnalyticsApiData analytics;

    @NotNull
    private final String ingredientDetails;

    @Nullable
    private final ButtonApiData swapButton;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IngredientCardApiData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IngredientCardApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            ButtonApiData buttonApiData = (ButtonApiData) parcel.readParcelable(IngredientCardApiData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(IngredientCardApiData.class, parcel, arrayList, iA, 1);
            }
            return new IngredientCardApiData(string, buttonApiData, arrayList, IngredientAnalyticsApiData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IngredientCardApiData[] newArray(int i) {
            return new IngredientCardApiData[i];
        }
    }

    public IngredientCardApiData(@NotNull String ingredientDetails, @Nullable ButtonApiData buttonApiData, @NotNull List<ProductCard> alternativeProducts, @NotNull IngredientAnalyticsApiData analytics) {
        Intrinsics.h(ingredientDetails, "ingredientDetails");
        Intrinsics.h(alternativeProducts, "alternativeProducts");
        Intrinsics.h(analytics, "analytics");
        this.ingredientDetails = ingredientDetails;
        this.swapButton = buttonApiData;
        this.alternativeProducts = alternativeProducts;
        this.analytics = analytics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IngredientCardApiData copy$default(IngredientCardApiData ingredientCardApiData, String str, ButtonApiData buttonApiData, List list, IngredientAnalyticsApiData ingredientAnalyticsApiData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ingredientCardApiData.ingredientDetails;
        }
        if ((i & 2) != 0) {
            buttonApiData = ingredientCardApiData.swapButton;
        }
        if ((i & 4) != 0) {
            list = ingredientCardApiData.alternativeProducts;
        }
        if ((i & 8) != 0) {
            ingredientAnalyticsApiData = ingredientCardApiData.analytics;
        }
        return ingredientCardApiData.copy(str, buttonApiData, list, ingredientAnalyticsApiData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIngredientDetails() {
        return this.ingredientDetails;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ButtonApiData getSwapButton() {
        return this.swapButton;
    }

    @NotNull
    public final List<ProductCard> component3() {
        return this.alternativeProducts;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IngredientAnalyticsApiData getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final IngredientCardApiData copy(@NotNull String ingredientDetails, @Nullable ButtonApiData swapButton, @NotNull List<ProductCard> alternativeProducts, @NotNull IngredientAnalyticsApiData analytics) {
        Intrinsics.h(ingredientDetails, "ingredientDetails");
        Intrinsics.h(alternativeProducts, "alternativeProducts");
        Intrinsics.h(analytics, "analytics");
        return new IngredientCardApiData(ingredientDetails, swapButton, alternativeProducts, analytics);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngredientCardApiData)) {
            return false;
        }
        IngredientCardApiData ingredientCardApiData = (IngredientCardApiData) other;
        return Intrinsics.c(this.ingredientDetails, ingredientCardApiData.ingredientDetails) && Intrinsics.c(this.swapButton, ingredientCardApiData.swapButton) && Intrinsics.c(this.alternativeProducts, ingredientCardApiData.alternativeProducts) && Intrinsics.c(this.analytics, ingredientCardApiData.analytics);
    }

    @NotNull
    public final List<ProductCard> getAlternativeProducts() {
        return this.alternativeProducts;
    }

    @NotNull
    public final IngredientAnalyticsApiData getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final String getIngredientDetails() {
        return this.ingredientDetails;
    }

    @Nullable
    public final ButtonApiData getSwapButton() {
        return this.swapButton;
    }

    public int hashCode() {
        int iHashCode = this.ingredientDetails.hashCode() * 31;
        ButtonApiData buttonApiData = this.swapButton;
        return this.analytics.hashCode() + b.d((iHashCode + (buttonApiData == null ? 0 : buttonApiData.hashCode())) * 31, 31, this.alternativeProducts);
    }

    @NotNull
    public String toString() {
        return "IngredientCardApiData(ingredientDetails=" + this.ingredientDetails + ", swapButton=" + this.swapButton + ", alternativeProducts=" + this.alternativeProducts + ", analytics=" + this.analytics + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.ingredientDetails);
        dest.writeParcelable(this.swapButton, flags);
        Iterator itU = a.u(this.alternativeProducts, dest);
        while (itU.hasNext()) {
            dest.writeParcelable((Parcelable) itU.next(), flags);
        }
        this.analytics.writeToParcel(dest, flags);
    }
}
