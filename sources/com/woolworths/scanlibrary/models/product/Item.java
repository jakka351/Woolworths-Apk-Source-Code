package com.woolworths.scanlibrary.models.product;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.scanlibrary.util.widget.ImageItem;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001|Bù\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010&J\b\u0010O\u001a\u00020\u0007H\u0016J\b\u0010P\u001a\u00020\u0007H\u0016J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0007HÆ\u0003J\t\u0010`\u001a\u00020\tHÆ\u0003J\t\u0010a\u001a\u00020\tHÆ\u0003J\u0013\u0010b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fHÆ\u0003J\t\u0010c\u001a\u00020\u000fHÆ\u0003J\t\u0010d\u001a\u00020\u0011HÆ\u0003J\t\u0010e\u001a\u00020\u0007HÆ\u0003J\t\u0010f\u001a\u00020\u0014HÆ\u0003J\u0013\u0010g\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fHÆ\u0003J\t\u0010h\u001a\u00020\u0017HÆ\u0003J\t\u0010i\u001a\u00020\u0007HÆ\u0003J\t\u0010j\u001a\u00020\tHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010m\u001a\u00020\u000fHÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010DJ\t\u0010o\u001a\u00020\u0007HÆ\u0003J\t\u0010p\u001a\u00020\u0007HÆ\u0003J\t\u0010q\u001a\u00020\tHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010s\u001a\u00020\u001eHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u009e\u0002\u0010u\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010#\u001a\u00020\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010vJ\u0013\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010z\u001a\u00020\tHÖ\u0001J\t\u0010{\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R \u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010,R\u0016\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010,R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0016\u0010\u001c\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00105R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0016\u0010\u001f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010,R\u0016\u0010 \u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010,R\u0016\u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010.R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010,R\u001e\u0010#\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010$\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010,R\u0015\u0010Q\u001a\u00060RR\u00020\u00008F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0015\u0010U\u001a\u00060RR\u00020\u00008F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0011\u0010W\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bX\u0010,R\u0011\u0010Y\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bZ\u00107R\u0011\u0010[\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010,¨\u0006}"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/Item;", "Lcom/woolworths/scanlibrary/util/widget/ImageItem;", "offers", "Lcom/woolworths/scanlibrary/models/product/Offers;", "images", "Lcom/woolworths/scanlibrary/models/product/Images;", "eannumber", "", "quantity", "", "defaultqty", "matchedpromotions", "", "", "saleprice", "", "discountamount", "Ljava/math/BigDecimal;", lqlqqlq.mmm006Dm006Dm, "itemIs", "Lcom/woolworths/scanlibrary/models/product/Is;", "missedpromotions", "instoreprice", "Lcom/woolworths/scanlibrary/models/product/Instoreprice;", "linenumber", "supplyLimit", "measure", "tareCode", "listprice", "size", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "articlenumber", "incrementalquantity", "updated", "weight", "inStoreLocation", "<init>", "(Lcom/woolworths/scanlibrary/models/product/Offers;Lcom/woolworths/scanlibrary/models/product/Images;Ljava/lang/String;IILjava/util/List;DLjava/math/BigDecimal;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/product/Is;Ljava/util/List;Lcom/woolworths/scanlibrary/models/product/Instoreprice;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;DLjava/lang/Float;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;FLjava/lang/String;)V", "getOffers", "()Lcom/woolworths/scanlibrary/models/product/Offers;", "getImages", "()Lcom/woolworths/scanlibrary/models/product/Images;", "getEannumber", "()Ljava/lang/String;", "getQuantity", "()I", "setQuantity", "(I)V", "getDefaultqty", "getMatchedpromotions", "()Ljava/util/List;", "getSaleprice", "()D", "getDiscountamount", "()Ljava/math/BigDecimal;", "getDescription", "getItemIs", "()Lcom/woolworths/scanlibrary/models/product/Is;", "getMissedpromotions", "getInstoreprice", "()Lcom/woolworths/scanlibrary/models/product/Instoreprice;", "getLinenumber", "getSupplyLimit", "getMeasure", "getTareCode", "getListprice", "getSize", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getName", "getArticlenumber", "getIncrementalquantity", "getUpdated", "getWeight", "()F", "setWeight", "(F)V", "getInStoreLocation", "getImagePath", "getEan", "unitPrice", "Lcom/woolworths/scanlibrary/models/product/Item$Amount;", "getUnitPrice", "()Lcom/woolworths/scanlibrary/models/product/Item$Amount;", "amount", "getAmount", "formattedDescription", "getFormattedDescription", "amountOfSaving", "getAmountOfSaving", "formattedUnitPriceLabel", "getFormattedUnitPriceLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Lcom/woolworths/scanlibrary/models/product/Offers;Lcom/woolworths/scanlibrary/models/product/Images;Ljava/lang/String;IILjava/util/List;DLjava/math/BigDecimal;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/product/Is;Ljava/util/List;Lcom/woolworths/scanlibrary/models/product/Instoreprice;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;DLjava/lang/Float;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;FLjava/lang/String;)Lcom/woolworths/scanlibrary/models/product/Item;", "equals", "", "other", "hashCode", "toString", "Amount", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Item implements ImageItem {
    public static final int $stable = 8;

    @SerializedName("articlenumber")
    @NotNull
    private final String articlenumber;

    @SerializedName("defaultqty")
    private final int defaultqty;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("discountamount")
    @NotNull
    private final BigDecimal discountamount;

    @SerializedName("eannumber")
    @NotNull
    private final String eannumber;

    @SerializedName("images")
    @NotNull
    private final Images images;

    @SerializedName("instorelocation")
    @Nullable
    private final String inStoreLocation;

    @SerializedName("incrementalquantity")
    private final int incrementalquantity;

    @SerializedName("instoreprice")
    @NotNull
    private final Instoreprice instoreprice;

    @SerializedName("is")
    @NotNull
    private final Is itemIs;

    @SerializedName("linenumber")
    @NotNull
    private final String linenumber;

    @SerializedName("listprice")
    private final double listprice;

    @SerializedName("matchedpromotions")
    @Nullable
    private final List<Object> matchedpromotions;

    @SerializedName("measure")
    @Nullable
    private final String measure;

    @SerializedName("missedpromotions")
    @Nullable
    private final List<Object> missedpromotions;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("offers")
    @Nullable
    private final Offers offers;

    @SerializedName("quantity")
    private int quantity;

    @SerializedName("saleprice")
    private final double saleprice;

    @SerializedName("size")
    @Nullable
    private final Float size;

    @SerializedName("supplyLimit")
    private final int supplyLimit;

    @SerializedName("tareCode")
    @Nullable
    private final String tareCode;

    @SerializedName("updated")
    @Nullable
    private final String updated;

    @SerializedName("weight")
    private float weight;

    public Item(@Nullable Offers offers, @NotNull Images images, @NotNull String eannumber, int i, int i2, @Nullable List<? extends Object> list, double d, @NotNull BigDecimal discountamount, @NotNull String description, @NotNull Is itemIs, @Nullable List<? extends Object> list2, @NotNull Instoreprice instoreprice, @NotNull String linenumber, int i3, @Nullable String str, @Nullable String str2, double d2, @Nullable Float f, @NotNull String name, @NotNull String articlenumber, int i4, @Nullable String str3, float f2, @Nullable String str4) {
        Intrinsics.h(images, "images");
        Intrinsics.h(eannumber, "eannumber");
        Intrinsics.h(discountamount, "discountamount");
        Intrinsics.h(description, "description");
        Intrinsics.h(itemIs, "itemIs");
        Intrinsics.h(instoreprice, "instoreprice");
        Intrinsics.h(linenumber, "linenumber");
        Intrinsics.h(name, "name");
        Intrinsics.h(articlenumber, "articlenumber");
        this.offers = offers;
        this.images = images;
        this.eannumber = eannumber;
        this.quantity = i;
        this.defaultqty = i2;
        this.matchedpromotions = list;
        this.saleprice = d;
        this.discountamount = discountamount;
        this.description = description;
        this.itemIs = itemIs;
        this.missedpromotions = list2;
        this.instoreprice = instoreprice;
        this.linenumber = linenumber;
        this.supplyLimit = i3;
        this.measure = str;
        this.tareCode = str2;
        this.listprice = d2;
        this.size = f;
        this.name = name;
        this.articlenumber = articlenumber;
        this.incrementalquantity = i4;
        this.updated = str3;
        this.weight = f2;
        this.inStoreLocation = str4;
    }

    public static /* synthetic */ Item copy$default(Item item, Offers offers, Images images, String str, int i, int i2, List list, double d, BigDecimal bigDecimal, String str2, Is is, List list2, Instoreprice instoreprice, String str3, int i3, String str4, String str5, double d2, Float f, String str6, String str7, int i4, String str8, float f2, String str9, int i5, Object obj) {
        String str10;
        float f3;
        Offers offers2 = (i5 & 1) != 0 ? item.offers : offers;
        Images images2 = (i5 & 2) != 0 ? item.images : images;
        String str11 = (i5 & 4) != 0 ? item.eannumber : str;
        int i6 = (i5 & 8) != 0 ? item.quantity : i;
        int i7 = (i5 & 16) != 0 ? item.defaultqty : i2;
        List list3 = (i5 & 32) != 0 ? item.matchedpromotions : list;
        double d3 = (i5 & 64) != 0 ? item.saleprice : d;
        BigDecimal bigDecimal2 = (i5 & 128) != 0 ? item.discountamount : bigDecimal;
        String str12 = (i5 & 256) != 0 ? item.description : str2;
        Is is2 = (i5 & 512) != 0 ? item.itemIs : is;
        List list4 = (i5 & 1024) != 0 ? item.missedpromotions : list2;
        Instoreprice instoreprice2 = (i5 & 2048) != 0 ? item.instoreprice : instoreprice;
        String str13 = (i5 & 4096) != 0 ? item.linenumber : str3;
        Offers offers3 = offers2;
        int i8 = (i5 & 8192) != 0 ? item.supplyLimit : i3;
        String str14 = (i5 & 16384) != 0 ? item.measure : str4;
        String str15 = (i5 & 32768) != 0 ? item.tareCode : str5;
        String str16 = str14;
        double d4 = (i5 & 65536) != 0 ? item.listprice : d2;
        Float f4 = (i5 & 131072) != 0 ? item.size : f;
        String str17 = (i5 & 262144) != 0 ? item.name : str6;
        Float f5 = f4;
        String str18 = (i5 & 524288) != 0 ? item.articlenumber : str7;
        int i9 = (i5 & 1048576) != 0 ? item.incrementalquantity : i4;
        String str19 = (i5 & 2097152) != 0 ? item.updated : str8;
        float f6 = (i5 & 4194304) != 0 ? item.weight : f2;
        if ((i5 & 8388608) != 0) {
            f3 = f6;
            str10 = item.inStoreLocation;
        } else {
            str10 = str9;
            f3 = f6;
        }
        return item.copy(offers3, images2, str11, i6, i7, list3, d3, bigDecimal2, str12, is2, list4, instoreprice2, str13, i8, str16, str15, d4, f5, str17, str18, i9, str19, f3, str10);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Offers getOffers() {
        return this.offers;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final Is getItemIs() {
        return this.itemIs;
    }

    @Nullable
    public final List<Object> component11() {
        return this.missedpromotions;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final Instoreprice getInstoreprice() {
        return this.instoreprice;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getLinenumber() {
        return this.linenumber;
    }

    /* renamed from: component14, reason: from getter */
    public final int getSupplyLimit() {
        return this.supplyLimit;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getMeasure() {
        return this.measure;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getTareCode() {
        return this.tareCode;
    }

    /* renamed from: component17, reason: from getter */
    public final double getListprice() {
        return this.listprice;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Float getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Images getImages() {
        return this.images;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final String getArticlenumber() {
        return this.articlenumber;
    }

    /* renamed from: component21, reason: from getter */
    public final int getIncrementalquantity() {
        return this.incrementalquantity;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getUpdated() {
        return this.updated;
    }

    /* renamed from: component23, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getInStoreLocation() {
        return this.inStoreLocation;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEannumber() {
        return this.eannumber;
    }

    /* renamed from: component4, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDefaultqty() {
        return this.defaultqty;
    }

    @Nullable
    public final List<Object> component6() {
        return this.matchedpromotions;
    }

    /* renamed from: component7, reason: from getter */
    public final double getSaleprice() {
        return this.saleprice;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BigDecimal getDiscountamount() {
        return this.discountamount;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Item copy(@Nullable Offers offers, @NotNull Images images, @NotNull String eannumber, int quantity, int defaultqty, @Nullable List<? extends Object> matchedpromotions, double saleprice, @NotNull BigDecimal discountamount, @NotNull String description, @NotNull Is itemIs, @Nullable List<? extends Object> missedpromotions, @NotNull Instoreprice instoreprice, @NotNull String linenumber, int supplyLimit, @Nullable String measure, @Nullable String tareCode, double listprice, @Nullable Float size, @NotNull String name, @NotNull String articlenumber, int incrementalquantity, @Nullable String updated, float weight, @Nullable String inStoreLocation) {
        Intrinsics.h(images, "images");
        Intrinsics.h(eannumber, "eannumber");
        Intrinsics.h(discountamount, "discountamount");
        Intrinsics.h(description, "description");
        Intrinsics.h(itemIs, "itemIs");
        Intrinsics.h(instoreprice, "instoreprice");
        Intrinsics.h(linenumber, "linenumber");
        Intrinsics.h(name, "name");
        Intrinsics.h(articlenumber, "articlenumber");
        return new Item(offers, images, eannumber, quantity, defaultqty, matchedpromotions, saleprice, discountamount, description, itemIs, missedpromotions, instoreprice, linenumber, supplyLimit, measure, tareCode, listprice, size, name, articlenumber, incrementalquantity, updated, weight, inStoreLocation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return Intrinsics.c(this.offers, item.offers) && Intrinsics.c(this.images, item.images) && Intrinsics.c(this.eannumber, item.eannumber) && this.quantity == item.quantity && this.defaultqty == item.defaultqty && Intrinsics.c(this.matchedpromotions, item.matchedpromotions) && Double.compare(this.saleprice, item.saleprice) == 0 && Intrinsics.c(this.discountamount, item.discountamount) && Intrinsics.c(this.description, item.description) && Intrinsics.c(this.itemIs, item.itemIs) && Intrinsics.c(this.missedpromotions, item.missedpromotions) && Intrinsics.c(this.instoreprice, item.instoreprice) && Intrinsics.c(this.linenumber, item.linenumber) && this.supplyLimit == item.supplyLimit && Intrinsics.c(this.measure, item.measure) && Intrinsics.c(this.tareCode, item.tareCode) && Double.compare(this.listprice, item.listprice) == 0 && Intrinsics.c(this.size, item.size) && Intrinsics.c(this.name, item.name) && Intrinsics.c(this.articlenumber, item.articlenumber) && this.incrementalquantity == item.incrementalquantity && Intrinsics.c(this.updated, item.updated) && Float.compare(this.weight, item.weight) == 0 && Intrinsics.c(this.inStoreLocation, item.inStoreLocation);
    }

    @NotNull
    public final Amount getAmount() {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.saleprice);
        Intrinsics.g(bigDecimalValueOf, "valueOf(...)");
        return new Amount(this, bigDecimalValueOf);
    }

    @NotNull
    public final BigDecimal getAmountOfSaving() {
        return this.discountamount;
    }

    @NotNull
    public final String getArticlenumber() {
        return this.articlenumber;
    }

    public final int getDefaultqty() {
        return this.defaultqty;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final BigDecimal getDiscountamount() {
        return this.discountamount;
    }

    @Override // com.woolworths.scanlibrary.util.widget.ImageItem
    @NotNull
    public String getEan() {
        return this.eannumber;
    }

    @NotNull
    public final String getEannumber() {
        return this.eannumber;
    }

    @NotNull
    public final String getFormattedDescription() {
        return this.name;
    }

    @NotNull
    public final String getFormattedUnitPriceLabel() {
        return String.format("@ $%d.%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(getUnitPrice().getDollars()), Integer.valueOf(getUnitPrice().getCents()), "EACH"}, 3));
    }

    @Override // com.woolworths.scanlibrary.util.widget.ImageItem
    @NotNull
    public String getImagePath() {
        return this.images.getThumbnail();
    }

    @NotNull
    public final Images getImages() {
        return this.images;
    }

    @Nullable
    public final String getInStoreLocation() {
        return this.inStoreLocation;
    }

    public final int getIncrementalquantity() {
        return this.incrementalquantity;
    }

    @NotNull
    public final Instoreprice getInstoreprice() {
        return this.instoreprice;
    }

    @NotNull
    public final Is getItemIs() {
        return this.itemIs;
    }

    @NotNull
    public final String getLinenumber() {
        return this.linenumber;
    }

    public final double getListprice() {
        return this.listprice;
    }

    @Nullable
    public final List<Object> getMatchedpromotions() {
        return this.matchedpromotions;
    }

    @Nullable
    public final String getMeasure() {
        return this.measure;
    }

    @Nullable
    public final List<Object> getMissedpromotions() {
        return this.missedpromotions;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Offers getOffers() {
        return this.offers;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final double getSaleprice() {
        return this.saleprice;
    }

    @Nullable
    public final Float getSize() {
        return this.size;
    }

    public final int getSupplyLimit() {
        return this.supplyLimit;
    }

    @Nullable
    public final String getTareCode() {
        return this.tareCode;
    }

    @NotNull
    public final Amount getUnitPrice() {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.instoreprice.getPricegst());
        Intrinsics.g(bigDecimalValueOf, "valueOf(...)");
        return new Amount(this, bigDecimalValueOf);
    }

    @Nullable
    public final String getUpdated() {
        return this.updated;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Offers offers = this.offers;
        int iA = b.a(this.defaultqty, b.a(this.quantity, b.c((this.images.hashCode() + ((offers == null ? 0 : offers.hashCode()) * 31)) * 31, 31, this.eannumber), 31), 31);
        List<Object> list = this.matchedpromotions;
        int iHashCode = (this.itemIs.hashCode() + b.c(a.c(this.discountamount, android.support.v4.media.session.a.a(this.saleprice, (iA + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31, this.description)) * 31;
        List<Object> list2 = this.missedpromotions;
        int iA2 = b.a(this.supplyLimit, b.c((this.instoreprice.hashCode() + ((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31, 31, this.linenumber), 31);
        String str = this.measure;
        int iHashCode2 = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tareCode;
        int iA3 = android.support.v4.media.session.a.a(this.listprice, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Float f = this.size;
        int iA4 = b.a(this.incrementalquantity, b.c(b.c((iA3 + (f == null ? 0 : f.hashCode())) * 31, 31, this.name), 31, this.articlenumber), 31);
        String str3 = this.updated;
        int iB = android.support.v4.media.session.a.b(this.weight, (iA4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.inStoreLocation;
        return iB + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setQuantity(int i) {
        this.quantity = i;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    @NotNull
    public String toString() {
        Offers offers = this.offers;
        Images images = this.images;
        String str = this.eannumber;
        int i = this.quantity;
        int i2 = this.defaultqty;
        List<Object> list = this.matchedpromotions;
        double d = this.saleprice;
        BigDecimal bigDecimal = this.discountamount;
        String str2 = this.description;
        Is is = this.itemIs;
        List<Object> list2 = this.missedpromotions;
        Instoreprice instoreprice = this.instoreprice;
        String str3 = this.linenumber;
        int i3 = this.supplyLimit;
        String str4 = this.measure;
        String str5 = this.tareCode;
        double d2 = this.listprice;
        Float f = this.size;
        String str6 = this.name;
        String str7 = this.articlenumber;
        int i4 = this.incrementalquantity;
        String str8 = this.updated;
        float f2 = this.weight;
        String str9 = this.inStoreLocation;
        StringBuilder sb = new StringBuilder("Item(offers=");
        sb.append(offers);
        sb.append(", images=");
        sb.append(images);
        sb.append(", eannumber=");
        YU.a.x(i, str, ", quantity=", ", defaultqty=", sb);
        sb.append(i2);
        sb.append(", matchedpromotions=");
        sb.append(list);
        sb.append(", saleprice=");
        sb.append(d);
        sb.append(", discountamount=");
        sb.append(bigDecimal);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", itemIs=");
        sb.append(is);
        sb.append(", missedpromotions=");
        sb.append(list2);
        sb.append(", instoreprice=");
        sb.append(instoreprice);
        sb.append(", linenumber=");
        sb.append(str3);
        sb.append(", supplyLimit=");
        sb.append(i3);
        androidx.constraintlayout.core.state.a.B(sb, ", measure=", str4, ", tareCode=", str5);
        au.com.woolworths.android.onesite.a.z(sb, ", listprice=", d2, ", size=");
        sb.append(f);
        sb.append(", name=");
        sb.append(str6);
        sb.append(", articlenumber=");
        YU.a.x(i4, str7, ", incrementalquantity=", ", updated=", sb);
        sb.append(str8);
        sb.append(", weight=");
        sb.append(f2);
        sb.append(", inStoreLocation=");
        return YU.a.o(sb, str9, ")");
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nR\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/Item$Amount;", "", "price", "Ljava/math/BigDecimal;", "<init>", "(Lcom/woolworths/scanlibrary/models/product/Item;Ljava/math/BigDecimal;)V", "productUnitPrice", "", "quantity", "", "(Lcom/woolworths/scanlibrary/models/product/Item;DI)V", "dollars", "getDollars", "()I", "setDollars", "(I)V", "cents", "getCents", "setCents", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Amount {
        private int cents;
        private int dollars;
        final /* synthetic */ Item this$0;

        public Amount(@NotNull Item item, BigDecimal price) {
            Intrinsics.h(price, "price");
            this.this$0 = item;
            this.dollars = price.intValue();
            BigDecimal bigDecimalMultiply = price.multiply(new BigDecimal(100));
            Intrinsics.g(bigDecimalMultiply, "multiply(...)");
            this.cents = bigDecimalMultiply.intValue() - (this.dollars * 100);
        }

        public final int getCents() {
            return this.cents;
        }

        public final int getDollars() {
            return this.dollars;
        }

        public final void setCents(int i) {
            this.cents = i;
        }

        public final void setDollars(int i) {
            this.dollars = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Amount(Item item, double d, int i) {
            BigDecimal bigDecimalMultiply = BigDecimal.valueOf(d).multiply(BigDecimal.valueOf(i));
            Intrinsics.g(bigDecimalMultiply, "multiply(...)");
            this(item, bigDecimalMultiply);
        }
    }

    public /* synthetic */ Item(Offers offers, Images images, String str, int i, int i2, List list, double d, BigDecimal bigDecimal, String str2, Is is, List list2, Instoreprice instoreprice, String str3, int i3, String str4, String str5, double d2, Float f, String str6, String str7, int i4, String str8, float f2, String str9, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : offers, images, str, (i5 & 8) != 0 ? 0 : i, i2, (i5 & 32) != 0 ? null : list, d, bigDecimal, str2, is, (i5 & 1024) != 0 ? null : list2, instoreprice, str3, i3, (i5 & 16384) != 0 ? null : str4, (32768 & i5) != 0 ? null : str5, d2, (131072 & i5) != 0 ? null : f, str6, str7, i4, (2097152 & i5) != 0 ? null : str8, f2, (i5 & 8388608) != 0 ? null : str9);
    }
}
