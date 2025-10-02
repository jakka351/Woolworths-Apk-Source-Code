package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

@UnstableApi
/* loaded from: classes2.dex */
public final class RandomTrackSelection extends BaseTrackSelection {

    public static final class Factory implements ExoTrackSelection.Factory {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int a() {
        return 0;
    }
}
