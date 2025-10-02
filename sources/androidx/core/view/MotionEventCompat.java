package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class MotionEventCompat {
    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
