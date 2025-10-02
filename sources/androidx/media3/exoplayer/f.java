package androidx.media3.exoplayer;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.MediaPeriodHolder;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements ListenerSet.Event, MediaPeriodHolder.Factory {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                int i2 = ExoPlayerImpl.k0;
                ((Player.Listener) obj).E((MediaMetadata) obj2);
                break;
            case 1:
                int i3 = ExoPlayerImpl.k0;
                ((Player.Listener) obj).X((TrackSelectionParameters) obj2);
                break;
            case 2:
                ((Player.Listener) obj).E(ExoPlayerImpl.this.P);
                break;
            case 3:
            default:
                ((Player.Listener) obj).a((VideoSize) obj2);
                break;
            case 4:
                ((Player.Listener) obj).t((CueGroup) obj2);
                break;
            case 5:
                ((Player.Listener) obj).u((Metadata) obj2);
                break;
            case 6:
                ((Player.Listener) obj).q((List) obj2);
                break;
        }
    }
}
