package au.com.woolworths.shop.addtolist.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/ScreenAction;", "Lau/com/woolworths/android/onesite/analytics/Action;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ScreenAction implements Action {
    public final AddToListScreen d;

    public ScreenAction(AddToListScreen addToListScreen) {
        this.d = addToListScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type au.com.woolworths.shop.addtolist.analytics.ScreenAction");
        ScreenAction screenAction = (ScreenAction) obj;
        return this.d.equals(screenAction.d) && getF() == screenAction.getF() && Intrinsics.c(getG(), screenAction.getG());
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(getClass()).hashCode();
    }
}
