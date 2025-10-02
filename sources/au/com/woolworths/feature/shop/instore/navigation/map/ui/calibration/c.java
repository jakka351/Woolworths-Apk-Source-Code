package au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements LifecycleEventObserver {
    public final /* synthetic */ int d;
    public final /* synthetic */ ExoPlayer e;

    public /* synthetic */ c(ExoPlayer exoPlayer, int i) {
        this.d = i;
        this.e = exoPlayer;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.d) {
            case 0:
                if (event == Lifecycle.Event.ON_PAUSE || event == Lifecycle.Event.ON_STOP) {
                    ExoPlayer exoPlayer = this.e;
                    if (exoPlayer.x()) {
                        exoPlayer.pause();
                        break;
                    }
                }
                break;
            default:
                if (event == Lifecycle.Event.ON_PAUSE || event == Lifecycle.Event.ON_STOP) {
                    this.e.pause();
                    break;
                }
                break;
        }
    }
}
