package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public class SwappedVideoEncoderInfo implements VideoEncoderInfo {

    /* renamed from: a, reason: collision with root package name */
    public final VideoEncoderInfo f634a;

    public SwappedVideoEncoderInfo(VideoEncoderInfo videoEncoderInfo) {
        Preconditions.b(videoEncoderInfo.g());
        this.f634a = videoEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range a(int i) {
        return this.f634a.d(i);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range c() {
        return this.f634a.c();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range d(int i) {
        return this.f634a.a(i);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range e() {
        return this.f634a.f();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range f() {
        return this.f634a.e();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean g() {
        return this.f634a.g();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int h() {
        return this.f634a.j();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean i(int i, int i2) {
        return this.f634a.i(i2, i);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int j() {
        return this.f634a.h();
    }
}
