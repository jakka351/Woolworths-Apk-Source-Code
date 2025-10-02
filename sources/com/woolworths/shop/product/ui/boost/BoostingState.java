package com.woolworths.shop.product.ui.boost;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/ui/boost/BoostingState;", "", "product-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BoostingState {
    public static final BoostingState d;
    public static final BoostingState e;
    public static final BoostingState f;
    public static final BoostingState g;
    public static final /* synthetic */ BoostingState[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        BoostingState boostingState = new BoostingState("DEFAULT", 0);
        d = boostingState;
        BoostingState boostingState2 = new BoostingState("PULSING_TEXT", 1);
        e = boostingState2;
        BoostingState boostingState3 = new BoostingState("FLING_BOOSTING", 2);
        f = boostingState3;
        BoostingState boostingState4 = new BoostingState("END", 3);
        g = boostingState4;
        BoostingState[] boostingStateArr = {boostingState, boostingState2, boostingState3, boostingState4};
        h = boostingStateArr;
        i = EnumEntriesKt.a(boostingStateArr);
    }

    public static BoostingState valueOf(String str) {
        return (BoostingState) Enum.valueOf(BoostingState.class, str);
    }

    public static BoostingState[] values() {
        return (BoostingState[]) h.clone();
    }
}
