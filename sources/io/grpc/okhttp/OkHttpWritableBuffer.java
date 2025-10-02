package io.grpc.okhttp;

import io.grpc.internal.WritableBuffer;
import okio.Buffer;

/* loaded from: classes7.dex */
class OkHttpWritableBuffer implements WritableBuffer {

    /* renamed from: a, reason: collision with root package name */
    public final Buffer f24128a;
    public int b;
    public int c;

    public OkHttpWritableBuffer(Buffer buffer, int i) {
        this.f24128a = buffer;
        this.b = i;
    }

    @Override // io.grpc.internal.WritableBuffer
    public final int a() {
        return this.b;
    }

    @Override // io.grpc.internal.WritableBuffer
    public final void b(byte b) {
        this.f24128a.Y(b);
        this.b--;
        this.c++;
    }

    @Override // io.grpc.internal.WritableBuffer
    public final int s() {
        return this.c;
    }

    @Override // io.grpc.internal.WritableBuffer
    public final void write(byte[] bArr, int i, int i2) {
        this.f24128a.write(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
