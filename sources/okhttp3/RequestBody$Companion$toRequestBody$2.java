package okhttp3;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Metadata;
import okio.BufferedSink;
import okio.Okio;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/RequestBody$Companion$toRequestBody$2", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    @Override // okhttp3.RequestBody
    /* renamed from: b */
    public final MediaType getD() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final void d(BufferedSink bufferedSink) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((FileDescriptor) null);
        try {
            bufferedSink.getE().U(Okio.h(fileInputStream));
            fileInputStream.close();
        } finally {
        }
    }
}
