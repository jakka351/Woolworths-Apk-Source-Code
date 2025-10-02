package io.grpc.okhttp.internal.framed;

import java.io.Closeable;
import java.util.ArrayList;
import okio.ByteString;
import okio.RealBufferedSource;

/* loaded from: classes7.dex */
public interface FrameReader extends Closeable {

    public interface Handler {
        void E(int i, long j);

        void J(int i, int i2, boolean z);

        void M(int i, ErrorCode errorCode);

        void N(boolean z, int i, ArrayList arrayList);

        void O(boolean z, int i, RealBufferedSource realBufferedSource, int i2, int i3);

        void P(int i, int i2, ArrayList arrayList);

        void Q(int i, ErrorCode errorCode, ByteString byteString);

        void u(Settings settings);
    }

    boolean i1(Handler handler);
}
