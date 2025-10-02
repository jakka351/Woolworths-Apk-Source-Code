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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CouponType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "COFFEE_CUP", "UNKNOWN", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
/* loaded from: classes7.dex */
public final class CouponType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CouponType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;

    @SerializedName("COFFEE_CUP")
    public static final CouponType COFFEE_CUP = new CouponType("COFFEE_CUP", 0, "coffeecup");

    @SerializedName("UNKNOWN")
    public static final CouponType UNKNOWN = new CouponType("UNKNOWN", 1, "UNKNOWN");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CouponType$Companion;", "", "<init>", "()V", "fromStatusValue", "Lcom/woolworths/scanlibrary/models/cart/CouponType;", "type", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CouponType fromStatusValue(@Nullable String type) {
            for (CouponType couponType : CouponType.values()) {
                if (Intrinsics.c(couponType.getType(), type)) {
                    return couponType;
                }
            }
            return CouponType.UNKNOWN;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CouponType[] $values() {
        return new CouponType[]{COFFEE_CUP, UNKNOWN};
    }

    static {
        CouponType[] couponTypeArr$values = $values();
        $VALUES = couponTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(couponTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private CouponType(String str, int i, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<CouponType> getEntries() {
        return $ENTRIES;
    }

    public static CouponType valueOf(String str) {
        return (CouponType) Enum.valueOf(CouponType.class, str);
    }

    public static CouponType[] values() {
        return (CouponType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
