package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.PlayerControlView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class PlayerControlViewLayoutManager {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final PlayerControlView f3457a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final g s = new g(this, 0);
    public final g t = new g(this, 3);
    public final g u = new g(this, 4);
    public final g v = new g(this, 5);
    public final g w = new g(this, 6);
    public final i x = new i(this, 0);
    public boolean C = true;
    public int z = 0;
    public final ArrayList y = new ArrayList();

    public PlayerControlViewLayoutManager(final PlayerControlView playerControlView) throws Resources.NotFoundException {
        this.f3457a = playerControlView;
        final int i = 0;
        final int i2 = 1;
        this.b = playerControlView.findViewById(com.woolworths.R.id.exo_controls_background);
        this.c = (ViewGroup) playerControlView.findViewById(com.woolworths.R.id.exo_center_controls);
        this.e = (ViewGroup) playerControlView.findViewById(com.woolworths.R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(com.woolworths.R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) playerControlView.findViewById(com.woolworths.R.id.exo_time);
        View viewFindViewById = playerControlView.findViewById(com.woolworths.R.id.exo_progress);
        this.j = viewFindViewById;
        this.f = (ViewGroup) playerControlView.findViewById(com.woolworths.R.id.exo_basic_controls);
        this.g = (ViewGroup) playerControlView.findViewById(com.woolworths.R.id.exo_extra_controls);
        this.h = (ViewGroup) playerControlView.findViewById(com.woolworths.R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(com.woolworths.R.id.exo_overflow_show);
        this.k = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(com.woolworths.R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: androidx.media3.ui.j
                public final /* synthetic */ PlayerControlViewLayoutManager e;

                {
                    this.e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            PlayerControlViewLayoutManager playerControlViewLayoutManager = this.e;
                            Callback.g(view);
                            try {
                                playerControlViewLayoutManager.e(view);
                                return;
                            } finally {
                            }
                        default:
                            PlayerControlViewLayoutManager playerControlViewLayoutManager2 = this.e;
                            Callback.g(view);
                            try {
                                playerControlViewLayoutManager2.e(view);
                                return;
                            } finally {
                            }
                    }
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: androidx.media3.ui.j
                public final /* synthetic */ PlayerControlViewLayoutManager e;

                {
                    this.e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            PlayerControlViewLayoutManager playerControlViewLayoutManager = this.e;
                            Callback.g(view);
                            try {
                                playerControlViewLayoutManager.e(view);
                                return;
                            } finally {
                            }
                        default:
                            PlayerControlViewLayoutManager playerControlViewLayoutManager2 = this.e;
                            Callback.g(view);
                            try {
                                playerControlViewLayoutManager2.e(view);
                                return;
                            } finally {
                            }
                    }
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new h(this, 0));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                View view = playerControlViewLayoutManager.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup2 = playerControlViewLayoutManager.c;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = playerControlViewLayoutManager.e;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                View view = playerControlViewLayoutManager.j;
                if (!(view instanceof DefaultTimeBar) || playerControlViewLayoutManager.A) {
                    return;
                }
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                ValueAnimator valueAnimator = defaultTimeBar.H;
                if (valueAnimator.isStarted()) {
                    valueAnimator.cancel();
                }
                valueAnimator.setFloatValues(defaultTimeBar.I, BitmapDescriptorFactory.HUE_RED);
                valueAnimator.setDuration(250L);
                valueAnimator.start();
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new h(this, 1));
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                View view = playerControlViewLayoutManager.b;
                if (view != null) {
                    view.setVisibility(0);
                }
                ViewGroup viewGroup2 = playerControlViewLayoutManager.c;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = playerControlViewLayoutManager.e;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(playerControlViewLayoutManager.A ? 0 : 4);
                }
                View view2 = playerControlViewLayoutManager.j;
                if (!(view2 instanceof DefaultTimeBar) || playerControlViewLayoutManager.A) {
                    return;
                }
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                ValueAnimator valueAnimator = defaultTimeBar.H;
                if (valueAnimator.isStarted()) {
                    valueAnimator.cancel();
                }
                defaultTimeBar.J = false;
                valueAnimator.setFloatValues(defaultTimeBar.I, 1.0f);
                valueAnimator.setDuration(250L);
                valueAnimator.start();
            }
        });
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(com.woolworths.R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(com.woolworths.R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(com.woolworths.R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                playerControlViewLayoutManager.j(1);
                if (playerControlViewLayoutManager.B) {
                    playerControlView.post(playerControlViewLayoutManager.s);
                    playerControlViewLayoutManager.B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.j(3);
            }
        });
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, BitmapDescriptorFactory.HUE_RED, dimension)).with(d(viewGroup, BitmapDescriptorFactory.HUE_RED, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                playerControlViewLayoutManager.j(2);
                if (playerControlViewLayoutManager.B) {
                    playerControlView.post(playerControlViewLayoutManager.s);
                    playerControlViewLayoutManager.B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.j(3);
            }
        });
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                playerControlViewLayoutManager.j(2);
                if (playerControlViewLayoutManager.B) {
                    playerControlView.post(playerControlViewLayoutManager.s);
                    playerControlViewLayoutManager.B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.j(3);
            }
        });
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, BitmapDescriptorFactory.HUE_RED, dimension2)).with(d(viewGroup, BitmapDescriptorFactory.HUE_RED, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.j(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.j(4);
            }
        });
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, BitmapDescriptorFactory.HUE_RED)).with(d(viewGroup, dimension, BitmapDescriptorFactory.HUE_RED));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.j(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.j(4);
            }
        });
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, BitmapDescriptorFactory.HUE_RED)).with(d(viewGroup, dimension2, BitmapDescriptorFactory.HUE_RED));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new h(this, 2));
        valueAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2 = PlayerControlViewLayoutManager.this.f;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                ViewGroup viewGroup2 = playerControlViewLayoutManager.h;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                    playerControlViewLayoutManager.h.setTranslationX(r0.getWidth());
                    ViewGroup viewGroup3 = playerControlViewLayoutManager.h;
                    viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new h(this, 3));
        valueAnimatorOfFloat4.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2 = PlayerControlViewLayoutManager.this.h;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ViewGroup viewGroup2 = PlayerControlViewLayoutManager.this.f;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
            }
        });
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean k(View view) {
        int id = view.getId();
        return id == com.woolworths.R.id.exo_bottom_bar || id == com.woolworths.R.id.exo_prev || id == com.woolworths.R.id.exo_next || id == com.woolworths.R.id.exo_rew || id == com.woolworths.R.id.exo_rew_with_amount || id == com.woolworths.R.id.exo_ffwd || id == com.woolworths.R.id.exo_ffwd_with_amount;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        return view != null && this.y.contains(view);
    }

    public final void e(View view) {
        h();
        if (view.getId() == com.woolworths.R.id.exo_overflow_show) {
            this.q.start();
        } else if (view.getId() == com.woolworths.R.id.exo_overflow_hide) {
            this.r.start();
        }
    }

    public final void f(Runnable runnable, long j) {
        if (j >= 0) {
            this.f3457a.postDelayed(runnable, j);
        }
    }

    public final void g() {
        g gVar = this.w;
        PlayerControlView playerControlView = this.f3457a;
        playerControlView.removeCallbacks(gVar);
        playerControlView.removeCallbacks(this.t);
        playerControlView.removeCallbacks(this.v);
        playerControlView.removeCallbacks(this.u);
    }

    public final void h() {
        if (this.z == 3) {
            return;
        }
        g();
        int showTimeoutMs = this.f3457a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                f(this.w, showTimeoutMs);
            } else if (this.z == 1) {
                f(this.u, 2000L);
            } else {
                f(this.v, showTimeoutMs);
            }
        }
    }

    public final void i(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.y;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && k(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void j(int i) {
        int i2 = this.z;
        this.z = i;
        PlayerControlView playerControlView = this.f3457a;
        if (i == 2) {
            playerControlView.setVisibility(8);
        } else if (i2 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i2 != i) {
            Iterator it = playerControlView.g.iterator();
            while (it.hasNext()) {
                ((PlayerControlView.VisibilityListener) it.next()).F(playerControlView.getVisibility());
            }
        }
    }

    public final void l() {
        if (!this.C) {
            j(0);
            h();
            return;
        }
        int i = this.z;
        if (i == 1) {
            this.o.start();
        } else if (i == 2) {
            this.p.start();
        } else if (i == 3) {
            this.B = true;
        } else if (i == 4) {
            return;
        }
        h();
    }
}
