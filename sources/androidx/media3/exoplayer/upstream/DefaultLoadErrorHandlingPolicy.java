package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.FileNotFoundException;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public final long a(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        Throwable cause = loadErrorInfo.f3181a;
        if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource.CleartextNotPermittedException) || (cause instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        int i = DataSourceException.e;
        while (cause != null) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).d == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((loadErrorInfo.b - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public final int b(int i) {
        return i == 7 ? 6 : 3;
    }
}
