package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ogg.FlacReader;

/* loaded from: classes2.dex */
abstract class StreamReader {
    public TrackOutput b;
    public ExtractorOutput c;
    public OggSeeker d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;

    /* renamed from: a, reason: collision with root package name */
    public final OggPacket f3349a = new OggPacket();
    public SetupData j = new SetupData();

    public static class SetupData {

        /* renamed from: a, reason: collision with root package name */
        public Format f3350a;
        public FlacReader.FlacOggSeeker b;
    }

    public static final class UnseekableOggSeeker implements OggSeeker {
        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final long a(ExtractorInput extractorInput) {
            return -1L;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final SeekMap b() {
            return new SeekMap.Unseekable(-9223372036854775807L);
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final void c(long j) {
        }
    }

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(ParsableByteArray parsableByteArray);

    public abstract boolean c(ParsableByteArray parsableByteArray, long j, SetupData setupData);

    public void d(boolean z) {
        if (z) {
            this.j = new SetupData();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
