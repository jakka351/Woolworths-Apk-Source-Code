package androidx.media;

import android.util.Log;

/* loaded from: classes2.dex */
public final class MediaSessionManager {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2840a = 0;

    public interface MediaSessionManagerImpl {
    }

    public static final class RemoteUserInfo {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfo) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public interface RemoteUserInfoImpl {
    }

    static {
        Log.isLoggable("MediaSessionManager", 3);
    }
}
