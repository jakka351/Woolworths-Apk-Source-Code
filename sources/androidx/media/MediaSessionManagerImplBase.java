package androidx.media;

import android.text.TextUtils;
import androidx.media.MediaSessionManager;
import java.util.Objects;

/* loaded from: classes2.dex */
class MediaSessionManagerImplBase implements MediaSessionManager.MediaSessionManagerImpl {

    public static class RemoteUserInfoImplBase implements MediaSessionManager.RemoteUserInfoImpl {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteUserInfoImplBase) && TextUtils.equals(null, null);
        }

        public final int hashCode() {
            return Objects.hash(null, 0, 0);
        }
    }

    static {
        int i = MediaSessionManager.f2840a;
    }
}
