package au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GiftCardPinStatus {
    public static final GiftCardPinStatus d;
    public static final GiftCardPinStatus e;
    public static final GiftCardPinStatus f;
    public static final GiftCardPinStatus g;
    public static final GiftCardPinStatus h;
    public static final GiftCardPinStatus i;
    public static final GiftCardPinStatus j;
    public static final /* synthetic */ GiftCardPinStatus[] k;

    static {
        GiftCardPinStatus giftCardPinStatus = new GiftCardPinStatus("EMPTY", 0);
        d = giftCardPinStatus;
        GiftCardPinStatus giftCardPinStatus2 = new GiftCardPinStatus("INCOMPLETE_PIN", 1);
        e = giftCardPinStatus2;
        GiftCardPinStatus giftCardPinStatus3 = new GiftCardPinStatus("CANNOT_GET_BALANCE", 2);
        f = giftCardPinStatus3;
        GiftCardPinStatus giftCardPinStatus4 = new GiftCardPinStatus("CARD_EXPIRED", 3);
        g = giftCardPinStatus4;
        GiftCardPinStatus giftCardPinStatus5 = new GiftCardPinStatus("INVALID_PIN", 4);
        h = giftCardPinStatus5;
        GiftCardPinStatus giftCardPinStatus6 = new GiftCardPinStatus("BRUTE_FORCE_DETECTED", 5);
        i = giftCardPinStatus6;
        GiftCardPinStatus giftCardPinStatus7 = new GiftCardPinStatus("VALID", 6);
        j = giftCardPinStatus7;
        k = new GiftCardPinStatus[]{giftCardPinStatus, giftCardPinStatus2, giftCardPinStatus3, giftCardPinStatus4, giftCardPinStatus5, giftCardPinStatus6, giftCardPinStatus7};
    }

    public static GiftCardPinStatus valueOf(String str) {
        return (GiftCardPinStatus) Enum.valueOf(GiftCardPinStatus.class, str);
    }

    public static GiftCardPinStatus[] values() {
        return (GiftCardPinStatus[]) k.clone();
    }
}
