package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.TimeBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public class PlayerControlView extends FrameLayout {
    public static final float[] E0;
    public final ImageView A;
    public final long[] A0;
    public final ImageView B;
    public final boolean[] B0;
    public final View C;
    public long C0;
    public final View D;
    public boolean D0;
    public final View E;
    public final TextView F;
    public final TextView G;
    public final TimeBar H;
    public final StringBuilder I;
    public final Formatter J;
    public final Timeline.Period K;
    public final Timeline.Window L;
    public final a M;
    public final Drawable N;
    public final Drawable O;
    public final Drawable P;
    public final Drawable Q;
    public final Drawable R;
    public final String S;
    public final String T;
    public final String U;
    public final Drawable V;
    public final Drawable W;
    public final float a0;
    public final float b0;
    public final String c0;
    public final PlayerControlViewLayoutManager d;
    public final String d0;
    public final Resources e;
    public final Drawable e0;
    public final ComponentListener f;
    public final Drawable f0;
    public final CopyOnWriteArrayList g;
    public final String g0;
    public final RecyclerView h;
    public final String h0;
    public final SettingsAdapter i;
    public final Drawable i0;
    public final PlaybackSpeedAdapter j;
    public final Drawable j0;
    public final TextTrackSelectionAdapter k;
    public final String k0;
    public final AudioTrackSelectionAdapter l;
    public final String l0;
    public final DefaultTrackNameProvider m;
    public Player m0;
    public final PopupWindow n;
    public ProgressUpdateListener n0;
    public final int o;
    public OnFullScreenModeChangedListener o0;
    public final ImageView p;
    public boolean p0;
    public final ImageView q;
    public boolean q0;
    public final ImageView r;
    public boolean r0;
    public final View s;
    public boolean s0;
    public final View t;
    public boolean t0;
    public final TextView u;
    public boolean u0;
    public final TextView v;
    public int v0;
    public final ImageView w;
    public int w0;
    public final ImageView x;
    public int x0;
    public final ImageView y;
    public long[] y0;
    public final ImageView z;
    public boolean[] z0;

    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        public AudioTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public final void I(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.f3455a.setText(com.woolworths.R.string.exo_track_selection_auto);
            Player player = PlayerControlView.this.m0;
            player.getClass();
            subSettingViewHolder.b.setVisibility(K(player.k()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new d(this, 0));
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public final void J(String str) {
            PlayerControlView.this.i.h[1] = str;
        }

        public final boolean K(TrackSelectionParameters trackSelectionParameters) {
            for (int i = 0; i < this.g.size(); i++) {
                if (trackSelectionParameters.t.containsKey(((TrackInformation) this.g.get(i)).f3456a.b)) {
                    return true;
                }
            }
            return false;
        }

        public final void L() throws Resources.NotFoundException {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.m0;
            if (player == null || !player.j(29)) {
                return;
            }
            TrackSelectionParameters trackSelectionParametersK = playerControlView.m0.k();
            Player player2 = playerControlView.m0;
            int i = Util.f2928a;
            player2.y(trackSelectionParametersK.a().b(1).i(1).a());
            SettingsAdapter settingsAdapter = playerControlView.i;
            settingsAdapter.h[1] = playerControlView.getResources().getString(com.woolworths.R.string.exo_track_selection_auto);
            playerControlView.n.dismiss();
        }
    }

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        public ComponentListener() {
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void C(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.u0 = true;
            TextView textView = playerControlView.G;
            if (textView != null) {
                textView.setText(Util.x(playerControlView.I, playerControlView.J, j));
            }
            playerControlView.d.g();
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void F(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.G;
            if (textView != null) {
                textView.setText(Util.x(playerControlView.I, playerControlView.J, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void H(long j, boolean z) {
            Player player;
            PlayerControlView playerControlView = PlayerControlView.this;
            int i = 0;
            playerControlView.u0 = false;
            if (!z && (player = playerControlView.m0) != null) {
                if (playerControlView.t0) {
                    if (player.j(17) && player.j(10)) {
                        Timeline timelineK = player.K();
                        int iO = timelineK.o();
                        while (true) {
                            long jU = Util.U(timelineK.m(i, playerControlView.L, 0L).l);
                            if (j < jU) {
                                break;
                            }
                            if (i == iO - 1) {
                                j = jU;
                                break;
                            } else {
                                j -= jU;
                                i++;
                            }
                        }
                        player.O(i, j);
                    }
                } else if (player.j(5)) {
                    player.seekTo(j);
                }
                playerControlView.n();
            }
            playerControlView.d.h();
        }

        @Override // androidx.media3.common.Player.Listener
        public final void L(Player player, Player.Events events) {
            boolean zB = events.b(4, 5, 13);
            PlayerControlView playerControlView = PlayerControlView.this;
            if (zB) {
                float[] fArr = PlayerControlView.E0;
                playerControlView.l();
            }
            if (events.b(4, 5, 7, 13)) {
                float[] fArr2 = PlayerControlView.E0;
                playerControlView.n();
            }
            if (events.b(8, 13)) {
                float[] fArr3 = PlayerControlView.E0;
                playerControlView.o();
            }
            if (events.b(9, 13)) {
                float[] fArr4 = PlayerControlView.E0;
                playerControlView.q();
            }
            if (events.b(8, 9, 11, 0, 16, 17, 13)) {
                float[] fArr5 = PlayerControlView.E0;
                playerControlView.k();
            }
            if (events.b(11, 0, 13)) {
                float[] fArr6 = PlayerControlView.E0;
                playerControlView.r();
            }
            if (events.b(12, 13)) {
                float[] fArr7 = PlayerControlView.E0;
                playerControlView.m();
            }
            if (events.b(2, 13)) {
                float[] fArr8 = PlayerControlView.E0;
                playerControlView.s();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            ImageView imageView = playerControlView.z;
            View view2 = playerControlView.E;
            View view3 = playerControlView.D;
            View view4 = playerControlView.C;
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView.d;
            Callback.g(view);
            try {
                Player player = playerControlView.m0;
                if (player == null) {
                    Callback.h();
                    return;
                }
                playerControlViewLayoutManager.h();
                if (playerControlView.q == view) {
                    if (player.j(9)) {
                        player.M();
                    }
                } else if (playerControlView.p == view) {
                    if (player.j(7)) {
                        player.D();
                    }
                } else if (playerControlView.s == view) {
                    if (player.s() != 4 && player.j(12)) {
                        player.A();
                    }
                } else if (playerControlView.t == view) {
                    if (player.j(11)) {
                        player.W();
                    }
                } else if (playerControlView.r == view) {
                    if (Util.Q(player, playerControlView.s0)) {
                        Util.B(player);
                    } else {
                        Util.A(player);
                    }
                } else if (playerControlView.w == view) {
                    if (player.j(15)) {
                        player.T(RepeatModeUtil.a(player.r(), playerControlView.x0));
                    }
                } else if (playerControlView.x == view) {
                    if (player.j(14)) {
                        player.m(!player.V());
                    }
                } else if (view4 == view) {
                    playerControlViewLayoutManager.g();
                    playerControlView.d(playerControlView.i, view4);
                } else if (view3 == view) {
                    playerControlViewLayoutManager.g();
                    playerControlView.d(playerControlView.j, view3);
                } else if (view2 == view) {
                    playerControlViewLayoutManager.g();
                    playerControlView.d(playerControlView.l, view2);
                } else if (imageView == view) {
                    playerControlViewLayoutManager.g();
                    playerControlView.d(playerControlView.k, imageView);
                }
                Callback.h();
            } catch (Throwable th) {
                Callback.h();
                throw th;
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.D0) {
                playerControlView.d.h();
            }
        }
    }

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void C(boolean z);
    }

    public final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        public final String[] g;
        public final float[] h;
        public int i;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.g = strArr;
            this.h = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int i() {
            return this.g.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void v(RecyclerView.ViewHolder viewHolder, final int i) {
            SubSettingViewHolder subSettingViewHolder = (SubSettingViewHolder) viewHolder;
            View view = subSettingViewHolder.b;
            String[] strArr = this.g;
            if (i < strArr.length) {
                subSettingViewHolder.f3455a.setText(strArr[i]);
            }
            if (i == this.i) {
                subSettingViewHolder.itemView.setSelected(true);
                view.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                view.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter = this.d;
                    Callback.g(view2);
                    try {
                        PlayerControlView playerControlView = PlayerControlView.this;
                        int i2 = playbackSpeedAdapter.i;
                        int i3 = i;
                        if (i3 != i2) {
                            playerControlView.setPlaybackSpeed(playbackSpeedAdapter.h[i3]);
                        }
                        playerControlView.n.dismiss();
                    } finally {
                        Callback.h();
                    }
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(com.woolworths.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface ProgressUpdateListener {
        void a();
    }

    public final class SettingViewHolder extends RecyclerView.ViewHolder {
        public static final /* synthetic */ int e = 0;

        /* renamed from: a, reason: collision with root package name */
        public final TextView f3454a;
        public final TextView b;
        public final ImageView c;

        public SettingViewHolder(View view) {
            super(view);
            if (Util.f2928a < 26) {
                view.setFocusable(true);
            }
            this.f3454a = (TextView) view.findViewById(com.woolworths.R.id.exo_main_text);
            this.b = (TextView) view.findViewById(com.woolworths.R.id.exo_sub_text);
            this.c = (ImageView) view.findViewById(com.woolworths.R.id.exo_icon);
            view.setOnClickListener(new d(this, 1));
        }
    }

    public class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {
        public final String[] g;
        public final String[] h;
        public final Drawable[] i;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.g = strArr;
            this.h = new String[strArr.length];
            this.i = drawableArr;
        }

        public final boolean G(int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.m0;
            if (player == null) {
                return false;
            }
            return i != 0 ? i != 1 || (player.j(30) && playerControlView.m0.j(29)) : player.j(13);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int i() {
            return this.g.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long j(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void v(RecyclerView.ViewHolder viewHolder, int i) {
            SettingViewHolder settingViewHolder = (SettingViewHolder) viewHolder;
            if (G(i)) {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            TextView textView = settingViewHolder.f3454a;
            ImageView imageView = settingViewHolder.c;
            TextView textView2 = settingViewHolder.b;
            textView.setText(this.g[i]);
            String str = this.h[i];
            if (str == null) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str);
            }
            Drawable drawable = this.i[i];
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            return playerControlView.new SettingViewHolder(LayoutInflater.from(playerControlView.getContext()).inflate(com.woolworths.R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public static class SubSettingViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f3455a;
        public final View b;

        public SubSettingViewHolder(View view) {
            super(view);
            if (Util.f2928a < 26) {
                view.setFocusable(true);
            }
            this.f3455a = (TextView) view.findViewById(com.woolworths.R.id.exo_text);
            this.b = view.findViewById(com.woolworths.R.id.exo_check);
        }
    }

    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        public TextTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public final void v(SubSettingViewHolder subSettingViewHolder, int i) {
            super.v(subSettingViewHolder, i);
            if (i > 0) {
                TrackInformation trackInformation = (TrackInformation) this.g.get(i - 1);
                subSettingViewHolder.b.setVisibility(trackInformation.f3456a.e[trackInformation.b] ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public final void I(SubSettingViewHolder subSettingViewHolder) {
            boolean z;
            subSettingViewHolder.f3455a.setText(com.woolworths.R.string.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.g.size()) {
                    z = true;
                    break;
                }
                TrackInformation trackInformation = (TrackInformation) this.g.get(i);
                if (trackInformation.f3456a.e[trackInformation.b]) {
                    z = false;
                    break;
                }
                i++;
            }
            subSettingViewHolder.b.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new d(this, 2));
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public final void J(String str) {
        }

        public final void K(List list) {
            PlayerControlView playerControlView = PlayerControlView.this;
            ImageView imageView = playerControlView.z;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                TrackInformation trackInformation = (TrackInformation) list.get(i);
                if (trackInformation.f3456a.e[trackInformation.b]) {
                    z = true;
                    break;
                }
                i++;
            }
            if (imageView != null) {
                imageView.setImageDrawable(z ? playerControlView.e0 : playerControlView.f0);
                imageView.setContentDescription(z ? playerControlView.g0 : playerControlView.h0);
            }
            this.g = list;
        }

        public final /* synthetic */ void L() {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.m0;
            if (player == null || !player.j(29)) {
                return;
            }
            playerControlView.m0.y(playerControlView.m0.k().a().b(3).d().f().h().a());
            playerControlView.n.dismiss();
        }
    }

    public static final class TrackInformation {

        /* renamed from: a, reason: collision with root package name */
        public final Tracks.Group f3456a;
        public final int b;
        public final String c;

        /* JADX WARN: Multi-variable type inference failed */
        public TrackInformation(Tracks tracks, int i, int i2, String str) {
            this.f3456a = (Tracks.Group) tracks.f2884a.get(i);
            this.b = i2;
            this.c = str;
        }
    }

    public abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        public List g = new ArrayList();

        public TrackSelectionAdapter() {
        }

        public final void G(Player player, TrackGroup trackGroup, TrackInformation trackInformation) {
            if (player.j(29)) {
                player.y(player.k().a().e(new TrackSelectionOverride(trackGroup, ImmutableList.w(Integer.valueOf(trackInformation.b)))).i(trackInformation.f3456a.b.c).a());
                J(trackInformation.c);
                PlayerControlView.this.n.dismiss();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(androidx.media3.ui.PlayerControlView.SubSettingViewHolder r7, int r8) {
            /*
                r6 = this;
                androidx.media3.ui.PlayerControlView r0 = androidx.media3.ui.PlayerControlView.this
                androidx.media3.common.Player r0 = r0.m0
                if (r0 != 0) goto L7
                return
            L7:
                if (r8 != 0) goto Ld
                r6.I(r7)
                return
            Ld:
                java.util.List r1 = r6.g
                r2 = 1
                int r8 = r8 - r2
                java.lang.Object r8 = r1.get(r8)
                androidx.media3.ui.PlayerControlView$TrackInformation r8 = (androidx.media3.ui.PlayerControlView.TrackInformation) r8
                androidx.media3.common.Tracks$Group r1 = r8.f3456a
                androidx.media3.common.TrackGroup r1 = r1.b
                androidx.media3.common.TrackSelectionParameters r3 = r0.k()
                com.google.common.collect.ImmutableMap r3 = r3.t
                java.lang.Object r3 = r3.get(r1)
                r4 = 0
                if (r3 == 0) goto L33
                androidx.media3.common.Tracks$Group r3 = r8.f3456a
                int r5 = r8.b
                boolean[] r3 = r3.e
                boolean r3 = r3[r5]
                if (r3 == 0) goto L33
                goto L34
            L33:
                r2 = r4
            L34:
                android.widget.TextView r3 = r7.f3455a
                java.lang.String r5 = r8.c
                r3.setText(r5)
                android.view.View r3 = r7.b
                if (r2 == 0) goto L40
                goto L41
            L40:
                r4 = 4
            L41:
                r3.setVisibility(r4)
                android.view.View r7 = r7.itemView
                androidx.media3.ui.f r2 = new androidx.media3.ui.f
                r2.<init>()
                r7.setOnClickListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.TrackSelectionAdapter.v(androidx.media3.ui.PlayerControlView$SubSettingViewHolder, int):void");
        }

        public abstract void I(SubSettingViewHolder subSettingViewHolder);

        public abstract void J(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int i() {
            if (this.g.isEmpty()) {
                return 0;
            }
            return this.g.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(com.woolworths.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @Deprecated
    public interface VisibilityListener {
        void F(int i);
    }

    static {
        MediaLibraryInfo.a("media3.ui");
        E0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public static boolean b(Player player, Timeline.Window window) {
        Timeline timelineK;
        int iO;
        if (player.j(17) && (iO = (timelineK = player.K()).o()) > 1 && iO <= 100) {
            for (int i = 0; i < iO; i++) {
                if (timelineK.m(i, window, 0L).l != -9223372036854775807L) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        Player player = this.m0;
        if (player == null || !player.j(13)) {
            return;
        }
        Player player2 = this.m0;
        player2.c(new PlaybackParameters(f, player2.d().b));
    }

    public final boolean c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.m0;
        if (player == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.s() == 4 || !player.j(12)) {
                return true;
            }
            player.A();
            return true;
        }
        if (keyCode == 89 && player.j(11)) {
            player.W();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (Util.Q(player, this.s0)) {
                Util.B(player);
                return true;
            }
            Util.A(player);
            return true;
        }
        if (keyCode == 87) {
            if (!player.j(9)) {
                return true;
            }
            player.M();
            return true;
        }
        if (keyCode == 88) {
            if (!player.j(7)) {
                return true;
            }
            player.D();
            return true;
        }
        if (keyCode == 126) {
            Util.B(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        Util.A(player);
        return true;
    }

    public final void d(RecyclerView.Adapter adapter, View view) {
        this.h.setAdapter(adapter);
        p();
        this.D0 = false;
        PopupWindow popupWindow = this.n;
        popupWindow.dismiss();
        this.D0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.o;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList e(Tracks tracks, int i) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList immutableList = tracks.f2884a;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            Tracks.Group group = (Tracks.Group) immutableList.get(i2);
            if (group.b.c == i) {
                for (int i3 = 0; i3 < group.f2885a; i3++) {
                    if (group.b(i3)) {
                        Format formatA = group.a(i3);
                        if ((formatA.e & 2) == 0) {
                            builder.h(new TrackInformation(tracks, i2, i3, this.m.a(formatA)));
                        }
                    }
                }
            }
        }
        return builder.j();
    }

    public final void f() {
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.d;
        int i = playerControlViewLayoutManager.z;
        if (i == 3 || i == 2) {
            return;
        }
        playerControlViewLayoutManager.g();
        if (!playerControlViewLayoutManager.C) {
            playerControlViewLayoutManager.j(2);
        } else if (playerControlViewLayoutManager.z == 1) {
            playerControlViewLayoutManager.m.start();
        } else {
            playerControlViewLayoutManager.n.start();
        }
    }

    public final boolean g() {
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.d;
        return playerControlViewLayoutManager.z == 0 && playerControlViewLayoutManager.f3457a.h();
    }

    @Nullable
    public Player getPlayer() {
        return this.m0;
    }

    public int getRepeatToggleModes() {
        return this.x0;
    }

    public boolean getShowShuffleButton() {
        return this.d.b(this.x);
    }

    public boolean getShowSubtitleButton() {
        return this.d.b(this.z);
    }

    public int getShowTimeoutMs() {
        return this.v0;
    }

    public boolean getShowVrButton() {
        return this.d.b(this.y);
    }

    public final boolean h() {
        return getVisibility() == 0;
    }

    public final void i() {
        l();
        k();
        o();
        q();
        s();
        m();
        r();
    }

    public final void j(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.a0 : this.b0);
    }

    public final void k() {
        boolean zJ;
        boolean zJ2;
        boolean zJ3;
        boolean zJ4;
        boolean zJ5;
        if (h() && this.q0) {
            Player player = this.m0;
            if (player != null) {
                zJ = (this.r0 && b(player, this.L)) ? player.j(10) : player.j(5);
                zJ3 = player.j(7);
                zJ4 = player.j(11);
                zJ5 = player.j(12);
                zJ2 = player.j(9);
            } else {
                zJ = false;
                zJ2 = false;
                zJ3 = false;
                zJ4 = false;
                zJ5 = false;
            }
            Resources resources = this.e;
            View view = this.t;
            if (zJ4) {
                Player player2 = this.m0;
                int iY = (int) ((player2 != null ? player2.Y() : 5000L) / 1000);
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(String.valueOf(iY));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(com.woolworths.R.plurals.exo_controls_rewind_by_amount_description, iY, Integer.valueOf(iY)));
                }
            }
            View view2 = this.s;
            if (zJ5) {
                Player player3 = this.m0;
                int iW = (int) ((player3 != null ? player3.w() : 15000L) / 1000);
                TextView textView2 = this.u;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iW));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(com.woolworths.R.plurals.exo_controls_fastforward_by_amount_description, iW, Integer.valueOf(iW)));
                }
            }
            j(this.p, zJ3);
            j(view, zJ4);
            j(view2, zJ5);
            j(this.q, zJ2);
            TimeBar timeBar = this.H;
            if (timeBar != null) {
                timeBar.setEnabled(zJ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r4 = this;
            boolean r0 = r4.h()
            if (r0 == 0) goto L55
            boolean r0 = r4.q0
            if (r0 != 0) goto Lb
            goto L55
        Lb:
            android.widget.ImageView r0 = r4.r
            if (r0 == 0) goto L55
            androidx.media3.common.Player r1 = r4.m0
            boolean r2 = r4.s0
            boolean r1 = androidx.media3.common.util.Util.Q(r1, r2)
            if (r1 == 0) goto L1c
            android.graphics.drawable.Drawable r2 = r4.N
            goto L1e
        L1c:
            android.graphics.drawable.Drawable r2 = r4.O
        L1e:
            if (r1 == 0) goto L24
            r1 = 2132017864(0x7f1402c8, float:1.9674018E38)
            goto L27
        L24:
            r1 = 2132017863(0x7f1402c7, float:1.9674016E38)
        L27:
            r0.setImageDrawable(r2)
            android.content.res.Resources r2 = r4.e
            java.lang.String r1 = r2.getString(r1)
            r0.setContentDescription(r1)
            androidx.media3.common.Player r1 = r4.m0
            if (r1 == 0) goto L51
            r2 = 1
            boolean r3 = r1.j(r2)
            if (r3 == 0) goto L51
            r3 = 17
            boolean r3 = r1.j(r3)
            if (r3 == 0) goto L52
            androidx.media3.common.Timeline r1 = r1.K()
            boolean r1 = r1.p()
            if (r1 != 0) goto L51
            goto L52
        L51:
            r2 = 0
        L52:
            r4.j(r0, r2)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.l():void");
    }

    public final void m() {
        PlaybackSpeedAdapter playbackSpeedAdapter;
        Player player = this.m0;
        if (player == null) {
            return;
        }
        float f = player.d().f2871a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            playbackSpeedAdapter = this.j;
            float[] fArr = playbackSpeedAdapter.h;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        playbackSpeedAdapter.i = i2;
        String str = playbackSpeedAdapter.g[i2];
        SettingsAdapter settingsAdapter = this.i;
        settingsAdapter.h[0] = str;
        j(this.C, settingsAdapter.G(1) || settingsAdapter.G(0));
    }

    public final void n() {
        long jR;
        long jZ;
        if (h() && this.q0) {
            Player player = this.m0;
            if (player == null || !player.j(16)) {
                jR = 0;
                jZ = 0;
            } else {
                jR = player.R() + this.C0;
                jZ = player.z() + this.C0;
            }
            TextView textView = this.G;
            if (textView != null && !this.u0) {
                textView.setText(Util.x(this.I, this.J, jR));
            }
            TimeBar timeBar = this.H;
            if (timeBar != null) {
                timeBar.setPosition(jR);
                timeBar.setBufferedPosition(jZ);
            }
            ProgressUpdateListener progressUpdateListener = this.n0;
            if (progressUpdateListener != null) {
                progressUpdateListener.a();
            }
            a aVar = this.M;
            removeCallbacks(aVar);
            int iS = player == null ? 1 : player.s();
            if (player != null && player.x()) {
                long jMin = Math.min(timeBar != null ? timeBar.getPreferredUpdateDelay() : 1000L, 1000 - (jR % 1000));
                float f = player.d().f2871a;
                postDelayed(aVar, Util.j(f > BitmapDescriptorFactory.HUE_RED ? (long) (jMin / f) : 1000L, this.w0, 1000L));
            } else {
                if (iS == 4 || iS == 1) {
                    return;
                }
                postDelayed(aVar, 1000L);
            }
        }
    }

    public final void o() {
        ImageView imageView;
        if (h() && this.q0 && (imageView = this.w) != null) {
            if (this.x0 == 0) {
                j(imageView, false);
                return;
            }
            Player player = this.m0;
            String str = this.S;
            Drawable drawable = this.P;
            if (player == null || !player.j(15)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            int iR = player.r();
            if (iR == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iR == 1) {
                imageView.setImageDrawable(this.Q);
                imageView.setContentDescription(this.T);
            } else {
                if (iR != 2) {
                    return;
                }
                imageView.setImageDrawable(this.R);
                imageView.setContentDescription(this.U);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.d;
        playerControlViewLayoutManager.f3457a.addOnLayoutChangeListener(playerControlViewLayoutManager.x);
        this.q0 = true;
        if (g()) {
            playerControlViewLayoutManager.h();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.d;
        playerControlViewLayoutManager.f3457a.removeOnLayoutChangeListener(playerControlViewLayoutManager.x);
        this.q0 = false;
        removeCallbacks(this.M);
        playerControlViewLayoutManager.g();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.d.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p() {
        RecyclerView recyclerView = this.h;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.o;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.n;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void q() {
        ImageView imageView;
        if (h() && this.q0 && (imageView = this.x) != null) {
            Player player = this.m0;
            if (!this.d.b(imageView)) {
                j(imageView, false);
                return;
            }
            String str = this.d0;
            Drawable drawable = this.W;
            if (player == null || !player.j(14)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            if (player.V()) {
                drawable = this.V;
            }
            imageView.setImageDrawable(drawable);
            if (player.V()) {
                str = this.c0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.r():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s() {
        TextTrackSelectionAdapter textTrackSelectionAdapter = this.k;
        textTrackSelectionAdapter.getClass();
        List list = Collections.EMPTY_LIST;
        textTrackSelectionAdapter.g = list;
        AudioTrackSelectionAdapter audioTrackSelectionAdapter = this.l;
        audioTrackSelectionAdapter.getClass();
        audioTrackSelectionAdapter.g = list;
        Player player = this.m0;
        ImageView imageView = this.z;
        if (player != null && player.j(30) && this.m0.j(29)) {
            Tracks tracksH = this.m0.h();
            ImmutableList immutableListE = e(tracksH, 1);
            audioTrackSelectionAdapter.g = immutableListE;
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player2 = playerControlView.m0;
            SettingsAdapter settingsAdapter = playerControlView.i;
            player2.getClass();
            TrackSelectionParameters trackSelectionParametersK = player2.k();
            if (!immutableListE.isEmpty()) {
                if (audioTrackSelectionAdapter.K(trackSelectionParametersK)) {
                    int i = 0;
                    while (true) {
                        if (i >= immutableListE.size()) {
                            break;
                        }
                        TrackInformation trackInformation = (TrackInformation) immutableListE.get(i);
                        if (trackInformation.f3456a.e[trackInformation.b]) {
                            settingsAdapter.h[1] = trackInformation.c;
                            break;
                        }
                        i++;
                    }
                } else {
                    settingsAdapter.h[1] = playerControlView.getResources().getString(com.woolworths.R.string.exo_track_selection_auto);
                }
            } else {
                settingsAdapter.h[1] = playerControlView.getResources().getString(com.woolworths.R.string.exo_track_selection_none);
            }
            if (this.d.b(imageView)) {
                textTrackSelectionAdapter.K(e(tracksH, 3));
            } else {
                textTrackSelectionAdapter.K(ImmutableList.t());
            }
        }
        j(imageView, textTrackSelectionAdapter.i() > 0);
        SettingsAdapter settingsAdapter2 = this.i;
        j(this.C, settingsAdapter2.G(1) || settingsAdapter2.G(0));
    }

    public void setAnimationEnabled(boolean z) {
        this.d.C = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.o0 = onFullScreenModeChangedListener;
        boolean z = onFullScreenModeChangedListener != null;
        ImageView imageView = this.A;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = onFullScreenModeChangedListener != null;
        ImageView imageView2 = this.B;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.f(Looper.myLooper() == Looper.getMainLooper());
        Assertions.b(player == null || player.L() == Looper.getMainLooper());
        Player player2 = this.m0;
        if (player2 == player) {
            return;
        }
        ComponentListener componentListener = this.f;
        if (player2 != null) {
            player2.G(componentListener);
        }
        this.m0 = player;
        if (player != null) {
            player.H(componentListener);
        }
        i();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.n0 = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i) {
        this.x0 = i;
        Player player = this.m0;
        if (player != null && player.j(15)) {
            int iR = this.m0.r();
            if (i == 0 && iR != 0) {
                this.m0.T(0);
            } else if (i == 1 && iR == 2) {
                this.m0.T(1);
            } else if (i == 2 && iR == 1) {
                this.m0.T(2);
            }
        }
        this.d.i(this.w, i != 0);
        o();
    }

    public void setShowFastForwardButton(boolean z) {
        this.d.i(this.s, z);
        k();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.r0 = z;
        r();
    }

    public void setShowNextButton(boolean z) {
        this.d.i(this.q, z);
        k();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.s0 = z;
        l();
    }

    public void setShowPreviousButton(boolean z) {
        this.d.i(this.p, z);
        k();
    }

    public void setShowRewindButton(boolean z) {
        this.d.i(this.t, z);
        k();
    }

    public void setShowShuffleButton(boolean z) {
        this.d.i(this.x, z);
        q();
    }

    public void setShowSubtitleButton(boolean z) {
        this.d.i(this.z, z);
    }

    public void setShowTimeoutMs(int i) {
        this.v0 = i;
        if (g()) {
            this.d.h();
        }
    }

    public void setShowVrButton(boolean z) {
        this.d.i(this.y, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.w0 = Util.i(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            j(imageView, onClickListener != null);
        }
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i13;
        int i14;
        boolean z8;
        int i15;
        boolean z9;
        int i16;
        ImageView imageView;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ComponentListener componentListener;
        int i17;
        int i18;
        int i19;
        int i20;
        TextView textView;
        boolean z15;
        int i21;
        boolean z16;
        super(context, attributeSet, i);
        this.s0 = true;
        this.v0 = 5000;
        this.x0 = 0;
        this.w0 = 200;
        int resourceId = com.woolworths.R.layout.exo_player_control_view;
        int resourceId2 = com.woolworths.R.drawable.exo_styled_controls_play;
        int resourceId3 = com.woolworths.R.drawable.exo_styled_controls_pause;
        int resourceId4 = com.woolworths.R.drawable.exo_styled_controls_next;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.d, i, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(6, com.woolworths.R.layout.exo_player_control_view);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, com.woolworths.R.drawable.exo_styled_controls_play);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(11, com.woolworths.R.drawable.exo_styled_controls_pause);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(10, com.woolworths.R.drawable.exo_styled_controls_next);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(7, com.woolworths.R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(15, com.woolworths.R.drawable.exo_styled_controls_previous);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, com.woolworths.R.drawable.exo_styled_controls_simple_rewind);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, com.woolworths.R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, com.woolworths.R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, com.woolworths.R.drawable.exo_styled_controls_repeat_off);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, com.woolworths.R.drawable.exo_styled_controls_repeat_one);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, com.woolworths.R.drawable.exo_styled_controls_repeat_all);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, com.woolworths.R.drawable.exo_styled_controls_shuffle_on);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, com.woolworths.R.drawable.exo_styled_controls_shuffle_off);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, com.woolworths.R.drawable.exo_styled_controls_subtitle_on);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, com.woolworths.R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(41, com.woolworths.R.drawable.exo_styled_controls_vr);
                this.v0 = typedArrayObtainStyledAttributes.getInt(32, this.v0);
                this.x0 = typedArrayObtainStyledAttributes.getInt(19, this.x0);
                z3 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                z4 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                z5 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                z6 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                z7 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.w0));
                z8 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i8 = resourceId10;
                z = z17;
                i3 = resourceId5;
                i4 = resourceId6;
                i5 = resourceId7;
                i6 = resourceId8;
                i7 = resourceId9;
                i2 = resourceId11;
                i9 = resourceId13;
                i10 = resourceId14;
                i11 = resourceId15;
                i12 = resourceId16;
                i14 = resourceId17;
                i13 = resourceId12;
                z2 = z18;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = com.woolworths.R.drawable.exo_styled_controls_repeat_one;
            i3 = com.woolworths.R.drawable.exo_styled_controls_simple_fastforward;
            i4 = com.woolworths.R.drawable.exo_styled_controls_previous;
            i5 = com.woolworths.R.drawable.exo_styled_controls_simple_rewind;
            i6 = com.woolworths.R.drawable.exo_styled_controls_fullscreen_exit;
            i7 = com.woolworths.R.drawable.exo_styled_controls_fullscreen_enter;
            i8 = com.woolworths.R.drawable.exo_styled_controls_repeat_off;
            i9 = com.woolworths.R.drawable.exo_styled_controls_shuffle_on;
            i10 = com.woolworths.R.drawable.exo_styled_controls_shuffle_off;
            i11 = com.woolworths.R.drawable.exo_styled_controls_subtitle_on;
            i12 = com.woolworths.R.drawable.exo_styled_controls_subtitle_off;
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = false;
            i13 = com.woolworths.R.drawable.exo_styled_controls_repeat_all;
            i14 = com.woolworths.R.drawable.exo_styled_controls_vr;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        ComponentListener componentListener2 = new ComponentListener();
        this.f = componentListener2;
        this.g = new CopyOnWriteArrayList();
        this.K = new Timeline.Period();
        this.L = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.I = sb;
        int i22 = resourceId2;
        int i23 = resourceId3;
        this.J = new Formatter(sb, Locale.getDefault());
        this.y0 = new long[0];
        this.z0 = new boolean[0];
        this.A0 = new long[0];
        this.B0 = new boolean[0];
        this.M = new a(1, this);
        this.F = (TextView) findViewById(com.woolworths.R.id.exo_duration);
        this.G = (TextView) findViewById(com.woolworths.R.id.exo_position);
        ImageView imageView2 = (ImageView) findViewById(com.woolworths.R.id.exo_subtitle);
        this.z = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener2);
        }
        ImageView imageView3 = (ImageView) findViewById(com.woolworths.R.id.exo_fullscreen);
        this.A = imageView3;
        final int i24 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: androidx.media3.ui.c
            public final /* synthetic */ PlayerControlView e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i25 = i24;
                PlayerControlView playerControlView = this.e;
                switch (i25) {
                    case 0:
                        float[] fArr = PlayerControlView.E0;
                        Callback.g(view);
                        try {
                            boolean z19 = playerControlView.p0;
                            boolean z20 = !z19;
                            String str = playerControlView.l0;
                            Drawable drawable = playerControlView.j0;
                            String str2 = playerControlView.k0;
                            Drawable drawable2 = playerControlView.i0;
                            if (z19 != z20) {
                                playerControlView.p0 = z20;
                                ImageView imageView4 = playerControlView.A;
                                if (imageView4 != null) {
                                    if (z19) {
                                        imageView4.setImageDrawable(drawable);
                                        imageView4.setContentDescription(str);
                                    } else {
                                        imageView4.setImageDrawable(drawable2);
                                        imageView4.setContentDescription(str2);
                                    }
                                }
                                ImageView imageView5 = playerControlView.B;
                                if (imageView5 != null) {
                                    if (z19) {
                                        imageView5.setImageDrawable(drawable);
                                        imageView5.setContentDescription(str);
                                    } else {
                                        imageView5.setImageDrawable(drawable2);
                                        imageView5.setContentDescription(str2);
                                    }
                                }
                                PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener = playerControlView.o0;
                                if (onFullScreenModeChangedListener != null) {
                                    onFullScreenModeChangedListener.C(z20);
                                }
                            }
                            return;
                        } finally {
                        }
                    default:
                        float[] fArr2 = PlayerControlView.E0;
                        Callback.g(view);
                        try {
                            boolean z21 = playerControlView.p0;
                            boolean z22 = !z21;
                            String str3 = playerControlView.l0;
                            Drawable drawable3 = playerControlView.j0;
                            String str4 = playerControlView.k0;
                            Drawable drawable4 = playerControlView.i0;
                            if (z21 != z22) {
                                playerControlView.p0 = z22;
                                ImageView imageView6 = playerControlView.A;
                                if (imageView6 != null) {
                                    if (z21) {
                                        imageView6.setImageDrawable(drawable3);
                                        imageView6.setContentDescription(str3);
                                    } else {
                                        imageView6.setImageDrawable(drawable4);
                                        imageView6.setContentDescription(str4);
                                    }
                                }
                                ImageView imageView7 = playerControlView.B;
                                if (imageView7 != null) {
                                    if (z21) {
                                        imageView7.setImageDrawable(drawable3);
                                        imageView7.setContentDescription(str3);
                                    } else {
                                        imageView7.setImageDrawable(drawable4);
                                        imageView7.setContentDescription(str4);
                                    }
                                }
                                PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener2 = playerControlView.o0;
                                if (onFullScreenModeChangedListener2 != null) {
                                    onFullScreenModeChangedListener2.C(z22);
                                }
                            }
                            return;
                        } finally {
                        }
                }
            }
        };
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(onClickListener);
        }
        ImageView imageView4 = (ImageView) findViewById(com.woolworths.R.id.exo_minimal_fullscreen);
        this.B = imageView4;
        final int i25 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: androidx.media3.ui.c
            public final /* synthetic */ PlayerControlView e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i252 = i25;
                PlayerControlView playerControlView = this.e;
                switch (i252) {
                    case 0:
                        float[] fArr = PlayerControlView.E0;
                        Callback.g(view);
                        try {
                            boolean z19 = playerControlView.p0;
                            boolean z20 = !z19;
                            String str = playerControlView.l0;
                            Drawable drawable = playerControlView.j0;
                            String str2 = playerControlView.k0;
                            Drawable drawable2 = playerControlView.i0;
                            if (z19 != z20) {
                                playerControlView.p0 = z20;
                                ImageView imageView42 = playerControlView.A;
                                if (imageView42 != null) {
                                    if (z19) {
                                        imageView42.setImageDrawable(drawable);
                                        imageView42.setContentDescription(str);
                                    } else {
                                        imageView42.setImageDrawable(drawable2);
                                        imageView42.setContentDescription(str2);
                                    }
                                }
                                ImageView imageView5 = playerControlView.B;
                                if (imageView5 != null) {
                                    if (z19) {
                                        imageView5.setImageDrawable(drawable);
                                        imageView5.setContentDescription(str);
                                    } else {
                                        imageView5.setImageDrawable(drawable2);
                                        imageView5.setContentDescription(str2);
                                    }
                                }
                                PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener = playerControlView.o0;
                                if (onFullScreenModeChangedListener != null) {
                                    onFullScreenModeChangedListener.C(z20);
                                }
                            }
                            return;
                        } finally {
                        }
                    default:
                        float[] fArr2 = PlayerControlView.E0;
                        Callback.g(view);
                        try {
                            boolean z21 = playerControlView.p0;
                            boolean z22 = !z21;
                            String str3 = playerControlView.l0;
                            Drawable drawable3 = playerControlView.j0;
                            String str4 = playerControlView.k0;
                            Drawable drawable4 = playerControlView.i0;
                            if (z21 != z22) {
                                playerControlView.p0 = z22;
                                ImageView imageView6 = playerControlView.A;
                                if (imageView6 != null) {
                                    if (z21) {
                                        imageView6.setImageDrawable(drawable3);
                                        imageView6.setContentDescription(str3);
                                    } else {
                                        imageView6.setImageDrawable(drawable4);
                                        imageView6.setContentDescription(str4);
                                    }
                                }
                                ImageView imageView7 = playerControlView.B;
                                if (imageView7 != null) {
                                    if (z21) {
                                        imageView7.setImageDrawable(drawable3);
                                        imageView7.setContentDescription(str3);
                                    } else {
                                        imageView7.setImageDrawable(drawable4);
                                        imageView7.setContentDescription(str4);
                                    }
                                }
                                PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener2 = playerControlView.o0;
                                if (onFullScreenModeChangedListener2 != null) {
                                    onFullScreenModeChangedListener2.C(z22);
                                }
                            }
                            return;
                        } finally {
                        }
                }
            }
        };
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(onClickListener2);
        }
        View viewFindViewById = findViewById(com.woolworths.R.id.exo_settings);
        this.C = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(componentListener2);
        }
        View viewFindViewById2 = findViewById(com.woolworths.R.id.exo_playback_speed);
        this.D = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener2);
        }
        View viewFindViewById3 = findViewById(com.woolworths.R.id.exo_audio_track);
        this.E = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener2);
        }
        TimeBar timeBar = (TimeBar) findViewById(com.woolworths.R.id.exo_progress);
        View viewFindViewById4 = findViewById(com.woolworths.R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.H = timeBar;
            i15 = i13;
            z9 = z2;
            i16 = i23;
            imageView = imageView2;
            z10 = z3;
            z11 = z4;
            z12 = z5;
            z13 = z6;
            z14 = z7;
            componentListener = componentListener2;
            i17 = resourceId4;
            i18 = i9;
            i19 = i10;
            i20 = i22;
            textView = null;
            z15 = z;
            i21 = i3;
        } else if (viewFindViewById4 != null) {
            i19 = i10;
            textView = null;
            i16 = i23;
            z9 = z2;
            imageView = imageView2;
            z10 = z3;
            i17 = resourceId4;
            z11 = z4;
            z12 = z5;
            z13 = z6;
            z14 = z7;
            i18 = i9;
            i20 = i22;
            z15 = z;
            i21 = i3;
            i15 = i13;
            componentListener = componentListener2;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, com.woolworths.R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(com.woolworths.R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.H = defaultTimeBar;
        } else {
            i15 = i13;
            z9 = z2;
            i16 = i23;
            imageView = imageView2;
            z10 = z3;
            z11 = z4;
            z12 = z5;
            z13 = z6;
            z14 = z7;
            componentListener = componentListener2;
            i17 = resourceId4;
            i18 = i9;
            i19 = i10;
            i20 = i22;
            textView = null;
            z15 = z;
            i21 = i3;
            this.H = null;
        }
        TimeBar timeBar2 = this.H;
        if (timeBar2 != null) {
            timeBar2.b(componentListener);
        }
        Resources resources = context.getResources();
        this.e = resources;
        ImageView imageView5 = (ImageView) findViewById(com.woolworths.R.id.exo_play_pause);
        this.r = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(componentListener);
        }
        ImageView imageView6 = (ImageView) findViewById(com.woolworths.R.id.exo_prev);
        this.p = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i4, context.getTheme()));
            imageView6.setOnClickListener(componentListener);
        }
        ImageView imageView7 = (ImageView) findViewById(com.woolworths.R.id.exo_next);
        this.q = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i17, context.getTheme()));
            imageView7.setOnClickListener(componentListener);
        }
        Typeface typefaceE = ResourcesCompat.e(com.woolworths.R.font.roboto_medium_numbers, context);
        ImageView imageView8 = (ImageView) findViewById(com.woolworths.R.id.exo_rew);
        TextView textView2 = (TextView) findViewById(com.woolworths.R.id.exo_rew_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i5, context.getTheme()));
            this.t = imageView8;
            this.v = textView;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceE);
            this.v = textView2;
            this.t = textView2;
        } else {
            this.v = textView;
            this.t = textView;
        }
        View view = this.t;
        if (view != null) {
            view.setOnClickListener(componentListener);
        }
        ImageView imageView9 = (ImageView) findViewById(com.woolworths.R.id.exo_ffwd);
        TextView textView3 = (TextView) findViewById(com.woolworths.R.id.exo_ffwd_with_amount);
        if (imageView9 != null) {
            imageView9.setImageDrawable(resources.getDrawable(i21, context.getTheme()));
            this.s = imageView9;
            this.u = textView;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceE);
            this.u = textView3;
            this.s = textView3;
        } else {
            this.u = textView;
            this.s = textView;
        }
        View view2 = this.s;
        if (view2 != null) {
            view2.setOnClickListener(componentListener);
        }
        ImageView imageView10 = (ImageView) findViewById(com.woolworths.R.id.exo_repeat_toggle);
        this.w = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(componentListener);
        }
        ImageView imageView11 = (ImageView) findViewById(com.woolworths.R.id.exo_shuffle);
        this.x = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(componentListener);
        }
        this.a0 = resources.getInteger(com.woolworths.R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.b0 = resources.getInteger(com.woolworths.R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView12 = (ImageView) findViewById(com.woolworths.R.id.exo_vr);
        this.y = imageView12;
        if (imageView12 != null) {
            imageView12.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
            j(imageView12, false);
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager = new PlayerControlViewLayoutManager(this);
        this.d = playerControlViewLayoutManager;
        playerControlViewLayoutManager.C = z8;
        SettingsAdapter settingsAdapter = new SettingsAdapter(new String[]{resources.getString(com.woolworths.R.string.exo_controls_playback_speed), resources.getString(com.woolworths.R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(com.woolworths.R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(com.woolworths.R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.i = settingsAdapter;
        this.o = resources.getDimensionPixelSize(com.woolworths.R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(com.woolworths.R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.h = recyclerView;
        recyclerView.setAdapter(settingsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.n = popupWindow;
        if (Util.f2928a < 23) {
            z16 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z16 = false;
        }
        popupWindow.setOnDismissListener(componentListener);
        this.D0 = true;
        this.m = new DefaultTrackNameProvider(getResources());
        this.e0 = resources.getDrawable(i11, context.getTheme());
        this.f0 = resources.getDrawable(i12, context.getTheme());
        this.g0 = resources.getString(com.woolworths.R.string.exo_controls_cc_enabled_description);
        this.h0 = resources.getString(com.woolworths.R.string.exo_controls_cc_disabled_description);
        this.k = new TextTrackSelectionAdapter();
        this.l = new AudioTrackSelectionAdapter();
        this.j = new PlaybackSpeedAdapter(resources.getStringArray(com.woolworths.R.array.exo_controls_playback_speeds), E0);
        this.N = resources.getDrawable(i20, context.getTheme());
        this.O = resources.getDrawable(i16, context.getTheme());
        this.i0 = resources.getDrawable(i6, context.getTheme());
        this.j0 = resources.getDrawable(i7, context.getTheme());
        this.P = resources.getDrawable(i8, context.getTheme());
        this.Q = resources.getDrawable(i2, context.getTheme());
        this.R = resources.getDrawable(i15, context.getTheme());
        this.V = resources.getDrawable(i18, context.getTheme());
        this.W = resources.getDrawable(i19, context.getTheme());
        this.k0 = resources.getString(com.woolworths.R.string.exo_controls_fullscreen_exit_description);
        this.l0 = resources.getString(com.woolworths.R.string.exo_controls_fullscreen_enter_description);
        this.S = resources.getString(com.woolworths.R.string.exo_controls_repeat_off_description);
        this.T = resources.getString(com.woolworths.R.string.exo_controls_repeat_one_description);
        this.U = resources.getString(com.woolworths.R.string.exo_controls_repeat_all_description);
        this.c0 = resources.getString(com.woolworths.R.string.exo_controls_shuffle_on_description);
        this.d0 = resources.getString(com.woolworths.R.string.exo_controls_shuffle_off_description);
        playerControlViewLayoutManager.i((ViewGroup) findViewById(com.woolworths.R.id.exo_bottom_bar), true);
        playerControlViewLayoutManager.i(this.s, z11);
        playerControlViewLayoutManager.i(this.t, z10);
        playerControlViewLayoutManager.i(imageView6, z12);
        playerControlViewLayoutManager.i(imageView7, z13);
        playerControlViewLayoutManager.i(imageView11, z15);
        playerControlViewLayoutManager.i(imageView, z9);
        playerControlViewLayoutManager.i(imageView12, z14);
        playerControlViewLayoutManager.i(imageView10, this.x0 != 0 ? true : z16);
        addOnLayoutChangeListener(new i(this, 1));
    }
}
