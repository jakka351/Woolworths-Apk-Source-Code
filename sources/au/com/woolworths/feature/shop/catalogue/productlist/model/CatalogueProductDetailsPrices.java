package au.com.woolworths.feature.shop.catalogue.productlist.model;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006)"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/model/CatalogueProductDetailsPrices;", "Landroid/os/Parcelable;", "priceOptionDesc", "", "priceReg", "priceSale", "priceSaleSuffix", "priceRegSuffix", "priceSaleDesc", "memberPricing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPriceOptionDesc", "()Ljava/lang/String;", "getPriceReg", "getPriceSale", "getPriceSaleSuffix", "getPriceRegSuffix", "getPriceSaleDesc", "getMemberPricing", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueProductDetailsPrices implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<CatalogueProductDetailsPrices> CREATOR = new Creator();

    @SerializedName("memberPricing")
    @Nullable
    private final String memberPricing;

    @SerializedName("priceOptionDesc")
    @NotNull
    private final String priceOptionDesc;

    @SerializedName("priceReg")
    @Nullable
    private final String priceReg;

    @SerializedName("priceRegSuffix")
    @Nullable
    private final String priceRegSuffix;

    @SerializedName("priceSale")
    @Nullable
    private final String priceSale;

    @SerializedName("priceSaleDesc")
    @Nullable
    private final String priceSaleDesc;

    @SerializedName("priceSaleSuffix")
    @Nullable
    private final String priceSaleSuffix;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CatalogueProductDetailsPrices> {
        @Override // android.os.Parcelable.Creator
        public final CatalogueProductDetailsPrices createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CatalogueProductDetailsPrices(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogueProductDetailsPrices[] newArray(int i) {
            return new CatalogueProductDetailsPrices[i];
        }
    }

    public CatalogueProductDetailsPrices(@NotNull String priceOptionDesc, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.h(priceOptionDesc, "priceOptionDesc");
        this.priceOptionDesc = priceOptionDesc;
        this.priceReg = str;
        this.priceSale = str2;
        this.priceSaleSuffix = str3;
        this.priceRegSuffix = str4;
        this.priceSaleDesc = str5;
        this.memberPricing = str6;
    }

    public static /* synthetic */ CatalogueProductDetailsPrices copy$default(CatalogueProductDetailsPrices catalogueProductDetailsPrices, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogueProductDetailsPrices.priceOptionDesc;
        }
        if ((i & 2) != 0) {
            str2 = catalogueProductDetailsPrices.priceReg;
        }
        if ((i & 4) != 0) {
            str3 = catalogueProductDetailsPrices.priceSale;
        }
        if ((i & 8) != 0) {
            str4 = catalogueProductDetailsPrices.priceSaleSuffix;
        }
        if ((i & 16) != 0) {
            str5 = catalogueProductDetailsPrices.priceRegSuffix;
        }
        if ((i & 32) != 0) {
            str6 = catalogueProductDetailsPrices.priceSaleDesc;
        }
        if ((i & 64) != 0) {
            str7 = catalogueProductDetailsPrices.memberPricing;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return catalogueProductDetailsPrices.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPriceOptionDesc() {
        return this.priceOptionDesc;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPriceReg() {
        return this.priceReg;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPriceSale() {
        return this.priceSale;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPriceSaleSuffix() {
        return this.priceSaleSuffix;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPriceRegSuffix() {
        return this.priceRegSuffix;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getPriceSaleDesc() {
        return this.priceSaleDesc;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getMemberPricing() {
        return this.memberPricing;
    }

    @NotNull
    public final CatalogueProductDetailsPrices copy(@NotNull String priceOptionDesc, @Nullable String priceReg, @Nullable String priceSale, @Nullable String priceSaleSuffix, @Nullable String priceRegSuffix, @Nullable String priceSaleDesc, @Nullable String memberPricing) {
        Intrinsics.h(priceOptionDesc, "priceOptionDesc");
        return new CatalogueProductDetailsPrices(priceOptionDesc, priceReg, priceSale, priceSaleSuffix, priceRegSuffix, priceSaleDesc, memberPricing);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogueProductDetailsPrices)) {
            return false;
        }
        CatalogueProductDetailsPrices catalogueProductDetailsPrices = (CatalogueProductDetailsPrices) other;
        return Intrinsics.c(this.priceOptionDesc, catalogueProductDetailsPrices.priceOptionDesc) && Intrinsics.c(this.priceReg, catalogueProductDetailsPrices.priceReg) && Intrinsics.c(this.priceSale, catalogueProductDetailsPrices.priceSale) && Intrinsics.c(this.priceSaleSuffix, catalogueProductDetailsPrices.priceSaleSuffix) && Intrinsics.c(this.priceRegSuffix, catalogueProductDetailsPrices.priceRegSuffix) && Intrinsics.c(this.priceSaleDesc, catalogueProductDetailsPrices.priceSaleDesc) && Intrinsics.c(this.memberPricing, catalogueProductDetailsPrices.memberPricing);
    }

    @Nullable
    public final String getMemberPricing() {
        return this.memberPricing;
    }

    @NotNull
    public final String getPriceOptionDesc() {
        return this.priceOptionDesc;
    }

    @Nullable
    public final String getPriceReg() {
        return this.priceReg;
    }

    @Nullable
    public final String getPriceRegSuffix() {
        return this.priceRegSuffix;
    }

    @Nullable
    public final String getPriceSale() {
        return this.priceSale;
    }

    @Nullable
    public final String getPriceSaleDesc() {
        return this.priceSaleDesc;
    }

    @Nullable
    public final String getPriceSaleSuffix() {
        return this.priceSaleSuffix;
    }

    public int hashCode() {
        int iHashCode = this.priceOptionDesc.hashCode() * 31;
        String str = this.priceReg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.priceSale;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priceSaleSuffix;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceRegSuffix;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceSaleDesc;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.memberPricing;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.priceOptionDesc;
        String str2 = this.priceReg;
        String str3 = this.priceSale;
        String str4 = this.priceSaleSuffix;
        String str5 = this.priceRegSuffix;
        String str6 = this.priceSaleDesc;
        String str7 = this.memberPricing;
        StringBuilder sbV = a.v("CatalogueProductDetailsPrices(priceOptionDesc=", str, ", priceReg=", str2, ", priceSale=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", priceSaleSuffix=", str4, ", priceRegSuffix=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", priceSaleDesc=", str6, ", memberPricing=");
        return a.o(sbV, str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.priceOptionDesc);
        dest.writeString(this.priceReg);
        dest.writeString(this.priceSale);
        dest.writeString(this.priceSaleSuffix);
        dest.writeString(this.priceRegSuffix);
        dest.writeString(this.priceSaleDesc);
        dest.writeString(this.memberPricing);
    }
}
