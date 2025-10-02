package androidx.activity;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ DynamicRangeProfiles c(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener e(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    public static /* synthetic */ EditorBoundsInfo.Builder g() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback j(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher l(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
