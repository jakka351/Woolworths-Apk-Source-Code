package okhttp3;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okio.BufferedSink;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f26692a = new Companion(0);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "Lokhttp3/RequestBody;", "EMPTY", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.RequestBody$Companion$toRequestBody$3] */
        public static RequestBody$Companion$toRequestBody$3 a(final int i, final MediaType mediaType, final byte[] bArr) {
            Intrinsics.h(bArr, "<this>");
            _UtilCommonKt.a(bArr.length, 0, i);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
                @Override // okhttp3.RequestBody
                public final long a() {
                    return i;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: b, reason: from getter */
                public final MediaType getB() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public final void d(BufferedSink bufferedSink) {
                    bufferedSink.F0(i, bArr);
                }
            };
        }

        public static RequestBody$Companion$toRequestBody$3 b(String str, MediaType mediaType) {
            Intrinsics.h(str, "<this>");
            Pair pairA = Internal.a(mediaType);
            Charset charset = (Charset) pairA.d;
            MediaType mediaType2 = (MediaType) pairA.e;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.g(bytes, "getBytes(...)");
            return a(bytes.length, mediaType2, bytes);
        }

        private Companion() {
        }
    }

    static {
        ByteString byteString = ByteString.g;
        Intrinsics.h(byteString, "<this>");
        new RequestBody$Companion$toRequestBody$1(null, byteString);
    }

    public long a() {
        return -1L;
    }

    /* renamed from: b */
    public abstract MediaType getB();

    public boolean c() {
        return this instanceof RequestBody$Companion$toRequestBody$2;
    }

    public abstract void d(BufferedSink bufferedSink);
}
