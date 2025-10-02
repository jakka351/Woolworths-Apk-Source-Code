package androidx.media3.exoplayer.drm;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource;

@UnstableApi
/* loaded from: classes2.dex */
public final class OfflineLicenseHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3088a = 0;

    /* renamed from: androidx.media3.exoplayer.drm.OfflineLicenseHelper$1, reason: invalid class name */
    class AnonymousClass1 implements DrmSessionEventListener {
        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void F(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            int i2 = OfflineLicenseHelper.f3088a;
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void d0(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            int i2 = OfflineLicenseHelper.f3088a;
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void k0(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            int i2 = OfflineLicenseHelper.f3088a;
            throw null;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.q = new DrmInitData(new DrmInitData.SchemeData[0]);
        builder.a();
    }
}
