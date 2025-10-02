package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface DataSink {

    public interface Factory {
    }

    void a(DataSpec dataSpec);

    void close();

    void write(byte[] bArr, int i, int i2);
}
