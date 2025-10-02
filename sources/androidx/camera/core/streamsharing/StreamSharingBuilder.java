package androidx.camera.core.streamsharing;

import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import java.util.UUID;

/* loaded from: classes2.dex */
class StreamSharingBuilder implements UseCaseConfig.Builder<StreamSharing, StreamSharingConfig, StreamSharingBuilder> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableOptionsBundle f568a;

    public StreamSharingBuilder(MutableOptionsBundle mutableOptionsBundle) {
        Object objA;
        this.f568a = mutableOptionsBundle;
        Object objA2 = null;
        try {
            objA = mutableOptionsBundle.a(TargetConfig.E);
        } catch (IllegalArgumentException unused) {
            objA = null;
        }
        Class cls = (Class) objA;
        if (cls != null && !cls.equals(StreamSharing.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        this.f568a.G(UseCaseConfig.z, UseCaseConfigFactory.CaptureType.h);
        MutableOptionsBundle mutableOptionsBundle2 = this.f568a;
        mutableOptionsBundle2.G(TargetConfig.E, StreamSharing.class);
        try {
            objA2 = mutableOptionsBundle2.a(TargetConfig.D);
        } catch (IllegalArgumentException unused2) {
        }
        if (objA2 == null) {
            mutableOptionsBundle2.G(TargetConfig.D, StreamSharing.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public final MutableConfig b() {
        return this.f568a;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final UseCaseConfig e() {
        return new StreamSharingConfig(OptionsBundle.U(this.f568a));
    }
}
