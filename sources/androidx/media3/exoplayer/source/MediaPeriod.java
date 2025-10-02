package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

@UnstableApi
/* loaded from: classes2.dex */
public interface MediaPeriod extends SequenceableLoader {

    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void f(MediaPeriod mediaPeriod);
    }

    long c(long j, SeekParameters seekParameters);

    long d(long j);

    long e();

    TrackGroupArray i();

    long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j);

    void r();

    void s(Callback callback, long j);

    void u(long j, boolean z);
}
