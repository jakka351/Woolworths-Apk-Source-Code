package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;

/* loaded from: classes2.dex */
public class AccessibilityWindowInfoCompat {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityWindowInfo f2514a;

    @RequiresApi
    public static class Api21Impl {
    }

    @RequiresApi
    public static class Api24Impl {
    }

    @RequiresApi
    public static class Api26Impl {
    }

    @RequiresApi
    public static class Api30Impl {
    }

    @RequiresApi
    public static class Api33Impl {
    }

    @RequiresApi
    public static class Api34Impl {
        public static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public AccessibilityWindowInfoCompat(AccessibilityWindowInfo accessibilityWindowInfo) {
        this.f2514a = accessibilityWindowInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        return this.f2514a.equals(((AccessibilityWindowInfoCompat) obj).f2514a);
    }

    public final int hashCode() {
        return this.f2514a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        AccessibilityWindowInfo accessibilityWindowInfo = this.f2514a;
        accessibilityWindowInfo.getBoundsInScreen(rect);
        sb.append(accessibilityWindowInfo.getId());
        sb.append(", type=");
        int type = accessibilityWindowInfo.getType();
        sb.append(type != 1 ? type != 2 ? type != 3 ? type != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION");
        sb.append(", layer=");
        sb.append(accessibilityWindowInfo.getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(accessibilityWindowInfo.isFocused());
        sb.append(", active=");
        sb.append(accessibilityWindowInfo.isActive());
        sb.append(", hasParent=");
        AccessibilityWindowInfo parent = accessibilityWindowInfo.getParent();
        sb.append((parent != null ? new AccessibilityWindowInfoCompat(parent) : null) != null);
        sb.append(", hasChildren=");
        sb.append(accessibilityWindowInfo.getChildCount() > 0);
        sb.append(", transitionTime=");
        int i = Build.VERSION.SDK_INT;
        sb.append(i >= 34 ? Api34Impl.b(accessibilityWindowInfo) : 0L);
        sb.append(", locales=");
        sb.append(i >= 34 ? LocaleListCompat.f(Api34Impl.a(accessibilityWindowInfo)) : LocaleListCompat.b);
        sb.append(']');
        return sb.toString();
    }
}
