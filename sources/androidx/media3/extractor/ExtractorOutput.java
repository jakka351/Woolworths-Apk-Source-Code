package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface ExtractorOutput {
    public static final ExtractorOutput j3 = new AnonymousClass1();

    /* renamed from: androidx.media3.extractor.ExtractorOutput$1, reason: invalid class name */
    public class AnonymousClass1 implements ExtractorOutput {
        @Override // androidx.media3.extractor.ExtractorOutput
        public final void h() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final TrackOutput j(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final void q(SeekMap seekMap) {
            throw new UnsupportedOperationException();
        }
    }

    void h();

    TrackOutput j(int i, int i2);

    void q(SeekMap seekMap);
}
