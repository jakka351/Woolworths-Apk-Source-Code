package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchView;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
class SearchViewAnimationHelper {

    /* renamed from: a, reason: collision with root package name */
    public final SearchView f14628a;
    public final View b;
    public final ClippableRoundedCornerLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final MaterialToolbar f;
    public final Toolbar g;
    public final TextView h;
    public final EditText i;
    public final ImageButton j;
    public final View k;
    public final TouchObserverFrameLayout l;
    public final MaterialMainContainerBackHelper m;
    public AnimatorSet n;
    public SearchBar o;

    public SearchViewAnimationHelper(SearchView searchView) {
        this.f14628a = searchView;
        this.b = searchView.d;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.e;
        this.c = clippableRoundedCornerLayout;
        this.d = searchView.h;
        this.e = searchView.i;
        this.f = searchView.j;
        this.g = searchView.k;
        this.h = searchView.l;
        this.i = searchView.m;
        this.j = searchView.n;
        this.k = searchView.o;
        this.l = searchView.p;
        this.m = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    public static void a(SearchViewAnimationHelper searchViewAnimationHelper, float f) {
        ActionMenuView actionMenuViewA;
        searchViewAnimationHelper.j.setAlpha(f);
        searchViewAnimationHelper.k.setAlpha(f);
        searchViewAnimationHelper.l.setAlpha(f);
        if (!searchViewAnimationHelper.f14628a.z || (actionMenuViewA = ToolbarUtils.a(searchViewAnimationHelper.f)) == null) {
            return;
        }
        actionMenuViewA.setAlpha(f);
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton imageButtonB = ToolbarUtils.b(this.f);
        if (imageButtonB == null) {
            return;
        }
        Drawable drawableO = DrawableCompat.o(imageButtonB.getDrawable());
        if (!this.f14628a.y) {
            if (drawableO instanceof DrawerArrowDrawable) {
                ((DrawerArrowDrawable) drawableO).setProgress(1.0f);
            }
            if (drawableO instanceof FadeThroughDrawable) {
                ((FadeThroughDrawable) drawableO).a(1.0f);
                return;
            }
            return;
        }
        final int i = 1;
        final int i2 = 0;
        if (drawableO instanceof DrawerArrowDrawable) {
            final DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawableO;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            ((DrawerArrowDrawable) drawerArrowDrawable).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        default:
                            ((FadeThroughDrawable) drawerArrowDrawable).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableO instanceof FadeThroughDrawable) {
            final FadeThroughDrawable fadeThroughDrawable = (FadeThroughDrawable) drawableO;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i) {
                        case 0:
                            ((DrawerArrowDrawable) fadeThroughDrawable).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        default:
                            ((FadeThroughDrawable) fadeThroughDrawable).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
    }

    public final AnimatorSet c(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f;
        ImageButton imageButtonB = ToolbarUtils.b(materialToolbar);
        if (imageButtonB != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f(imageButtonB), BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(0), imageButtonB));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(g(), BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.a(imageButtonB));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuViewA = ToolbarUtils.a(materialToolbar);
        if (actionMenuViewA != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(e(actionMenuViewA), BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat3.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(0), actionMenuViewA));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(g(), BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat4.addUpdateListener(MultiViewUpdateListener.a(actionMenuViewA));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.a(z, AnimationUtils.b));
        return animatorSet;
    }

    public final AnimatorSet d(final boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.n == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(z ? 300L : 250L);
            animatorSet2.setInterpolator(ReversableAnimatedValueInterpolator.a(z, AnimationUtils.b));
            animatorSet.playTogether(animatorSet2, c(z));
        }
        TimeInterpolator timeInterpolator = z ? AnimationUtils.f14504a : AnimationUtils.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.a(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(3), this.b));
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.m;
        Rect rect = materialMainContainerBackHelper.j;
        Rect rectA = materialMainContainerBackHelper.k;
        SearchView searchView = this.f14628a;
        if (rect == null) {
            rect = new Rect(searchView.getLeft(), searchView.getTop(), searchView.getRight(), searchView.getBottom());
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        if (rectA == null) {
            rectA = ViewUtils.a(clippableRoundedCornerLayout, this.o);
        }
        final Rect rect2 = new Rect(rectA);
        final float cornerSize = this.o.getCornerSize();
        final float fMax = Math.max(clippableRoundedCornerLayout.getCornerRadius(), materialMainContainerBackHelper.c());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect2), rectA, rect);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchViewAnimationHelper searchViewAnimationHelper = this.d;
                searchViewAnimationHelper.getClass();
                float fA = AnimationUtils.a(cornerSize, fMax, valueAnimator.getAnimatedFraction());
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = searchViewAnimationHelper.c;
                clippableRoundedCornerLayout2.getClass();
                Rect rect3 = rect2;
                clippableRoundedCornerLayout2.a(rect3.left, rect3.top, rect3.right, rect3.bottom, fA);
            }
        });
        valueAnimatorOfObject.setDuration(z ? 300L : 250L);
        FastOutSlowInInterpolator fastOutSlowInInterpolator = AnimationUtils.b;
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.a(z, fastOutSlowInInterpolator));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.setDuration(z ? 50L : 42L);
        valueAnimatorOfFloat2.setStartDelay(z ? 250L : 0L);
        LinearInterpolator linearInterpolator = AnimationUtils.f14504a;
        valueAnimatorOfFloat2.setInterpolator(ReversableAnimatedValueInterpolator.a(z, linearInterpolator));
        valueAnimatorOfFloat2.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(3), this.j));
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat3.setDuration(z ? 150L : 83L);
        valueAnimatorOfFloat3.setStartDelay(z ? 75L : 0L);
        valueAnimatorOfFloat3.setInterpolator(ReversableAnimatedValueInterpolator.a(z, linearInterpolator));
        View view = this.k;
        TouchObserverFrameLayout touchObserverFrameLayout = this.l;
        valueAnimatorOfFloat3.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(3), view, touchObserverFrameLayout));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat4.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat4.setInterpolator(ReversableAnimatedValueInterpolator.a(z, fastOutSlowInInterpolator));
        valueAnimatorOfFloat4.addUpdateListener(MultiViewUpdateListener.a(view));
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat5.setInterpolator(ReversableAnimatedValueInterpolator.a(z, fastOutSlowInInterpolator));
        valueAnimatorOfFloat5.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(2), touchObserverFrameLayout));
        animatorSet3.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        Animator animatorI = i(z, false, this.d);
        Toolbar toolbar = this.g;
        Animator animatorI2 = i(z, false, toolbar);
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat6.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat6.setInterpolator(ReversableAnimatedValueInterpolator.a(z, fastOutSlowInInterpolator));
        if (searchView.z) {
            valueAnimatorOfFloat6.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.a(toolbar), ToolbarUtils.a(this.f)));
        }
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfObject, valueAnimatorOfFloat2, animatorSet3, animatorI, animatorI2, valueAnimatorOfFloat6, i(z, true, this.i), i(z, true, this.h));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                float f = z ? 1.0f : 0.0f;
                SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
                SearchViewAnimationHelper.a(searchViewAnimationHelper, f);
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = searchViewAnimationHelper.c;
                clippableRoundedCornerLayout2.d = null;
                clippableRoundedCornerLayout2.e = BitmapDescriptorFactory.HUE_RED;
                clippableRoundedCornerLayout2.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.a(SearchViewAnimationHelper.this, z ? BitmapDescriptorFactory.HUE_RED : 1.0f);
            }
        });
        return animatorSet;
    }

    public final int e(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        return ViewUtils.h(this.o) ? this.o.getLeft() - marginEnd : (this.o.getRight() - this.f14628a.getWidth()) + marginEnd;
    }

    public final int f(View view) {
        int marginStart = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
        SearchBar searchBar = this.o;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int paddingStart = searchBar.getPaddingStart();
        return ViewUtils.h(this.o) ? ((this.o.getWidth() - this.o.getRight()) + marginStart) - paddingStart : (this.o.getLeft() - marginStart) + paddingStart;
    }

    public final int g() {
        FrameLayout frameLayout = this.e;
        return ((this.o.getBottom() + this.o.getTop()) / 2) - ((frameLayout.getBottom() + frameLayout.getTop()) / 2);
    }

    public final AnimatorSet h(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.a(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        b(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.a(z, AnimationUtils.b));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet i(boolean z, boolean z2, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z2 ? f(view) : e(view), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(0), view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(g(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.a(z, AnimationUtils.b));
        return animatorSet;
    }

    public final AnimatorSet j() {
        SearchBar searchBar = this.o;
        SearchView searchView = this.f14628a;
        if (searchBar != null) {
            if (searchView.i()) {
                searchView.h();
            }
            AnimatorSet animatorSetD = d(false);
            animatorSetD.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
                    searchViewAnimationHelper.c.setVisibility(8);
                    if (!searchViewAnimationHelper.f14628a.i()) {
                        searchViewAnimationHelper.f14628a.h();
                    }
                    searchViewAnimationHelper.f14628a.setTransitionState(SearchView.TransitionState.e);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    SearchViewAnimationHelper.this.f14628a.setTransitionState(SearchView.TransitionState.d);
                }
            });
            animatorSetD.start();
            return animatorSetD;
        }
        if (searchView.i()) {
            searchView.h();
        }
        AnimatorSet animatorSetH = h(false);
        animatorSetH.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
                searchViewAnimationHelper.c.setVisibility(8);
                if (!searchViewAnimationHelper.f14628a.i()) {
                    searchViewAnimationHelper.f14628a.h();
                }
                searchViewAnimationHelper.f14628a.setTransitionState(SearchView.TransitionState.e);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.f14628a.setTransitionState(SearchView.TransitionState.d);
            }
        });
        animatorSetH.start();
        return animatorSetH;
    }
}
