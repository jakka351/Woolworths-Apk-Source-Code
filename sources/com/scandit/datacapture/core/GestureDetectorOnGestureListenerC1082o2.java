package com.scandit.datacapture.core;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.module.ui.GestureListener;
import com.scandit.datacapture.core.internal.module.ui.NativeGestureType;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.o2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class GestureDetectorOnGestureListenerC1082o2 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1091p2 f18812a;

    public GestureDetectorOnGestureListenerC1082o2(C1091p2 c1091p2) {
        this.f18812a = c1091p2;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e) {
        GestureListener gestureListener;
        Intrinsics.h(e, "e");
        if (!this.f18812a.d.contains(NativeGestureType.DOUBLE_TAP) || (gestureListener = this.f18812a.c) == null) {
            return false;
        }
        return gestureListener.a(C1091p2.a(this.f18812a, e));
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e) {
        Intrinsics.h(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.h(e, "e");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        GestureListener gestureListener;
        GestureListener gestureListener2;
        Intrinsics.h(e1, "e1");
        Intrinsics.h(e2, "e2");
        EnumSet enumSet = this.f18812a.d;
        NativeGestureType nativeGestureType = NativeGestureType.SWIPE_UP;
        if (enumSet.contains(nativeGestureType) || this.f18812a.d.contains(NativeGestureType.SWIPE_DOWN) || this.f18812a.d.contains(NativeGestureType.SWIPE_LEFT) || this.f18812a.d.contains(NativeGestureType.SWIPE_RIGHT)) {
            Point pointA = C1091p2.a(this.f18812a, e1);
            Point pointA2 = C1091p2.a(this.f18812a, e2);
            float x = pointA2.getX() - pointA.getX();
            float y = pointA2.getY() - pointA.getY();
            float f3 = 2;
            if (Math.abs(y) > Math.abs(x * f3)) {
                if (y > BitmapDescriptorFactory.HUE_RED && this.f18812a.d.contains(NativeGestureType.SWIPE_DOWN)) {
                    GestureListener gestureListener3 = this.f18812a.c;
                    if (gestureListener3 != null) {
                        return gestureListener3.a();
                    }
                } else if (this.f18812a.d.contains(nativeGestureType) && (gestureListener2 = this.f18812a.c) != null) {
                    return gestureListener2.d();
                }
                return false;
            }
            if (Math.abs(x) > Math.abs(y * f3)) {
                if (x > BitmapDescriptorFactory.HUE_RED && this.f18812a.d.contains(NativeGestureType.SWIPE_RIGHT)) {
                    GestureListener gestureListener4 = this.f18812a.c;
                    if (gestureListener4 != null) {
                        return gestureListener4.c();
                    }
                } else if (this.f18812a.d.contains(NativeGestureType.SWIPE_LEFT) && (gestureListener = this.f18812a.c) != null) {
                    return gestureListener.b();
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.h(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        Intrinsics.h(e1, "e1");
        Intrinsics.h(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        Intrinsics.h(e, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        Intrinsics.h(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        GestureListener gestureListener;
        Intrinsics.h(e, "e");
        if (!this.f18812a.d.contains(NativeGestureType.TAP) || (gestureListener = this.f18812a.c) == null) {
            return false;
        }
        return gestureListener.b(C1091p2.a(this.f18812a, e));
    }
}
