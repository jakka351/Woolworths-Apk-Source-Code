package androidx.media3.extractor.mp3;

import androidx.media3.extractor.SeekMap;

/* loaded from: classes2.dex */
interface Seeker extends SeekMap {

    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        @Override // androidx.media3.extractor.mp3.Seeker
        public final long g() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public final long h(long j) {
            return 0L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public final int k() {
            return -2147483647;
        }
    }

    long g();

    long h(long j);

    int k();
}
