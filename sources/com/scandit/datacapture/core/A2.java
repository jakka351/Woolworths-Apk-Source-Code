package com.scandit.datacapture.core;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Choreographer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeTextureBinding;
import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener;
import com.scandit.datacapture.core.logger.GlRenderThreadDisposedEvent;
import com.scandit.datacapture.core.logger.GlRenderThreadObtainSurfaceEvent;
import com.scandit.datacapture.core.logger.GlRenderThreadPreparedEvent;
import com.scandit.datacapture.core.logger.GlRenderThreadState;
import com.scandit.datacapture.core.logger.SdcLogger;
import com.scandit.datacapture.core.logger.UpdateTexImageCrashEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A2 extends HandlerThread implements Choreographer.FrameCallback, NeedsRedrawListener {
    public static final /* synthetic */ int A = 0;

    /* renamed from: a, reason: collision with root package name */
    private Size2 f18295a;
    private int b;
    private SurfaceTexture c;
    private SurfaceTexture d;
    private EGLSurface e;
    private int f;
    private final Handler g;
    private Function1 h;
    private M1 i;
    private final AtomicBoolean j;
    private Choreographer k;
    private boolean l;
    private final AtomicBoolean m;
    private long n;
    private final float[] o;
    private final ArrayList p;
    private final float[] q;
    private final Matrix r;
    private final AtomicBoolean s;
    private final AtomicBoolean t;
    private Function0 u;
    private final C0965b2 v;
    private volatile boolean w;
    private volatile boolean x;
    private final ArrayList y;
    private final P7 z;

    public A2() {
        super("com.scandit.gl-render-thread");
        this.f18295a = new Size2(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.j = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = -1L;
        this.o = new float[16];
        this.p = new ArrayList(16);
        this.q = new float[9];
        this.r = new Matrix();
        this.s = new AtomicBoolean(false);
        this.t = new AtomicBoolean(false);
        this.v = new C0965b2();
        start();
        this.g = new HandlerC1163x2(this);
        this.y = a();
        this.z = new P7();
    }

    public final void a(boolean z) {
        this.w = z;
    }

    public final void d() {
        this.g.sendEmptyMessage(5);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        M1 m1;
        if (this.s.get()) {
            return;
        }
        if (this.l) {
            this.m.set(false);
            if (j <= this.n) {
                return;
            } else {
                this.n = j;
            }
        } else {
            Choreographer choreographer = this.k;
            if (choreographer != null) {
                choreographer.postFrameCallback(this);
            }
        }
        EGLSurface eGLSurface = this.e;
        if (eGLSurface != null && (m1 = this.i) != null && this.j.get() && m1.b(eGLSurface)) {
            SurfaceTexture surfaceTexture = this.c;
            if (surfaceTexture != null && this.t.get()) {
                try {
                    surfaceTexture.updateTexImage();
                    this.t.set(false);
                } catch (Throwable th) {
                    SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new UpdateTexImageCrashEvent(th, j, c()));
                }
            }
            NativeCopiedCameraTexture nativeCopiedCameraTextureD = (!this.x && this.w && this.z.b()) ? this.z.d() : this.z.c();
            if (nativeCopiedCameraTextureD == null) {
                return;
            }
            Function1 function1 = this.h;
            if (function1 != null) {
                function1.invoke(new C1172y2(this.y, new NativeTextureBinding(3553, nativeCopiedCameraTextureD.getTextureId()), this.f18295a, this.w));
            }
            this.z.b(nativeCopiedCameraTextureD);
            if (this.j.get()) {
                m1.c(eGLSurface);
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener
    public final void setNeedsRedrawInMillis(int i) {
        if (this.s.get()) {
            return;
        }
        if (i == 0 && this.m.compareAndSet(false, true)) {
            this.g.sendEmptyMessage(3);
        } else {
            Handler handler = this.g;
            handler.sendMessage(handler.obtainMessage(4, Long.valueOf(i)));
        }
    }

    public static final void a(A2 a2) {
        a2.z.a();
        a2.v.b();
        a2.t.set(false);
        SurfaceTexture surfaceTexture = a2.c;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = a2.c;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        a2.c = null;
        M1 m1 = a2.i;
        if (m1 != null) {
            m1.b();
        }
        a2.i = null;
        a2.s.set(true);
        SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new GlRenderThreadDisposedEvent(a2.c()));
    }

    public static final void d(A2 a2) {
        a2.s.set(false);
        M1 m1 = new M1();
        a2.i = m1;
        m1.d();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        a2.f = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(a2.f);
        a2.c = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C1154w2(a2));
        SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new GlRenderThreadPreparedEvent(a2.c()));
    }

    private final GlRenderThreadState c() {
        return new GlRenderThreadState(this.x, this.w, this.m.get(), this.j.get(), this.n, C1145v2.b().getCounter(), this.k, this.c);
    }

    public final void b(boolean z) {
        this.x = z;
    }

    public final void b() {
        this.g.sendEmptyMessage(2);
    }

    public final void b(long j) {
        C0965b2.c(this.v, j);
    }

    public static final void b(A2 a2, SurfaceTexture surfaceTexture) {
        if (a2.j.get()) {
            M1 m1 = a2.i;
            if (m1 != null) {
                m1.a(a2.e);
            }
            M1 m12 = a2.i;
            if (m12 != null) {
                m12.d();
            }
            M1 m13 = a2.i;
            a2.e = m13 != null ? m13.a(surfaceTexture) : null;
            a2.d = surfaceTexture;
        }
    }

    public final void a(Function1 surfaceCallback, int i, int i2, int i3) {
        Intrinsics.h(surfaceCallback, "surfaceCallback");
        C1181z2 c1181z2 = new C1181z2(surfaceCallback, i, i2, i3);
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(1, c1181z2));
    }

    public final long a(long j) {
        C0965b2.a(this.v, j);
        return this.v.a();
    }

    public static final void a(A2 a2, SurfaceTexture surfaceTexture) {
        a2.t.set(true);
        if (a2.s.get()) {
            return;
        }
        try {
            surfaceTexture.updateTexImage();
            C0965b2.b(a2.v, surfaceTexture.getTimestamp());
            NativeCopiedCameraTexture nativeCopiedCameraTextureE = a2.z.e();
            surfaceTexture.getTransformMatrix(a2.o);
            float[] fArr = a2.q;
            float[] fArr2 = a2.o;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[4];
            fArr[2] = fArr2[12];
            fArr[3] = fArr2[1];
            fArr[4] = fArr2[5];
            fArr[5] = fArr2[13];
            fArr[6] = fArr2[2];
            fArr[7] = fArr2[6];
            fArr[8] = fArr2[15];
            float f = a2.b;
            a2.r.setValues(fArr);
            a2.r.postTranslate(-0.5f, -0.5f);
            a2.r.postRotate(f);
            a2.r.postTranslate(0.5f, 0.5f);
            a2.r.getValues(fArr);
            float[] fArr3 = a2.o;
            float[] fArr4 = a2.q;
            fArr3[0] = fArr4[0];
            fArr3[4] = fArr4[1];
            fArr3[12] = fArr4[2];
            fArr3[1] = fArr4[3];
            fArr3[5] = fArr4[4];
            fArr3[13] = fArr4[5];
            fArr3[2] = fArr4[6];
            fArr3[6] = fArr4[7];
            fArr3[15] = fArr4[8];
            a2.p.clear();
            for (float f2 : a2.o) {
                a2.p.add(Float.valueOf(f2));
            }
            nativeCopiedCameraTextureE.update(a2.f18295a, a2.f, a2.p);
            a2.z.a(nativeCopiedCameraTextureE);
            a2.t.set(false);
        } catch (Throwable th) {
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new UpdateTexImageCrashEvent(th, SystemClock.elapsedRealtimeNanos(), a2.c()));
        }
    }

    private final ArrayList a() {
        ArrayList arrayList = new ArrayList(this.o.length);
        for (int i = 1; i < 5; i++) {
            for (int i2 = 1; i2 < 5; i2++) {
                if (i == i2) {
                    arrayList.add(Float.valueOf(1.0f));
                } else {
                    arrayList.add(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                }
            }
        }
        return arrayList;
    }

    public final void a(final SurfaceTexture surface, final Function1 doOnFrame, final Function0 doOnFrameAvailable, final boolean z, final Function1 setNeedsRedrawListener) {
        Intrinsics.h(surface, "surface");
        Intrinsics.h(doOnFrame, "doOnFrame");
        Intrinsics.h(doOnFrameAvailable, "doOnFrameAvailable");
        Intrinsics.h(setNeedsRedrawListener, "setNeedsRedrawListener");
        this.g.post(new Runnable() { // from class: com.scandit.datacapture.core.s8
            @Override // java.lang.Runnable
            public final void run() {
                A2.a(this.d, surface, doOnFrame, doOnFrameAvailable, z, setNeedsRedrawListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(A2 this$0, SurfaceTexture surface, Function1 doOnFrame, Function0 doOnFrameAvailable, boolean z, Function1 setNeedsRedrawListener) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(surface, "$surface");
        Intrinsics.h(doOnFrame, "$doOnFrame");
        Intrinsics.h(doOnFrameAvailable, "$doOnFrameAvailable");
        Intrinsics.h(setNeedsRedrawListener, "$setNeedsRedrawListener");
        if (this$0.s.get()) {
            return;
        }
        Object obj = this$0.d;
        if (obj != null && obj.equals(obj)) {
            Choreographer choreographer = this$0.k;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this$0);
            }
            M1 m1 = this$0.i;
            if (m1 != null) {
                m1.a(this$0.e);
            }
            this$0.e = null;
            this$0.d = null;
            this$0.j.set(false);
            this$0.h = null;
            this$0.u = null;
            this$0.k = null;
        }
        this$0.k = Choreographer.getInstance();
        M1 m12 = this$0.i;
        if (m12 != null) {
            m12.d();
        }
        M1 m13 = this$0.i;
        this$0.e = m13 != null ? m13.a(surface) : null;
        this$0.d = surface;
        this$0.j.set(true);
        Choreographer choreographer2 = this$0.k;
        if (choreographer2 != null) {
            choreographer2.postFrameCallback(this$0);
        }
        this$0.h = doOnFrame;
        this$0.l = z;
        if (z) {
            setNeedsRedrawListener.invoke(this$0);
        }
        this$0.u = doOnFrameAvailable;
    }

    public final void a(SurfaceTexture surface) {
        Intrinsics.h(surface, "surface");
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(6, surface));
    }

    public final void a(SurfaceTexture surfaceTexture, Function0 andThen) {
        Intrinsics.h(andThen, "andThen");
        this.g.post(new t8(this, surfaceTexture, andThen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(A2 this$0, SurfaceTexture surfaceTexture, Function0 andThen) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(andThen, "$andThen");
        if (this$0.s.get()) {
            return;
        }
        if (Intrinsics.c(this$0.d, surfaceTexture)) {
            Choreographer choreographer = this$0.k;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this$0);
            }
            M1 m1 = this$0.i;
            if (m1 != null) {
                m1.a(this$0.e);
            }
            this$0.e = null;
            this$0.d = null;
            this$0.j.set(false);
            this$0.h = null;
            this$0.u = null;
            this$0.k = null;
        }
        M1 m12 = this$0.i;
        if (m12 != null) {
            m12.d();
        }
        andThen.invoke();
    }

    public static final void a(A2 a2, C1181z2 c1181z2) {
        a2.f18295a = new Size2(c1181z2.d(), c1181z2.a());
        a2.b = c1181z2.b();
        M1 m1 = a2.i;
        if (m1 != null) {
            m1.d();
        }
        SurfaceTexture surfaceTexture = a2.c;
        if (surfaceTexture != null) {
            c1181z2.c().invoke(surfaceTexture);
        }
        SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new GlRenderThreadObtainSurfaceEvent(a2.c()));
    }
}
