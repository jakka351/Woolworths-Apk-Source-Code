package au.com.woolworths.shop.cart.ui.quickadd;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferConfetti;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class QuickAddOfferConfetti {
    public static final QuickAddOfferConfetti e;
    public static final QuickAddOfferConfetti f;
    public static final /* synthetic */ QuickAddOfferConfetti[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int d;

    static {
        QuickAddOfferConfetti quickAddOfferConfetti = new QuickAddOfferConfetti("BuyMoreSaveMoreApplied", 0, R.array.confetti_buy_more_save_more);
        e = quickAddOfferConfetti;
        QuickAddOfferConfetti quickAddOfferConfetti2 = new QuickAddOfferConfetti("MemberPriceApplied", 1, R.array.confetti_member_price);
        f = quickAddOfferConfetti2;
        QuickAddOfferConfetti[] quickAddOfferConfettiArr = {quickAddOfferConfetti, quickAddOfferConfetti2};
        g = quickAddOfferConfettiArr;
        h = EnumEntriesKt.a(quickAddOfferConfettiArr);
    }

    public QuickAddOfferConfetti(String str, int i, int i2) {
        this.d = i2;
    }

    public static QuickAddOfferConfetti valueOf(String str) {
        return (QuickAddOfferConfetti) Enum.valueOf(QuickAddOfferConfetti.class, str);
    }

    public static QuickAddOfferConfetti[] values() {
        return (QuickAddOfferConfetti[]) g.clone();
    }
}
