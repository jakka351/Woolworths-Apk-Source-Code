package com.apollographql.apollo.internal;

import androidx.camera.core.impl.b;
import com.apollographql.apollo.annotations.ApolloInternal;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;

@ApolloInternal
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader;", "Ljava/io/Closeable;", "Lokio/Closeable;", "PartSource", "Part", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MultipartReader implements Closeable {
    public final BufferedSource d;
    public final ByteString e;
    public final ByteString f;
    public int g;
    public boolean h;
    public boolean i;
    public PartSource j;
    public final Options k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader$Companion;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @ApolloInternal
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokio/Closeable;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Part implements Closeable {
        public final RealBufferedSource d;

        public Part(ArrayList arrayList, RealBufferedSource realBufferedSource) {
            this.d = realBufferedSource;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.d.close();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader$PartSource;", "Lokio/Source;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public final class PartSource implements Source {
        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            MultipartReader multipartReader = MultipartReader.this;
            if (Intrinsics.c(multipartReader.j, this)) {
                multipartReader.j = null;
            }
        }

        @Override // okio.Source
        /* renamed from: n */
        public final Timeout getE() {
            return MultipartReader.this.d.getE();
        }

        @Override // okio.Source
        public final long q2(Buffer sink, long j) {
            Intrinsics.h(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
            }
            MultipartReader multipartReader = MultipartReader.this;
            if (!Intrinsics.c(multipartReader.j, this)) {
                throw new IllegalStateException("closed");
            }
            long jA = multipartReader.a(j);
            if (jA == 0) {
                return -1L;
            }
            return multipartReader.d.q2(sink, jA);
        }
    }

    public MultipartReader(BufferedSource bufferedSource, String str) {
        this.d = bufferedSource;
        Buffer buffer = new Buffer();
        buffer.t0("--");
        buffer.t0(str);
        this.e = buffer.p0(buffer.e);
        Buffer buffer2 = new Buffer();
        buffer2.t0("\r\n--");
        buffer2.t0(str);
        this.f = buffer2.p0(buffer2.e);
        ByteString byteString = ByteString.g;
        this.k = Options.Companion.b(ByteString.Companion.b("\r\n--" + str + "--"), ByteString.Companion.b("\r\n"), ByteString.Companion.b("--"), ByteString.Companion.b(" "), ByteString.Companion.b("\t"));
    }

    public final long a(long j) {
        ByteString byteString = this.f;
        long jC = byteString.c();
        BufferedSource bufferedSource = this.d;
        bufferedSource.I1(jC);
        Buffer e = bufferedSource.getE();
        e.getClass();
        byte[] bArr = okio.internal.Buffer.f26785a;
        long jA = okio.internal.Buffer.a(e, byteString, 0L, Long.MAX_VALUE, byteString.c());
        return jA == -1 ? Math.min(j, (bufferedSource.getE().e - byteString.c()) + 1) : Math.min(j, jA);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.h) {
            return;
        }
        this.h = true;
        this.j = null;
        this.d.close();
    }
}
