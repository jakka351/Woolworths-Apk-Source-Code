package com.woolworths.scanlibrary.models.cart;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/PendingPromotion;", "", "promotionId", "", "sequenceNumber", "voucherMessage", "isApproved", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getPromotionId", "()Ljava/lang/String;", "getSequenceNumber", "getVoucherMessage", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Request", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PendingPromotion {
    public static final int $stable = 0;

    @SerializedName("isApproved")
    private final boolean isApproved;

    @SerializedName("promotionId")
    @NotNull
    private final String promotionId;

    @SerializedName("sequenceNumber")
    @NotNull
    private final String sequenceNumber;

    @SerializedName("voucherMessage")
    @NotNull
    private final String voucherMessage;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/PendingPromotion$Request;", "", "promotionId", "", "sequenceNumber", "isApproved", "", "<init>", "(Lcom/woolworths/scanlibrary/models/cart/PendingPromotion;Ljava/lang/String;Ljava/lang/String;Z)V", "getPromotionId", "()Ljava/lang/String;", "getSequenceNumber", "()Z", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Request {

        @SerializedName("isApproved")
        private final boolean isApproved;

        @SerializedName("promotionId")
        @NotNull
        private final String promotionId;

        @SerializedName("sequenceNumber")
        @NotNull
        private final String sequenceNumber;
        final /* synthetic */ PendingPromotion this$0;

        public Request(@NotNull PendingPromotion pendingPromotion, @NotNull String promotionId, String sequenceNumber, boolean z) {
            Intrinsics.h(promotionId, "promotionId");
            Intrinsics.h(sequenceNumber, "sequenceNumber");
            this.this$0 = pendingPromotion;
            this.promotionId = promotionId;
            this.sequenceNumber = sequenceNumber;
            this.isApproved = z;
        }

        @NotNull
        public final String getPromotionId() {
            return this.promotionId;
        }

        @NotNull
        public final String getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: isApproved, reason: from getter */
        public final boolean getIsApproved() {
            return this.isApproved;
        }
    }

    public PendingPromotion(@NotNull String promotionId, @NotNull String sequenceNumber, @NotNull String voucherMessage, boolean z) {
        Intrinsics.h(promotionId, "promotionId");
        Intrinsics.h(sequenceNumber, "sequenceNumber");
        Intrinsics.h(voucherMessage, "voucherMessage");
        this.promotionId = promotionId;
        this.sequenceNumber = sequenceNumber;
        this.voucherMessage = voucherMessage;
        this.isApproved = z;
    }

    public static /* synthetic */ PendingPromotion copy$default(PendingPromotion pendingPromotion, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingPromotion.promotionId;
        }
        if ((i & 2) != 0) {
            str2 = pendingPromotion.sequenceNumber;
        }
        if ((i & 4) != 0) {
            str3 = pendingPromotion.voucherMessage;
        }
        if ((i & 8) != 0) {
            z = pendingPromotion.isApproved;
        }
        return pendingPromotion.copy(str, str2, str3, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPromotionId() {
        return this.promotionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSequenceNumber() {
        return this.sequenceNumber;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getVoucherMessage() {
        return this.voucherMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsApproved() {
        return this.isApproved;
    }

    @NotNull
    public final PendingPromotion copy(@NotNull String promotionId, @NotNull String sequenceNumber, @NotNull String voucherMessage, boolean isApproved) {
        Intrinsics.h(promotionId, "promotionId");
        Intrinsics.h(sequenceNumber, "sequenceNumber");
        Intrinsics.h(voucherMessage, "voucherMessage");
        return new PendingPromotion(promotionId, sequenceNumber, voucherMessage, isApproved);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingPromotion)) {
            return false;
        }
        PendingPromotion pendingPromotion = (PendingPromotion) other;
        return Intrinsics.c(this.promotionId, pendingPromotion.promotionId) && Intrinsics.c(this.sequenceNumber, pendingPromotion.sequenceNumber) && Intrinsics.c(this.voucherMessage, pendingPromotion.voucherMessage) && this.isApproved == pendingPromotion.isApproved;
    }

    @NotNull
    public final String getPromotionId() {
        return this.promotionId;
    }

    @NotNull
    public final String getSequenceNumber() {
        return this.sequenceNumber;
    }

    @NotNull
    public final String getVoucherMessage() {
        return this.voucherMessage;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isApproved) + b.c(b.c(this.promotionId.hashCode() * 31, 31, this.sequenceNumber), 31, this.voucherMessage);
    }

    public final boolean isApproved() {
        return this.isApproved;
    }

    @NotNull
    public String toString() {
        String str = this.promotionId;
        String str2 = this.sequenceNumber;
        return d.r(this.voucherMessage, ", isApproved=", ")", a.v("PendingPromotion(promotionId=", str, ", sequenceNumber=", str2, ", voucherMessage="), this.isApproved);
    }
}
