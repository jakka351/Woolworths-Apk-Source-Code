package au.com.woolworths.feature.shop.catalogue.common;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/common/AnalyticsAction;", "Lau/com/woolworths/android/onesite/analytics/Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnalyticsAction implements Action {
    public final Screen d;
    public final Category e;
    public final String f;

    public AnalyticsAction(Screen screen, Category category, String label) {
        Intrinsics.h(screen, "screen");
        Intrinsics.h(label, "label");
        this.d = screen;
        this.e = category;
        this.f = label;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b, reason: from getter */
    public final Category getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsAction)) {
            return false;
        }
        AnalyticsAction analyticsAction = (AnalyticsAction) obj;
        return Intrinsics.c(this.d, analyticsAction.d) && this.e == analyticsAction.e && Intrinsics.c(this.f, analyticsAction.f);
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsAction(screen=");
        sb.append(this.d);
        sb.append(", category=");
        sb.append(this.e);
        sb.append(", label=");
        return a.o(sb, this.f, ")");
    }
}
