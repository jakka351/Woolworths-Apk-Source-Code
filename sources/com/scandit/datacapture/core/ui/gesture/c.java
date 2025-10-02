package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class c implements FocusGestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18931a;

    public c(TapToFocus owner) {
        Intrinsics.h(owner, "owner");
        this.f18931a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGestureListener
    public final void onFocusGesture(FocusGesture focusGesture, PointWithUnit point) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(focusGesture, "focusGesture");
        Intrinsics.h(point, "point");
        TapToFocus tapToFocus = (TapToFocus) this.f18931a.get();
        if (tapToFocus == null || (copyOnWriteArraySet = tapToFocus.b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((FocusGestureListener) it.next()).onFocusGesture(focusGesture, point);
        }
    }
}
