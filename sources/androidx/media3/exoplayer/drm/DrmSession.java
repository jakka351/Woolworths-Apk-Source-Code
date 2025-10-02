package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int d;

        public DrmSessionException(Throwable th, int i) {
            super(th);
            this.d = i;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    static void b(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.g(null);
        }
        if (drmSession != null) {
            drmSession.e(null);
        }
    }

    default boolean a() {
        return false;
    }

    DrmSessionException c();

    CryptoConfig d();

    void e(DrmSessionEventListener.EventDispatcher eventDispatcher);

    UUID f();

    void g(DrmSessionEventListener.EventDispatcher eventDispatcher);

    int getState();

    boolean h(String str);
}
