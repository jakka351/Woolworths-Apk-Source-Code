package au.com.woolworths.base.wallet.digipay.framesview;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ControlType;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ControlType {
    public static final ControlType e;
    public static final ControlType f;
    public static final ControlType g;
    public static final ControlType h;
    public static final /* synthetic */ ControlType[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    static {
        ControlType controlType = new ControlType("CARD_GROUP", 0, "CardGroup");
        ControlType controlType2 = new ControlType("CARD_NUMBER", 1, "CardNo");
        e = controlType2;
        ControlType controlType3 = new ControlType("CARD_EXPIRY", 2, "CardExpiry");
        f = controlType3;
        ControlType controlType4 = new ControlType("CARD_CVV", 3, "CardCVV");
        g = controlType4;
        ControlType controlType5 = new ControlType("OVERLAY", 4, "Overlay");
        h = controlType5;
        ControlType[] controlTypeArr = {controlType, controlType2, controlType3, controlType4, controlType5};
        i = controlTypeArr;
        j = EnumEntriesKt.a(controlTypeArr);
    }

    public ControlType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ControlType valueOf(String str) {
        return (ControlType) Enum.valueOf(ControlType.class, str);
    }

    public static ControlType[] values() {
        return (ControlType[]) i.clone();
    }
}
