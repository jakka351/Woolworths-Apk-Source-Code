package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TapGestureDetector_androidKt {
    public static final boolean a(PointerEvent pointerEvent) {
        MotionEvent motionEventA;
        return ((Build.VERSION.SDK_INT < 29 || (motionEventA = pointerEvent.a()) == null) ? 0 : motionEventA.getClassification()) == 2;
    }
}
