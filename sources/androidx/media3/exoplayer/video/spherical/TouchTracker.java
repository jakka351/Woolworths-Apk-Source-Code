package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.OrientationListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    public final Listener f;
    public final GestureDetector h;
    public final PointF d = new PointF();
    public final PointF e = new PointF();
    public final float g = 25.0f;
    public volatile float i = 3.1415927f;

    public interface Listener {
    }

    public TouchTracker(Context context, Listener listener) {
        this.f = listener;
        this.h = new GestureDetector(context, this);
    }

    @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
    public final void a(float[] fArr, float f) {
        this.i = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.d.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.d.x) / this.g;
        float y = motionEvent2.getY();
        PointF pointF = this.d;
        float f3 = (y - pointF.y) / this.g;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.i;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.e;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        Listener listener = this.f;
        PointF pointF3 = this.e;
        SphericalGLSurfaceView.Renderer renderer = (SphericalGLSurfaceView.Renderer) listener;
        synchronized (renderer) {
            float f5 = pointF3.y;
            renderer.j = f5;
            Matrix.setRotateM(renderer.h, 0, -f5, (float) Math.cos(renderer.k), (float) Math.sin(renderer.k), BitmapDescriptorFactory.HUE_RED);
            Matrix.setRotateM(renderer.i, 0, -pointF3.x, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.h.onTouchEvent(motionEvent);
    }
}
