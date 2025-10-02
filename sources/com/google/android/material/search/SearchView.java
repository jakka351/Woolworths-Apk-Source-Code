package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.media3.exoplayer.analytics.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchView;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, MaterialBackHandler {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;
    public TransitionState E;
    public HashMap F;
    public final View d;
    public final ClippableRoundedCornerLayout e;
    public final View f;
    public final View g;
    public final FrameLayout h;
    public final FrameLayout i;
    public final MaterialToolbar j;
    public final Toolbar k;
    public final TextView l;
    public final EditText m;
    public final ImageButton n;
    public final View o;
    public final TouchObserverFrameLayout p;
    public final boolean q;
    public final SearchViewAnimationHelper r;
    public final MaterialBackOrchestrator s;
    public final boolean t;
    public final ElevationOverlayProvider u;
    public final LinkedHashSet v;
    public SearchBar w;
    public int x;
    public boolean y;
    public boolean z;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.w != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior() {
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public String f;
        public int g;

        /* renamed from: com.google.android.material.search.SearchView$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readString();
            this.g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
        }
    }

    public interface TransitionListener {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {
        public static final TransitionState d;
        public static final TransitionState e;
        public static final TransitionState f;
        public static final TransitionState g;
        public static final /* synthetic */ TransitionState[] h;

        static {
            TransitionState transitionState = new TransitionState("HIDING", 0);
            d = transitionState;
            TransitionState transitionState2 = new TransitionState("HIDDEN", 1);
            e = transitionState2;
            TransitionState transitionState3 = new TransitionState("SHOWING", 2);
            f = transitionState3;
            TransitionState transitionState4 = new TransitionState("SHOWN", 3);
            g = transitionState4;
            h = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) h.clone();
        }
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void g(SearchView searchView, WindowInsetsCompat windowInsetsCompat) {
        int iK = windowInsetsCompat.k();
        searchView.setUpStatusBarSpacer(iK);
        if (searchView.D) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(iK > 0);
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activityA = ContextUtils.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.w;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        View view;
        ElevationOverlayProvider elevationOverlayProvider = this.u;
        if (elevationOverlayProvider == null || (view = this.f) == null) {
            return;
        }
        view.setBackgroundColor(elevationOverlayProvider.a(f, this.B));
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            FrameLayout frameLayout = this.h;
            frameLayout.addView(layoutInflaterFrom.inflate(i, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(@Px int i) {
        View view = this.g;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.q) {
            this.p.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void b(BackEventCompat backEventCompat) {
        if (j() || this.w == null) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.r;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.m;
        SearchBar searchBar = searchViewAnimationHelper.o;
        materialMainContainerBackHelper.f = backEventCompat;
        float f = backEventCompat.b;
        View view = materialMainContainerBackHelper.b;
        materialMainContainerBackHelper.j = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar != null) {
            materialMainContainerBackHelper.k = ViewUtils.a(view, searchBar);
        }
        materialMainContainerBackHelper.i = f;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void c(BackEventCompat backEventCompat) {
        if (j() || this.w == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.r;
        SearchView searchView = searchViewAnimationHelper.f14628a;
        float f = backEventCompat.c;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.m;
        SearchBar searchBar = searchViewAnimationHelper.o;
        float cornerSize = searchBar.getCornerSize();
        if (materialMainContainerBackHelper.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = materialMainContainerBackHelper.f;
        materialMainContainerBackHelper.f = backEventCompat;
        if (backEventCompat2 != null) {
            if (searchBar.getVisibility() != 4) {
                searchBar.setVisibility(4);
            }
            boolean z = backEventCompat.d == 0;
            float f2 = backEventCompat.b;
            float f3 = materialMainContainerBackHelper.g;
            float interpolation = materialMainContainerBackHelper.f14611a.getInterpolation(f);
            View view = materialMainContainerBackHelper.b;
            float width = view.getWidth();
            float height = view.getHeight();
            if (width > BitmapDescriptorFactory.HUE_RED && height > BitmapDescriptorFactory.HUE_RED) {
                float fA = AnimationUtils.a(1.0f, 0.9f, interpolation);
                float fA2 = AnimationUtils.a(BitmapDescriptorFactory.HUE_RED, Math.max(BitmapDescriptorFactory.HUE_RED, ((width - (0.9f * width)) / 2.0f) - f3), interpolation) * (z ? 1 : -1);
                float fMin = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, ((height - (fA * height)) / 2.0f) - f3), materialMainContainerBackHelper.h);
                float f4 = f2 - materialMainContainerBackHelper.i;
                float fA3 = AnimationUtils.a(BitmapDescriptorFactory.HUE_RED, fMin, Math.abs(f4) / height) * Math.signum(f4);
                view.setScaleX(fA);
                view.setScaleY(fA);
                view.setTranslationX(fA2);
                view.setTranslationY(fA3);
                if (view instanceof ClippableRoundedCornerLayout) {
                    ((ClippableRoundedCornerLayout) view).a(r17.getLeft(), r17.getTop(), r17.getRight(), r17.getBottom(), AnimationUtils.a(materialMainContainerBackHelper.c(), cornerSize, interpolation));
                }
            }
        }
        AnimatorSet animatorSet = searchViewAnimationHelper.n;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
            return;
        }
        if (searchView.i()) {
            searchView.h();
        }
        if (searchView.y) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            searchViewAnimationHelper.b(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(ReversableAnimatedValueInterpolator.a(false, AnimationUtils.b));
            searchViewAnimationHelper.n = animatorSet2;
            animatorSet2.start();
            searchViewAnimationHelper.n.pause();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d() {
        if (j()) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.r;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.m;
        BackEventCompat backEventCompat = materialMainContainerBackHelper.f;
        materialMainContainerBackHelper.f = null;
        if (Build.VERSION.SDK_INT < 34 || this.w == null || backEventCompat == null) {
            if (this.E.equals(TransitionState.e) || this.E.equals(TransitionState.d)) {
                return;
            }
            searchViewAnimationHelper.j();
            return;
        }
        long totalDuration = searchViewAnimationHelper.j().getTotalDuration();
        MaterialMainContainerBackHelper materialMainContainerBackHelper2 = searchViewAnimationHelper.m;
        AnimatorSet animatorSetB = materialMainContainerBackHelper2.b(searchViewAnimationHelper.o);
        animatorSetB.setDuration(totalDuration);
        animatorSetB.start();
        materialMainContainerBackHelper2.i = BitmapDescriptorFactory.HUE_RED;
        materialMainContainerBackHelper2.j = null;
        materialMainContainerBackHelper2.k = null;
        if (searchViewAnimationHelper.n != null) {
            searchViewAnimationHelper.c(false).start();
            searchViewAnimationHelper.n.resume();
        }
        searchViewAnimationHelper.n = null;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void e() {
        if (j() || this.w == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.r;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.m;
        SearchBar searchBar = searchViewAnimationHelper.o;
        if (materialMainContainerBackHelper.a() != null) {
            AnimatorSet animatorSetB = materialMainContainerBackHelper.b(searchBar);
            View view = materialMainContainerBackHelper.b;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), materialMainContainerBackHelper.c());
                valueAnimatorOfFloat.addUpdateListener(new au.com.woolworths.shop.addtolist.utils.a(clippableRoundedCornerLayout, 3));
                animatorSetB.playTogether(valueAnimatorOfFloat);
            }
            animatorSetB.setDuration(materialMainContainerBackHelper.e);
            animatorSetB.start();
            materialMainContainerBackHelper.i = BitmapDescriptorFactory.HUE_RED;
            materialMainContainerBackHelper.j = null;
            materialMainContainerBackHelper.k = null;
        }
        AnimatorSet animatorSet = searchViewAnimationHelper.n;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        searchViewAnimationHelper.n = null;
    }

    @VisibleForTesting
    public MaterialMainContainerBackHelper getBackHelper() {
        return this.r.m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.E;
    }

    @DrawableRes
    @RestrictTo
    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.m;
    }

    @Nullable
    public CharSequence getHint() {
        return this.m.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.l;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.l.getText();
    }

    @SuppressLint
    public int getSoftInputMode() {
        return this.x;
    }

    @NonNull
    @SuppressLint
    public Editable getText() {
        return this.m.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.j;
    }

    public final void h() {
        this.m.post(new b(this, 0));
    }

    public final boolean i() {
        return this.x == 48;
    }

    public final boolean j() {
        return this.E.equals(TransitionState.e) || this.E.equals(TransitionState.d);
    }

    public final void k() {
        if (this.A) {
            this.m.postDelayed(new b(this, 1), 100L);
        }
    }

    public final void l(TransitionState transitionState, boolean z) {
        if (this.E.equals(transitionState)) {
            return;
        }
        if (z) {
            if (transitionState == TransitionState.g) {
                setModalForAccessibility(true);
            } else if (transitionState == TransitionState.e) {
                setModalForAccessibility(false);
            }
        }
        this.E = transitionState;
        Iterator it = new LinkedHashSet(this.v).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).a();
        }
        o(transitionState);
    }

    public final void m() {
        if (this.E.equals(TransitionState.g)) {
            return;
        }
        TransitionState transitionState = this.E;
        TransitionState transitionState2 = TransitionState.f;
        if (transitionState.equals(transitionState2)) {
            return;
        }
        final SearchViewAnimationHelper searchViewAnimationHelper = this.r;
        SearchView searchView = searchViewAnimationHelper.f14628a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchViewAnimationHelper.c;
        if (searchViewAnimationHelper.o == null) {
            if (searchView.i()) {
                searchView.postDelayed(new b(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            final int i = 1;
            clippableRoundedCornerLayout.post(new Runnable() { // from class: com.google.android.material.search.h
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            final SearchViewAnimationHelper searchViewAnimationHelper2 = searchViewAnimationHelper;
                            AnimatorSet animatorSetD = searchViewAnimationHelper2.d(true);
                            animatorSetD.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    SearchViewAnimationHelper searchViewAnimationHelper3 = SearchViewAnimationHelper.this;
                                    if (!searchViewAnimationHelper3.f14628a.i()) {
                                        searchViewAnimationHelper3.f14628a.k();
                                    }
                                    searchViewAnimationHelper3.f14628a.setTransitionState(SearchView.TransitionState.g);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    SearchViewAnimationHelper searchViewAnimationHelper3 = SearchViewAnimationHelper.this;
                                    searchViewAnimationHelper3.c.setVisibility(0);
                                    SearchBar searchBar = searchViewAnimationHelper3.o;
                                    searchBar.d0.getClass();
                                    View centerView = searchBar.getCenterView();
                                    if (centerView instanceof AnimatableView) {
                                        ((AnimatableView) centerView).stopAnimation();
                                    }
                                    if (centerView != 0) {
                                        centerView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                                    }
                                }
                            });
                            animatorSetD.start();
                            break;
                        default:
                            final SearchViewAnimationHelper searchViewAnimationHelper3 = searchViewAnimationHelper;
                            searchViewAnimationHelper3.c.setTranslationY(r1.getHeight());
                            AnimatorSet animatorSetH = searchViewAnimationHelper3.h(true);
                            animatorSetH.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.3
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    SearchViewAnimationHelper searchViewAnimationHelper4 = SearchViewAnimationHelper.this;
                                    if (!searchViewAnimationHelper4.f14628a.i()) {
                                        searchViewAnimationHelper4.f14628a.k();
                                    }
                                    searchViewAnimationHelper4.f14628a.setTransitionState(SearchView.TransitionState.g);
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    SearchViewAnimationHelper searchViewAnimationHelper4 = SearchViewAnimationHelper.this;
                                    searchViewAnimationHelper4.c.setVisibility(0);
                                    searchViewAnimationHelper4.f14628a.setTransitionState(SearchView.TransitionState.f);
                                }
                            });
                            animatorSetH.start();
                            break;
                    }
                }
            });
            return;
        }
        EditText editText = searchViewAnimationHelper.i;
        if (searchView.i()) {
            searchView.k();
        }
        searchView.setTransitionState(transitionState2);
        Toolbar toolbar = searchViewAnimationHelper.g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (searchViewAnimationHelper.o.getMenuResId() == -1 || !searchView.z) {
            toolbar.setVisibility(8);
        } else {
            toolbar.n(searchViewAnimationHelper.o.getMenuResId());
            ActionMenuView actionMenuViewA = ToolbarUtils.a(toolbar);
            if (actionMenuViewA != null) {
                for (int i2 = 0; i2 < actionMenuViewA.getChildCount(); i2++) {
                    View childAt = actionMenuViewA.getChildAt(i2);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        editText.setText(searchViewAnimationHelper.o.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        final int i3 = 0;
        clippableRoundedCornerLayout.post(new Runnable() { // from class: com.google.android.material.search.h
            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        final SearchViewAnimationHelper searchViewAnimationHelper2 = searchViewAnimationHelper;
                        AnimatorSet animatorSetD = searchViewAnimationHelper2.d(true);
                        animatorSetD.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                SearchViewAnimationHelper searchViewAnimationHelper3 = SearchViewAnimationHelper.this;
                                if (!searchViewAnimationHelper3.f14628a.i()) {
                                    searchViewAnimationHelper3.f14628a.k();
                                }
                                searchViewAnimationHelper3.f14628a.setTransitionState(SearchView.TransitionState.g);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                SearchViewAnimationHelper searchViewAnimationHelper3 = SearchViewAnimationHelper.this;
                                searchViewAnimationHelper3.c.setVisibility(0);
                                SearchBar searchBar = searchViewAnimationHelper3.o;
                                searchBar.d0.getClass();
                                View centerView = searchBar.getCenterView();
                                if (centerView instanceof AnimatableView) {
                                    ((AnimatableView) centerView).stopAnimation();
                                }
                                if (centerView != 0) {
                                    centerView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                                }
                            }
                        });
                        animatorSetD.start();
                        break;
                    default:
                        final SearchViewAnimationHelper searchViewAnimationHelper3 = searchViewAnimationHelper;
                        searchViewAnimationHelper3.c.setTranslationY(r1.getHeight());
                        AnimatorSet animatorSetH = searchViewAnimationHelper3.h(true);
                        animatorSetH.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.3
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                SearchViewAnimationHelper searchViewAnimationHelper4 = SearchViewAnimationHelper.this;
                                if (!searchViewAnimationHelper4.f14628a.i()) {
                                    searchViewAnimationHelper4.f14628a.k();
                                }
                                searchViewAnimationHelper4.f14628a.setTransitionState(SearchView.TransitionState.g);
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                SearchViewAnimationHelper searchViewAnimationHelper4 = SearchViewAnimationHelper.this;
                                searchViewAnimationHelper4.c.setVisibility(0);
                                searchViewAnimationHelper4.f14628a.setTransitionState(SearchView.TransitionState.f);
                            }
                        });
                        animatorSetH.start();
                        break;
                }
            }
        });
    }

    public final void n(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.e.getId()) != null) {
                    n((ViewGroup) childAt, z);
                } else if (z) {
                    this.F.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    childAt.setImportantForAccessibility(4);
                } else {
                    HashMap map = this.F;
                    if (map != null && map.containsKey(childAt)) {
                        int iIntValue = ((Integer) this.F.get(childAt)).intValue();
                        WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                        childAt.setImportantForAccessibility(iIntValue);
                    }
                }
            }
        }
    }

    public final void o(TransitionState transitionState) {
        if (this.w == null || !this.t) {
            return;
        }
        boolean zEquals = transitionState.equals(TransitionState.g);
        MaterialBackOrchestrator materialBackOrchestrator = this.s;
        if (zEquals) {
            materialBackOrchestrator.a(false);
        } else if (transitionState.equals(TransitionState.e)) {
            materialBackOrchestrator.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.x = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setText(savedState.f);
        setVisible(savedState.g == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f = text == null ? null : text.toString();
        savedState.g = this.e.getVisibility();
        return savedState;
    }

    public final void p() {
        ImageButton imageButtonB = ToolbarUtils.b(this.j);
        if (imageButtonB == null) {
            return;
        }
        int i = this.e.getVisibility() == 0 ? 1 : 0;
        Drawable drawableO = DrawableCompat.o(imageButtonB.getDrawable());
        if (drawableO instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawableO).setProgress(i);
        }
        if (drawableO instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawableO).a(i);
        }
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.y = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.A = z;
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.m.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.z = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.F = new HashMap(viewGroup.getChildCount());
        }
        n(viewGroup, z);
        if (z) {
            return;
        }
        this.F = null;
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.j.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        TextView textView = this.l;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @RestrictTo
    public void setStatusBarSpacerEnabled(boolean z) {
        this.D = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    @SuppressLint
    public void setText(@Nullable CharSequence charSequence) {
        this.m.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.j.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        l(transitionState, true);
    }

    @RestrictTo
    public void setUseWindowInsetsController(boolean z) {
        this.C = z;
    }

    public void setVisible(boolean z) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.e;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z ? 0 : 8);
        p();
        l(z ? TransitionState.g : TransitionState.e, z2 != z);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.w = searchBar;
        this.r.o = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new a(this, 2));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new b(this, 2));
                    this.m.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.j;
        if (materialToolbar != null && !(DrawableCompat.o(materialToolbar.getNavigationIcon()) instanceof DrawerArrowDrawable)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.w == null) {
                materialToolbar.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable drawableMutate = AppCompatResources.b(defaultNavigationIconResource, getContext()).mutate();
                if (materialToolbar.getNavigationIconTint() != null) {
                    drawableMutate.setTint(materialToolbar.getNavigationIconTint().intValue());
                }
                materialToolbar.setNavigationIcon(new FadeThroughDrawable(this.w.getNavigationIcon(), drawableMutate));
                p();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        o(getCurrentTransitionState());
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(@StringRes int i) {
        this.m.setHint(i);
    }

    public void setText(@StringRes int i) {
        this.m.setText(i);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        this.s = new MaterialBackOrchestrator(this, this);
        this.v = new LinkedHashSet();
        this.x = 16;
        this.E = TransitionState.e;
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.X, i, R.style.Widget_Material3_SearchView, new int[0]);
        this.B = typedArrayD.getColor(11, 0);
        int resourceId = typedArrayD.getResourceId(16, -1);
        int resourceId2 = typedArrayD.getResourceId(0, -1);
        String string = typedArrayD.getString(3);
        String string2 = typedArrayD.getString(4);
        String string3 = typedArrayD.getString(24);
        boolean z = typedArrayD.getBoolean(27, false);
        this.y = typedArrayD.getBoolean(8, true);
        this.z = typedArrayD.getBoolean(7, true);
        boolean z2 = typedArrayD.getBoolean(17, false);
        this.A = typedArrayD.getBoolean(9, true);
        this.t = typedArrayD.getBoolean(10, true);
        typedArrayD.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.q = true;
        this.d = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.e = clippableRoundedCornerLayout;
        this.f = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.g = viewFindViewById;
        this.h = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.i = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.j = materialToolbar;
        this.k = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.l = (TextView) findViewById(R.id.open_search_view_search_prefix);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.m = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.n = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.o = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.p = touchObserverFrameLayout;
        this.r = new SearchViewAnimationHelper(this);
        this.u = new ElevationOverlayProvider(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new d());
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z2) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new a(this, 0));
            if (z) {
                DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
                int iB = MaterialColors.b(R.attr.colorOnSurface, this);
                Paint paint = drawerArrowDrawable.f122a;
                if (iB != paint.getColor()) {
                    paint.setColor(iB);
                    drawerArrowDrawable.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(drawerArrowDrawable);
            }
        }
        imageButton.setOnClickListener(new a(this, 1));
        editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView.this.n.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        });
        touchObserverFrameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = SearchView.G;
                SearchView searchView = this.d;
                if (!searchView.i()) {
                    return false;
                }
                searchView.h();
                return false;
            }
        });
        ViewUtils.b(materialToolbar, new c(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        ViewCompat.I(viewFindViewById2, new m(marginLayoutParams.leftMargin, marginLayoutParams.rightMargin, marginLayoutParams));
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.I(viewFindViewById, new c(this));
    }
}
