package au.com.woolworths.feature.shop.editorder.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/analytics/EditOrderErrorActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "ErrorImpression", "DismissButtonClick", "Lau/com/woolworths/feature/shop/editorder/analytics/EditOrderErrorActions$DismissButtonClick;", "Lau/com/woolworths/feature/shop/editorder/analytics/EditOrderErrorActions$ErrorImpression;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EditOrderErrorActions implements Action {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/analytics/EditOrderErrorActions$DismissButtonClick;", "Lau/com/woolworths/feature/shop/editorder/analytics/EditOrderErrorActions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DismissButtonClick extends EditOrderErrorActions {
        public final Screens d;
        public final Category e;
        public final String f;

        public DismissButtonClick(Screens screen) {
            Intrinsics.h(screen, "screen");
            this.d = screen;
            this.e = Category.m;
            this.f = "Dismiss CMO fatal error modal";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getO() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getN() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DismissButtonClick) && this.d == ((DismissButtonClick) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "DismissButtonClick(screen=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/analytics/EditOrderErrorActions$ErrorImpression;", "Lau/com/woolworths/feature/shop/editorder/analytics/EditOrderErrorActions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorImpression extends EditOrderErrorActions {
        public final Screens d;
        public final Category e;
        public final String f;

        public ErrorImpression(Screens screen) {
            Intrinsics.h(screen, "screen");
            this.d = screen;
            this.e = Category.v;
            this.f = "CMO fatal error";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getO() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getN() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorImpression) && this.d == ((ErrorImpression) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "ErrorImpression(screen=" + this.d + ")";
        }
    }
}
