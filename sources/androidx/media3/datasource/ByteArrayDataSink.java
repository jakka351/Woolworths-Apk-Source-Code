package androidx.media3.datasource;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class ByteArrayDataSink implements DataSink {

    /* renamed from: a, reason: collision with root package name */
    public ByteArrayOutputStream f2955a;

    @Override // androidx.media3.datasource.DataSink
    public final void a(DataSpec dataSpec) {
        long j = dataSpec.g;
        if (j == -1) {
            this.f2955a = new ByteArrayOutputStream();
        } else {
            Assertions.b(j <= 2147483647L);
            this.f2955a = new ByteArrayOutputStream((int) j);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public final void close() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.f2955a;
        int i = Util.f2928a;
        byteArrayOutputStream.close();
    }

    @Override // androidx.media3.datasource.DataSink
    public final void write(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = this.f2955a;
        int i3 = Util.f2928a;
        byteArrayOutputStream.write(bArr, i, i2);
    }
}
