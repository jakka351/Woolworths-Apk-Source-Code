package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class AutoValue_Camera2CameraImpl_UseCaseInfo extends Camera2CameraImpl.UseCaseInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f225a;
    public final Class b;
    public final SessionConfig c;
    public final UseCaseConfig d;
    public final Size e;
    public final StreamSpec f;
    public final List g;

    public AutoValue_Camera2CameraImpl_UseCaseInfo(String str, Class cls, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, Size size, StreamSpec streamSpec, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f225a = str;
        this.b = cls;
        if (sessionConfig == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.c = sessionConfig;
        if (useCaseConfig == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.d = useCaseConfig;
        this.e = size;
        this.f = streamSpec;
        this.g = arrayList;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public final List a() {
        return this.g;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public final SessionConfig b() {
        return this.c;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public final StreamSpec c() {
        return this.f;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public final Size d() {
        return this.e;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public final UseCaseConfig e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera2CameraImpl.UseCaseInfo)) {
            return false;
        }
        Camera2CameraImpl.UseCaseInfo useCaseInfo = (Camera2CameraImpl.UseCaseInfo) obj;
        if (!this.f225a.equals(useCaseInfo.f()) || !this.b.equals(useCaseInfo.g()) || !this.c.equals(useCaseInfo.b()) || !this.d.equals(useCaseInfo.e())) {
            return false;
        }
        Size size = this.e;
        if (size == null) {
            if (useCaseInfo.d() != null) {
                return false;
            }
        } else if (!size.equals(useCaseInfo.d())) {
            return false;
        }
        StreamSpec streamSpec = this.f;
        if (streamSpec == null) {
            if (useCaseInfo.c() != null) {
                return false;
            }
        } else if (!streamSpec.equals(useCaseInfo.c())) {
            return false;
        }
        List list = this.g;
        return list == null ? useCaseInfo.a() == null : list.equals(useCaseInfo.a());
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public final String f() {
        return this.f225a;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public final Class g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f225a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Size size = this.e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        StreamSpec streamSpec = this.f;
        int iHashCode3 = (iHashCode2 ^ (streamSpec == null ? 0 : streamSpec.hashCode())) * 1000003;
        List list = this.g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.f225a);
        sb.append(", useCaseType=");
        sb.append(this.b);
        sb.append(", sessionConfig=");
        sb.append(this.c);
        sb.append(", useCaseConfig=");
        sb.append(this.d);
        sb.append(", surfaceResolution=");
        sb.append(this.e);
        sb.append(", streamSpec=");
        sb.append(this.f);
        sb.append(", captureTypes=");
        return android.support.v4.media.session.a.t(sb, this.g, "}");
    }
}
