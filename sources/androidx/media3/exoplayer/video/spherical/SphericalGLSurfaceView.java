package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.utils.futures.e;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.OrientationListener;
import androidx.media3.exoplayer.video.spherical.ProjectionRenderer;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.TouchTracker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@UnstableApi
/* loaded from: classes2.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    public static final /* synthetic */ int o = 0;
    public final CopyOnWriteArrayList d;
    public final SensorManager e;
    public final Sensor f;
    public final OrientationListener g;
    public final Handler h;
    public final SceneRenderer i;
    public SurfaceTexture j;
    public Surface k;
    public boolean l;
    public boolean m;
    public boolean n;

    @VisibleForTesting
    public final class Renderer implements GLSurfaceView.Renderer, TouchTracker.Listener, OrientationListener.Listener {
        public final SceneRenderer d;
        public final float[] g;
        public final float[] h;
        public final float[] i;
        public float j;
        public float k;
        public final float[] e = new float[16];
        public final float[] f = new float[16];
        public final float[] l = new float[16];
        public final float[] m = new float[16];

        public Renderer(SceneRenderer sceneRenderer) {
            float[] fArr = new float[16];
            this.g = fArr;
            float[] fArr2 = new float[16];
            this.h = fArr2;
            float[] fArr3 = new float[16];
            this.i = fArr3;
            this.d = sceneRenderer;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.k = 3.1415927f;
        }

        @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
        public final synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.g;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.k = f2;
            Matrix.setRotateM(this.h, 0, -this.j, (float) Math.cos(f2), (float) Math.sin(this.k), BitmapDescriptorFactory.HUE_RED);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            Object objD;
            float[] fArr;
            synchronized (this) {
                Matrix.multiplyMM(this.m, 0, this.g, 0, this.i, 0);
                Matrix.multiplyMM(this.l, 0, this.h, 0, this.m, 0);
            }
            Matrix.multiplyMM(this.f, 0, this.e, 0, this.l, 0);
            SceneRenderer sceneRenderer = this.d;
            float[] fArr2 = this.f;
            GLES20.glClear(16384);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e) {
                Log.d("SceneRenderer", "Failed to draw a frame", e);
            }
            if (sceneRenderer.d.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = sceneRenderer.m;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    GlUtil.b();
                } catch (GlUtil.GlException e2) {
                    Log.d("SceneRenderer", "Failed to draw a frame", e2);
                }
                if (sceneRenderer.e.compareAndSet(true, false)) {
                    Matrix.setIdentityM(sceneRenderer.j, 0);
                }
                long timestamp = sceneRenderer.m.getTimestamp();
                TimedValueQueue timedValueQueue = sceneRenderer.h;
                synchronized (timedValueQueue) {
                    objD = timedValueQueue.d(timestamp, false);
                }
                Long l = (Long) objD;
                if (l != null) {
                    FrameRotationQueue frameRotationQueue = sceneRenderer.g;
                    float[] fArr3 = sceneRenderer.j;
                    float[] fArr4 = (float[]) frameRotationQueue.c.f(l.longValue());
                    if (fArr4 != null) {
                        float[] fArr5 = frameRotationQueue.b;
                        float f = fArr4[0];
                        float f2 = -fArr4[1];
                        float f3 = -fArr4[2];
                        float length = Matrix.length(f, f2, f3);
                        if (length != BitmapDescriptorFactory.HUE_RED) {
                            fArr = fArr3;
                            Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        } else {
                            fArr = fArr3;
                            Matrix.setIdentityM(fArr5, 0);
                        }
                        if (!frameRotationQueue.d) {
                            FrameRotationQueue.a(frameRotationQueue.f3210a, frameRotationQueue.b);
                            frameRotationQueue.d = true;
                        }
                        Matrix.multiplyMM(fArr, 0, frameRotationQueue.f3210a, 0, frameRotationQueue.b, 0);
                    }
                }
                Projection projection = (Projection) sceneRenderer.i.f(timestamp);
                if (projection != null) {
                    ProjectionRenderer projectionRenderer = sceneRenderer.f;
                    projectionRenderer.getClass();
                    if (ProjectionRenderer.b(projection)) {
                        projectionRenderer.f3214a = projection.c;
                        projectionRenderer.b = new ProjectionRenderer.MeshData(projection.f3211a.f3212a[0]);
                        if (!projection.d) {
                            new ProjectionRenderer.MeshData(projection.b.f3212a[0]);
                        }
                    }
                }
            }
            Matrix.multiplyMM(sceneRenderer.k, 0, fArr2, 0, sceneRenderer.j, 0);
            ProjectionRenderer projectionRenderer2 = sceneRenderer.f;
            int i = sceneRenderer.l;
            float[] fArr6 = sceneRenderer.k;
            ProjectionRenderer.MeshData meshData = projectionRenderer2.b;
            if (meshData == null) {
                return;
            }
            int i2 = projectionRenderer2.f3214a;
            GLES20.glUniformMatrix3fv(projectionRenderer2.e, 1, false, i2 == 1 ? ProjectionRenderer.j : i2 == 2 ? ProjectionRenderer.k : ProjectionRenderer.i, 0);
            GLES20.glUniformMatrix4fv(projectionRenderer2.d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(projectionRenderer2.h, 0);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e3) {
                android.util.Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(projectionRenderer2.f, 3, 5126, false, 12, (Buffer) meshData.b);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e4) {
                android.util.Log.e("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(projectionRenderer2.g, 2, 5126, false, 8, (Buffer) meshData.c);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e5) {
                android.util.Log.e("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(meshData.d, 0, meshData.f3215a);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e6) {
                android.util.Log.e("ProjectionRenderer", "Failed to render", e6);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.e, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.h.post(new e(14, sphericalGLSurfaceView, this.d.b()));
        }
    }

    public interface VideoSurfaceListener {
        void B(Surface surface);

        void C();
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public final void a() {
        boolean z = this.l && this.m;
        Sensor sensor = this.f;
        if (sensor == null || z == this.n) {
            return;
        }
        OrientationListener orientationListener = this.g;
        SensorManager sensorManager = this.e;
        if (z) {
            sensorManager.registerListener(orientationListener, sensor, 0);
        } else {
            sensorManager.unregisterListener(orientationListener);
        }
        this.n = z;
    }

    public CameraMotionListener getCameraMotionListener() {
        return this.i;
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return this.i;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.k;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.post(new Runnable() { // from class: androidx.media3.exoplayer.video.spherical.b
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView sphericalGLSurfaceView = this.d;
                Surface surface = sphericalGLSurfaceView.k;
                if (surface != null) {
                    Iterator it = sphericalGLSurfaceView.d.iterator();
                    while (it.hasNext()) {
                        ((SphericalGLSurfaceView.VideoSurfaceListener) it.next()).C();
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.j;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.j = null;
                sphericalGLSurfaceView.k = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.m = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.m = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.i.n = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.l = z;
        a();
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new CopyOnWriteArrayList();
        this.h = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.e = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        SceneRenderer sceneRenderer = new SceneRenderer();
        this.i = sceneRenderer;
        Renderer renderer = new Renderer(sceneRenderer);
        View.OnTouchListener touchTracker = new TouchTracker(context, renderer);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.g = new OrientationListener(windowManager.getDefaultDisplay(), touchTracker, renderer);
        this.l = true;
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setOnTouchListener(touchTracker);
    }
}
