package au.com.woolworths.product.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.graphql.MappedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003Jg\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006;"}, d2 = {"Lau/com/woolworths/product/details/models/ProductDetailsMarketplace;", "Landroid/os/Parcelable;", "imageUrl", "", "title", "dispatchNote", "sellerName", "brandName", "info", "Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "channel", "facet", "bottomSheet", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/base/shopapp/data/models/InfoSection;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;)V", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getDispatchNote", "setDispatchNote", "getSellerName", "setSellerName", "getBrandName", "setBrandName", "getInfo", "()Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "setInfo", "(Lau/com/woolworths/base/shopapp/data/models/InfoSection;)V", "getChannel", "getFacet", "getBottomSheet", "()Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsMarketplace implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProductDetailsMarketplace> CREATOR = new Creator();

    @Nullable
    private final BottomSheetContent.Marketplace bottomSheet;

    @NotNull
    private String brandName;

    @NotNull
    private final String channel;

    @NotNull
    private String dispatchNote;

    @NotNull
    private final String facet;

    @NotNull
    private String imageUrl;

    @Nullable
    private InfoSection info;

    @NotNull
    private String sellerName;

    @MappedName
    @NotNull
    private String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductDetailsMarketplace> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductDetailsMarketplace createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductDetailsMarketplace(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (InfoSection) parcel.readParcelable(ProductDetailsMarketplace.class.getClassLoader()), parcel.readString(), parcel.readString(), (BottomSheetContent.Marketplace) parcel.readParcelable(ProductDetailsMarketplace.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductDetailsMarketplace[] newArray(int i) {
            return new ProductDetailsMarketplace[i];
        }
    }

    public ProductDetailsMarketplace(@NotNull String imageUrl, @NotNull String title, @NotNull String dispatchNote, @NotNull String sellerName, @NotNull String brandName, @Nullable InfoSection infoSection, @NotNull String channel, @NotNull String facet, @Nullable BottomSheetContent.Marketplace marketplace) {
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(dispatchNote, "dispatchNote");
        Intrinsics.h(sellerName, "sellerName");
        Intrinsics.h(brandName, "brandName");
        Intrinsics.h(channel, "channel");
        Intrinsics.h(facet, "facet");
        this.imageUrl = imageUrl;
        this.title = title;
        this.dispatchNote = dispatchNote;
        this.sellerName = sellerName;
        this.brandName = brandName;
        this.info = infoSection;
        this.channel = channel;
        this.facet = facet;
        this.bottomSheet = marketplace;
    }

    public static /* synthetic */ ProductDetailsMarketplace copy$default(ProductDetailsMarketplace productDetailsMarketplace, String str, String str2, String str3, String str4, String str5, InfoSection infoSection, String str6, String str7, BottomSheetContent.Marketplace marketplace, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productDetailsMarketplace.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = productDetailsMarketplace.title;
        }
        if ((i & 4) != 0) {
            str3 = productDetailsMarketplace.dispatchNote;
        }
        if ((i & 8) != 0) {
            str4 = productDetailsMarketplace.sellerName;
        }
        if ((i & 16) != 0) {
            str5 = productDetailsMarketplace.brandName;
        }
        if ((i & 32) != 0) {
            infoSection = productDetailsMarketplace.info;
        }
        if ((i & 64) != 0) {
            str6 = productDetailsMarketplace.channel;
        }
        if ((i & 128) != 0) {
            str7 = productDetailsMarketplace.facet;
        }
        if ((i & 256) != 0) {
            marketplace = productDetailsMarketplace.bottomSheet;
        }
        String str8 = str7;
        BottomSheetContent.Marketplace marketplace2 = marketplace;
        InfoSection infoSection2 = infoSection;
        String str9 = str6;
        String str10 = str5;
        String str11 = str3;
        return productDetailsMarketplace.copy(str, str2, str11, str4, str10, infoSection2, str9, str8, marketplace2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDispatchNote() {
        return this.dispatchNote;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSellerName() {
        return this.sellerName;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBrandName() {
        return this.brandName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final InfoSection getInfo() {
        return this.info;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getFacet() {
        return this.facet;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final BottomSheetContent.Marketplace getBottomSheet() {
        return this.bottomSheet;
    }

    @NotNull
    public final ProductDetailsMarketplace copy(@NotNull String imageUrl, @NotNull String title, @NotNull String dispatchNote, @NotNull String sellerName, @NotNull String brandName, @Nullable InfoSection info, @NotNull String channel, @NotNull String facet, @Nullable BottomSheetContent.Marketplace bottomSheet) {
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(dispatchNote, "dispatchNote");
        Intrinsics.h(sellerName, "sellerName");
        Intrinsics.h(brandName, "brandName");
        Intrinsics.h(channel, "channel");
        Intrinsics.h(facet, "facet");
        return new ProductDetailsMarketplace(imageUrl, title, dispatchNote, sellerName, brandName, info, channel, facet, bottomSheet);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailsMarketplace)) {
            return false;
        }
        ProductDetailsMarketplace productDetailsMarketplace = (ProductDetailsMarketplace) other;
        return Intrinsics.c(this.imageUrl, productDetailsMarketplace.imageUrl) && Intrinsics.c(this.title, productDetailsMarketplace.title) && Intrinsics.c(this.dispatchNote, productDetailsMarketplace.dispatchNote) && Intrinsics.c(this.sellerName, productDetailsMarketplace.sellerName) && Intrinsics.c(this.brandName, productDetailsMarketplace.brandName) && Intrinsics.c(this.info, productDetailsMarketplace.info) && Intrinsics.c(this.channel, productDetailsMarketplace.channel) && Intrinsics.c(this.facet, productDetailsMarketplace.facet) && Intrinsics.c(this.bottomSheet, productDetailsMarketplace.bottomSheet);
    }

    @Nullable
    public final BottomSheetContent.Marketplace getBottomSheet() {
        return this.bottomSheet;
    }

    @NotNull
    public final String getBrandName() {
        return this.brandName;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getDispatchNote() {
        return this.dispatchNote;
    }

    @NotNull
    public final String getFacet() {
        return this.facet;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final InfoSection getInfo() {
        return this.info;
    }

    @NotNull
    public final String getSellerName() {
        return this.sellerName;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = b.c(b.c(b.c(b.c(this.imageUrl.hashCode() * 31, 31, this.title), 31, this.dispatchNote), 31, this.sellerName), 31, this.brandName);
        InfoSection infoSection = this.info;
        int iC2 = b.c(b.c((iC + (infoSection == null ? 0 : infoSection.hashCode())) * 31, 31, this.channel), 31, this.facet);
        BottomSheetContent.Marketplace marketplace = this.bottomSheet;
        return iC2 + (marketplace != null ? marketplace.hashCode() : 0);
    }

    public final void setBrandName(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.brandName = str;
    }

    public final void setDispatchNote(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.dispatchNote = str;
    }

    public final void setImageUrl(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setInfo(@Nullable InfoSection infoSection) {
        this.info = infoSection;
    }

    public final void setSellerName(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.sellerName = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.dispatchNote;
        String str4 = this.sellerName;
        String str5 = this.brandName;
        InfoSection infoSection = this.info;
        String str6 = this.channel;
        String str7 = this.facet;
        BottomSheetContent.Marketplace marketplace = this.bottomSheet;
        StringBuilder sbV = a.v("ProductDetailsMarketplace(imageUrl=", str, ", title=", str2, ", dispatchNote=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", sellerName=", str4, ", brandName=");
        sbV.append(str5);
        sbV.append(", info=");
        sbV.append(infoSection);
        sbV.append(", channel=");
        androidx.constraintlayout.core.state.a.B(sbV, str6, ", facet=", str7, ", bottomSheet=");
        sbV.append(marketplace);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.imageUrl);
        dest.writeString(this.title);
        dest.writeString(this.dispatchNote);
        dest.writeString(this.sellerName);
        dest.writeString(this.brandName);
        dest.writeParcelable(this.info, flags);
        dest.writeString(this.channel);
        dest.writeString(this.facet);
        dest.writeParcelable(this.bottomSheet, flags);
    }
}
