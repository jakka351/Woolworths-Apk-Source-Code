package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

@UnstableApi
/* loaded from: classes2.dex */
public interface DrmSessionManager {

    /* renamed from: a, reason: collision with root package name */
    public static final DrmSessionManager f3081a = new AnonymousClass1();

    /* renamed from: androidx.media3.exoplayer.drm.DrmSessionManager$1, reason: invalid class name */
    public class AnonymousClass1 implements DrmSessionManager {
        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public final int a(Format format) {
            return format.r != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public final void b(Looper looper, PlayerId playerId) {
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public final DrmSession c(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
            if (format.r == null) {
                return null;
            }
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(), 6001));
        }
    }

    public interface DrmSessionReference {
        public static final androidx.camera.core.internal.a i3 = new androidx.camera.core.internal.a(26);

        void release();
    }

    int a(Format format);

    void b(Looper looper, PlayerId playerId);

    DrmSession c(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    default DrmSessionReference d(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        return DrmSessionReference.i3;
    }

    default void p() {
    }

    default void release() {
    }
}
