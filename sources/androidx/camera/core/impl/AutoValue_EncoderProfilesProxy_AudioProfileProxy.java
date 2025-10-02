package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;

/* loaded from: classes2.dex */
final class AutoValue_EncoderProfilesProxy_AudioProfileProxy extends EncoderProfilesProxy.AudioProfileProxy {

    /* renamed from: a, reason: collision with root package name */
    public final int f460a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public AutoValue_EncoderProfilesProxy_AudioProfileProxy(String str, int i, int i2, int i3, int i4, int i5) {
        this.f460a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int b() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int c() {
        return this.e;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int d() {
        return this.f460a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.AudioProfileProxy)) {
            return false;
        }
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = (EncoderProfilesProxy.AudioProfileProxy) obj;
        return this.f460a == audioProfileProxy.d() && this.b.equals(audioProfileProxy.e()) && this.c == audioProfileProxy.b() && this.d == audioProfileProxy.g() && this.e == audioProfileProxy.c() && this.f == audioProfileProxy.f();
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int f() {
        return this.f;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((this.f460a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.f460a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channels=");
        sb.append(this.e);
        sb.append(", profile=");
        return YU.a.m(sb, this.f, "}");
    }
}
