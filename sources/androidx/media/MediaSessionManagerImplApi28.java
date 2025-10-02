package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.media.MediaSessionManager;
import java.util.Objects;

@RequiresApi
/* loaded from: classes2.dex */
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {

    public static final class RemoteUserInfoImplApi28 implements MediaSessionManager.RemoteUserInfoImpl {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSessionManager.RemoteUserInfo f2841a;

        public RemoteUserInfoImplApi28(String str, int i, int i2) {
            this.f2841a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfoImplApi28) {
                return this.f2841a.equals(((RemoteUserInfoImplApi28) obj).f2841a);
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f2841a);
        }
    }
}
