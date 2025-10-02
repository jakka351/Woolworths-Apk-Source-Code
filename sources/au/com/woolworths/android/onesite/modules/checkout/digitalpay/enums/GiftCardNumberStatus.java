package au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GiftCardNumberStatus {
    public static final GiftCardNumberStatus d;
    public static final GiftCardNumberStatus e;
    public static final GiftCardNumberStatus f;
    public static final GiftCardNumberStatus g;
    public static final GiftCardNumberStatus h;
    public static final GiftCardNumberStatus i;
    public static final GiftCardNumberStatus j;
    public static final GiftCardNumberStatus k;
    public static final GiftCardNumberStatus l;
    public static final /* synthetic */ GiftCardNumberStatus[] m;

    static {
        GiftCardNumberStatus giftCardNumberStatus = new GiftCardNumberStatus("EMPTY", 0);
        d = giftCardNumberStatus;
        GiftCardNumberStatus giftCardNumberStatus2 = new GiftCardNumberStatus("INCOMPLETE_NUMBER", 1);
        e = giftCardNumberStatus2;
        GiftCardNumberStatus giftCardNumberStatus3 = new GiftCardNumberStatus("INVALID_NUMBER", 2);
        f = giftCardNumberStatus3;
        GiftCardNumberStatus giftCardNumberStatus4 = new GiftCardNumberStatus("INVALID_TYPE", 3);
        g = giftCardNumberStatus4;
        GiftCardNumberStatus giftCardNumberStatus5 = new GiftCardNumberStatus("CARD_EXPIRED", 4);
        h = giftCardNumberStatus5;
        GiftCardNumberStatus giftCardNumberStatus6 = new GiftCardNumberStatus("BRUTE_FORCE_DETECTED", 5);
        i = giftCardNumberStatus6;
        GiftCardNumberStatus giftCardNumberStatus7 = new GiftCardNumberStatus("CANNOT_GET_BALANCE", 6);
        j = giftCardNumberStatus7;
        GiftCardNumberStatus giftCardNumberStatus8 = new GiftCardNumberStatus("DUPLICATED", 7);
        k = giftCardNumberStatus8;
        GiftCardNumberStatus giftCardNumberStatus9 = new GiftCardNumberStatus("VALID", 8);
        l = giftCardNumberStatus9;
        m = new GiftCardNumberStatus[]{giftCardNumberStatus, giftCardNumberStatus2, giftCardNumberStatus3, giftCardNumberStatus4, giftCardNumberStatus5, giftCardNumberStatus6, giftCardNumberStatus7, giftCardNumberStatus8, giftCardNumberStatus9};
    }

    public static GiftCardNumberStatus valueOf(String str) {
        return (GiftCardNumberStatus) Enum.valueOf(GiftCardNumberStatus.class, str);
    }

    public static GiftCardNumberStatus[] values() {
        return (GiftCardNumberStatus[]) m.clone();
    }
}
