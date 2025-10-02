package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public interface MediaDrmCallback {
    byte[] a(UUID uuid, ExoMediaDrm.KeyRequest keyRequest);

    byte[] b(ExoMediaDrm.ProvisionRequest provisionRequest);
}
