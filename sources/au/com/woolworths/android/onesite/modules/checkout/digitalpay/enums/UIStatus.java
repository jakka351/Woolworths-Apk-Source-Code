package au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class UIStatus {
    public static final UIStatus d;
    public static final UIStatus e;
    public static final /* synthetic */ UIStatus[] f;

    static {
        UIStatus uIStatus = new UIStatus("ERROR", 0);
        d = uIStatus;
        UIStatus uIStatus2 = new UIStatus("NORMAL", 1);
        e = uIStatus2;
        f = new UIStatus[]{uIStatus, uIStatus2};
    }

    public static UIStatus valueOf(String str) {
        return (UIStatus) Enum.valueOf(UIStatus.class, str);
    }

    public static UIStatus[] values() {
        return (UIStatus[]) f.clone();
    }
}
