package au.com.woolworths.shop.addtolist.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/DuplicateListSuccess;", "Lau/com/woolworths/android/onesite/analytics/Action;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DuplicateListSuccess implements Action {
    public final Screen d;
    public final Category e;
    public final String f;

    public DuplicateListSuccess(Screen screen) {
        Intrinsics.h(screen, "screen");
        this.d = screen;
        this.e = Category.g0;
        this.f = "list successfully duplicated";
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a, reason: from getter */
    public final String getG() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b, reason: from getter */
    public final Category getF() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DuplicateListSuccess) && Intrinsics.c(this.d, ((DuplicateListSuccess) obj).d);
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getE() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return d.m("DuplicateListSuccess(screen=", this.d, ")");
    }
}
