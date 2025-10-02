package au.com.woolworths.feature.shop.catalogue.productlist.model;

import YU.a;
import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003J\u008b\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 ¨\u00064"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/model/CatalogueProductDetailsList;", "", "itemId", "", "itemName", lqlqqlq.mmm006Dm006Dm, "itemImage", "startDate", "Ljava/util/Date;", "endDate", "dateDisplay", "termsAndConditions", "skuCode", "prices", "", "Lau/com/woolworths/feature/shop/catalogue/productlist/model/CatalogueProductDetailsPrices;", "additionalItems", "Lau/com/woolworths/feature/shop/catalogue/productlist/model/CatalogueProductDetailsAdditionalItems;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getItemId", "()Ljava/lang/String;", "getItemName", "getDescription", "getItemImage", "getStartDate", "()Ljava/util/Date;", "getEndDate", "getDateDisplay", "getTermsAndConditions", "getSkuCode", "getPrices", "()Ljava/util/List;", "getAdditionalItems", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueProductDetailsList {
    public static final int $stable = 8;

    @SerializedName("additionalSkus")
    @Nullable
    private final List<CatalogueProductDetailsAdditionalItems> additionalItems;

    @SerializedName("dateDisplay")
    @NotNull
    private final String dateDisplay;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @Nullable
    private final String description;

    @SerializedName("endDate")
    @NotNull
    private final Date endDate;

    @SerializedName("itemId")
    @NotNull
    private final String itemId;

    @SerializedName("itemImage")
    @Nullable
    private final String itemImage;

    @SerializedName("itemName")
    @Nullable
    private final String itemName;

    @SerializedName("prices")
    @NotNull
    private final List<CatalogueProductDetailsPrices> prices;

    @SerializedName("SKU")
    @NotNull
    private final String skuCode;

    @SerializedName("startDate")
    @NotNull
    private final Date startDate;

    @SerializedName("terms")
    @NotNull
    private final String termsAndConditions;

    public CatalogueProductDetailsList(@NotNull String itemId, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Date startDate, @NotNull Date endDate, @NotNull String dateDisplay, @NotNull String termsAndConditions, @NotNull String skuCode, @NotNull List<CatalogueProductDetailsPrices> prices, @Nullable List<CatalogueProductDetailsAdditionalItems> list) {
        Intrinsics.h(itemId, "itemId");
        Intrinsics.h(startDate, "startDate");
        Intrinsics.h(endDate, "endDate");
        Intrinsics.h(dateDisplay, "dateDisplay");
        Intrinsics.h(termsAndConditions, "termsAndConditions");
        Intrinsics.h(skuCode, "skuCode");
        Intrinsics.h(prices, "prices");
        this.itemId = itemId;
        this.itemName = str;
        this.description = str2;
        this.itemImage = str3;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateDisplay = dateDisplay;
        this.termsAndConditions = termsAndConditions;
        this.skuCode = skuCode;
        this.prices = prices;
        this.additionalItems = list;
    }

    public static /* synthetic */ CatalogueProductDetailsList copy$default(CatalogueProductDetailsList catalogueProductDetailsList, String str, String str2, String str3, String str4, Date date, Date date2, String str5, String str6, String str7, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogueProductDetailsList.itemId;
        }
        if ((i & 2) != 0) {
            str2 = catalogueProductDetailsList.itemName;
        }
        if ((i & 4) != 0) {
            str3 = catalogueProductDetailsList.description;
        }
        if ((i & 8) != 0) {
            str4 = catalogueProductDetailsList.itemImage;
        }
        if ((i & 16) != 0) {
            date = catalogueProductDetailsList.startDate;
        }
        if ((i & 32) != 0) {
            date2 = catalogueProductDetailsList.endDate;
        }
        if ((i & 64) != 0) {
            str5 = catalogueProductDetailsList.dateDisplay;
        }
        if ((i & 128) != 0) {
            str6 = catalogueProductDetailsList.termsAndConditions;
        }
        if ((i & 256) != 0) {
            str7 = catalogueProductDetailsList.skuCode;
        }
        if ((i & 512) != 0) {
            list = catalogueProductDetailsList.prices;
        }
        if ((i & 1024) != 0) {
            list2 = catalogueProductDetailsList.additionalItems;
        }
        List list3 = list;
        List list4 = list2;
        String str8 = str6;
        String str9 = str7;
        Date date3 = date2;
        String str10 = str5;
        Date date4 = date;
        String str11 = str3;
        return catalogueProductDetailsList.copy(str, str2, str11, str4, date4, date3, str10, str8, str9, list3, list4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    public final List<CatalogueProductDetailsPrices> component10() {
        return this.prices;
    }

    @Nullable
    public final List<CatalogueProductDetailsAdditionalItems> component11() {
        return this.additionalItems;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getItemImage() {
        return this.itemImage;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Date getStartDate() {
        return this.startDate;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Date getEndDate() {
        return this.endDate;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getDateDisplay() {
        return this.dateDisplay;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getSkuCode() {
        return this.skuCode;
    }

    @NotNull
    public final CatalogueProductDetailsList copy(@NotNull String itemId, @Nullable String itemName, @Nullable String description, @Nullable String itemImage, @NotNull Date startDate, @NotNull Date endDate, @NotNull String dateDisplay, @NotNull String termsAndConditions, @NotNull String skuCode, @NotNull List<CatalogueProductDetailsPrices> prices, @Nullable List<CatalogueProductDetailsAdditionalItems> additionalItems) {
        Intrinsics.h(itemId, "itemId");
        Intrinsics.h(startDate, "startDate");
        Intrinsics.h(endDate, "endDate");
        Intrinsics.h(dateDisplay, "dateDisplay");
        Intrinsics.h(termsAndConditions, "termsAndConditions");
        Intrinsics.h(skuCode, "skuCode");
        Intrinsics.h(prices, "prices");
        return new CatalogueProductDetailsList(itemId, itemName, description, itemImage, startDate, endDate, dateDisplay, termsAndConditions, skuCode, prices, additionalItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogueProductDetailsList)) {
            return false;
        }
        CatalogueProductDetailsList catalogueProductDetailsList = (CatalogueProductDetailsList) other;
        return Intrinsics.c(this.itemId, catalogueProductDetailsList.itemId) && Intrinsics.c(this.itemName, catalogueProductDetailsList.itemName) && Intrinsics.c(this.description, catalogueProductDetailsList.description) && Intrinsics.c(this.itemImage, catalogueProductDetailsList.itemImage) && Intrinsics.c(this.startDate, catalogueProductDetailsList.startDate) && Intrinsics.c(this.endDate, catalogueProductDetailsList.endDate) && Intrinsics.c(this.dateDisplay, catalogueProductDetailsList.dateDisplay) && Intrinsics.c(this.termsAndConditions, catalogueProductDetailsList.termsAndConditions) && Intrinsics.c(this.skuCode, catalogueProductDetailsList.skuCode) && Intrinsics.c(this.prices, catalogueProductDetailsList.prices) && Intrinsics.c(this.additionalItems, catalogueProductDetailsList.additionalItems);
    }

    @Nullable
    public final List<CatalogueProductDetailsAdditionalItems> getAdditionalItems() {
        return this.additionalItems;
    }

    @NotNull
    public final String getDateDisplay() {
        return this.dateDisplay;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Date getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getItemImage() {
        return this.itemImage;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @NotNull
    public final List<CatalogueProductDetailsPrices> getPrices() {
        return this.prices;
    }

    @NotNull
    public final String getSkuCode() {
        return this.skuCode;
    }

    @NotNull
    public final Date getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public int hashCode() {
        int iHashCode = this.itemId.hashCode() * 31;
        String str = this.itemName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemImage;
        int iD = b.d(b.c(b.c(b.c((this.endDate.hashCode() + ((this.startDate.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31, 31, this.dateDisplay), 31, this.termsAndConditions), 31, this.skuCode), 31, this.prices);
        List<CatalogueProductDetailsAdditionalItems> list = this.additionalItems;
        return iD + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        String str2 = this.itemName;
        String str3 = this.description;
        String str4 = this.itemImage;
        Date date = this.startDate;
        Date date2 = this.endDate;
        String str5 = this.dateDisplay;
        String str6 = this.termsAndConditions;
        String str7 = this.skuCode;
        List<CatalogueProductDetailsPrices> list = this.prices;
        List<CatalogueProductDetailsAdditionalItems> list2 = this.additionalItems;
        StringBuilder sbV = a.v("CatalogueProductDetailsList(itemId=", str, ", itemName=", str2, ", description=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", itemImage=", str4, ", startDate=");
        sbV.append(date);
        sbV.append(", endDate=");
        sbV.append(date2);
        sbV.append(", dateDisplay=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", termsAndConditions=", str6, ", skuCode=");
        au.com.woolworths.android.onesite.a.B(sbV, str7, ", prices=", list, ", additionalItems=");
        return android.support.v4.media.session.a.t(sbV, list2, ")");
    }
}
