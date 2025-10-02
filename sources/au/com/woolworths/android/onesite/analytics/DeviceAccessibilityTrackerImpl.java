package au.com.woolworths.android.onesite.analytics;

import android.app.Application;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/DeviceAccessibilityTrackerImpl;", "Lau/com/woolworths/android/onesite/analytics/DeviceAccessibilityTracker;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceAccessibilityTrackerImpl implements DeviceAccessibilityTracker {

    /* renamed from: a, reason: collision with root package name */
    public final Application f4056a;
    public boolean b;
    public FontScale c = FontScale.i;

    public DeviceAccessibilityTrackerImpl(Application application) {
        this.f4056a = application;
    }

    @Override // au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTracker
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTracker
    /* renamed from: b, reason: from getter */
    public final FontScale getC() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    @Override // au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTracker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r5 = this;
            android.app.Application r0 = r5.f4056a
            boolean r1 = au.com.woolworths.android.onesite.extensions.ContextExtKt.d(r0)
            r5.b = r1
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            au.com.woolworths.android.onesite.analytics.FontScale$Companion r1 = au.com.woolworths.android.onesite.analytics.FontScale.f
            r1.getClass()
            au.com.woolworths.android.onesite.analytics.FontScale r1 = au.com.woolworths.android.onesite.analytics.FontScale.i
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L22
            au.com.woolworths.android.onesite.analytics.FontScale r0 = au.com.woolworths.android.onesite.analytics.FontScale.h
            goto L39
        L22:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1066611507(0x3f933333, float:1.15)
            if (r2 <= 0) goto L31
            au.com.woolworths.android.onesite.analytics.FontScale r2 = au.com.woolworths.android.onesite.analytics.FontScale.j
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 > 0) goto L31
            r0 = r2
            goto L39
        L31:
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L38
            au.com.woolworths.android.onesite.analytics.FontScale r0 = au.com.woolworths.android.onesite.analytics.FontScale.k
            goto L39
        L38:
            r0 = r1
        L39:
            java.util.LinkedHashMap r2 = au.com.woolworths.android.onesite.analytics.FontScale.g
            float r0 = r0.d
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            au.com.woolworths.android.onesite.analytics.FontScale r0 = (au.com.woolworths.android.onesite.analytics.FontScale) r0
            if (r0 != 0) goto L4a
            goto L4b
        L4a:
            r1 = r0
        L4b:
            r5.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTrackerImpl.c():void");
    }

    @Override // au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTracker
    public final boolean d() {
        return (this.f4056a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
