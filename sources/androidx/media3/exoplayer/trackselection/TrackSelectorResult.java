package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.RendererConfiguration;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class TrackSelectorResult {

    /* renamed from: a, reason: collision with root package name */
    public final int f3170a;
    public final RendererConfiguration[] b;
    public final ExoTrackSelection[] c;
    public final Tracks d;
    public final Object e;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Tracks tracks, Object obj) {
        Assertions.b(rendererConfigurationArr.length == exoTrackSelectionArr.length);
        this.b = rendererConfigurationArr;
        this.c = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.d = tracks;
        this.e = obj;
        this.f3170a = rendererConfigurationArr.length;
    }

    public final boolean a(TrackSelectorResult trackSelectorResult, int i) {
        return trackSelectorResult != null && Objects.equals(this.b[i], trackSelectorResult.b[i]) && Objects.equals(this.c[i], trackSelectorResult.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
