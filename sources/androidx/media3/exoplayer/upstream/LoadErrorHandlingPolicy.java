package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public interface LoadErrorHandlingPolicy {

    public static final class FallbackOptions {
    }

    public static final class FallbackSelection {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    public static final class LoadErrorInfo {

        /* renamed from: a, reason: collision with root package name */
        public final IOException f3181a;
        public final int b;

        public LoadErrorInfo(IOException iOException, int i) {
            this.f3181a = iOException;
            this.b = i;
        }
    }

    long a(LoadErrorInfo loadErrorInfo);

    int b(int i);
}
