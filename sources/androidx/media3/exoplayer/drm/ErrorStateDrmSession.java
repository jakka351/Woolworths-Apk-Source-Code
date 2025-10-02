package androidx.media3.exoplayer.drm;

import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public final class ErrorStateDrmSession implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f3082a;

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        this.f3082a = drmSessionException;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean a() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException c() {
        return this.f3082a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final CryptoConfig d() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void e(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID f() {
        return C.f2848a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void g(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean h(String str) {
        return false;
    }
}
