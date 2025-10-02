package com.woolworths.scanlibrary.models.receipt;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.api.internal.a;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.scanlibrary.models.cart.Promotion;
import com.woolworths.scanlibrary.models.product.Images;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Ju\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/ReceiptItem;", "", "images", "Lcom/woolworths/scanlibrary/models/product/Images;", "uom", "", lqlqqlq.mmm006Dm006Dm, "quantity", "salePrice", "Ljava/math/BigDecimal;", "unitPrice", "productType", "lineNumber", "itemIs", "Lcom/woolworths/scanlibrary/models/receipt/ReceiptItemIs;", "offers", "", "Lcom/woolworths/scanlibrary/models/cart/Promotion;", "<init>", "(Lcom/woolworths/scanlibrary/models/product/Images;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/receipt/ReceiptItemIs;Ljava/util/List;)V", "getImages", "()Lcom/woolworths/scanlibrary/models/product/Images;", "getUom", "()Ljava/lang/String;", "getDescription", "getQuantity", "getSalePrice", "()Ljava/math/BigDecimal;", "getUnitPrice", "getProductType", "getLineNumber", "getItemIs", "()Lcom/woolworths/scanlibrary/models/receipt/ReceiptItemIs;", "getOffers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReceiptItem {
    public static final int $stable = 8;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("images")
    @NotNull
    private final Images images;

    @SerializedName("is")
    @NotNull
    private final ReceiptItemIs itemIs;

    @SerializedName("linenumber")
    @NotNull
    private final String lineNumber;

    @SerializedName("offers")
    @Nullable
    private final List<Promotion> offers;

    @SerializedName("producttype")
    @NotNull
    private final String productType;

    @SerializedName("quantity")
    @NotNull
    private final String quantity;

    @SerializedName("saleprice")
    @NotNull
    private final BigDecimal salePrice;

    @SerializedName("unitprice")
    @NotNull
    private final BigDecimal unitPrice;

    @SerializedName("uom")
    @NotNull
    private final String uom;

    public ReceiptItem(@NotNull Images images, @NotNull String uom, @NotNull String description, @NotNull String quantity, @NotNull BigDecimal salePrice, @NotNull BigDecimal unitPrice, @NotNull String productType, @NotNull String lineNumber, @NotNull ReceiptItemIs itemIs, @Nullable List<Promotion> list) {
        Intrinsics.h(images, "images");
        Intrinsics.h(uom, "uom");
        Intrinsics.h(description, "description");
        Intrinsics.h(quantity, "quantity");
        Intrinsics.h(salePrice, "salePrice");
        Intrinsics.h(unitPrice, "unitPrice");
        Intrinsics.h(productType, "productType");
        Intrinsics.h(lineNumber, "lineNumber");
        Intrinsics.h(itemIs, "itemIs");
        this.images = images;
        this.uom = uom;
        this.description = description;
        this.quantity = quantity;
        this.salePrice = salePrice;
        this.unitPrice = unitPrice;
        this.productType = productType;
        this.lineNumber = lineNumber;
        this.itemIs = itemIs;
        this.offers = list;
    }

    public static /* synthetic */ ReceiptItem copy$default(ReceiptItem receiptItem, Images images, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, String str5, ReceiptItemIs receiptItemIs, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            images = receiptItem.images;
        }
        if ((i & 2) != 0) {
            str = receiptItem.uom;
        }
        if ((i & 4) != 0) {
            str2 = receiptItem.description;
        }
        if ((i & 8) != 0) {
            str3 = receiptItem.quantity;
        }
        if ((i & 16) != 0) {
            bigDecimal = receiptItem.salePrice;
        }
        if ((i & 32) != 0) {
            bigDecimal2 = receiptItem.unitPrice;
        }
        if ((i & 64) != 0) {
            str4 = receiptItem.productType;
        }
        if ((i & 128) != 0) {
            str5 = receiptItem.lineNumber;
        }
        if ((i & 256) != 0) {
            receiptItemIs = receiptItem.itemIs;
        }
        if ((i & 512) != 0) {
            list = receiptItem.offers;
        }
        ReceiptItemIs receiptItemIs2 = receiptItemIs;
        List list2 = list;
        String str6 = str4;
        String str7 = str5;
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        return receiptItem.copy(images, str, str2, str3, bigDecimal3, bigDecimal4, str6, str7, receiptItemIs2, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Images getImages() {
        return this.images;
    }

    @Nullable
    public final List<Promotion> component10() {
        return this.offers;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUom() {
        return this.uom;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BigDecimal getSalePrice() {
        return this.salePrice;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getLineNumber() {
        return this.lineNumber;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final ReceiptItemIs getItemIs() {
        return this.itemIs;
    }

    @NotNull
    public final ReceiptItem copy(@NotNull Images images, @NotNull String uom, @NotNull String description, @NotNull String quantity, @NotNull BigDecimal salePrice, @NotNull BigDecimal unitPrice, @NotNull String productType, @NotNull String lineNumber, @NotNull ReceiptItemIs itemIs, @Nullable List<Promotion> offers) {
        Intrinsics.h(images, "images");
        Intrinsics.h(uom, "uom");
        Intrinsics.h(description, "description");
        Intrinsics.h(quantity, "quantity");
        Intrinsics.h(salePrice, "salePrice");
        Intrinsics.h(unitPrice, "unitPrice");
        Intrinsics.h(productType, "productType");
        Intrinsics.h(lineNumber, "lineNumber");
        Intrinsics.h(itemIs, "itemIs");
        return new ReceiptItem(images, uom, description, quantity, salePrice, unitPrice, productType, lineNumber, itemIs, offers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptItem)) {
            return false;
        }
        ReceiptItem receiptItem = (ReceiptItem) other;
        return Intrinsics.c(this.images, receiptItem.images) && Intrinsics.c(this.uom, receiptItem.uom) && Intrinsics.c(this.description, receiptItem.description) && Intrinsics.c(this.quantity, receiptItem.quantity) && Intrinsics.c(this.salePrice, receiptItem.salePrice) && Intrinsics.c(this.unitPrice, receiptItem.unitPrice) && Intrinsics.c(this.productType, receiptItem.productType) && Intrinsics.c(this.lineNumber, receiptItem.lineNumber) && Intrinsics.c(this.itemIs, receiptItem.itemIs) && Intrinsics.c(this.offers, receiptItem.offers);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Images getImages() {
        return this.images;
    }

    @NotNull
    public final ReceiptItemIs getItemIs() {
        return this.itemIs;
    }

    @NotNull
    public final String getLineNumber() {
        return this.lineNumber;
    }

    @Nullable
    public final List<Promotion> getOffers() {
        return this.offers;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    public final String getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final BigDecimal getSalePrice() {
        return this.salePrice;
    }

    @NotNull
    public final BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    @NotNull
    public final String getUom() {
        return this.uom;
    }

    public int hashCode() {
        int iHashCode = (this.itemIs.hashCode() + b.c(b.c(a.c(this.unitPrice, a.c(this.salePrice, b.c(b.c(b.c(this.images.hashCode() * 31, 31, this.uom), 31, this.description), 31, this.quantity), 31), 31), 31, this.productType), 31, this.lineNumber)) * 31;
        List<Promotion> list = this.offers;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        Images images = this.images;
        String str = this.uom;
        String str2 = this.description;
        String str3 = this.quantity;
        BigDecimal bigDecimal = this.salePrice;
        BigDecimal bigDecimal2 = this.unitPrice;
        String str4 = this.productType;
        String str5 = this.lineNumber;
        ReceiptItemIs receiptItemIs = this.itemIs;
        List<Promotion> list = this.offers;
        StringBuilder sb = new StringBuilder("ReceiptItem(images=");
        sb.append(images);
        sb.append(", uom=");
        sb.append(str);
        sb.append(", description=");
        androidx.constraintlayout.core.state.a.B(sb, str2, ", quantity=", str3, ", salePrice=");
        sb.append(bigDecimal);
        sb.append(", unitPrice=");
        sb.append(bigDecimal2);
        sb.append(", productType=");
        androidx.constraintlayout.core.state.a.B(sb, str4, ", lineNumber=", str5, ", itemIs=");
        sb.append(receiptItemIs);
        sb.append(", offers=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ReceiptItem(Images images, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, String str5, ReceiptItemIs receiptItemIs, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(images, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, bigDecimal, bigDecimal2, (i & 64) != 0 ? "" : str4, str5, receiptItemIs, (i & 512) != 0 ? null : list);
    }
}
