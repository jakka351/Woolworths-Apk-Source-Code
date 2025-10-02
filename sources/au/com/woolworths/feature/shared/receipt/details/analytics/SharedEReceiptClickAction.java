package au.com.woolworths.feature.shared.receipt.details.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/analytics/SharedEReceiptClickAction;", "Lau/com/woolworths/android/onesite/analytics/Action;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SharedEReceiptClickAction implements Action {
    public final Screen d;
    public final Category e;
    public final String f;

    public SharedEReceiptClickAction(Screen screen) {
        Intrinsics.h(screen, "screen");
        this.d = screen;
        this.e = Category.m;
        this.f = "External Link";
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
        return (obj instanceof SharedEReceiptClickAction) && Intrinsics.c(this.d, ((SharedEReceiptClickAction) obj).d);
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return d.m("SharedEReceiptClickAction(screen=", this.d, ")");
    }
}
