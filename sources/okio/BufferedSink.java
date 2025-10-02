package okio;

import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/Buffer;", "Lokio/RealBufferedSink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    BufferedSink F0(int i, byte[] bArr);

    BufferedSink L0(long j);

    BufferedSink S0(ByteString byteString);

    BufferedSink f1();

    @Override // okio.Sink, java.io.Flushable
    void flush();

    BufferedSink i2(int i, int i2, String str);

    BufferedSink n0(long j);

    /* renamed from: q */
    Buffer getE();

    BufferedSink r1(String str);

    BufferedSink write(byte[] bArr);

    BufferedSink writeByte(int i);

    BufferedSink writeInt(int i);

    BufferedSink writeShort(int i);
}
