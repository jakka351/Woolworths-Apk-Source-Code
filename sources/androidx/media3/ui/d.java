package androidx.media3.ui;

import android.view.View;
import androidx.media3.ui.PlayerControlView;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                PlayerControlView.AudioTrackSelectionAdapter audioTrackSelectionAdapter = (PlayerControlView.AudioTrackSelectionAdapter) obj;
                Callback.g(view);
                try {
                    audioTrackSelectionAdapter.L();
                    return;
                } finally {
                }
            case 1:
                PlayerControlView.SettingViewHolder settingViewHolder = (PlayerControlView.SettingViewHolder) obj;
                int i2 = PlayerControlView.SettingViewHolder.e;
                Callback.g(view);
                try {
                    PlayerControlView playerControlView = PlayerControlView.this;
                    int bindingAdapterPosition = settingViewHolder.getBindingAdapterPosition();
                    View view2 = playerControlView.C;
                    if (bindingAdapterPosition == 0) {
                        PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter = playerControlView.j;
                        view2.getClass();
                        playerControlView.d(playbackSpeedAdapter, view2);
                    } else if (bindingAdapterPosition == 1) {
                        PlayerControlView.AudioTrackSelectionAdapter audioTrackSelectionAdapter2 = playerControlView.l;
                        view2.getClass();
                        playerControlView.d(audioTrackSelectionAdapter2, view2);
                    } else {
                        playerControlView.n.dismiss();
                    }
                    return;
                } finally {
                }
            default:
                PlayerControlView.TextTrackSelectionAdapter textTrackSelectionAdapter = (PlayerControlView.TextTrackSelectionAdapter) obj;
                Callback.g(view);
                try {
                    textTrackSelectionAdapter.L();
                    return;
                } finally {
                }
        }
    }
}
