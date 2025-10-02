package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ImageAnalysis extends UseCase {
    public static final Defaults v = new Defaults();
    public final ImageAnalysisAbstractAnalyzer p;
    public final Object q;
    public Analyzer r;
    public SessionConfig.Builder s;
    public ImmediateSurface t;
    public SessionConfig.CloseableErrorListener u;

    public interface Analyzer {
        void b(SettableImageProxy settableImageProxy);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BackpressureStrategy {
    }

    public static final class Builder implements ImageOutputConfig.Builder<Builder>, ThreadConfig.Builder<Builder>, UseCaseConfig.Builder<ImageAnalysis, ImageAnalysisConfig, Builder>, ImageInputConfig.Builder<Builder> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f404a;

        public Builder() {
            this(MutableOptionsBundle.V());
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object a(int i) {
            this.f404a.G(ImageOutputConfig.i, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableConfig b() {
            return this.f404a;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object c(ResolutionSelector resolutionSelector) {
            this.f404a.G(ImageOutputConfig.p, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object d(Size size) {
            this.f404a.G(ImageOutputConfig.l, size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final UseCaseConfig e() {
            return new ImageAnalysisConfig(OptionsBundle.U(this.f404a));
        }

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            Object objA;
            this.f404a = mutableOptionsBundle;
            Object objA2 = null;
            try {
                objA = mutableOptionsBundle.a(TargetConfig.E);
            } catch (IllegalArgumentException unused) {
                objA = null;
            }
            Class cls = (Class) objA;
            if (cls != null && !cls.equals(ImageAnalysis.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f404a.G(UseCaseConfig.z, UseCaseConfigFactory.CaptureType.f);
            MutableOptionsBundle mutableOptionsBundle2 = this.f404a;
            mutableOptionsBundle2.G(TargetConfig.E, ImageAnalysis.class);
            try {
                objA2 = mutableOptionsBundle2.a(TargetConfig.D);
            } catch (IllegalArgumentException unused2) {
            }
            if (objA2 == null) {
                mutableOptionsBundle2.G(TargetConfig.D, ImageAnalysis.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    @RestrictTo
    public static final class Defaults implements ConfigProvider<ImageAnalysisConfig> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImageAnalysisConfig f405a;

        static {
            Object size = new Size(640, 480);
            ResolutionSelector.Builder builder = new ResolutionSelector.Builder();
            builder.f565a = AspectRatioStrategy.b;
            Size size2 = SizeUtil.c;
            ResolutionStrategy resolutionStrategy = new ResolutionStrategy();
            resolutionStrategy.f566a = size2;
            resolutionStrategy.b = 1;
            builder.b = resolutionStrategy;
            Object objA = builder.a();
            Builder builder2 = new Builder();
            Config.Option option = ImageOutputConfig.m;
            MutableOptionsBundle mutableOptionsBundle = builder2.f404a;
            mutableOptionsBundle.G(option, size);
            mutableOptionsBundle.G(UseCaseConfig.v, 1);
            mutableOptionsBundle.G(ImageOutputConfig.h, 0);
            mutableOptionsBundle.G(ImageOutputConfig.p, objA);
            DynamicRange dynamicRange = DynamicRange.d;
            if (!dynamicRange.equals(dynamicRange)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            mutableOptionsBundle.G(ImageInputConfig.g, dynamicRange);
            f405a = new ImageAnalysisConfig(OptionsBundle.U(mutableOptionsBundle));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OutputImageFormat {
    }

    public ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.q = new Object();
        if (((Integer) ((ImageAnalysisConfig) this.f).c(ImageAnalysisConfig.H, 0)).intValue() == 1) {
            this.p = new ImageAnalysisBlockingAnalyzer();
        } else {
            this.p = new ImageAnalysisNonBlockingAnalyzer((Executor) imageAnalysisConfig.c(ThreadConfig.F, CameraXExecutors.b()));
        }
        this.p.g = F();
        this.p.h = ((Boolean) ((ImageAnalysisConfig) this.f).c(ImageAnalysisConfig.M, Boolean.FALSE)).booleanValue();
    }

    @Override // androidx.camera.core.UseCase
    public final void B(Rect rect) {
        this.i = rect;
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.p;
        synchronized (imageAnalysisAbstractAnalyzer.u) {
            imageAnalysisAbstractAnalyzer.m = rect;
            imageAnalysisAbstractAnalyzer.n = new Rect(imageAnalysisAbstractAnalyzer.m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.SessionConfig.Builder E(androidx.camera.core.impl.ImageAnalysisConfig r14, androidx.camera.core.impl.StreamSpec r15) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageAnalysis.E(androidx.camera.core.impl.ImageAnalysisConfig, androidx.camera.core.impl.StreamSpec):androidx.camera.core.impl.SessionConfig$Builder");
    }

    public final int F() {
        return ((Integer) ((ImageAnalysisConfig) this.f).c(ImageAnalysisConfig.K, 1)).intValue();
    }

    public final void G(Executor executor, Analyzer analyzer) {
        synchronized (this.q) {
            try {
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.p;
                f fVar = new f(analyzer);
                synchronized (imageAnalysisAbstractAnalyzer.u) {
                    imageAnalysisAbstractAnalyzer.d = fVar;
                    imageAnalysisAbstractAnalyzer.j = executor;
                }
                if (this.r == null) {
                    o();
                }
                this.r = analyzer;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H() {
        CameraInternal cameraInternalB = b();
        if (cameraInternalB != null) {
            this.p.e = g(cameraInternalB, false);
        }
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig e(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        v.getClass();
        ImageAnalysisConfig imageAnalysisConfig = Defaults.f405a;
        Config configA = useCaseConfigFactory.a(imageAnalysisConfig.Q(), 1);
        if (z) {
            configA = Config.R(configA, imageAnalysisConfig);
        }
        if (configA == null) {
            return null;
        }
        return new ImageAnalysisConfig(OptionsBundle.U(((Builder) k(configA)).f404a));
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder k(Config config) {
        return new Builder(MutableOptionsBundle.W(config));
    }

    @Override // androidx.camera.core.UseCase
    public final void r() {
        this.p.v = true;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig t(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        Boolean bool = (Boolean) ((ImageAnalysisConfig) this.f).c(ImageAnalysisConfig.L, null);
        boolean zA = cameraInfoInternal.j().a(OnePixelShiftQuirk.class);
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.p;
        if (bool != null) {
            zA = bool.booleanValue();
        }
        imageAnalysisAbstractAnalyzer.i = zA;
        synchronized (this.q) {
        }
        return builder.e();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(f());
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec w(Config config) {
        this.s.e(config);
        Object[] objArr = {this.s.k()};
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
        ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) this.f;
        d();
        SessionConfig.Builder builderE = E(imageAnalysisConfig, streamSpec);
        this.s = builderE;
        Object[] objArr = {builderE.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        D(Collections.unmodifiableList(arrayList));
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public final void y() {
        Threads.a();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.u;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
            this.u = null;
        }
        ImmediateSurface immediateSurface = this.t;
        if (immediateSurface != null) {
            immediateSurface.a();
            this.t = null;
        }
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.p;
        imageAnalysisAbstractAnalyzer.v = false;
        imageAnalysisAbstractAnalyzer.d();
    }

    @Override // androidx.camera.core.UseCase
    public final void z(Matrix matrix) {
        super.z(matrix);
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.p;
        synchronized (imageAnalysisAbstractAnalyzer.u) {
            imageAnalysisAbstractAnalyzer.o = matrix;
            imageAnalysisAbstractAnalyzer.p = new Matrix(imageAnalysisAbstractAnalyzer.o);
        }
    }
}
