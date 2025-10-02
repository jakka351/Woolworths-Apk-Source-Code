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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CartStatus;", "", "status", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "OPEN", "INTERVENTIONED", "CHECKOUT", "CANCELLED", "VOIDED", "TRANSFERED_TO_POS", "COMPLETED", "PAID", "PAID_AND_TAP_OFF", "CLOSED", "NO_ACTIVE_CART", "KIOSK_CHECKOUT", "KIOSK_CLOSED", "KIOSK_COMPLETED", "KIOSK_OPEN", "UNKNOWN", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
/* loaded from: classes7.dex */
public final class CartStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CartStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String status;

    @SerializedName("OPEN")
    public static final CartStatus OPEN = new CartStatus("OPEN", 0, "OPEN");

    @SerializedName("INTERVENTIONED")
    public static final CartStatus INTERVENTIONED = new CartStatus("INTERVENTIONED", 1, "INTERVENTIONED");

    @SerializedName("CHECKOUT")
    public static final CartStatus CHECKOUT = new CartStatus("CHECKOUT", 2, "CHECKOUT");

    @SerializedName("CANCELLED")
    public static final CartStatus CANCELLED = new CartStatus("CANCELLED", 3, "CANCELLED");

    @SerializedName("VOIDED")
    public static final CartStatus VOIDED = new CartStatus("VOIDED", 4, "VOIDED");

    @SerializedName("TRANSFERED_TO_POS")
    public static final CartStatus TRANSFERED_TO_POS = new CartStatus("TRANSFERED_TO_POS", 5, "TRANSFERED_TO_POS");

    @SerializedName("COMPLETED")
    public static final CartStatus COMPLETED = new CartStatus("COMPLETED", 6, "COMPLETED");

    @SerializedName("PAID")
    public static final CartStatus PAID = new CartStatus("PAID", 7, "PAID");

    @SerializedName("PAID_AND_TAP_OFF")
    public static final CartStatus PAID_AND_TAP_OFF = new CartStatus("PAID_AND_TAP_OFF", 8, "PAID_AND_TAP_OFF");

    @SerializedName("CLOSED")
    public static final CartStatus CLOSED = new CartStatus("CLOSED", 9, "CLOSED");

    @SerializedName("NO_ACTIVE_CART")
    public static final CartStatus NO_ACTIVE_CART = new CartStatus("NO_ACTIVE_CART", 10, "NO_ACTIVE_CART");

    @SerializedName("KIOSK_CHECKOUT")
    public static final CartStatus KIOSK_CHECKOUT = new CartStatus("KIOSK_CHECKOUT", 11, "KIOSK_CHECKOUT");

    @SerializedName("KIOSK_CLOSED")
    public static final CartStatus KIOSK_CLOSED = new CartStatus("KIOSK_CLOSED", 12, "KIOSK_CLOSED");

    @SerializedName("KIOSK_COMPLETED")
    public static final CartStatus KIOSK_COMPLETED = new CartStatus("KIOSK_COMPLETED", 13, "KIOSK_COMPLETED");

    @SerializedName("KIOSK_OPEN")
    public static final CartStatus KIOSK_OPEN = new CartStatus("KIOSK_OPEN", 14, "KIOSK_OPEN");

    @SerializedName("UNKNOWN")
    public static final CartStatus UNKNOWN = new CartStatus("UNKNOWN", 15, "UNKNOWN");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CartStatus$Companion;", "", "<init>", "()V", "fromStatusValue", "Lcom/woolworths/scanlibrary/models/cart/CartStatus;", "status", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CartStatus fromStatusValue(@Nullable String status) {
            for (CartStatus cartStatus : CartStatus.values()) {
                if (Intrinsics.c(cartStatus.getStatus(), status)) {
                    return cartStatus;
                }
            }
            return CartStatus.UNKNOWN;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CartStatus[] $values() {
        return new CartStatus[]{OPEN, INTERVENTIONED, CHECKOUT, CANCELLED, VOIDED, TRANSFERED_TO_POS, COMPLETED, PAID, PAID_AND_TAP_OFF, CLOSED, NO_ACTIVE_CART, KIOSK_CHECKOUT, KIOSK_CLOSED, KIOSK_COMPLETED, KIOSK_OPEN, UNKNOWN};
    }

    static {
        CartStatus[] cartStatusArr$values = $values();
        $VALUES = cartStatusArr$values;
        $ENTRIES = EnumEntriesKt.a(cartStatusArr$values);
        INSTANCE = new Companion(null);
    }

    private CartStatus(String str, int i, String str2) {
        this.status = str2;
    }

    @NotNull
    public static EnumEntries<CartStatus> getEntries() {
        return $ENTRIES;
    }

    public static CartStatus valueOf(String str) {
        return (CartStatus) Enum.valueOf(CartStatus.class, str);
    }

    public static CartStatus[] values() {
        return (CartStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
