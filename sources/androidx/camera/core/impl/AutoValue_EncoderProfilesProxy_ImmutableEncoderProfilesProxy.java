package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* loaded from: classes2.dex */
final class AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy extends EncoderProfilesProxy.ImmutableEncoderProfilesProxy {

    /* renamed from: a, reason: collision with root package name */
    public final int f461a;
    public final int b;
    public final List c;
    public final List d;

    public AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(int i, int i2, List list, List list2) {
        this.f461a = i;
        this.b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.d = list2;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int a() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List b() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int c() {
        return this.f461a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EncoderProfilesProxy.ImmutableEncoderProfilesProxy) {
            AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = (AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy) ((EncoderProfilesProxy.ImmutableEncoderProfilesProxy) obj);
            if (this.f461a == autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.f461a && this.b == autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.b && this.c.equals(autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.c) && this.d.equals(autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f461a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.f461a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.c);
        sb.append(", videoProfiles=");
        return android.support.v4.media.session.a.t(sb, this.d, "}");
    }
}
