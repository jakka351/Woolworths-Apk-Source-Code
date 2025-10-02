package androidx.camera.view.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.camera.view.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector;", "", "Companion", "OnZoomGestureListener", "ZoomEvent", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ZoomGestureDetector {

    /* renamed from: a, reason: collision with root package name */
    public final int f660a;
    public final e b;
    public final boolean c = true;
    public final boolean d = true;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public int k;
    public final GestureDetector l;
    public boolean m;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$Companion;", "", "", "ANCHORED_ZOOM_MODE_DOUBLE_TAP", "I", "ANCHORED_ZOOM_MODE_NONE", "ANCHORED_ZOOM_MODE_STYLUS", "DEFAULT_MIN_SPAN", "", "SCALE_FACTOR", "F", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;", "", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnZoomGestureListener {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;", "", "Begin", "End", "Move", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ZoomEvent {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Begin;", "Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Begin extends ZoomEvent {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;", "Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class End extends ZoomEvent {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Move;", "Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Move extends ZoomEvent {

            /* renamed from: a, reason: collision with root package name */
            public final float f661a;

            public Move(float f) {
                this.f661a = f;
            }
        }
    }

    public ZoomGestureDetector(Context context, e eVar) {
        this.f660a = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.b = eVar;
        this.l = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.view.impl.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent e) {
                Intrinsics.h(e, "e");
                float x = e.getX();
                ZoomGestureDetector zoomGestureDetector = this.d;
                zoomGestureDetector.i = x;
                zoomGestureDetector.j = e.getY();
                zoomGestureDetector.k = 1;
                return true;
            }
        });
    }

    public final float a() {
        if (!b()) {
            float f = this.f;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                return this.e / f;
            }
            return 1.0f;
        }
        boolean z = this.m;
        boolean z2 = (z && this.e < this.f) || (!z && this.e > this.f);
        float fAbs = Math.abs(1 - (this.e / this.f)) * 0.5f;
        if (this.f <= this.f660a) {
            return 1.0f;
        }
        return z2 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    public final boolean b() {
        return this.k != 0;
    }
}
