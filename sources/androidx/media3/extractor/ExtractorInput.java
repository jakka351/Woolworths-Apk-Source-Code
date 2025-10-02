package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface ExtractorInput extends DataReader {
    void b(int i, int i2, byte[] bArr);

    int c(int i, int i2, byte[] bArr);

    boolean e(byte[] bArr, int i, int i2, boolean z);

    int f(int i);

    long getLength();

    long getPosition();

    boolean h(byte[] bArr, int i, int i2, boolean z);

    void i();

    long j();

    void k(int i);

    void l(int i);

    void readFully(byte[] bArr, int i, int i2);
}
