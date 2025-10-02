package au.com.woolworths.android.onesite.modules.checkout.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutStep;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckoutStep {
    public static final CheckoutStep d;
    public static final CheckoutStep e;
    public static final CheckoutStep f;
    public static final /* synthetic */ CheckoutStep[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CheckoutStep checkoutStep = new CheckoutStep("SUMMARY", 0);
        d = checkoutStep;
        CheckoutStep checkoutStep2 = new CheckoutStep("PAY", 1);
        e = checkoutStep2;
        CheckoutStep checkoutStep3 = new CheckoutStep("PAY_ERROR", 2);
        f = checkoutStep3;
        CheckoutStep[] checkoutStepArr = {checkoutStep, checkoutStep2, checkoutStep3};
        g = checkoutStepArr;
        h = EnumEntriesKt.a(checkoutStepArr);
    }

    public static CheckoutStep valueOf(String str) {
        return (CheckoutStep) Enum.valueOf(CheckoutStep.class, str);
    }

    public static CheckoutStep[] values() {
        return (CheckoutStep[]) g.clone();
    }
}
