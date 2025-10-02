package au.com.woolworths.checkout.common.responsemodels;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\t\u0010?\u001a\u00020\u0014HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0018HÆ\u0003J\t\u0010C\u001a\u00020\u0014HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J·\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0005HÆ\u0001J\u0013\u0010F\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0016\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0016\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00102R\u0016\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010/R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 ¨\u0006K"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutProduct;", "", "articleId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", lqlqqlq.mmm006Dm006Dm, "images", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutImages;", "inStorePrice", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutInStorePrice;", "totalItemPrice", "", "promotions", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutPromotions;", "itemQuantityInTrolley", "minQuantityLimit", "maxQuantityLimit", "incrementalQuantity", "allowSubstitution", "", "rewardPoints", "measure", "isCheck", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutProductIsCheck;", "isAvailable", "comment", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lau/com/woolworths/checkout/common/responsemodels/CheckoutImages;Lau/com/woolworths/checkout/common/responsemodels/CheckoutInStorePrice;FLau/com/woolworths/checkout/common/responsemodels/CheckoutPromotions;FFFFZLjava/lang/String;Ljava/lang/String;Lau/com/woolworths/checkout/common/responsemodels/CheckoutProductIsCheck;ZLjava/lang/String;)V", "getArticleId", "()J", "getName", "()Ljava/lang/String;", "getDescription", "getImages", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutImages;", "getInStorePrice", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutInStorePrice;", "getTotalItemPrice", "()F", "getPromotions", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutPromotions;", "getItemQuantityInTrolley", "getMinQuantityLimit", "getMaxQuantityLimit", "getIncrementalQuantity", "getAllowSubstitution", "()Z", "getRewardPoints", "getMeasure", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutProductIsCheck;", "getComment", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutProduct {

    @SerializedName("AllowSubstitution")
    private final boolean allowSubstitution;

    @SerializedName("Article")
    private final long articleId;

    @SerializedName("Comment")
    @NotNull
    private final String comment;

    @SerializedName("Description")
    @NotNull
    private final String description;

    @SerializedName("Images")
    @NotNull
    private final CheckoutImages images;

    @SerializedName("InStorePrice")
    @NotNull
    private final CheckoutInStorePrice inStorePrice;

    @SerializedName("IncrementalQuantity")
    private final float incrementalQuantity;

    @SerializedName("IsAvailable")
    private final boolean isAvailable;

    @SerializedName("Is")
    @NotNull
    private final CheckoutProductIsCheck isCheck;

    @SerializedName("ItemQuantityInTrolley")
    private final float itemQuantityInTrolley;

    @SerializedName("MaxQuantityLimit")
    private final float maxQuantityLimit;

    @SerializedName("Measure")
    @NotNull
    private final String measure;

    @SerializedName("MinQuantityLimit")
    private final float minQuantityLimit;

    @SerializedName("Name")
    @NotNull
    private final String name;

    @SerializedName("Promotions")
    @Nullable
    private final CheckoutPromotions promotions;

    @SerializedName("LoyaltyPoints")
    @Nullable
    private final String rewardPoints;

    @SerializedName("TotalItemPrice")
    private final float totalItemPrice;

    public CheckoutProduct(long j, @NotNull String name, @NotNull String description, @NotNull CheckoutImages images, @NotNull CheckoutInStorePrice inStorePrice, float f, @Nullable CheckoutPromotions checkoutPromotions, float f2, float f3, float f4, float f5, boolean z, @Nullable String str, @NotNull String measure, @NotNull CheckoutProductIsCheck isCheck, boolean z2, @NotNull String comment) {
        Intrinsics.h(name, "name");
        Intrinsics.h(description, "description");
        Intrinsics.h(images, "images");
        Intrinsics.h(inStorePrice, "inStorePrice");
        Intrinsics.h(measure, "measure");
        Intrinsics.h(isCheck, "isCheck");
        Intrinsics.h(comment, "comment");
        this.articleId = j;
        this.name = name;
        this.description = description;
        this.images = images;
        this.inStorePrice = inStorePrice;
        this.totalItemPrice = f;
        this.promotions = checkoutPromotions;
        this.itemQuantityInTrolley = f2;
        this.minQuantityLimit = f3;
        this.maxQuantityLimit = f4;
        this.incrementalQuantity = f5;
        this.allowSubstitution = z;
        this.rewardPoints = str;
        this.measure = measure;
        this.isCheck = isCheck;
        this.isAvailable = z2;
        this.comment = comment;
    }

    public static /* synthetic */ CheckoutProduct copy$default(CheckoutProduct checkoutProduct, long j, String str, String str2, CheckoutImages checkoutImages, CheckoutInStorePrice checkoutInStorePrice, float f, CheckoutPromotions checkoutPromotions, float f2, float f3, float f4, float f5, boolean z, String str3, String str4, CheckoutProductIsCheck checkoutProductIsCheck, boolean z2, String str5, int i, Object obj) {
        String str6;
        boolean z3;
        long j2 = (i & 1) != 0 ? checkoutProduct.articleId : j;
        String str7 = (i & 2) != 0 ? checkoutProduct.name : str;
        String str8 = (i & 4) != 0 ? checkoutProduct.description : str2;
        CheckoutImages checkoutImages2 = (i & 8) != 0 ? checkoutProduct.images : checkoutImages;
        CheckoutInStorePrice checkoutInStorePrice2 = (i & 16) != 0 ? checkoutProduct.inStorePrice : checkoutInStorePrice;
        float f6 = (i & 32) != 0 ? checkoutProduct.totalItemPrice : f;
        CheckoutPromotions checkoutPromotions2 = (i & 64) != 0 ? checkoutProduct.promotions : checkoutPromotions;
        float f7 = (i & 128) != 0 ? checkoutProduct.itemQuantityInTrolley : f2;
        float f8 = (i & 256) != 0 ? checkoutProduct.minQuantityLimit : f3;
        float f9 = (i & 512) != 0 ? checkoutProduct.maxQuantityLimit : f4;
        float f10 = (i & 1024) != 0 ? checkoutProduct.incrementalQuantity : f5;
        boolean z4 = (i & 2048) != 0 ? checkoutProduct.allowSubstitution : z;
        String str9 = (i & 4096) != 0 ? checkoutProduct.rewardPoints : str3;
        long j3 = j2;
        String str10 = (i & 8192) != 0 ? checkoutProduct.measure : str4;
        CheckoutProductIsCheck checkoutProductIsCheck2 = (i & 16384) != 0 ? checkoutProduct.isCheck : checkoutProductIsCheck;
        boolean z5 = (i & 32768) != 0 ? checkoutProduct.isAvailable : z2;
        if ((i & 65536) != 0) {
            z3 = z5;
            str6 = checkoutProduct.comment;
        } else {
            str6 = str5;
            z3 = z5;
        }
        return checkoutProduct.copy(j3, str7, str8, checkoutImages2, checkoutInStorePrice2, f6, checkoutPromotions2, f7, f8, f9, f10, z4, str9, str10, checkoutProductIsCheck2, z3, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final long getArticleId() {
        return this.articleId;
    }

    /* renamed from: component10, reason: from getter */
    public final float getMaxQuantityLimit() {
        return this.maxQuantityLimit;
    }

    /* renamed from: component11, reason: from getter */
    public final float getIncrementalQuantity() {
        return this.incrementalQuantity;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getAllowSubstitution() {
        return this.allowSubstitution;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getRewardPoints() {
        return this.rewardPoints;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getMeasure() {
        return this.measure;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final CheckoutProductIsCheck getIsCheck() {
        return this.isCheck;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CheckoutImages getImages() {
        return this.images;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CheckoutInStorePrice getInStorePrice() {
        return this.inStorePrice;
    }

    /* renamed from: component6, reason: from getter */
    public final float getTotalItemPrice() {
        return this.totalItemPrice;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final CheckoutPromotions getPromotions() {
        return this.promotions;
    }

    /* renamed from: component8, reason: from getter */
    public final float getItemQuantityInTrolley() {
        return this.itemQuantityInTrolley;
    }

    /* renamed from: component9, reason: from getter */
    public final float getMinQuantityLimit() {
        return this.minQuantityLimit;
    }

    @NotNull
    public final CheckoutProduct copy(long articleId, @NotNull String name, @NotNull String description, @NotNull CheckoutImages images, @NotNull CheckoutInStorePrice inStorePrice, float totalItemPrice, @Nullable CheckoutPromotions promotions, float itemQuantityInTrolley, float minQuantityLimit, float maxQuantityLimit, float incrementalQuantity, boolean allowSubstitution, @Nullable String rewardPoints, @NotNull String measure, @NotNull CheckoutProductIsCheck isCheck, boolean isAvailable, @NotNull String comment) {
        Intrinsics.h(name, "name");
        Intrinsics.h(description, "description");
        Intrinsics.h(images, "images");
        Intrinsics.h(inStorePrice, "inStorePrice");
        Intrinsics.h(measure, "measure");
        Intrinsics.h(isCheck, "isCheck");
        Intrinsics.h(comment, "comment");
        return new CheckoutProduct(articleId, name, description, images, inStorePrice, totalItemPrice, promotions, itemQuantityInTrolley, minQuantityLimit, maxQuantityLimit, incrementalQuantity, allowSubstitution, rewardPoints, measure, isCheck, isAvailable, comment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutProduct)) {
            return false;
        }
        CheckoutProduct checkoutProduct = (CheckoutProduct) other;
        return this.articleId == checkoutProduct.articleId && Intrinsics.c(this.name, checkoutProduct.name) && Intrinsics.c(this.description, checkoutProduct.description) && Intrinsics.c(this.images, checkoutProduct.images) && Intrinsics.c(this.inStorePrice, checkoutProduct.inStorePrice) && Float.compare(this.totalItemPrice, checkoutProduct.totalItemPrice) == 0 && Intrinsics.c(this.promotions, checkoutProduct.promotions) && Float.compare(this.itemQuantityInTrolley, checkoutProduct.itemQuantityInTrolley) == 0 && Float.compare(this.minQuantityLimit, checkoutProduct.minQuantityLimit) == 0 && Float.compare(this.maxQuantityLimit, checkoutProduct.maxQuantityLimit) == 0 && Float.compare(this.incrementalQuantity, checkoutProduct.incrementalQuantity) == 0 && this.allowSubstitution == checkoutProduct.allowSubstitution && Intrinsics.c(this.rewardPoints, checkoutProduct.rewardPoints) && Intrinsics.c(this.measure, checkoutProduct.measure) && Intrinsics.c(this.isCheck, checkoutProduct.isCheck) && this.isAvailable == checkoutProduct.isAvailable && Intrinsics.c(this.comment, checkoutProduct.comment);
    }

    public final boolean getAllowSubstitution() {
        return this.allowSubstitution;
    }

    public final long getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final CheckoutImages getImages() {
        return this.images;
    }

    @NotNull
    public final CheckoutInStorePrice getInStorePrice() {
        return this.inStorePrice;
    }

    public final float getIncrementalQuantity() {
        return this.incrementalQuantity;
    }

    public final float getItemQuantityInTrolley() {
        return this.itemQuantityInTrolley;
    }

    public final float getMaxQuantityLimit() {
        return this.maxQuantityLimit;
    }

    @NotNull
    public final String getMeasure() {
        return this.measure;
    }

    public final float getMinQuantityLimit() {
        return this.minQuantityLimit;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final CheckoutPromotions getPromotions() {
        return this.promotions;
    }

    @Nullable
    public final String getRewardPoints() {
        return this.rewardPoints;
    }

    public final float getTotalItemPrice() {
        return this.totalItemPrice;
    }

    public int hashCode() {
        int iB = a.b(this.totalItemPrice, (this.inStorePrice.hashCode() + ((this.images.hashCode() + b.c(b.c(Long.hashCode(this.articleId) * 31, 31, this.name), 31, this.description)) * 31)) * 31, 31);
        CheckoutPromotions checkoutPromotions = this.promotions;
        int iE = b.e(a.b(this.incrementalQuantity, a.b(this.maxQuantityLimit, a.b(this.minQuantityLimit, a.b(this.itemQuantityInTrolley, (iB + (checkoutPromotions == null ? 0 : checkoutPromotions.hashCode())) * 31, 31), 31), 31), 31), 31, this.allowSubstitution);
        String str = this.rewardPoints;
        return this.comment.hashCode() + b.e((this.isCheck.hashCode() + b.c((iE + (str != null ? str.hashCode() : 0)) * 31, 31, this.measure)) * 31, 31, this.isAvailable);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public final CheckoutProductIsCheck isCheck() {
        return this.isCheck;
    }

    @NotNull
    public String toString() {
        long j = this.articleId;
        String str = this.name;
        String str2 = this.description;
        CheckoutImages checkoutImages = this.images;
        CheckoutInStorePrice checkoutInStorePrice = this.inStorePrice;
        float f = this.totalItemPrice;
        CheckoutPromotions checkoutPromotions = this.promotions;
        float f2 = this.itemQuantityInTrolley;
        float f3 = this.minQuantityLimit;
        float f4 = this.maxQuantityLimit;
        float f5 = this.incrementalQuantity;
        boolean z = this.allowSubstitution;
        String str3 = this.rewardPoints;
        String str4 = this.measure;
        CheckoutProductIsCheck checkoutProductIsCheck = this.isCheck;
        boolean z2 = this.isAvailable;
        String str5 = this.comment;
        StringBuilder sb = new StringBuilder("CheckoutProduct(articleId=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", images=");
        sb.append(checkoutImages);
        sb.append(", inStorePrice=");
        sb.append(checkoutInStorePrice);
        sb.append(", totalItemPrice=");
        sb.append(f);
        sb.append(", promotions=");
        sb.append(checkoutPromotions);
        sb.append(", itemQuantityInTrolley=");
        sb.append(f2);
        sb.append(", minQuantityLimit=");
        sb.append(f3);
        sb.append(", maxQuantityLimit=");
        sb.append(f4);
        sb.append(", incrementalQuantity=");
        sb.append(f5);
        sb.append(", allowSubstitution=");
        sb.append(z);
        androidx.constraintlayout.core.state.a.B(sb, ", rewardPoints=", str3, ", measure=", str4);
        sb.append(", isCheck=");
        sb.append(checkoutProductIsCheck);
        sb.append(", isAvailable=");
        sb.append(z2);
        return YU.a.p(sb, ", comment=", str5, ")");
    }
}
