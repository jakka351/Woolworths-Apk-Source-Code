package androidx.media3.exoplayer;

import android.content.Context;
import android.util.SparseArray;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

@UnstableApi
/* loaded from: classes2.dex */
public final class MediaExtractorCompat {

    public final class ExtractorOutputImpl implements ExtractorOutput {
        @Override // androidx.media3.extractor.ExtractorOutput
        public final void h() {
            throw null;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final TrackOutput j(int i, int i2) {
            throw null;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final void q(SeekMap seekMap) {
            throw null;
        }
    }

    public final class MediaExtractorSampleQueue extends SampleQueue {
        @Override // androidx.media3.extractor.TrackOutput
        public final void d() {
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public final void g(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
            int i4 = i & (-536870913);
            int i5 = this.q + this.p;
            super.g(j, i4, i2, i3, cryptoData);
            if (this.q + this.p == i5 + 1) {
                throw null;
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public final Format k(Format format) {
            m().getClass();
            return format;
        }

        public final String toString() {
            return "trackId: 0, mainTrackIndex: 0, compatibilityTrackIndex: 0";
        }
    }

    public static final class MediaExtractorTrack {
        public final String toString() {
            return "MediaExtractorSampleQueue: " + ((Object) null) + ", isCompatibilityTrack: false, compatibilityTrackMimeType: " + ((String) null);
        }
    }

    public static final class SampleMetadataQueue {

        public static final class SampleMetadata {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    public MediaExtractorCompat(Context context) {
        new DefaultExtractorsFactory();
        new DefaultDataSource.Factory(context);
        new DefaultAllocator();
        new ArrayList();
        new SparseArray();
        new ArrayDeque();
        new ArrayDeque();
        new DecoderInputBuffer(0);
        new DecoderInputBuffer(2);
        new HashSet();
    }
}
