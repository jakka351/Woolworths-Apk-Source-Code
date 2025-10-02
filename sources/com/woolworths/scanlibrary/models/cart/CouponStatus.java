package com.woolworths.scanlibrary.models.cart;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CouponStatus;", "", "status", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "REDEEMED", "UNUSED", "UNKNOWN", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
/* loaded from: classes7.dex */
public final class CouponStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CouponStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String status;

    @SerializedName("REDEEMED")
    public static final CouponStatus REDEEMED = new CouponStatus("REDEEMED", 0, "Redeemed");

    @SerializedName("UNUSED")
    public static final CouponStatus UNUSED = new CouponStatus("UNUSED", 1, "Unused");

    @SerializedName("UNKNOWN")
    public static final CouponStatus UNKNOWN = new CouponStatus("UNKNOWN", 2, "UNKNOWN");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CouponStatus$Companion;", "", "<init>", "()V", "fromStatusValue", "Lcom/woolworths/scanlibrary/models/cart/CouponStatus;", "status", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CouponStatus fromStatusValue(@Nullable String status) {
            for (CouponStatus couponStatus : CouponStatus.values()) {
                if (Intrinsics.c(couponStatus.getStatus(), status)) {
                    return couponStatus;
                }
            }
            return CouponStatus.UNKNOWN;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CouponStatus[] $values() {
        return new CouponStatus[]{REDEEMED, UNUSED, UNKNOWN};
    }

    static {
        CouponStatus[] couponStatusArr$values = $values();
        $VALUES = couponStatusArr$values;
        $ENTRIES = EnumEntriesKt.a(couponStatusArr$values);
        INSTANCE = new Companion(null);
    }

    private CouponStatus(String str, int i, String str2) {
        this.status = str2;
    }

    @NotNull
    public static EnumEntries<CouponStatus> getEntries() {
        return $ENTRIES;
    }

    public static CouponStatus valueOf(String str) {
        return (CouponStatus) Enum.valueOf(CouponStatus.class, str);
    }

    public static CouponStatus[] values() {
        return (CouponStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
