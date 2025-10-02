package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;

/* loaded from: classes2.dex */
final class AutoValue_EncoderProfilesProxy_VideoProfileProxy extends EncoderProfilesProxy.VideoProfileProxy {

    /* renamed from: a, reason: collision with root package name */
    public final int f462a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public AutoValue_EncoderProfilesProxy_VideoProfileProxy(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f462a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int b() {
        return this.h;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int c() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int d() {
        return this.i;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int e() {
        return this.f462a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.VideoProfileProxy)) {
            return false;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) obj;
        return this.f462a == videoProfileProxy.e() && this.b.equals(videoProfileProxy.i()) && this.c == videoProfileProxy.c() && this.d == videoProfileProxy.f() && this.e == videoProfileProxy.k() && this.f == videoProfileProxy.h() && this.g == videoProfileProxy.j() && this.h == videoProfileProxy.b() && this.i == videoProfileProxy.d() && this.j == videoProfileProxy.g();
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int f() {
        return this.d;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int g() {
        return this.j;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f462a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final String i() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int j() {
        return this.g;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int k() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.f462a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", frameRate=");
        sb.append(this.d);
        sb.append(", width=");
        sb.append(this.e);
        sb.append(", height=");
        sb.append(this.f);
        sb.append(", profile=");
        sb.append(this.g);
        sb.append(", bitDepth=");
        sb.append(this.h);
        sb.append(", chromaSubsampling=");
        sb.append(this.i);
        sb.append(", hdrFormat=");
        return YU.a.m(sb, this.j, "}");
    }
}
