package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/Buffer;", "Lokio/RealBufferedSource;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    int A2(Options options);

    String B1();

    String I0(Charset charset);

    void I1(long j);

    long V(ByteString byteString);

    long X0();

    boolean X1();

    boolean a0(long j, ByteString byteString);

    void l1(Buffer buffer, long j);

    String n1(long j);

    ByteString p0(long j);

    /* renamed from: q */
    Buffer getE();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    void skip(long j);

    long t2(BufferedSink bufferedSink);

    byte[] u0();

    InputStream z2();
}
