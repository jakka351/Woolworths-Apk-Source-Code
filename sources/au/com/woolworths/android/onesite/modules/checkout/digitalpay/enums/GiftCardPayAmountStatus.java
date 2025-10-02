package au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GiftCardPayAmountStatus {
    public static final GiftCardPayAmountStatus d;
    public static final GiftCardPayAmountStatus e;
    public static final GiftCardPayAmountStatus f;
    public static final GiftCardPayAmountStatus g;
    public static final GiftCardPayAmountStatus h;
    public static final GiftCardPayAmountStatus i;
    public static final GiftCardPayAmountStatus j;
    public static final GiftCardPayAmountStatus k;
    public static final GiftCardPayAmountStatus l;
    public static final /* synthetic */ GiftCardPayAmountStatus[] m;

    static {
        GiftCardPayAmountStatus giftCardPayAmountStatus = new GiftCardPayAmountStatus("EMPTY", 0);
        d = giftCardPayAmountStatus;
        GiftCardPayAmountStatus giftCardPayAmountStatus2 = new GiftCardPayAmountStatus("INVALID", 1);
        e = giftCardPayAmountStatus2;
        GiftCardPayAmountStatus giftCardPayAmountStatus3 = new GiftCardPayAmountStatus("NO_CARD_AMOUNT_COMPARE", 2);
        f = giftCardPayAmountStatus3;
        GiftCardPayAmountStatus giftCardPayAmountStatus4 = new GiftCardPayAmountStatus("INSUFFICIENT_AMOUNT", 3);
        g = giftCardPayAmountStatus4;
        GiftCardPayAmountStatus giftCardPayAmountStatus5 = new GiftCardPayAmountStatus("CARD_EXPIRED", 4);
        h = giftCardPayAmountStatus5;
        GiftCardPayAmountStatus giftCardPayAmountStatus6 = new GiftCardPayAmountStatus("ZERO_BALANCE", 5);
        i = giftCardPayAmountStatus6;
        GiftCardPayAmountStatus giftCardPayAmountStatus7 = new GiftCardPayAmountStatus("ZERO_INPUT_AMOUNT", 6);
        j = giftCardPayAmountStatus7;
        GiftCardPayAmountStatus giftCardPayAmountStatus8 = new GiftCardPayAmountStatus("AMOUNT_EQUAL_TO_BALANCE", 7);
        k = giftCardPayAmountStatus8;
        GiftCardPayAmountStatus giftCardPayAmountStatus9 = new GiftCardPayAmountStatus("VALID", 8);
        l = giftCardPayAmountStatus9;
        m = new GiftCardPayAmountStatus[]{giftCardPayAmountStatus, giftCardPayAmountStatus2, giftCardPayAmountStatus3, giftCardPayAmountStatus4, giftCardPayAmountStatus5, giftCardPayAmountStatus6, giftCardPayAmountStatus7, giftCardPayAmountStatus8, giftCardPayAmountStatus9};
    }

    public static GiftCardPayAmountStatus valueOf(String str) {
        return (GiftCardPayAmountStatus) Enum.valueOf(GiftCardPayAmountStatus.class, str);
    }

    public static GiftCardPayAmountStatus[] values() {
        return (GiftCardPayAmountStatus[]) m.clone();
    }
}
