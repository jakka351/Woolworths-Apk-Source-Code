package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class TrackSelector {

    /* renamed from: a, reason: collision with root package name */
    public InvalidationListener f3169a;
    public BandwidthMeter b;

    public interface Factory {
    }

    public interface InvalidationListener {
        void a();
    }

    public TrackSelectionParameters b() {
        return TrackSelectionParameters.v;
    }

    public RendererCapabilities.Listener c() {
        return null;
    }

    public abstract void d(Object obj);

    public void e() {
        this.f3169a = null;
        this.b = null;
    }

    public abstract TrackSelectorResult f(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    public void g(AudioAttributes audioAttributes) {
    }

    public void h(TrackSelectionParameters trackSelectionParameters) {
    }
}
