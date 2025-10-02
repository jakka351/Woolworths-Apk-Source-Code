package io.grpc.okhttp;

import io.grpc.internal.WritableBuffer;
import io.grpc.internal.WritableBufferAllocator;
import okio.Buffer;

/* loaded from: classes7.dex */
class OkHttpWritableBufferAllocator implements WritableBufferAllocator {
    @Override // io.grpc.internal.WritableBufferAllocator
    public final WritableBuffer a(int i) {
        return new OkHttpWritableBuffer(new Buffer(), Math.min(1048576, Math.max(4096, i)));
    }
}
