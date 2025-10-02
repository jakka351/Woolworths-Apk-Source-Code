package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class CmcdConfiguration {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CmcdKey {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DataTransmissionMode {
    }

    public interface Factory {

        /* renamed from: androidx.media3.exoplayer.upstream.CmcdConfiguration$Factory$1, reason: invalid class name */
        public class AnonymousClass1 implements RequestConfig {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HeaderKey {
    }

    public interface RequestConfig {
    }
}
