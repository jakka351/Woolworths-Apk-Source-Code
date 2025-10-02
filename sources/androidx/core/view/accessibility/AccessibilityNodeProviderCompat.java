package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

/* loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f2512a;

    public static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeProviderCompat f2513a;

        public AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f2513a = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatB = this.f2513a.b(i);
            if (accessibilityNodeInfoCompatB == null) {
                return null;
            }
            return accessibilityNodeInfoCompatB.f2508a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List findAccessibilityNodeInfosByText(String str, int i) {
            this.f2513a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatC = this.f2513a.c(i);
            if (accessibilityNodeInfoCompatC == null) {
                return null;
            }
            return accessibilityNodeInfoCompatC.f2508a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f2513a.d(i, i2, bundle);
        }
    }

    @RequiresApi
    public static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2513a.a(i, new AccessibilityNodeInfoCompat(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        this.f2512a = new AccessibilityNodeProviderApi26(this);
    }

    public void a(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    public AccessibilityNodeInfoCompat b(int i) {
        return null;
    }

    public AccessibilityNodeInfoCompat c(int i) {
        return null;
    }

    public boolean d(int i, int i2, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f2512a = accessibilityNodeProvider;
    }
}
