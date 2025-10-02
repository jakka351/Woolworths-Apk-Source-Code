package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.SurfaceViewImplementation;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class SurfaceViewImplementation extends PreviewViewImplementation {
    public SurfaceView e;
    public final SurfaceRequestCallback f;

    @RequiresApi
    public static class Api24Impl {
    }

    public class SurfaceRequestCallback implements SurfaceHolder.Callback {
        public Size d;
        public SurfaceRequest e;
        public SurfaceRequest f;
        public h g;
        public Size h;
        public boolean i = false;
        public boolean j = false;

        public SurfaceRequestCallback() {
        }

        public final void a() {
            if (this.e != null) {
                Logger.a("SurfaceViewImpl", "Request canceled: " + this.e);
                this.e.c();
            }
        }

        public final boolean b() throws ExecutionException, InterruptedException {
            SurfaceViewImplementation surfaceViewImplementation = SurfaceViewImplementation.this;
            Surface surface = surfaceViewImplementation.e.getHolder().getSurface();
            if (this.i || this.e == null || !Objects.equals(this.d, this.h)) {
                return false;
            }
            Logger.a("SurfaceViewImpl", "Surface set on Preview.");
            h hVar = this.g;
            SurfaceRequest surfaceRequest = this.e;
            Objects.requireNonNull(surfaceRequest);
            surfaceRequest.a(surface, ContextCompat.d(surfaceViewImplementation.e.getContext()), new n(hVar, 0));
            this.i = true;
            surfaceViewImplementation.d = true;
            surfaceViewImplementation.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) throws ExecutionException, InterruptedException {
            Logger.a("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.h = new Size(i2, i3);
            b();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceRequest surfaceRequest;
            Logger.a("SurfaceViewImpl", "Surface created.");
            if (!this.j || (surfaceRequest = this.f) == null) {
                return;
            }
            surfaceRequest.c();
            surfaceRequest.j.b(null);
            this.f = null;
            this.j = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Logger.a("SurfaceViewImpl", "Surface destroyed.");
            if (!this.i) {
                a();
            } else if (this.e != null) {
                Logger.a("SurfaceViewImpl", "Surface closed " + this.e);
                this.e.l.a();
            }
            this.j = true;
            SurfaceRequest surfaceRequest = this.e;
            if (surfaceRequest != null) {
                this.f = surfaceRequest;
            }
            this.i = false;
            this.e = null;
            this.g = null;
            this.h = null;
            this.d = null;
        }
    }

    public SurfaceViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        super(frameLayout, previewTransformation);
        this.f = new SurfaceRequestCallback();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final View a() {
        return this.e;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final Bitmap b() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.l
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    Logger.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    Logger.b("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                Logger.b("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e) {
            Logger.c("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void c() {
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void d() {
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void e(final SurfaceRequest surfaceRequest, final h hVar) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals(this.f650a, surfaceRequest.b);
        if (surfaceView == null || !zEquals) {
            Size size = surfaceRequest.b;
            this.f650a = size;
            size.getClass();
            FrameLayout frameLayout = this.b;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f650a.getWidth(), this.f650a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor executorD = ContextCompat.d(this.e.getContext());
        surfaceRequest.k.a(new k(hVar, 1), executorD);
        this.e.post(new Runnable() { // from class: androidx.camera.view.m
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceViewImplementation.SurfaceRequestCallback surfaceRequestCallback = this.d.f;
                surfaceRequestCallback.a();
                boolean z = surfaceRequestCallback.j;
                SurfaceRequest surfaceRequest2 = surfaceRequest;
                if (z) {
                    surfaceRequestCallback.j = false;
                    surfaceRequest2.c();
                    surfaceRequest2.j.b(null);
                    return;
                }
                surfaceRequestCallback.e = surfaceRequest2;
                surfaceRequestCallback.g = hVar;
                Size size2 = surfaceRequest2.b;
                surfaceRequestCallback.d = size2;
                surfaceRequestCallback.i = false;
                if (surfaceRequestCallback.b()) {
                    return;
                }
                Logger.a("SurfaceViewImpl", "Wait for new Surface creation.");
                SurfaceViewImplementation.this.e.getHolder().setFixedSize(size2.getWidth(), size2.getHeight());
            }
        });
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final ListenableFuture g() {
        return Futures.g(null);
    }
}
