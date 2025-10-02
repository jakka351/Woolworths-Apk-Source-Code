package au.com.woolworths.base.shopapp.cartbadge;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/cartbadge/CartBadgeActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CartBadgeActions implements Action {
    public static final CartBadgeActions e;
    public static final /* synthetic */ CartBadgeActions[] f;
    public static final /* synthetic */ EnumEntries g;
    public Screen d;

    static {
        CartBadgeActions cartBadgeActions = new CartBadgeActions() { // from class: au.com.woolworths.base.shopapp.cartbadge.CartBadgeActions.CART_OPEN
            public final Category h = Category.m;
            public final String i = "Cart Open";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.h;
            }
        };
        e = cartBadgeActions;
        CartBadgeActions[] cartBadgeActionsArr = {cartBadgeActions};
        f = cartBadgeActionsArr;
        g = EnumEntriesKt.a(cartBadgeActionsArr);
    }

    public static CartBadgeActions valueOf(String str) {
        return (CartBadgeActions) Enum.valueOf(CartBadgeActions.class, str);
    }

    public static CartBadgeActions[] values() {
        return (CartBadgeActions[]) f.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        Screen screen = this.d;
        if (screen != null) {
            return screen;
        }
        Intrinsics.p("screen");
        throw null;
    }
}
