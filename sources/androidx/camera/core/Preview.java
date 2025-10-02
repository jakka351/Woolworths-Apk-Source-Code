package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class Preview extends UseCase {
    public static final Defaults w = new Defaults();
    public static final Executor x = CameraXExecutors.d();
    public SurfaceProvider p;
    public Executor q;
    public SessionConfig.Builder r;
    public DeferrableSurface s;
    public SurfaceEdge t;
    public SurfaceRequest u;
    public SessionConfig.CloseableErrorListener v;

    public static final class Builder implements UseCaseConfig.Builder<Preview, PreviewConfig, Builder>, ImageOutputConfig.Builder<Builder>, ImageInputConfig.Builder<Builder>, ThreadConfig.Builder<Builder> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f418a;

        public Builder() {
            this(MutableOptionsBundle.V());
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object a(int i) {
            Config.Option option = ImageOutputConfig.i;
            Integer numValueOf = Integer.valueOf(i);
            MutableOptionsBundle mutableOptionsBundle = this.f418a;
            mutableOptionsBundle.G(option, numValueOf);
            mutableOptionsBundle.G(ImageOutputConfig.j, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableConfig b() {
            return this.f418a;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object c(ResolutionSelector resolutionSelector) {
            this.f418a.G(ImageOutputConfig.p, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object d(Size size) {
            this.f418a.G(ImageOutputConfig.l, size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final UseCaseConfig e() {
            return new PreviewConfig(OptionsBundle.U(this.f418a));
        }

        public final Preview f() {
            PreviewConfig previewConfig = new PreviewConfig(OptionsBundle.U(this.f418a));
            ImageOutputConfig.J(previewConfig);
            Preview preview = new Preview(previewConfig);
            preview.q = Preview.x;
            return preview;
        }

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            Object objA;
            this.f418a = mutableOptionsBundle;
            Object objA2 = null;
            try {
                objA = mutableOptionsBundle.a(TargetConfig.E);
            } catch (IllegalArgumentException unused) {
                objA = null;
            }
            Class cls = (Class) objA;
            if (cls != null && !cls.equals(Preview.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f418a.G(UseCaseConfig.z, UseCaseConfigFactory.CaptureType.e);
            MutableOptionsBundle mutableOptionsBundle2 = this.f418a;
            mutableOptionsBundle2.G(TargetConfig.E, Preview.class);
            try {
                objA2 = mutableOptionsBundle2.a(TargetConfig.D);
            } catch (IllegalArgumentException unused2) {
            }
            if (objA2 == null) {
                this.f418a.G(TargetConfig.D, Preview.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
            Object objA3 = -1;
            try {
                objA3 = mutableOptionsBundle.a(ImageOutputConfig.k);
            } catch (IllegalArgumentException unused3) {
            }
            if (((Integer) objA3).intValue() == -1) {
                mutableOptionsBundle.G(ImageOutputConfig.k, 2);
            }
        }
    }

    @RestrictTo
    public static final class Defaults implements ConfigProvider<PreviewConfig> {

        /* renamed from: a, reason: collision with root package name */
        public static final PreviewConfig f419a;

        static {
            ResolutionSelector.Builder builder = new ResolutionSelector.Builder();
            builder.f565a = AspectRatioStrategy.b;
            builder.b = ResolutionStrategy.c;
            ResolutionSelector resolutionSelectorA = builder.a();
            Builder builder2 = new Builder();
            Config.Option option = UseCaseConfig.v;
            MutableOptionsBundle mutableOptionsBundle = builder2.f418a;
            mutableOptionsBundle.G(option, 2);
            mutableOptionsBundle.G(ImageOutputConfig.h, 0);
            mutableOptionsBundle.G(ImageOutputConfig.p, resolutionSelectorA);
            mutableOptionsBundle.G(ImageInputConfig.g, DynamicRange.c);
            f419a = new PreviewConfig(OptionsBundle.U(mutableOptionsBundle));
        }
    }

    public interface SurfaceProvider {
        void a(SurfaceRequest surfaceRequest);
    }

    @Override // androidx.camera.core.UseCase
    public final void B(Rect rect) {
        this.i = rect;
        CameraInternal cameraInternalB = b();
        SurfaceEdge surfaceEdge = this.t;
        if (cameraInternalB == null || surfaceEdge == null) {
            return;
        }
        Threads.c(new androidx.camera.core.processing.k(surfaceEdge, g(cameraInternalB, m(cameraInternalB)), ((ImageOutputConfig) this.f).D()));
    }

    public final void E() {
        SessionConfig.CloseableErrorListener closeableErrorListener = this.v;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
            this.v = null;
        }
        DeferrableSurface deferrableSurface = this.s;
        if (deferrableSurface != null) {
            deferrableSurface.a();
            this.s = null;
        }
        SurfaceEdge surfaceEdge = this.t;
        if (surfaceEdge != null) {
            surfaceEdge.c();
            this.t = null;
        }
        this.u = null;
    }

    public final void F(SurfaceProvider surfaceProvider) {
        Threads.a();
        if (surfaceProvider == null) {
            this.p = null;
            this.c = UseCase.State.e;
            q();
            return;
        }
        this.p = surfaceProvider;
        this.q = x;
        StreamSpec streamSpec = this.g;
        if ((streamSpec != null ? streamSpec.e() : null) != null) {
            G((PreviewConfig) this.f, this.g);
            p();
        }
        o();
    }

    public final void G(PreviewConfig previewConfig, StreamSpec streamSpec) {
        Rect rect;
        Threads.a();
        CameraInternal cameraInternalB = b();
        Objects.requireNonNull(cameraInternalB);
        E();
        Preconditions.f(null, this.t == null);
        Matrix matrix = this.j;
        boolean zP = cameraInternalB.p();
        Size sizeE = streamSpec.e();
        Rect rect2 = this.i;
        if (rect2 != null) {
            rect = rect2;
        } else if (sizeE != null) {
            rect2 = new Rect(0, 0, sizeE.getWidth(), sizeE.getHeight());
            rect = rect2;
        } else {
            rect = null;
        }
        Objects.requireNonNull(rect);
        SurfaceEdge surfaceEdge = new SurfaceEdge(1, 34, streamSpec, matrix, zP, rect, g(cameraInternalB, m(cameraInternalB)), ((ImageOutputConfig) this.f).D(), cameraInternalB.p() && m(cameraInternalB));
        this.t = surfaceEdge;
        if (this.m != null) {
            throw null;
        }
        surfaceEdge.a(new k(this, 1));
        SurfaceRequest surfaceRequestD = this.t.d(cameraInternalB, true);
        this.u = surfaceRequestD;
        this.s = surfaceRequestD.l;
        if (this.p != null) {
            CameraInternal cameraInternalB2 = b();
            SurfaceEdge surfaceEdge2 = this.t;
            if (cameraInternalB2 != null && surfaceEdge2 != null) {
                Threads.c(new androidx.camera.core.processing.k(surfaceEdge2, g(cameraInternalB2, m(cameraInternalB2)), ((ImageOutputConfig) this.f).D()));
            }
            SurfaceProvider surfaceProvider = this.p;
            surfaceProvider.getClass();
            SurfaceRequest surfaceRequest = this.u;
            surfaceRequest.getClass();
            this.q.execute(new b(3, surfaceProvider, surfaceRequest));
        }
        SessionConfig.Builder builderM = SessionConfig.Builder.m(previewConfig, streamSpec.e());
        builderM.p(streamSpec.c());
        builderM.t(previewConfig.p());
        if (streamSpec.d() != null) {
            builderM.e(streamSpec.d());
        }
        if (this.p != null) {
            builderM.i(this.s, streamSpec.b(), ((ImageOutputConfig) this.f).v());
        }
        SessionConfig.CloseableErrorListener closeableErrorListener = this.v;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new g(this, 2));
        this.v = closeableErrorListener2;
        builderM.o(closeableErrorListener2);
        this.r = builderM;
        Object[] objArr = {builderM.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        D(Collections.unmodifiableList(arrayList));
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig e(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        w.getClass();
        PreviewConfig previewConfig = Defaults.f419a;
        Config configA = useCaseConfigFactory.a(previewConfig.Q(), 1);
        if (z) {
            configA = Config.R(configA, previewConfig);
        }
        if (configA == null) {
            return null;
        }
        return new PreviewConfig(OptionsBundle.U(((Builder) k(configA)).f418a));
    }

    @Override // androidx.camera.core.UseCase
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder k(Config config) {
        return new Builder(MutableOptionsBundle.W(config));
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig t(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        builder.b().G(ImageInputConfig.f, 34);
        return builder.e();
    }

    public final String toString() {
        return "Preview:".concat(f());
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec w(Config config) {
        this.r.e(config);
        Object[] objArr = {this.r.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        D(Collections.unmodifiableList(arrayList));
        StreamSpec.Builder builderG = this.g.g();
        builderG.d(config);
        return builderG.a();
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec x(StreamSpec streamSpec, StreamSpec streamSpec2) {
        G((PreviewConfig) this.f, streamSpec);
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public final void y() {
        E();
    }
}
