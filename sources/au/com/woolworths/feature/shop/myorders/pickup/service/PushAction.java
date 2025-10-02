package au.com.woolworths.feature.shop.myorders.pickup.service;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PushAction {
    public static final /* synthetic */ PushAction[] d = {new PushAction("ORDER_READY", 0), new PushAction("CUSTOMER_VERIFIED", 1), new PushAction("ORDER_ACKNOWLEDGED", 2), new PushAction("FEEDBACK", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    PushAction EF5;

    public static PushAction valueOf(String str) {
        return (PushAction) Enum.valueOf(PushAction.class, str);
    }

    public static PushAction[] values() {
        return (PushAction[]) d.clone();
    }
}
