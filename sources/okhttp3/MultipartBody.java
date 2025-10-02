package okhttp3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.MediaType;
import okhttp3.internal._UtilJvmKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Part", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType f;
    public static final MediaType g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final ByteString b;
    public final List c;
    public final MediaType d;
    public long e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ByteString f26686a;
        public MediaType b;
        public final ArrayList c;

        @JvmOverloads
        public Builder() {
            String strH = androidx.constraintlayout.core.state.a.h("toString(...)");
            ByteString byteString = ByteString.g;
            this.f26686a = ByteString.Companion.b(strH);
            this.b = MultipartBody.f;
            this.c = new ArrayList();
        }

        public final void a(Headers headers, RequestBody body) {
            Intrinsics.h(body, "body");
            Part.c.getClass();
            if (headers.b(RequestBuilder.CONTENT_TYPE) != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers.b("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            b(new Part(headers, body));
        }

        public final void b(Part part) {
            Intrinsics.h(part, "part");
            this.c.add(part);
        }

        public final MultipartBody c() {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.f26686a, this.b, _UtilJvmKt.j(arrayList));
        }

        public final void d(MediaType type) {
            Intrinsics.h(type, "type");
            if (type.b.equals("multipart")) {
                this.b = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "<init>", "()V", "Lokhttp3/MediaType;", "MIXED", "Lokhttp3/MediaType;", "ALTERNATIVE", "DIGEST", "PARALLEL", "FORM", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Part {
        public static final Companion c = new Companion(0);

        /* renamed from: a, reason: collision with root package name */
        public final Headers f26687a;
        public final RequestBody b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            private Companion() {
            }
        }

        public Part(Headers headers, RequestBody requestBody) {
            this.f26687a = headers;
            this.b = requestBody;
        }
    }

    static {
        new Companion(0);
        MediaType.e.getClass();
        f = MediaType.Companion.a("multipart/mixed");
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
        g = MediaType.Companion.a("multipart/form-data");
        h = new byte[]{58, 32};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public MultipartBody(ByteString boundaryByteString, MediaType type, List list) {
        Intrinsics.h(boundaryByteString, "boundaryByteString");
        Intrinsics.h(type, "type");
        this.b = boundaryByteString;
        this.c = list;
        MediaType.Companion companion = MediaType.e;
        String str = type + "; boundary=" + boundaryByteString.y();
        companion.getClass();
        this.d = MediaType.Companion.a(str);
        this.e = -1L;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        long j2 = this.e;
        if (j2 != -1) {
            return j2;
        }
        long jE = e(null, true);
        this.e = jE;
        return jE;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b, reason: from getter */
    public final MediaType getD() {
        return this.d;
    }

    @Override // okhttp3.RequestBody
    public final boolean c() {
        List list = this.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.RequestBody
    public final void d(BufferedSink bufferedSink) {
        e(bufferedSink, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        BufferedSink buffer2;
        if (z) {
            buffer2 = new Buffer();
            buffer = buffer2;
        } else {
            buffer = 0;
            buffer2 = bufferedSink;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            ByteString byteString = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 >= size) {
                Intrinsics.e(buffer2);
                buffer2.write(bArr);
                buffer2.S0(byteString);
                buffer2.write(bArr);
                buffer2.write(bArr2);
                if (!z) {
                    return j2;
                }
                Intrinsics.e(buffer);
                long j3 = j2 + buffer.e;
                buffer.a();
                return j3;
            }
            Part part = (Part) list.get(i2);
            Headers headers = part.f26687a;
            RequestBody requestBody = part.b;
            Intrinsics.e(buffer2);
            buffer2.write(bArr);
            buffer2.S0(byteString);
            buffer2.write(bArr2);
            int size2 = headers.size();
            for (int i3 = 0; i3 < size2; i3++) {
                buffer2.r1(headers.d(i3)).write(h).r1(headers.i(i3)).write(bArr2);
            }
            MediaType d = requestBody.getD();
            if (d != null) {
                buffer2.r1("Content-Type: ").r1(d.f26685a).write(bArr2);
            }
            long jA = requestBody.a();
            if (jA == -1 && z) {
                Intrinsics.e(buffer);
                buffer.a();
                return -1L;
            }
            buffer2.write(bArr2);
            if (z) {
                j2 += jA;
            } else {
                requestBody.d(buffer2);
            }
            buffer2.write(bArr2);
            i2++;
        }
    }
}
