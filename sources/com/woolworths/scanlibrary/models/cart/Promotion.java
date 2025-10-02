package com.woolworths.scanlibrary.models.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.api.internal.a;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008a\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00064"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/Promotion;", "", "promotionRewardType", "", "promotionDescriptions", "quantity", "", "promotionType", "Lcom/woolworths/scanlibrary/models/cart/PromotionType;", "discountAmount", "Ljava/math/BigDecimal;", "triggeredLineNumbers", "", "lastUpdated", "dateCreated", "promotionId", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/woolworths/scanlibrary/models/cart/PromotionType;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPromotionRewardType", "()Ljava/lang/String;", "getPromotionDescriptions", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPromotionType", "()Lcom/woolworths/scanlibrary/models/cart/PromotionType;", "getDiscountAmount", "()Ljava/math/BigDecimal;", "getTriggeredLineNumbers", "()Ljava/util/List;", "getLastUpdated", "getDateCreated", "getPromotionId", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/woolworths/scanlibrary/models/cart/PromotionType;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/woolworths/scanlibrary/models/cart/Promotion;", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Promotion {
    public static final int $stable = 8;

    @SerializedName("datecreated")
    @Nullable
    private final String dateCreated;

    @SerializedName("discountamount")
    @NotNull
    private final BigDecimal discountAmount;

    @SerializedName("lastupdated")
    @Nullable
    private final String lastUpdated;

    @SerializedName("promotiondescriptions")
    @Nullable
    private final String promotionDescriptions;

    @SerializedName("promotionid")
    @Nullable
    private final String promotionId;

    @SerializedName("promotionrewardtype")
    @Nullable
    private final String promotionRewardType;

    @SerializedName("promotiontype")
    @Nullable
    private final PromotionType promotionType;

    @SerializedName("quantity")
    @Nullable
    private final Integer quantity;

    @SerializedName("status")
    @Nullable
    private final String status;

    @SerializedName("triggeredlinenumbers")
    @Nullable
    private final List<String> triggeredLineNumbers;

    public Promotion(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable PromotionType promotionType, @NotNull BigDecimal discountAmount, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.h(discountAmount, "discountAmount");
        this.promotionRewardType = str;
        this.promotionDescriptions = str2;
        this.quantity = num;
        this.promotionType = promotionType;
        this.discountAmount = discountAmount;
        this.triggeredLineNumbers = list;
        this.lastUpdated = str3;
        this.dateCreated = str4;
        this.promotionId = str5;
        this.status = str6;
    }

    public static /* synthetic */ Promotion copy$default(Promotion promotion, String str, String str2, Integer num, PromotionType promotionType, BigDecimal bigDecimal, List list, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotion.promotionRewardType;
        }
        if ((i & 2) != 0) {
            str2 = promotion.promotionDescriptions;
        }
        if ((i & 4) != 0) {
            num = promotion.quantity;
        }
        if ((i & 8) != 0) {
            promotionType = promotion.promotionType;
        }
        if ((i & 16) != 0) {
            bigDecimal = promotion.discountAmount;
        }
        if ((i & 32) != 0) {
            list = promotion.triggeredLineNumbers;
        }
        if ((i & 64) != 0) {
            str3 = promotion.lastUpdated;
        }
        if ((i & 128) != 0) {
            str4 = promotion.dateCreated;
        }
        if ((i & 256) != 0) {
            str5 = promotion.promotionId;
        }
        if ((i & 512) != 0) {
            str6 = promotion.status;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        BigDecimal bigDecimal2 = bigDecimal;
        List list2 = list;
        return promotion.copy(str, str2, num, promotionType, bigDecimal2, list2, str9, str10, str7, str8);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPromotionRewardType() {
        return this.promotionRewardType;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPromotionDescriptions() {
        return this.promotionDescriptions;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final PromotionType getPromotionType() {
        return this.promotionType;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final List<String> component6() {
        return this.triggeredLineNumbers;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getDateCreated() {
        return this.dateCreated;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getPromotionId() {
        return this.promotionId;
    }

    @NotNull
    public final Promotion copy(@Nullable String promotionRewardType, @Nullable String promotionDescriptions, @Nullable Integer quantity, @Nullable PromotionType promotionType, @NotNull BigDecimal discountAmount, @Nullable List<String> triggeredLineNumbers, @Nullable String lastUpdated, @Nullable String dateCreated, @Nullable String promotionId, @Nullable String status) {
        Intrinsics.h(discountAmount, "discountAmount");
        return new Promotion(promotionRewardType, promotionDescriptions, quantity, promotionType, discountAmount, triggeredLineNumbers, lastUpdated, dateCreated, promotionId, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) other;
        return Intrinsics.c(this.promotionRewardType, promotion.promotionRewardType) && Intrinsics.c(this.promotionDescriptions, promotion.promotionDescriptions) && Intrinsics.c(this.quantity, promotion.quantity) && this.promotionType == promotion.promotionType && Intrinsics.c(this.discountAmount, promotion.discountAmount) && Intrinsics.c(this.triggeredLineNumbers, promotion.triggeredLineNumbers) && Intrinsics.c(this.lastUpdated, promotion.lastUpdated) && Intrinsics.c(this.dateCreated, promotion.dateCreated) && Intrinsics.c(this.promotionId, promotion.promotionId) && Intrinsics.c(this.status, promotion.status);
    }

    @Nullable
    public final String getDateCreated() {
        return this.dateCreated;
    }

    @NotNull
    public final BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    @Nullable
    public final String getPromotionDescriptions() {
        return this.promotionDescriptions;
    }

    @Nullable
    public final String getPromotionId() {
        return this.promotionId;
    }

    @Nullable
    public final String getPromotionRewardType() {
        return this.promotionRewardType;
    }

    @Nullable
    public final PromotionType getPromotionType() {
        return this.promotionType;
    }

    @Nullable
    public final Integer getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<String> getTriggeredLineNumbers() {
        return this.triggeredLineNumbers;
    }

    public int hashCode() {
        String str = this.promotionRewardType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promotionDescriptions;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        PromotionType promotionType = this.promotionType;
        int iC = a.c(this.discountAmount, (iHashCode3 + (promotionType == null ? 0 : promotionType.hashCode())) * 31, 31);
        List<String> list = this.triggeredLineNumbers;
        int iHashCode4 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.lastUpdated;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateCreated;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.promotionId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.promotionRewardType;
        String str2 = this.promotionDescriptions;
        Integer num = this.quantity;
        PromotionType promotionType = this.promotionType;
        BigDecimal bigDecimal = this.discountAmount;
        List<String> list = this.triggeredLineNumbers;
        String str3 = this.lastUpdated;
        String str4 = this.dateCreated;
        String str5 = this.promotionId;
        String str6 = this.status;
        StringBuilder sbV = YU.a.v("Promotion(promotionRewardType=", str, ", promotionDescriptions=", str2, ", quantity=");
        sbV.append(num);
        sbV.append(", promotionType=");
        sbV.append(promotionType);
        sbV.append(", discountAmount=");
        sbV.append(bigDecimal);
        sbV.append(", triggeredLineNumbers=");
        sbV.append(list);
        sbV.append(", lastUpdated=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", dateCreated=", str4, ", promotionId=");
        return androidx.constraintlayout.core.state.a.l(sbV, str5, ", status=", str6, ")");
    }

    public /* synthetic */ Promotion(String str, String str2, Integer num, PromotionType promotionType, BigDecimal bigDecimal, List list, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : promotionType, bigDecimal, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6);
    }
}
