package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class SurfaceEdge {

    /* renamed from: a, reason: collision with root package name */
    public final int f550a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final StreamSpec g;
    public int h;
    public int i;
    public SurfaceRequest k;
    public SettableSurface l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public static class SettableSurface extends DeferrableSurface {
        public final ListenableFuture o;
        public CallbackToFutureAdapter.Completer p;
        public DeferrableSurface q;
        public SurfaceOutputImpl r;

        public SettableSurface(Size size, int i) {
            super(size, i);
            this.o = CallbackToFutureAdapter.a(new o(this, 0));
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public final void a() {
            super.a();
            Threads.c(new j(this, 2));
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public final ListenableFuture f() {
            return this.o;
        }

        public final boolean g(DeferrableSurface deferrableSurface, Runnable runnable) {
            boolean z;
            Size size = this.h;
            Threads.a();
            deferrableSurface.getClass();
            int i = deferrableSurface.i;
            Size size2 = deferrableSurface.h;
            DeferrableSurface deferrableSurface2 = this.q;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            Preconditions.f("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", deferrableSurface2 == null);
            Preconditions.a("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
            int i2 = this.i;
            Preconditions.a(androidx.camera.core.impl.b.j(i2, i, "The provider's format(", ") must match the parent(", ")"), i2 == i);
            synchronized (this.f486a) {
                z = this.c;
            }
            Preconditions.f("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
            this.q = deferrableSurface;
            Futures.i(this.p, deferrableSurface.c());
            deferrableSurface.d();
            Futures.h(this.e).addListener(new m(deferrableSurface, 1), CameraXExecutors.a());
            Futures.h(deferrableSurface.g).addListener(runnable, CameraXExecutors.d());
            return true;
        }
    }

    public SurfaceEdge(int i, int i2, StreamSpec streamSpec, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.f550a = i2;
        this.g = streamSpec;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new SettableSurface(streamSpec.e(), i2);
    }

    public final void a(Runnable runnable) {
        Threads.a();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        Preconditions.f("Edge is already closed.", !this.n);
    }

    public final void c() {
        Threads.a();
        this.l.a();
        this.n = true;
    }

    public final SurfaceRequest d(CameraInternal cameraInternal, boolean z) {
        Threads.a();
        b();
        StreamSpec streamSpec = this.g;
        SurfaceRequest surfaceRequest = new SurfaceRequest(streamSpec.e(), cameraInternal, z, streamSpec.b(), streamSpec.c(), new l(this, 0));
        try {
            DeferrableSurface deferrableSurface = surfaceRequest.l;
            SettableSurface settableSurface = this.l;
            Objects.requireNonNull(settableSurface);
            if (settableSurface.g(deferrableSurface, new j(settableSurface, 0))) {
                Futures.h(settableSurface.e).addListener(new m(deferrableSurface, 0), CameraXExecutors.a());
            }
            this.k = surfaceRequest;
            g();
            return surfaceRequest;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            surfaceRequest.c();
            throw e2;
        }
    }

    public final void e() {
        Threads.a();
        b();
        this.l.a();
    }

    public final void f() {
        boolean z;
        Threads.a();
        b();
        SettableSurface settableSurface = this.l;
        settableSurface.getClass();
        Threads.a();
        if (settableSurface.q == null) {
            synchronized (settableSurface.f486a) {
                z = settableSurface.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new SettableSurface(this.g.e(), this.f550a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void g() {
        SurfaceRequest.TransformationInfoListener transformationInfoListener;
        Executor executor;
        Threads.a();
        SurfaceRequest.TransformationInfo transformationInfoG = SurfaceRequest.TransformationInfo.g(this.d, this.i, this.h, this.c, this.b, this.e);
        SurfaceRequest surfaceRequest = this.k;
        if (surfaceRequest != null) {
            synchronized (surfaceRequest.f424a) {
                surfaceRequest.m = transformationInfoG;
                transformationInfoListener = surfaceRequest.n;
                executor = surfaceRequest.o;
            }
            if (transformationInfoListener != null && executor != null) {
                executor.execute(new androidx.camera.core.m(transformationInfoListener, transformationInfoG, 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(transformationInfoG);
        }
    }

    public final void h(DeferrableSurface deferrableSurface) {
        Threads.a();
        b();
        SettableSurface settableSurface = this.l;
        Objects.requireNonNull(settableSurface);
        settableSurface.g(deferrableSurface, new j(settableSurface, 0));
    }
}
