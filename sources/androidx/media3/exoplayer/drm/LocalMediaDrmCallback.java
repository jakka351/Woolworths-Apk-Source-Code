package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public final class LocalMediaDrmCallback implements MediaDrmCallback {
    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public final byte[] a(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public final byte[] b(ExoMediaDrm.ProvisionRequest provisionRequest) {
        throw new UnsupportedOperationException();
    }
}
