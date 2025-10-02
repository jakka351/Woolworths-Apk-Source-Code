package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnimationEffect extends SpecialEffectsController.Effect {
        public final AnimationInfo c;

        public AnimationEffect(AnimationInfo animationInfo) {
            this.c = animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void b(ViewGroup container) {
            Intrinsics.h(container, "container");
            AnimationInfo animationInfo = this.c;
            SpecialEffectsController.Operation operation = animationInfo.f2736a;
            View view = operation.c.mView;
            view.clearAnimation();
            container.endViewTransition(view);
            animationInfo.f2736a.c(this);
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void c(final ViewGroup container) throws Resources.NotFoundException {
            Intrinsics.h(container, "container");
            AnimationInfo animationInfo = this.c;
            final SpecialEffectsController.Operation operation = animationInfo.f2736a;
            if (animationInfo.a()) {
                operation.c(this);
                return;
            }
            Context context = container.getContext();
            final View view = operation.c.mView;
            Intrinsics.g(context, "context");
            FragmentAnim.AnimationOrAnimator animationOrAnimatorB = animationInfo.b(context);
            if (animationOrAnimatorB == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = animationOrAnimatorB.f2743a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.f2769a != SpecialEffectsController.Operation.State.d) {
                view.startAnimation(animation);
                operation.c(this);
                return;
            }
            container.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation, container, view);
            endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation2) {
                    Intrinsics.h(animation2, "animation");
                    ViewGroup viewGroup = container;
                    viewGroup.post(new a(viewGroup, view, this, 0));
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "Animation from operation " + operation + " has ended.");
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation2) {
                    Intrinsics.h(animation2, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation2) {
                    Intrinsics.h(animation2, "animation");
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "Animation from operation " + operation + " has reached onAnimationStart.");
                    }
                }
            });
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnimationInfo extends SpecialEffectsInfo {
        public final boolean b;
        public boolean c;
        public FragmentAnim.AnimationOrAnimator d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, boolean z) {
            super(operation);
            Intrinsics.h(operation, "operation");
            this.b = z;
        }

        public final FragmentAnim.AnimationOrAnimator b(Context context) throws Resources.NotFoundException {
            Animation animationLoadAnimation;
            FragmentAnim.AnimationOrAnimator animationOrAnimator;
            if (this.c) {
                return this.d;
            }
            SpecialEffectsController.Operation operation = this.f2736a;
            Fragment fragment2 = operation.c;
            boolean z = operation.f2769a == SpecialEffectsController.Operation.State.e;
            int nextTransition = fragment2.getNextTransition();
            int popEnterAnim = this.b ? z ? fragment2.getPopEnterAnim() : fragment2.getPopExitAnim() : z ? fragment2.getEnterAnim() : fragment2.getExitAnim();
            fragment2.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment2.mContainer;
            FragmentAnim.AnimationOrAnimator animationOrAnimator2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment2.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment2.onCreateAnimation(nextTransition, z, popEnterAnim);
                if (animationOnCreateAnimation != null) {
                    animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment2.onCreateAnimator(nextTransition, z, popEnterAnim);
                    if (animatorOnCreateAnimator != null) {
                        animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animatorOnCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? FragmentAnim.a(android.R.attr.activityOpenEnterAnimation, context) : FragmentAnim.a(android.R.attr.activityOpenExitAnimation, context) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? FragmentAnim.a(android.R.attr.activityCloseEnterAnimation, context) : FragmentAnim.a(android.R.attr.activityCloseExitAnimation, context) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
                        if (popEnterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            if (zEquals) {
                                try {
                                    animationLoadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                                if (animationLoadAnimation != null) {
                                    animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animationLoadAnimation);
                                    animationOrAnimator2 = animationOrAnimator;
                                }
                            } else {
                                try {
                                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                    if (animatorLoadAnimator != null) {
                                        animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animatorLoadAnimator);
                                        animationOrAnimator2 = animationOrAnimator;
                                    }
                                } catch (RuntimeException e2) {
                                    if (zEquals) {
                                        throw e2;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animationLoadAnimation2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.d = animationOrAnimator2;
            this.c = true;
            return animationOrAnimator2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnimatorEffect extends SpecialEffectsController.Effect {
        public final AnimationInfo c;
        public AnimatorSet d;

        public AnimatorEffect(AnimationInfo animationInfo) {
            this.c = animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void b(ViewGroup container) {
            Intrinsics.h(container, "container");
            AnimatorSet animatorSet = this.d;
            AnimationInfo animationInfo = this.c;
            if (animatorSet == null) {
                animationInfo.f2736a.c(this);
                return;
            }
            SpecialEffectsController.Operation operation = animationInfo.f2736a;
            if (operation.g) {
                Api26Impl.f2735a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.Q(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(operation);
                sb.append(" has been canceled");
                sb.append(operation.g ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void c(ViewGroup container) {
            Intrinsics.h(container, "container");
            SpecialEffectsController.Operation operation = this.c.f2736a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void d(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.h(backEvent, "backEvent");
            Intrinsics.h(container, "container");
            SpecialEffectsController.Operation operation = this.c.f2736a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.c.mTransitioning) {
                return;
            }
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long jA = Api24Impl.f2734a.a(animatorSet);
            long j = (long) (backEvent.c * jA);
            if (j == 0) {
                j = 1;
            }
            if (j == jA) {
                j = jA - 1;
            }
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + operation);
            }
            Api26Impl.f2735a.b(animatorSet, j);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void e(final ViewGroup container) throws Resources.NotFoundException {
            final AnimatorEffect animatorEffect;
            Intrinsics.h(container, "container");
            AnimationInfo animationInfo = this.c;
            if (animationInfo.a()) {
                return;
            }
            Context context = container.getContext();
            Intrinsics.g(context, "context");
            FragmentAnim.AnimationOrAnimator animationOrAnimatorB = animationInfo.b(context);
            this.d = animationOrAnimatorB != null ? animationOrAnimatorB.b : null;
            final SpecialEffectsController.Operation operation = animationInfo.f2736a;
            Fragment fragment2 = operation.c;
            final boolean z = operation.f2769a == SpecialEffectsController.Operation.State.f;
            final View view = fragment2.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator anim) {
                        Intrinsics.h(anim, "anim");
                        ViewGroup viewGroup = container;
                        View viewToAnimate = view;
                        viewGroup.endViewTransition(viewToAnimate);
                        boolean z2 = z;
                        SpecialEffectsController.Operation operation2 = operation;
                        if (z2) {
                            SpecialEffectsController.Operation.State state = operation2.f2769a;
                            Intrinsics.g(viewToAnimate, "viewToAnimate");
                            state.a(viewToAnimate, viewGroup);
                        }
                        DefaultSpecialEffectsController.AnimatorEffect animatorEffect2 = animatorEffect;
                        animatorEffect2.c.f2736a.c(animatorEffect2);
                        if (FragmentManager.Q(2)) {
                            Log.v("FragmentManager", "Animator from operation " + operation2 + " has ended.");
                        }
                    }
                });
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api24Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Api24Impl f2734a = new Api24Impl();

        @DoNotInline
        public final long a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.h(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api26Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Api26Impl f2735a = new Api26Impl();

        @DoNotInline
        public final void a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.h(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        @DoNotInline
        public final void b(@NotNull AnimatorSet animatorSet, long time) {
            Intrinsics.h(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SpecialEffectsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final SpecialEffectsController.Operation f2736a;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation) {
            Intrinsics.h(operation, "operation");
            this.f2736a = operation;
        }

        public final boolean a() {
            SpecialEffectsController.Operation operation = this.f2736a;
            View view = operation.c.mView;
            SpecialEffectsController.Operation.State stateA = view != null ? SpecialEffectsController.Operation.State.Companion.a(view) : null;
            SpecialEffectsController.Operation.State state = operation.f2769a;
            if (stateA == state) {
                return true;
            }
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.e;
            return (stateA == state2 || state == state2) ? false : true;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class TransitionEffect extends SpecialEffectsController.Effect {
        public final ArrayList c;
        public final SpecialEffectsController.Operation d;
        public final SpecialEffectsController.Operation e;
        public final FragmentTransitionImpl f;
        public final Object g;
        public final ArrayList h;
        public final ArrayList i;
        public final ArrayMap j;
        public final ArrayList k;
        public final ArrayList l;
        public final ArrayMap m;
        public final ArrayMap n;
        public final boolean o;
        public final CancellationSignal p = new CancellationSignal();
        public Object q;
        public boolean r;

        public TransitionEffect(ArrayList arrayList, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, FragmentTransitionImpl fragmentTransitionImpl, Object obj, ArrayList arrayList2, ArrayList arrayList3, ArrayMap arrayMap, ArrayList arrayList4, ArrayList arrayList5, ArrayMap arrayMap2, ArrayMap arrayMap3, boolean z) {
            this.c = arrayList;
            this.d = operation;
            this.e = operation2;
            this.f = fragmentTransitionImpl;
            this.g = obj;
            this.h = arrayList2;
            this.i = arrayList3;
            this.j = arrayMap;
            this.k = arrayList4;
            this.l = arrayList5;
            this.m = arrayMap2;
            this.n = arrayMap3;
            this.o = z;
        }

        public static void f(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int i = ViewGroupCompat.f2491a;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    f(childAt, arrayList);
                }
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final boolean a() {
            Object obj;
            FragmentTransitionImpl fragmentTransitionImpl = this.f;
            if (!fragmentTransitionImpl.l()) {
                return false;
            }
            ArrayList<TransitionInfo> arrayList = this.c;
            if (!arrayList.isEmpty()) {
                for (TransitionInfo transitionInfo : arrayList) {
                    if (Build.VERSION.SDK_INT < 34 || (obj = transitionInfo.b) == null || !fragmentTransitionImpl.m(obj)) {
                        return false;
                    }
                }
            }
            Object obj2 = this.g;
            return obj2 == null || fragmentTransitionImpl.m(obj2);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void b(ViewGroup container) {
            Intrinsics.h(container, "container");
            this.p.a();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void c(final ViewGroup container) {
            Intrinsics.h(container, "container");
            boolean zIsLaidOut = container.isLaidOut();
            ArrayList<TransitionInfo> arrayList = this.c;
            if (!zIsLaidOut || this.r) {
                for (TransitionInfo transitionInfo : arrayList) {
                    SpecialEffectsController.Operation operation = transitionInfo.f2736a;
                    if (FragmentManager.Q(2)) {
                        if (this.r) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + operation);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                        }
                    }
                    transitionInfo.f2736a.c(this);
                }
                this.r = false;
                return;
            }
            Object obj = this.q;
            FragmentTransitionImpl fragmentTransitionImpl = this.f;
            SpecialEffectsController.Operation operation2 = this.e;
            SpecialEffectsController.Operation operation3 = this.d;
            if (obj != null) {
                fragmentTransitionImpl.c(obj);
                if (FragmentManager.Q(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + operation3 + " to " + operation2);
                    return;
                }
                return;
            }
            Pair pairG = g(container, operation2, operation3);
            ArrayList arrayList2 = (ArrayList) pairG.d;
            final Object obj2 = pairG.e;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((TransitionInfo) it.next()).f2736a);
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it2.next();
                fragmentTransitionImpl.u(operation4.c, obj2, this.p, new b(operation4, this, 1));
            }
            i(arrayList2, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.f.e(container, obj2);
                    return Unit.f24250a;
                }
            });
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + operation3 + " to " + operation2);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void d(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.h(backEvent, "backEvent");
            Intrinsics.h(container, "container");
            Object obj = this.q;
            if (obj != null) {
                this.f.r(obj, backEvent.c);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void e(final ViewGroup container) {
            Object obj;
            Intrinsics.h(container, "container");
            boolean zIsLaidOut = container.isLaidOut();
            ArrayList arrayList = this.c;
            if (!zIsLaidOut) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((TransitionInfo) it.next()).f2736a;
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            boolean zH = h();
            SpecialEffectsController.Operation operation2 = this.e;
            SpecialEffectsController.Operation operation3 = this.d;
            if (zH && (obj = this.g) != null && !a()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + operation3 + " and " + operation2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (a() && h()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Pair pairG = g(container, operation2, operation3);
                ArrayList arrayList2 = (ArrayList) pairG.d;
                final Object obj2 = pairG.e;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((TransitionInfo) it2.next()).f2736a);
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it3.next();
                    d dVar = new d(objectRef, 2);
                    Fragment fragment2 = operation4.c;
                    this.f.v(obj2, this.p, dVar, new b(operation4, this, 0));
                }
                i(arrayList2, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (FragmentManager.Q(2)) {
                            Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                        }
                        final DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.h;
                        FragmentTransitionImpl fragmentTransitionImpl = transitionEffect.f;
                        final ViewGroup viewGroup = container;
                        final Object obj3 = obj2;
                        Object objI = fragmentTransitionImpl.i(viewGroup, obj3);
                        transitionEffect.q = objI;
                        if (objI == null) {
                            if (FragmentManager.Q(2)) {
                                Log.v("FragmentManager", "TransitionSeekController was not created.");
                            }
                            transitionEffect.r = true;
                        } else {
                            objectRef.d = new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
                                @Override // kotlin.jvm.functions.Function0
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invoke() {
                                    /*
                                        r7 = this;
                                        androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r2
                                        java.util.ArrayList r1 = r0.c
                                        androidx.fragment.app.FragmentTransitionImpl r2 = r0.f
                                        boolean r3 = r1.isEmpty()
                                        java.lang.String r4 = "FragmentManager"
                                        r5 = 2
                                        if (r3 == 0) goto L10
                                        goto L50
                                    L10:
                                        java.util.Iterator r3 = r1.iterator()
                                    L14:
                                        boolean r6 = r3.hasNext()
                                        if (r6 == 0) goto L50
                                        java.lang.Object r6 = r3.next()
                                        androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r6
                                        androidx.fragment.app.SpecialEffectsController$Operation r6 = r6.f2736a
                                        boolean r6 = r6.g
                                        if (r6 != 0) goto L14
                                        boolean r3 = androidx.fragment.app.FragmentManager.Q(r5)
                                        if (r3 == 0) goto L31
                                        java.lang.String r3 = "Completing animating immediately"
                                        android.util.Log.v(r4, r3)
                                    L31:
                                        androidx.core.os.CancellationSignal r3 = new androidx.core.os.CancellationSignal
                                        r3.<init>()
                                        r4 = 0
                                        java.lang.Object r1 = r1.get(r4)
                                        androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
                                        androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.f2736a
                                        androidx.fragment.app.Fragment r1 = r1.c
                                        androidx.fragment.app.d r4 = new androidx.fragment.app.d
                                        r5 = 0
                                        r4.<init>(r0, r5)
                                        java.lang.Object r0 = r3
                                        r2.u(r1, r0, r3, r4)
                                        r3.a()
                                        goto L6b
                                    L50:
                                        boolean r1 = androidx.fragment.app.FragmentManager.Q(r5)
                                        if (r1 == 0) goto L5b
                                        java.lang.String r1 = "Animating to start"
                                        android.util.Log.v(r4, r1)
                                    L5b:
                                        java.lang.Object r1 = r0.q
                                        kotlin.jvm.internal.Intrinsics.e(r1)
                                        androidx.fragment.app.c r3 = new androidx.fragment.app.c
                                        r4 = 0
                                        android.view.ViewGroup r5 = r1
                                        r3.<init>(r4, r0, r5)
                                        r2.d(r1, r3)
                                    L6b:
                                        kotlin.Unit r0 = kotlin.Unit.f24250a
                                        return r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass1.invoke():java.lang.Object");
                                }
                            };
                            if (FragmentManager.Q(2)) {
                                Log.v("FragmentManager", "Started executing operations from " + transitionEffect.d + " to " + transitionEffect.e);
                            }
                        }
                        return Unit.f24250a;
                    }
                });
            }
        }

        public final Pair g(ViewGroup viewGroup, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Object obj;
            FragmentTransitionImpl fragmentTransitionImpl;
            Object obj2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Iterator it;
            View view = new View(viewGroup.getContext());
            Rect rect = new Rect();
            ArrayList arrayList5 = this.c;
            Iterator it2 = arrayList5.iterator();
            View view2 = null;
            boolean z = false;
            while (true) {
                boolean zHasNext = it2.hasNext();
                arrayList = this.i;
                arrayList2 = this.h;
                obj = this.g;
                fragmentTransitionImpl = this.f;
                if (!zHasNext) {
                    break;
                }
                if (((TransitionInfo) it2.next()).d == null || operation2 == null || operation == null || this.j.isEmpty() || obj == null) {
                    arrayList4 = arrayList5;
                    it = it2;
                } else {
                    Fragment fragment2 = operation.c;
                    Fragment fragment3 = operation2.c;
                    arrayList4 = arrayList5;
                    boolean z2 = this.o;
                    it = it2;
                    ArrayMap arrayMap = this.m;
                    FragmentTransition.a(fragment2, fragment3, z2, arrayMap);
                    OneShotPreDrawListener.a(viewGroup, new a(operation, operation2, this, 1));
                    arrayList2.addAll(arrayMap.values());
                    ArrayList arrayList6 = this.l;
                    if (!arrayList6.isEmpty()) {
                        Object obj3 = arrayList6.get(0);
                        Intrinsics.g(obj3, "exitingNames[0]");
                        View view3 = (View) arrayMap.get((String) obj3);
                        fragmentTransitionImpl.s(view3, obj);
                        view2 = view3;
                    }
                    ArrayMap arrayMap2 = this.n;
                    arrayList.addAll(arrayMap2.values());
                    ArrayList arrayList7 = this.k;
                    if (!arrayList7.isEmpty()) {
                        Object obj4 = arrayList7.get(0);
                        Intrinsics.g(obj4, "enteringNames[0]");
                        View view4 = (View) arrayMap2.get((String) obj4);
                        if (view4 != null) {
                            OneShotPreDrawListener.a(viewGroup, new c(fragmentTransitionImpl, view4, rect));
                            z = true;
                        }
                    }
                    fragmentTransitionImpl.w(obj, view, arrayList2);
                    Object obj5 = this.g;
                    fragmentTransitionImpl.q(obj5, null, null, obj5, arrayList);
                }
                arrayList5 = arrayList4;
                it2 = it;
            }
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList;
            ArrayList arrayList10 = new ArrayList();
            Iterator it3 = arrayList8.iterator();
            Object objO = null;
            Object objO2 = null;
            while (it3.hasNext()) {
                ArrayList arrayList11 = arrayList9;
                TransitionInfo transitionInfo = (TransitionInfo) it3.next();
                Iterator it4 = it3;
                SpecialEffectsController.Operation operation3 = transitionInfo.f2736a;
                boolean z3 = z;
                Object objH = fragmentTransitionImpl.h(transitionInfo.b);
                if (objH != null) {
                    ArrayList arrayList12 = arrayList2;
                    ArrayList arrayList13 = new ArrayList();
                    Object obj6 = obj;
                    Fragment fragment4 = operation3.c;
                    Object obj7 = objO2;
                    View view5 = fragment4.mView;
                    Object obj8 = objO;
                    Intrinsics.g(view5, "operation.fragment.mView");
                    f(view5, arrayList13);
                    if (obj6 != null && (operation3 == operation2 || operation3 == operation)) {
                        if (operation3 == operation2) {
                            arrayList13.removeAll(CollectionsKt.L0(arrayList12));
                        } else {
                            arrayList13.removeAll(CollectionsKt.L0(arrayList11));
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        fragmentTransitionImpl.a(view, objH);
                        obj2 = objH;
                        arrayList3 = arrayList13;
                    } else {
                        fragmentTransitionImpl.b(objH, arrayList13);
                        fragmentTransitionImpl.q(objH, objH, arrayList13, null, null);
                        obj2 = objH;
                        arrayList3 = arrayList13;
                        if (operation3.f2769a == SpecialEffectsController.Operation.State.f) {
                            operation3.i = false;
                            ArrayList arrayList14 = new ArrayList(arrayList3);
                            arrayList14.remove(fragment4.mView);
                            fragmentTransitionImpl.p(obj2, fragment4.mView, arrayList14);
                            OneShotPreDrawListener.a(viewGroup, new d(arrayList3, 3));
                        }
                    }
                    if (operation3.f2769a == SpecialEffectsController.Operation.State.e) {
                        arrayList10.addAll(arrayList3);
                        if (z3) {
                            fragmentTransitionImpl.t(obj2, rect);
                        }
                        if (FragmentManager.Q(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator it5 = arrayList3.iterator();
                            while (it5.hasNext()) {
                                Object transitioningViews = it5.next();
                                Intrinsics.g(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                            }
                        }
                    } else {
                        fragmentTransitionImpl.s(view2, obj2);
                        if (FragmentManager.Q(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                Object transitioningViews2 = it6.next();
                                Intrinsics.g(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                            }
                        }
                    }
                    if (transitionInfo.c) {
                        objO = fragmentTransitionImpl.o(obj8, obj2);
                        arrayList9 = arrayList11;
                        it3 = it4;
                        z = z3;
                        arrayList2 = arrayList12;
                        obj = obj6;
                        objO2 = obj7;
                    } else {
                        objO2 = fragmentTransitionImpl.o(obj7, obj2);
                        objO = obj8;
                        arrayList9 = arrayList11;
                        it3 = it4;
                        z = z3;
                        arrayList2 = arrayList12;
                        obj = obj6;
                    }
                } else {
                    arrayList9 = arrayList11;
                    it3 = it4;
                    z = z3;
                }
            }
            Object objN = fragmentTransitionImpl.n(objO, objO2, obj);
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objN + " for container " + viewGroup);
            }
            return new Pair(arrayList10, objN);
        }

        public final boolean h() {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((TransitionInfo) it.next()).f2736a.c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
            FragmentTransition.c(4, arrayList);
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = this.i;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList3.get(i);
                arrayList2.add(ViewCompat.o(view));
                ViewCompat.N(view, null);
            }
            boolean zQ = FragmentManager.Q(2);
            final ArrayList arrayList4 = this.h;
            if (zQ) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    Object sharedElementFirstOutViews = it.next();
                    Intrinsics.g(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view2 = (View) sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + ViewCompat.o(view2));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object sharedElementLastInViews = it2.next();
                    Intrinsics.g(sharedElementLastInViews, "sharedElementLastInViews");
                    View view3 = (View) sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view3 + " Name: " + ViewCompat.o(view3));
                }
            }
            function0.invoke();
            final int size2 = arrayList3.size();
            final ArrayList arrayList5 = new ArrayList();
            for (int i2 = 0; i2 < size2; i2++) {
                View view4 = (View) arrayList4.get(i2);
                String strO = ViewCompat.o(view4);
                arrayList5.add(strO);
                if (strO != null) {
                    ViewCompat.N(view4, null);
                    String str = (String) this.j.get(strO);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        if (str.equals(arrayList2.get(i3))) {
                            ViewCompat.N((View) arrayList3.get(i3), strO);
                            break;
                        }
                        i3++;
                    }
                }
            }
            OneShotPreDrawListener.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.1
                @Override // java.lang.Runnable
                public final void run() {
                    for (int i4 = 0; i4 < size2; i4++) {
                        ViewCompat.N((View) arrayList3.get(i4), (String) arrayList2.get(i4));
                        ViewCompat.N((View) arrayList4.get(i4), (String) arrayList5.get(i4));
                    }
                }
            });
            FragmentTransition.c(0, arrayList);
            this.f.x(this.g, arrayList4, arrayList3);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransitionInfo extends SpecialEffectsInfo {
        public final Object b;
        public final boolean c;
        public final Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, boolean z, boolean z2) {
            super(operation);
            Fragment fragment2 = operation.c;
            SpecialEffectsController.Operation.State state = operation.f2769a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.e;
            this.b = state == state2 ? z ? fragment2.getReenterTransition() : fragment2.getEnterTransition() : z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            this.c = operation.f2769a == state2 ? z ? fragment2.getAllowReturnTransitionOverlap() : fragment2.getAllowEnterTransitionOverlap() : true;
            this.d = z2 ? z ? fragment2.getSharedElementReturnTransition() : fragment2.getSharedElementEnterTransition() : null;
        }

        public final FragmentTransitionImpl b() {
            Object obj = this.b;
            FragmentTransitionImpl fragmentTransitionImplC = c(obj);
            Object obj2 = this.d;
            FragmentTransitionImpl fragmentTransitionImplC2 = c(obj2);
            if (fragmentTransitionImplC == null || fragmentTransitionImplC2 == null || fragmentTransitionImplC == fragmentTransitionImplC2) {
                return fragmentTransitionImplC == null ? fragmentTransitionImplC2 : fragmentTransitionImplC;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f2736a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final FragmentTransitionImpl c(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.f2761a;
            if (obj instanceof Transition) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.b;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.g(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f2736a.c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup container) {
        super(container);
        Intrinsics.h(container, "container");
    }

    public static void s(ArrayMap arrayMap, View view) {
        String strO = ViewCompat.o(view);
        if (strO != null) {
            arrayMap.put(strO, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    s(arrayMap, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04d7 A[LOOP:20: B:162:0x04d1->B:164:0x04d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.Object] */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r29, boolean r30) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.b(java.util.ArrayList, boolean):void");
    }
}
