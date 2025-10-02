package com.woolworths.scanlibrary.models.cart;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006$"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/Coupon;", "", "couponCode", "", "sequenceNumber", "", "type", "Lcom/woolworths/scanlibrary/models/cart/CouponType;", "status", "Lcom/woolworths/scanlibrary/models/cart/CouponStatus;", "message", "title", "<init>", "(Ljava/lang/String;ILcom/woolworths/scanlibrary/models/cart/CouponType;Lcom/woolworths/scanlibrary/models/cart/CouponStatus;Ljava/lang/String;Ljava/lang/String;)V", "getCouponCode", "()Ljava/lang/String;", "getSequenceNumber", "()I", "getType", "()Lcom/woolworths/scanlibrary/models/cart/CouponType;", "getStatus", "()Lcom/woolworths/scanlibrary/models/cart/CouponStatus;", "getMessage", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Coupon {
    public static final int $stable = 0;

    @SerializedName("couponCode")
    @NotNull
    private final String couponCode;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("sequenceNumber")
    private final int sequenceNumber;

    @SerializedName("status")
    @NotNull
    private final CouponStatus status;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("type")
    @NotNull
    private final CouponType type;

    public Coupon(@NotNull String couponCode, int i, @NotNull CouponType type, @NotNull CouponStatus status, @NotNull String message, @NotNull String title) {
        Intrinsics.h(couponCode, "couponCode");
        Intrinsics.h(type, "type");
        Intrinsics.h(status, "status");
        Intrinsics.h(message, "message");
        Intrinsics.h(title, "title");
        this.couponCode = couponCode;
        this.sequenceNumber = i;
        this.type = type;
        this.status = status;
        this.message = message;
        this.title = title;
    }

    public static /* synthetic */ Coupon copy$default(Coupon coupon, String str, int i, CouponType couponType, CouponStatus couponStatus, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = coupon.couponCode;
        }
        if ((i2 & 2) != 0) {
            i = coupon.sequenceNumber;
        }
        if ((i2 & 4) != 0) {
            couponType = coupon.type;
        }
        if ((i2 & 8) != 0) {
            couponStatus = coupon.status;
        }
        if ((i2 & 16) != 0) {
            str2 = coupon.message;
        }
        if ((i2 & 32) != 0) {
            str3 = coupon.title;
        }
        String str4 = str2;
        String str5 = str3;
        return coupon.copy(str, i, couponType, couponStatus, str4, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCouponCode() {
        return this.couponCode;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CouponType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CouponStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Coupon copy(@NotNull String couponCode, int sequenceNumber, @NotNull CouponType type, @NotNull CouponStatus status, @NotNull String message, @NotNull String title) {
        Intrinsics.h(couponCode, "couponCode");
        Intrinsics.h(type, "type");
        Intrinsics.h(status, "status");
        Intrinsics.h(message, "message");
        Intrinsics.h(title, "title");
        return new Coupon(couponCode, sequenceNumber, type, status, message, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coupon)) {
            return false;
        }
        Coupon coupon = (Coupon) other;
        return Intrinsics.c(this.couponCode, coupon.couponCode) && this.sequenceNumber == coupon.sequenceNumber && this.type == coupon.type && this.status == coupon.status && Intrinsics.c(this.message, coupon.message) && Intrinsics.c(this.title, coupon.title);
    }

    @NotNull
    public final String getCouponCode() {
        return this.couponCode;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    @NotNull
    public final CouponStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final CouponType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.title.hashCode() + b.c((this.status.hashCode() + ((this.type.hashCode() + b.a(this.sequenceNumber, this.couponCode.hashCode() * 31, 31)) * 31)) * 31, 31, this.message);
    }

    @NotNull
    public String toString() {
        String str = this.couponCode;
        int i = this.sequenceNumber;
        CouponType couponType = this.type;
        CouponStatus couponStatus = this.status;
        String str2 = this.message;
        String str3 = this.title;
        StringBuilder sbU = b.u("Coupon(couponCode=", i, str, ", sequenceNumber=", ", type=");
        sbU.append(couponType);
        sbU.append(", status=");
        sbU.append(couponStatus);
        sbU.append(", message=");
        return a.l(sbU, str2, ", title=", str3, ")");
    }

    public /* synthetic */ Coupon(String str, int i, CouponType couponType, CouponStatus couponStatus, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, couponType, couponStatus, str2, str3);
    }
}
