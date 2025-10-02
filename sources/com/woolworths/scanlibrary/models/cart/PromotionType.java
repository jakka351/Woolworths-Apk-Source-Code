package com.woolworths.scanlibrary.models.cart;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/PromotionType;", "", "<init>", "(Ljava/lang/String;I)V", "CART_PROMOTION", "ITEM_PROMOTION", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
/* loaded from: classes7.dex */
public final class PromotionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PromotionType[] $VALUES;

    @SerializedName("CART_PROMOTION")
    public static final PromotionType CART_PROMOTION = new PromotionType("CART_PROMOTION", 0);

    @SerializedName("ITEM_PROMOTION")
    public static final PromotionType ITEM_PROMOTION = new PromotionType("ITEM_PROMOTION", 1);

    private static final /* synthetic */ PromotionType[] $values() {
        return new PromotionType[]{CART_PROMOTION, ITEM_PROMOTION};
    }

    static {
        PromotionType[] promotionTypeArr$values = $values();
        $VALUES = promotionTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(promotionTypeArr$values);
    }

    private PromotionType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PromotionType> getEntries() {
        return $ENTRIES;
    }

    public static PromotionType valueOf(String str) {
        return (PromotionType) Enum.valueOf(PromotionType.class, str);
    }

    public static PromotionType[] values() {
        return (PromotionType[]) $VALUES.clone();
    }
}
