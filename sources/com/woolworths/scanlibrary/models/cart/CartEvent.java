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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CartEvent;", "", "event", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "KIOSK_METRO_GO", "KIOSK_CART_VERIFY", "INIT_CART", "UNKNOWN", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
/* loaded from: classes7.dex */
public final class CartEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CartEvent[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String event;

    @SerializedName("KIOSK_METRO_GO")
    public static final CartEvent KIOSK_METRO_GO = new CartEvent("KIOSK_METRO_GO", 0, "KIOSK_METRO_GO");

    @SerializedName("KIOSK_CART_VERIFY")
    public static final CartEvent KIOSK_CART_VERIFY = new CartEvent("KIOSK_CART_VERIFY", 1, "KIOSK_CART_VERIFY");

    @SerializedName("INIT_CART")
    public static final CartEvent INIT_CART = new CartEvent("INIT_CART", 2, "INIT_CART");

    @SerializedName("UNKNOWN")
    public static final CartEvent UNKNOWN = new CartEvent("UNKNOWN", 3, "UNKNOWN");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CartEvent$Companion;", "", "<init>", "()V", "fromEventValue", "Lcom/woolworths/scanlibrary/models/cart/CartEvent;", "event", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CartEvent fromEventValue(@Nullable String event) {
            for (CartEvent cartEvent : CartEvent.values()) {
                if (Intrinsics.c(cartEvent.getEvent(), event)) {
                    return cartEvent;
                }
            }
            return CartEvent.UNKNOWN;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CartEvent[] $values() {
        return new CartEvent[]{KIOSK_METRO_GO, KIOSK_CART_VERIFY, INIT_CART, UNKNOWN};
    }

    static {
        CartEvent[] cartEventArr$values = $values();
        $VALUES = cartEventArr$values;
        $ENTRIES = EnumEntriesKt.a(cartEventArr$values);
        INSTANCE = new Companion(null);
    }

    private CartEvent(String str, int i, String str2) {
        this.event = str2;
    }

    @NotNull
    public static EnumEntries<CartEvent> getEntries() {
        return $ENTRIES;
    }

    public static CartEvent valueOf(String str) {
        return (CartEvent) Enum.valueOf(CartEvent.class, str);
    }

    public static CartEvent[] values() {
        return (CartEvent[]) $VALUES.clone();
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }
}
