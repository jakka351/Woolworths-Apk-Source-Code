package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class TextureViewImplementation extends PreviewViewImplementation {
    public TextureView e;
    public SurfaceTexture f;
    public ListenableFuture g;
    public SurfaceRequest h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public h l;

    @Override // androidx.camera.view.PreviewViewImplementation
    public final View a() {
        return this.e;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final Bitmap b() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void c() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void d() {
        this.i = true;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void e(SurfaceRequest surfaceRequest, h hVar) {
        Size size = surfaceRequest.b;
        this.f650a = size;
        this.l = hVar;
        size.getClass();
        FrameLayout frameLayout = this.b;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f650a.getWidth(), this.f650a.getHeight()));
        this.e.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: androidx.camera.view.TextureViewImplementation.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Logger.a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
                TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
                textureViewImplementation.f = surfaceTexture;
                if (textureViewImplementation.g == null) {
                    textureViewImplementation.h();
                    return;
                }
                textureViewImplementation.h.getClass();
                Logger.a("TextureViewImpl", "Surface invalidated " + textureViewImplementation.h);
                textureViewImplementation.h.l.a();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
                TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
                textureViewImplementation.f = null;
                ListenableFuture listenableFuture = textureViewImplementation.g;
                if (listenableFuture == null) {
                    Logger.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                    return true;
                }
                Futures.a(listenableFuture, new FutureCallback<SurfaceRequest.Result>() { // from class: androidx.camera.view.TextureViewImplementation.1.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final void onFailure(Throwable th) {
                        throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final void onSuccess(Object obj) {
                        Preconditions.f("Unexpected result from SurfaceRequest. Surface was provided twice.", ((SurfaceRequest.Result) obj).a() != 3);
                        Logger.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                        surfaceTexture.release();
                        TextureViewImplementation textureViewImplementation2 = TextureViewImplementation.this;
                        if (textureViewImplementation2.j != null) {
                            textureViewImplementation2.j = null;
                        }
                    }
                }, ContextCompat.d(textureViewImplementation.e.getContext()));
                textureViewImplementation.j = surfaceTexture;
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                Logger.a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) TextureViewImplementation.this.k.getAndSet(null);
                if (completer != null) {
                    completer.b(null);
                }
            }
        });
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        SurfaceRequest surfaceRequest2 = this.h;
        if (surfaceRequest2 != null) {
            surfaceRequest2.c();
        }
        this.h = surfaceRequest;
        Executor executorD = ContextCompat.d(this.e.getContext());
        surfaceRequest.k.a(new g(this, surfaceRequest, 1), executorD);
        h();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final ListenableFuture g() {
        return CallbackToFutureAdapter.a(new e(this));
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f650a;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f650a.getHeight());
        final Surface surface = new Surface(this.f);
        final SurfaceRequest surfaceRequest = this.h;
        final ListenableFuture listenableFutureA = CallbackToFutureAdapter.a(new d(2, this, surface));
        this.g = listenableFutureA;
        listenableFutureA.addListener(new Runnable() { // from class: androidx.camera.view.o
            @Override // java.lang.Runnable
            public final void run() {
                Logger.a("TextureViewImpl", "Safe to release surface.");
                TextureViewImplementation textureViewImplementation = this.d;
                h hVar = textureViewImplementation.l;
                if (hVar != null) {
                    hVar.a();
                    textureViewImplementation.l = null;
                }
                surface.release();
                if (textureViewImplementation.g == listenableFutureA) {
                    textureViewImplementation.g = null;
                }
                if (textureViewImplementation.h == surfaceRequest) {
                    textureViewImplementation.h = null;
                }
            }
        }, ContextCompat.d(this.e.getContext()));
        this.d = true;
        f();
    }
}
