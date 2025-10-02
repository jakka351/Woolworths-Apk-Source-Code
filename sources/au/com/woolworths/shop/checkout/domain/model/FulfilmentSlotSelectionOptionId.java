package au.com.woolworths.shop.checkout.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentSlotSelectionOptionId;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentSlotSelectionOptionId {
    public static final FulfilmentSlotSelectionOptionId d;
    public static final FulfilmentSlotSelectionOptionId e;
    public static final FulfilmentSlotSelectionOptionId f;
    public static final /* synthetic */ FulfilmentSlotSelectionOptionId[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId = new FulfilmentSlotSelectionOptionId("DIRECT_TO_BOOT", 0);
        d = fulfilmentSlotSelectionOptionId;
        FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId2 = new FulfilmentSlotSelectionOptionId("ELOCKER", 1);
        e = fulfilmentSlotSelectionOptionId2;
        FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId3 = new FulfilmentSlotSelectionOptionId("SELF_SERVICE", 2);
        f = fulfilmentSlotSelectionOptionId3;
        FulfilmentSlotSelectionOptionId[] fulfilmentSlotSelectionOptionIdArr = {fulfilmentSlotSelectionOptionId, fulfilmentSlotSelectionOptionId2, fulfilmentSlotSelectionOptionId3};
        g = fulfilmentSlotSelectionOptionIdArr;
        h = EnumEntriesKt.a(fulfilmentSlotSelectionOptionIdArr);
    }

    public static FulfilmentSlotSelectionOptionId valueOf(String str) {
        return (FulfilmentSlotSelectionOptionId) Enum.valueOf(FulfilmentSlotSelectionOptionId.class, str);
    }

    public static FulfilmentSlotSelectionOptionId[] values() {
        return (FulfilmentSlotSelectionOptionId[]) g.clone();
    }
}
