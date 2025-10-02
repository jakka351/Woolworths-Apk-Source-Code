package com.scandit.datacapture.core.ui.gesture;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class b implements ZoomGestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18930a;

    public b(SwipeToZoom owner) {
        Intrinsics.h(owner, "owner");
        this.f18930a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGestureListener
    public final void onZoomInGesture(ZoomGesture zoomGesture) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(zoomGesture, "zoomGesture");
        SwipeToZoom swipeToZoom = (SwipeToZoom) this.f18930a.get();
        if (swipeToZoom == null || (copyOnWriteArraySet = swipeToZoom.b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ZoomGestureListener) it.next()).onZoomInGesture(zoomGesture);
        }
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGestureListener
    public final void onZoomOutGesture(ZoomGesture zoomGesture) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(zoomGesture, "zoomGesture");
        SwipeToZoom swipeToZoom = (SwipeToZoom) this.f18930a.get();
        if (swipeToZoom == null || (copyOnWriteArraySet = swipeToZoom.b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ZoomGestureListener) it.next()).onZoomOutGesture(zoomGesture);
        }
    }
}
