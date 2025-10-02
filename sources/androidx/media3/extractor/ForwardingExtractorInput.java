package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingExtractorInput implements ExtractorInput {

    /* renamed from: a, reason: collision with root package name */
    public final ExtractorInput f3240a;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.f3240a = extractorInput;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void b(int i, int i2, byte[] bArr) {
        this.f3240a.b(i, i2, bArr);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final int c(int i, int i2, byte[] bArr) {
        return this.f3240a.c(i, i2, bArr);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean e(byte[] bArr, int i, int i2, boolean z) {
        return this.f3240a.e(bArr, 0, i2, z);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final int f(int i) {
        return this.f3240a.f(i);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.f3240a.getLength();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.f3240a.getPosition();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean h(byte[] bArr, int i, int i2, boolean z) {
        return this.f3240a.h(bArr, 0, i2, z);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void i() {
        this.f3240a.i();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long j() {
        return this.f3240a.j();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void k(int i) {
        this.f3240a.k(i);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void l(int i) {
        this.f3240a.l(i);
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        return this.f3240a.read(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.f3240a.readFully(bArr, i, i2);
    }
}
