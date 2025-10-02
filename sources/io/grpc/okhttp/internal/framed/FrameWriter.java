package io.grpc.okhttp.internal.framed;

import java.io.Closeable;
import java.util.List;
import okio.Buffer;

/* loaded from: classes7.dex */
public interface FrameWriter extends Closeable {
    void A0(ErrorCode errorCode, byte[] bArr);

    void E(int i, long j);

    int H1();

    void J(int i, int i2, boolean z);

    void M(int i, ErrorCode errorCode);

    void S();

    void c0(int i, List list, boolean z);

    void flush();

    void k1(boolean z, int i, Buffer buffer, int i2);

    void u(Settings settings);

    void u1(Settings settings);
}
