package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.ui.TimeBar;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public class LegacyPlayerControlView extends FrameLayout {
    public static final /* synthetic */ int j0 = 0;
    public final String A;
    public final String B;
    public final String C;
    public final Drawable D;
    public final Drawable E;
    public final float F;
    public final float G;
    public final String H;
    public final String I;
    public Player J;
    public ProgressUpdateListener K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public long b0;
    public long[] c0;
    public final ComponentListener d;
    public boolean[] d0;
    public final CopyOnWriteArrayList e;
    public final long[] e0;
    public final View f;
    public final boolean[] f0;
    public final View g;
    public long g0;
    public final View h;
    public long h0;
    public final View i;
    public long i0;
    public final View j;
    public final View k;
    public final ImageView l;
    public final ImageView m;
    public final View n;
    public final TextView o;
    public final TextView p;
    public final TimeBar q;
    public final StringBuilder r;
    public final Formatter s;
    public final Timeline.Period t;
    public final Timeline.Window u;
    public final b v;
    public final b w;
    public final Drawable x;
    public final Drawable y;
    public final Drawable z;

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        public ComponentListener() {
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void C(long j) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.P = true;
            TextView textView = legacyPlayerControlView.p;
            if (textView != null) {
                textView.setText(Util.x(legacyPlayerControlView.r, legacyPlayerControlView.s, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void F(long j) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            TextView textView = legacyPlayerControlView.p;
            if (textView != null) {
                textView.setText(Util.x(legacyPlayerControlView.r, legacyPlayerControlView.s, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void H(long j, boolean z) {
            Player player;
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            int iS = 0;
            legacyPlayerControlView.P = false;
            if (z || (player = legacyPlayerControlView.J) == null) {
                return;
            }
            Timeline timelineK = player.K();
            if (legacyPlayerControlView.O && !timelineK.p()) {
                int iO = timelineK.o();
                while (true) {
                    long jU = Util.U(timelineK.m(iS, legacyPlayerControlView.u, 0L).l);
                    if (j < jU) {
                        break;
                    }
                    if (iS == iO - 1) {
                        j = jU;
                        break;
                    } else {
                        j -= jU;
                        iS++;
                    }
                }
            } else {
                iS = player.S();
            }
            player.O(iS, j);
            legacyPlayerControlView.g();
        }

        @Override // androidx.media3.common.Player.Listener
        public final void L(Player player, Player.Events events) {
            boolean zB = events.b(4, 5);
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            if (zB) {
                int i = LegacyPlayerControlView.j0;
                legacyPlayerControlView.f();
            }
            if (events.b(4, 5, 7)) {
                int i2 = LegacyPlayerControlView.j0;
                legacyPlayerControlView.g();
            }
            if (events.a(8)) {
                int i3 = LegacyPlayerControlView.j0;
                legacyPlayerControlView.h();
            }
            if (events.a(9)) {
                int i4 = LegacyPlayerControlView.j0;
                legacyPlayerControlView.i();
            }
            if (events.b(8, 9, 11, 0, 13)) {
                int i5 = LegacyPlayerControlView.j0;
                legacyPlayerControlView.e();
            }
            if (events.b(11, 0)) {
                int i6 = LegacyPlayerControlView.j0;
                legacyPlayerControlView.j();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            Callback.g(view);
            try {
                Player player = legacyPlayerControlView.J;
                if (player == null) {
                    Callback.h();
                    return;
                }
                if (legacyPlayerControlView.g == view) {
                    player.M();
                } else if (legacyPlayerControlView.f == view) {
                    player.D();
                } else if (legacyPlayerControlView.j == view) {
                    if (player.s() != 4) {
                        player.A();
                    }
                } else if (legacyPlayerControlView.k == view) {
                    player.W();
                } else if (legacyPlayerControlView.h == view) {
                    Util.B(player);
                } else if (legacyPlayerControlView.i == view) {
                    Util.A(player);
                } else if (legacyPlayerControlView.l == view) {
                    player.T(RepeatModeUtil.a(player.r(), legacyPlayerControlView.S));
                } else if (legacyPlayerControlView.m == view) {
                    player.m(!player.V());
                }
                Callback.h();
            } catch (Throwable th) {
                Callback.h();
                throw th;
            }
        }
    }

    public interface ProgressUpdateListener {
        void a();
    }

    public interface VisibilityListener {
        void a();
    }

    static {
        MediaLibraryInfo.a("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    public final void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                VisibilityListener visibilityListener = (VisibilityListener) it.next();
                getVisibility();
                visibilityListener.a();
            }
            removeCallbacks(this.v);
            removeCallbacks(this.w);
            this.b0 = -9223372036854775807L;
        }
    }

    public final void b() {
        b bVar = this.w;
        removeCallbacks(bVar);
        if (this.Q <= 0) {
            this.b0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.Q;
        this.b0 = jUptimeMillis + j;
        if (this.L) {
            postDelayed(bVar, j);
        }
    }

    public final boolean c() {
        return getVisibility() == 0;
    }

    public final void d(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.F : this.G);
        view.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.J;
        if (player == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.s() == 4) {
                return true;
            }
            player.A();
            return true;
        }
        if (keyCode == 89) {
            player.W();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (Util.Q(player, this.N)) {
                Util.B(player);
                return true;
            }
            Util.A(player);
            return true;
        }
        if (keyCode == 87) {
            player.M();
            return true;
        }
        if (keyCode == 88) {
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

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.w);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        boolean zJ;
        boolean zJ2;
        boolean zJ3;
        boolean zJ4;
        boolean zJ5;
        if (c() && this.L) {
            Player player = this.J;
            if (player != null) {
                zJ = player.j(5);
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
            d(this.V, zJ3, this.f);
            d(this.T, zJ4, this.k);
            d(this.U, zJ5, this.j);
            d(this.W, zJ2, this.g);
            TimeBar timeBar = this.q;
            if (timeBar != null) {
                timeBar.setEnabled(zJ);
            }
        }
    }

    public final void f() {
        boolean z;
        boolean z2;
        if (c() && this.L) {
            boolean zQ = Util.Q(this.J, this.N);
            View view = this.h;
            if (view != null) {
                z = !zQ && view.isFocused();
                z2 = !zQ && view.isAccessibilityFocused();
                view.setVisibility(zQ ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.i;
            if (view2 != null) {
                z |= zQ && view2.isFocused();
                z2 |= zQ && view2.isAccessibilityFocused();
                view2.setVisibility(zQ ? 8 : 0);
            }
            if (z) {
                boolean zQ2 = Util.Q(this.J, this.N);
                if (zQ2 && view != null) {
                    view.requestFocus();
                } else if (!zQ2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                boolean zQ3 = Util.Q(this.J, this.N);
                if (zQ3 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (zQ3 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void g() {
        long jR;
        long jZ;
        if (c() && this.L) {
            Player player = this.J;
            if (player != null) {
                jR = player.R() + this.g0;
                jZ = player.z() + this.g0;
            } else {
                jR = 0;
                jZ = 0;
            }
            boolean z = jR != this.h0;
            boolean z2 = jZ != this.i0;
            this.h0 = jR;
            this.i0 = jZ;
            TextView textView = this.p;
            if (textView != null && !this.P && z) {
                textView.setText(Util.x(this.r, this.s, jR));
            }
            TimeBar timeBar = this.q;
            if (timeBar != null) {
                timeBar.setPosition(jR);
                timeBar.setBufferedPosition(jZ);
            }
            ProgressUpdateListener progressUpdateListener = this.K;
            if (progressUpdateListener != null && (z || z2)) {
                progressUpdateListener.a();
            }
            b bVar = this.v;
            removeCallbacks(bVar);
            int iS = player == null ? 1 : player.s();
            if (player != null && player.x()) {
                long jMin = Math.min(timeBar != null ? timeBar.getPreferredUpdateDelay() : 1000L, 1000 - (jR % 1000));
                float f = player.d().f2871a;
                postDelayed(bVar, Util.j(f > BitmapDescriptorFactory.HUE_RED ? (long) (jMin / f) : 1000L, this.R, 1000L));
            } else {
                if (iS == 4 || iS == 1) {
                    return;
                }
                postDelayed(bVar, 1000L);
            }
        }
    }

    @Nullable
    public Player getPlayer() {
        return this.J;
    }

    public int getRepeatToggleModes() {
        return this.S;
    }

    public boolean getShowShuffleButton() {
        return this.a0;
    }

    public int getShowTimeoutMs() {
        return this.Q;
    }

    public boolean getShowVrButton() {
        View view = this.n;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        ImageView imageView;
        if (c() && this.L && (imageView = this.l) != null) {
            if (this.S == 0) {
                d(false, false, imageView);
                return;
            }
            Player player = this.J;
            String str = this.A;
            Drawable drawable = this.x;
            if (player == null) {
                d(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            d(true, true, imageView);
            int iR = player.r();
            if (iR == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iR == 1) {
                imageView.setImageDrawable(this.y);
                imageView.setContentDescription(this.B);
            } else if (iR == 2) {
                imageView.setImageDrawable(this.z);
                imageView.setContentDescription(this.C);
            }
            imageView.setVisibility(0);
        }
    }

    public final void i() {
        ImageView imageView;
        if (c() && this.L && (imageView = this.m) != null) {
            Player player = this.J;
            if (!this.a0) {
                d(false, false, imageView);
                return;
            }
            String str = this.I;
            Drawable drawable = this.E;
            if (player == null) {
                d(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            d(true, true, imageView);
            if (player.V()) {
                drawable = this.D;
            }
            imageView.setImageDrawable(drawable);
            if (player.V()) {
                str = this.H;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[EDGE_INSN: B:17:0x003a->B:18:0x003b BREAK  A[LOOP:0: B:11:0x0028->B:15:0x0035]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.LegacyPlayerControlView.j():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        long j = this.b0;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.w, jUptimeMillis);
            }
        } else if (c()) {
            b();
        }
        f();
        e();
        h();
        i();
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L = false;
        removeCallbacks(this.v);
        removeCallbacks(this.w);
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.f(Looper.myLooper() == Looper.getMainLooper());
        Assertions.b(player == null || player.L() == Looper.getMainLooper());
        Player player2 = this.J;
        if (player2 == player) {
            return;
        }
        ComponentListener componentListener = this.d;
        if (player2 != null) {
            player2.G(componentListener);
        }
        this.J = player;
        if (player != null) {
            player.H(componentListener);
        }
        f();
        e();
        h();
        i();
        j();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.K = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i) {
        this.S = i;
        Player player = this.J;
        if (player != null) {
            int iR = player.r();
            if (i == 0 && iR != 0) {
                this.J.T(0);
            } else if (i == 1 && iR == 2) {
                this.J.T(1);
            } else if (i == 2 && iR == 1) {
                this.J.T(2);
            }
        }
        h();
    }

    public void setShowFastForwardButton(boolean z) {
        this.U = z;
        e();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.M = z;
        j();
    }

    public void setShowNextButton(boolean z) {
        this.W = z;
        e();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.N = z;
        f();
    }

    public void setShowPreviousButton(boolean z) {
        this.V = z;
        e();
    }

    public void setShowRewindButton(boolean z) {
        this.T = z;
        e();
    }

    public void setShowShuffleButton(boolean z) {
        this.a0 = z;
        i();
    }

    public void setShowTimeoutMs(int i) {
        this.Q = i;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.n;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.R = Util.i(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.n;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            d(getShowVrButton(), onClickListener != null, view);
        }
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.media3.ui.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.media3.ui.b] */
    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        Context context2;
        super(context, attributeSet, i);
        this.N = true;
        this.Q = 5000;
        this.S = 0;
        this.R = 200;
        this.b0 = -9223372036854775807L;
        this.T = true;
        this.U = true;
        this.V = true;
        this.W = true;
        this.a0 = false;
        int resourceId = com.woolworths.R.layout.exo_legacy_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.c, i, 0);
            try {
                this.Q = typedArrayObtainStyledAttributes.getInt(19, this.Q);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, com.woolworths.R.layout.exo_legacy_player_control_view);
                this.S = typedArrayObtainStyledAttributes.getInt(8, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(17, this.T);
                this.U = typedArrayObtainStyledAttributes.getBoolean(14, this.U);
                this.V = typedArrayObtainStyledAttributes.getBoolean(16, this.V);
                this.W = typedArrayObtainStyledAttributes.getBoolean(15, this.W);
                this.a0 = typedArrayObtainStyledAttributes.getBoolean(18, this.a0);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(20, this.R));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.e = new CopyOnWriteArrayList();
        this.t = new Timeline.Period();
        this.u = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.r = sb;
        this.s = new Formatter(sb, Locale.getDefault());
        this.c0 = new long[0];
        this.d0 = new boolean[0];
        this.e0 = new long[0];
        this.f0 = new boolean[0];
        ComponentListener componentListener = new ComponentListener();
        this.d = componentListener;
        final int i2 = 0;
        this.v = new Runnable(this) { // from class: androidx.media3.ui.b
            public final /* synthetic */ LegacyPlayerControlView e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                LegacyPlayerControlView legacyPlayerControlView = this.e;
                switch (i3) {
                    case 0:
                        int i4 = LegacyPlayerControlView.j0;
                        legacyPlayerControlView.g();
                        break;
                    default:
                        legacyPlayerControlView.a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.w = new Runnable(this) { // from class: androidx.media3.ui.b
            public final /* synthetic */ LegacyPlayerControlView e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                LegacyPlayerControlView legacyPlayerControlView = this.e;
                switch (i32) {
                    case 0:
                        int i4 = LegacyPlayerControlView.j0;
                        legacyPlayerControlView.g();
                        break;
                    default:
                        legacyPlayerControlView.a();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        TimeBar timeBar = (TimeBar) findViewById(com.woolworths.R.id.exo_progress);
        View viewFindViewById = findViewById(com.woolworths.R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.q = timeBar;
            context2 = context;
        } else if (viewFindViewById != null) {
            context2 = context;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet, 0);
            defaultTimeBar.setId(com.woolworths.R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.q = defaultTimeBar;
        } else {
            context2 = context;
            this.q = null;
        }
        this.o = (TextView) findViewById(com.woolworths.R.id.exo_duration);
        this.p = (TextView) findViewById(com.woolworths.R.id.exo_position);
        TimeBar timeBar2 = this.q;
        if (timeBar2 != null) {
            timeBar2.b(componentListener);
        }
        View viewFindViewById2 = findViewById(com.woolworths.R.id.exo_play);
        this.h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        View viewFindViewById3 = findViewById(com.woolworths.R.id.exo_pause);
        this.i = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        View viewFindViewById4 = findViewById(com.woolworths.R.id.exo_prev);
        this.f = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(componentListener);
        }
        View viewFindViewById5 = findViewById(com.woolworths.R.id.exo_next);
        this.g = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(componentListener);
        }
        View viewFindViewById6 = findViewById(com.woolworths.R.id.exo_rew);
        this.k = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(componentListener);
        }
        View viewFindViewById7 = findViewById(com.woolworths.R.id.exo_ffwd);
        this.j = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(componentListener);
        }
        ImageView imageView = (ImageView) findViewById(com.woolworths.R.id.exo_repeat_toggle);
        this.l = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(com.woolworths.R.id.exo_shuffle);
        this.m = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener);
        }
        View viewFindViewById8 = findViewById(com.woolworths.R.id.exo_vr);
        this.n = viewFindViewById8;
        setShowVrButton(false);
        d(false, false, viewFindViewById8);
        Resources resources = context2.getResources();
        this.F = resources.getInteger(com.woolworths.R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.G = resources.getInteger(com.woolworths.R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.x = resources.getDrawable(com.woolworths.R.drawable.exo_legacy_controls_repeat_off, context2.getTheme());
        this.y = resources.getDrawable(com.woolworths.R.drawable.exo_legacy_controls_repeat_one, context2.getTheme());
        this.z = resources.getDrawable(com.woolworths.R.drawable.exo_legacy_controls_repeat_all, context2.getTheme());
        this.D = resources.getDrawable(com.woolworths.R.drawable.exo_legacy_controls_shuffle_on, context2.getTheme());
        this.E = resources.getDrawable(com.woolworths.R.drawable.exo_legacy_controls_shuffle_off, context2.getTheme());
        this.A = resources.getString(com.woolworths.R.string.exo_controls_repeat_off_description);
        this.B = resources.getString(com.woolworths.R.string.exo_controls_repeat_one_description);
        this.C = resources.getString(com.woolworths.R.string.exo_controls_repeat_all_description);
        this.H = resources.getString(com.woolworths.R.string.exo_controls_shuffle_on_description);
        this.I = resources.getString(com.woolworths.R.string.exo_controls_shuffle_off_description);
        this.h0 = -9223372036854775807L;
        this.i0 = -9223372036854775807L;
    }
}
