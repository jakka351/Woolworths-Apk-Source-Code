package leakcanary;

import android.os.Handler;
import android.view.accessibility.AccessibilityNodeInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/AndroidLeakFixes$ACCESSIBILITY_NODE_INFO$apply$starvePool$1", "Ljava/lang/Runnable;", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class AndroidLeakFixes$ACCESSIBILITY_NODE_INFO$apply$starvePool$1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < 50; i++) {
            AccessibilityNodeInfo.obtain();
        }
        AndroidLeakFixes[] androidLeakFixesArr = AndroidLeakFixes.e;
        ((Handler) AndroidLeakFixes.f.getD()).postDelayed(this, 5000L);
    }
}
