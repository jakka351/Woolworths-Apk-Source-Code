package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.core.util.Preconditions;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class UseCase {
    public UseCaseConfig d;
    public UseCaseConfig e;
    public UseCaseConfig f;
    public StreamSpec g;
    public UseCaseConfig h;
    public Rect i;
    public CameraInternal k;
    public CameraInternal l;
    public CameraEffect m;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f429a = new HashSet();
    public final Object b = new Object();
    public State c = State.e;
    public Matrix j = new Matrix();
    public SessionConfig n = SessionConfig.a();
    public SessionConfig o = SessionConfig.a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final /* synthetic */ State[] f;

        static {
            State state = new State("ACTIVE", 0);
            d = state;
            State state2 = new State("INACTIVE", 1);
            e = state2;
            f = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f.clone();
        }
    }

    @RestrictTo
    public interface StateChangeCallback {
        void c(UseCase useCase);

        void j(UseCase useCase);

        void n(UseCase useCase);

        void q(UseCase useCase);
    }

    public UseCase(UseCaseConfig useCaseConfig) {
        this.e = useCaseConfig;
        this.f = useCaseConfig;
    }

    public final boolean A(int i) {
        Size sizeN;
        int iS = ((ImageOutputConfig) this.f).s(-1);
        if (iS != -1 && iS == i) {
            return false;
        }
        UseCaseConfig.Builder builderK = k(this.e);
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) builderK.e();
        int iS2 = imageOutputConfig.s(-1);
        if (iS2 == -1 || iS2 != i) {
            ((ImageOutputConfig.Builder) builderK).a(i);
        }
        if (iS2 != -1 && i != -1 && iS2 != i) {
            if (Math.abs(CameraOrientationUtil.b(i) - CameraOrientationUtil.b(iS2)) % SubsamplingScaleImageView.ORIENTATION_180 == 90 && (sizeN = imageOutputConfig.n()) != null) {
                ((ImageOutputConfig.Builder) builderK).d(new Size(sizeN.getHeight(), sizeN.getWidth()));
            }
        }
        this.e = builderK.e();
        CameraInternal cameraInternalB = b();
        if (cameraInternalB == null) {
            this.f = this.e;
            return true;
        }
        this.f = n(cameraInternalB.d(), this.d, this.h);
        return true;
    }

    public void B(Rect rect) {
        this.i = rect;
    }

    public final void C(CameraInternal cameraInternal) {
        y();
        synchronized (this.b) {
            try {
                CameraInternal cameraInternal2 = this.k;
                if (cameraInternal == cameraInternal2) {
                    this.f429a.remove(cameraInternal2);
                    this.k = null;
                }
                CameraInternal cameraInternal3 = this.l;
                if (cameraInternal == cameraInternal3) {
                    this.f429a.remove(cameraInternal3);
                    this.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    public final void D(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.n = (SessionConfig) list.get(0);
        if (list.size() > 1) {
            this.o = (SessionConfig) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (DeferrableSurface deferrableSurface : ((SessionConfig) it.next()).b()) {
                if (deferrableSurface.j == null) {
                    deferrableSurface.j = getClass();
                }
            }
        }
    }

    public final void a(CameraInternal cameraInternal, CameraInternal cameraInternal2, UseCaseConfig useCaseConfig, UseCaseConfig useCaseConfig2) {
        synchronized (this.b) {
            this.k = cameraInternal;
            this.l = cameraInternal2;
            this.f429a.add(cameraInternal);
            if (cameraInternal2 != null) {
                this.f429a.add(cameraInternal2);
            }
        }
        this.d = useCaseConfig;
        this.h = useCaseConfig2;
        this.f = n(cameraInternal.d(), this.d, this.h);
        r();
    }

    public final CameraInternal b() {
        CameraInternal cameraInternal;
        synchronized (this.b) {
            cameraInternal = this.k;
        }
        return cameraInternal;
    }

    public final CameraControlInternal c() {
        synchronized (this.b) {
            try {
                CameraInternal cameraInternal = this.k;
                if (cameraInternal == null) {
                    return CameraControlInternal.f474a;
                }
                return cameraInternal.k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d() {
        CameraInternal cameraInternalB = b();
        Preconditions.e(cameraInternalB, "No camera attached to use case: " + this);
        return cameraInternalB.d().b();
    }

    public abstract UseCaseConfig e(boolean z, UseCaseConfigFactory useCaseConfigFactory);

    public final String f() {
        String strM = this.f.m("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strM);
        return strM;
    }

    public final int g(CameraInternal cameraInternal, boolean z) {
        int iF = cameraInternal.d().f(j());
        return (cameraInternal.p() || !z) ? iF : TransformUtils.h(-iF);
    }

    public final CameraInternal h() {
        CameraInternal cameraInternal;
        synchronized (this.b) {
            cameraInternal = this.l;
        }
        return cameraInternal;
    }

    public Set i() {
        return Collections.EMPTY_SET;
    }

    public final int j() {
        return ((ImageOutputConfig) this.f).s(0);
    }

    public abstract UseCaseConfig.Builder k(Config config);

    public final boolean l(int i) {
        Iterator it = i().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if ((i & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(CameraInternal cameraInternal) {
        int iV = ((ImageOutputConfig) this.f).v();
        if (iV == -1 || iV == 0) {
            return false;
        }
        if (iV == 1) {
            return true;
        }
        if (iV == 2) {
            return cameraInternal.e();
        }
        throw new AssertionError(YU.a.d(iV, "Unknown mirrorMode: "));
    }

    public final UseCaseConfig n(CameraInfoInternal cameraInfoInternal, UseCaseConfig useCaseConfig, UseCaseConfig useCaseConfig2) {
        MutableOptionsBundle mutableOptionsBundleV;
        if (useCaseConfig2 != null) {
            mutableOptionsBundleV = MutableOptionsBundle.W(useCaseConfig2);
            mutableOptionsBundleV.G.remove(TargetConfig.D);
        } else {
            mutableOptionsBundleV = MutableOptionsBundle.V();
        }
        TreeMap treeMap = mutableOptionsBundleV.G;
        if (this.e.d(ImageOutputConfig.h) || this.e.d(ImageOutputConfig.l)) {
            Config.Option option = ImageOutputConfig.p;
            if (treeMap.containsKey(option)) {
                treeMap.remove(option);
            }
        }
        UseCaseConfig useCaseConfig3 = this.e;
        Config.Option option2 = ImageOutputConfig.p;
        if (useCaseConfig3.d(option2)) {
            Config.Option option3 = ImageOutputConfig.n;
            if (treeMap.containsKey(option3) && ((ResolutionSelector) this.e.a(option2)).b != null) {
                treeMap.remove(option3);
            }
        }
        Iterator it = this.e.f().iterator();
        while (it.hasNext()) {
            Config.t(mutableOptionsBundleV, mutableOptionsBundleV, this.e, (Config.Option) it.next());
        }
        if (useCaseConfig != null) {
            for (Config.Option option4 : useCaseConfig.f()) {
                if (!option4.c().equals(TargetConfig.D.c())) {
                    Config.t(mutableOptionsBundleV, mutableOptionsBundleV, useCaseConfig, option4);
                }
            }
        }
        if (treeMap.containsKey(ImageOutputConfig.l)) {
            Config.Option option5 = ImageOutputConfig.h;
            if (treeMap.containsKey(option5)) {
                treeMap.remove(option5);
            }
        }
        Config.Option option6 = ImageOutputConfig.p;
        if (treeMap.containsKey(option6)) {
            ((ResolutionSelector) mutableOptionsBundleV.a(option6)).getClass();
        }
        return t(cameraInfoInternal, k(mutableOptionsBundleV));
    }

    public final void o() {
        this.c = State.d;
        q();
    }

    public final void p() {
        Iterator it = this.f429a.iterator();
        while (it.hasNext()) {
            ((StateChangeCallback) it.next()).n(this);
        }
    }

    public final void q() {
        int iOrdinal = this.c.ordinal();
        HashSet hashSet = this.f429a;
        if (iOrdinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((StateChangeCallback) it.next()).j(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((StateChangeCallback) it2.next()).q(this);
            }
        }
    }

    public void r() {
    }

    public void s() {
    }

    public UseCaseConfig t(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        return builder.e();
    }

    public void u() {
    }

    public void v() {
    }

    public StreamSpec w(Config config) {
        StreamSpec streamSpec = this.g;
        if (streamSpec == null) {
            throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
        }
        StreamSpec.Builder builderG = streamSpec.g();
        builderG.d(config);
        return builderG.a();
    }

    public StreamSpec x(StreamSpec streamSpec, StreamSpec streamSpec2) {
        return streamSpec;
    }

    public void y() {
    }

    public void z(Matrix matrix) {
        this.j = new Matrix(matrix);
    }
}
