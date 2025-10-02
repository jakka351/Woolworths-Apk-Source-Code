package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public interface ExoMediaDrm {

    public static final class AppManagedProvider implements Provider {
        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
        public final ExoMediaDrm g(UUID uuid) {
            throw null;
        }
    }

    public static final class KeyRequest {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f3083a;
        public final String b;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(byte[] bArr, String str) {
            this.f3083a = bArr;
            this.b = str;
        }
    }

    public static final class KeyStatus {
    }

    public interface OnEventListener {
    }

    public interface OnExpirationUpdateListener {
    }

    public interface OnKeyStatusChangeListener {
    }

    public interface Provider {
        ExoMediaDrm g(UUID uuid);
    }

    public static final class ProvisionRequest {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f3084a;
        public final String b;

        public ProvisionRequest(byte[] bArr, String str) {
            this.f3084a = bArr;
            this.b = str;
        }
    }

    Map a(byte[] bArr);

    ProvisionRequest b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    byte[] e(byte[] bArr, byte[] bArr2);

    default void f(byte[] bArr, PlayerId playerId) {
    }

    boolean g(String str, byte[] bArr);

    void h(byte[] bArr);

    int i();

    CryptoConfig j(byte[] bArr);

    void k(byte[] bArr);

    void l(OnEventListener onEventListener);

    KeyRequest m(byte[] bArr, List list, int i, HashMap map);

    void release();
}
