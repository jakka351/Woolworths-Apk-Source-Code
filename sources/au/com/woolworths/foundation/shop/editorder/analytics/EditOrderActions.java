package au.com.woolworths.foundation.shop.editorder.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "CancelEditModeClick", "CancellationWarmingDialogImpression", "CloseCancellationWarningDialog", "ConfirmCancellationWarningDialog", "CancellationSuccess", "CancellationFailure", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CancelEditModeClick;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CancellationFailure;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CancellationSuccess;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CancellationWarmingDialogImpression;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CloseCancellationWarningDialog;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$ConfirmCancellationWarningDialog;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EditOrderActions implements Action {
    public final Screen d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CancelEditModeClick;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancelEditModeClick extends EditOrderActions {
        public final Enum e;
        public final Category f;
        public final String g;

        /* JADX WARN: Multi-variable type inference failed */
        public CancelEditModeClick(Screen screen) {
            super(screen);
            this.e = (Enum) screen;
            this.f = Category.g;
            this.g = "Change My Order - Exit Edit Mode";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancelEditModeClick) && this.e.equals(((CancelEditModeClick) obj).e);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.android.onesite.analytics.Screen, java.lang.Enum] */
        @Override // au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "CancelEditModeClick(screen=" + this.e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CancellationFailure;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancellationFailure extends EditOrderActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public CancellationFailure(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.g0;
            this.g = "Change My Order - Cancellation Failure";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancellationFailure) && Intrinsics.c(this.e, ((CancellationFailure) obj).e);
        }

        @Override // au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("CancellationFailure(screen=", this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CancellationSuccess;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancellationSuccess extends EditOrderActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public CancellationSuccess(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.g0;
            this.g = "Change My Order - Cancellation Success";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancellationSuccess) && Intrinsics.c(this.e, ((CancellationSuccess) obj).e);
        }

        @Override // au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("CancellationSuccess(screen=", this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CancellationWarmingDialogImpression;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancellationWarmingDialogImpression extends EditOrderActions {
        public final Enum e;
        public final Category f;
        public final String g;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellationWarmingDialogImpression(Screen screen) {
            super(screen);
            this.e = (Enum) screen;
            this.f = Category.u;
            this.g = "Change My Order - Cancellation Warning";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancellationWarmingDialogImpression) && this.e.equals(((CancellationWarmingDialogImpression) obj).e);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.android.onesite.analytics.Screen, java.lang.Enum] */
        @Override // au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "CancellationWarmingDialogImpression(screen=" + this.e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$CloseCancellationWarningDialog;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CloseCancellationWarningDialog extends EditOrderActions {
        public final Enum e;
        public final Category f;
        public final String g;

        /* JADX WARN: Multi-variable type inference failed */
        public CloseCancellationWarningDialog(Screen screen) {
            super(screen);
            this.e = (Enum) screen;
            this.f = Category.m;
            this.g = "Change My Order - Close Cancellation Warning";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseCancellationWarningDialog) && this.e.equals(((CloseCancellationWarningDialog) obj).e);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.android.onesite.analytics.Screen, java.lang.Enum] */
        @Override // au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "CloseCancellationWarningDialog(screen=" + this.e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions$ConfirmCancellationWarningDialog;", "Lau/com/woolworths/foundation/shop/editorder/analytics/EditOrderActions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfirmCancellationWarningDialog extends EditOrderActions {
        public final Enum e;
        public final Category f;
        public final String g;

        /* JADX WARN: Multi-variable type inference failed */
        public ConfirmCancellationWarningDialog(Screen screen) {
            super(screen);
            this.e = (Enum) screen;
            this.f = Category.m;
            this.g = "Change My Order - Confirm Cancellation Warning";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmCancellationWarningDialog) && this.e.equals(((ConfirmCancellationWarningDialog) obj).e);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.android.onesite.analytics.Screen, java.lang.Enum] */
        @Override // au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "ConfirmCancellationWarningDialog(screen=" + this.e + ")";
        }
    }

    public EditOrderActions(Screen screen) {
        this.d = screen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
