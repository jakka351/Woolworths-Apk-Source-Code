package androidx.media3.datasource;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import androidx.annotation.RequiresExtension;
import java.nio.ByteBuffer;

@RequiresExtension
/* loaded from: classes2.dex */
final class ByteArrayUploadDataProvider extends UploadDataProvider {
    public final byte[] d;
    public int e;

    public ByteArrayUploadDataProvider(byte[] bArr) {
        this.d = bArr;
    }

    public final long getLength() {
        return this.d.length;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int iMin = Math.min(byteBuffer.remaining(), this.d.length - this.e);
        byteBuffer.put(this.d, this.e, iMin);
        this.e += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.e = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
