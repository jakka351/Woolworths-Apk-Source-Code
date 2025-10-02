package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode d;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.d = errorCode;
    }
}
