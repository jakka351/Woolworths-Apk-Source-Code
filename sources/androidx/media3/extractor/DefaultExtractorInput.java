package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    public final DataReader b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3229a = new byte[4096];

    static {
        MediaLibraryInfo.a("media3.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader, long j, long j2) {
        this.b = dataReader;
        this.d = j;
        this.c = j2;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void b(int i, int i2, byte[] bArr) {
        h(bArr, i, i2, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final int c(int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin;
        n(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.o(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            defaultExtractorInput.g += iMin;
        } else {
            defaultExtractorInput = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(defaultExtractorInput.e, defaultExtractorInput.f, bArr, i, iMin);
        defaultExtractorInput.f += iMin;
        return iMin;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean e(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            p(iMin);
        }
        int iO = iMin;
        while (iO < i2 && iO != -1) {
            iO = o(bArr, i, i2, iO, z);
        }
        if (iO != -1) {
            this.d += iO;
        }
        return iO != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final int f(int i) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin = Math.min(this.g, i);
        p(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f3229a;
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.o(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            defaultExtractorInput = this;
        }
        if (iMin != -1) {
            defaultExtractorInput.d += iMin;
        }
        return iMin;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getLength() {
        return this.c;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getPosition() {
        return this.d;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean h(byte[] bArr, int i, int i2, boolean z) {
        if (!m(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void i() {
        this.f = 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long j() {
        return this.d + this.f;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void k(int i) throws EOFException, InterruptedIOException {
        m(i, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void l(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        p(iMin);
        int iO = iMin;
        while (iO < i && iO != -1) {
            byte[] bArr = this.f3229a;
            iO = o(bArr, -iO, Math.min(i, bArr.length + iO), iO, false);
        }
        if (iO != -1) {
            this.d += iO;
        }
    }

    public final boolean m(int i, boolean z) throws EOFException, InterruptedIOException {
        n(i);
        int iO = this.g - this.f;
        while (iO < i) {
            int i2 = i;
            boolean z2 = z;
            iO = o(this.e, this.f, i2, iO, z2);
            if (iO == -1) {
                return false;
            }
            this.g = this.f + iO;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void n(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, Util.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int o(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void p(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int i3 = this.g;
        int iO = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            p(iMin);
            iO = iMin;
        }
        if (iO == 0) {
            defaultExtractorInput = this;
            iO = defaultExtractorInput.o(bArr, i, i2, 0, true);
        } else {
            defaultExtractorInput = this;
        }
        if (iO != -1) {
            defaultExtractorInput.d += iO;
        }
        return iO;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        e(bArr, i, i2, false);
    }
}
