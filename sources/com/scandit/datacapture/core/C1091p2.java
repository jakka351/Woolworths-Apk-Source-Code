package com.scandit.datacapture.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.module.ui.GestureListener;
import com.scandit.datacapture.core.internal.module.ui.GestureRecognizer;
import com.scandit.datacapture.core.internal.module.ui.NativeGestureType;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.p2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1091p2 implements GestureRecognizer {

    /* renamed from: a, reason: collision with root package name */
    private final GestureDetectorOnGestureListenerC1082o2 f18815a;
    private final GestureDetector b;
    private GestureListener c;
    private EnumSet d;
    private final float e;

    public C1091p2(float f, Context context) {
        Intrinsics.h(context, "context");
        GestureDetectorOnGestureListenerC1082o2 gestureDetectorOnGestureListenerC1082o2 = new GestureDetectorOnGestureListenerC1082o2(this);
        this.f18815a = gestureDetectorOnGestureListenerC1082o2;
        this.b = new GestureDetector(context, gestureDetectorOnGestureListenerC1082o2, new Handler(Looper.getMainLooper()));
        EnumSet enumSetNoneOf = EnumSet.noneOf(NativeGestureType.class);
        Intrinsics.g(enumSetNoneOf, "noneOf(NativeGestureType::class.java)");
        this.d = enumSetNoneOf;
        this.e = 1.0f / f;
    }

    public static final Point a(C1091p2 c1091p2, MotionEvent motionEvent) {
        c1091p2.getClass();
        return new Point(motionEvent.getX() * c1091p2.e, motionEvent.getY() * c1091p2.e);
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.GestureRecognizer
    public final void a(GestureListener listener, EnumSet gestures) {
        Intrinsics.h(listener, "listener");
        Intrinsics.h(gestures, "gestures");
        this.c = listener;
        this.d = gestures;
        if (gestures.contains(NativeGestureType.DOUBLE_TAP)) {
            this.b.setOnDoubleTapListener(this.f18815a);
        } else {
            this.b.setOnDoubleTapListener(null);
        }
    }

    public final boolean a(MotionEvent event) {
        Intrinsics.h(event, "event");
        return this.b.onTouchEvent(event);
    }
}
