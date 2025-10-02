package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/EnterTransition;", "activeEnter", "Landroidx/compose/animation/ExitTransition;", "activeExit", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class EnterExitTransitionKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TwoWayConverter f721a = VectorConvertersKt.a(EnterExitTransitionKt$TransformOriginVectorConverter$1.h, EnterExitTransitionKt$TransformOriginVectorConverter$2.h);
    public static final SpringSpec b = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5);
    public static final SpringSpec c = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1);
    public static final SpringSpec d = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1);

    public static EnterTransition a(TweenSpec tweenSpec, int i) {
        FiniteAnimationSpec finiteAnimationSpecD = tweenSpec;
        if ((i & 1) != 0) {
            finiteAnimationSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1);
        }
        int i2 = i & 2;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.o;
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
        BiasAlignment.Horizontal horizontal3 = i2 != 0 ? horizontal : horizontal2;
        return b(finiteAnimationSpecD, Intrinsics.c(horizontal3, horizontal2) ? Alignment.Companion.d : Intrinsics.c(horizontal3, horizontal) ? Alignment.Companion.f : Alignment.Companion.e, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            public final /* synthetic */ Function1 h = EnterExitTransitionKt$expandHorizontally$1.h;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j = ((IntSize) obj).f2202a;
                return new IntSize((((Number) this.h.invoke(Integer.valueOf((int) (j >> 32)))).intValue() << 32) | (4294967295L & ((int) (j & 4294967295L))));
            }
        });
    }

    public static final EnterTransition b(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, Function1 function1) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(finiteAnimationSpec, alignment, function1), (Scale) null, (LinkedHashMap) null, 59));
    }

    public static EnterTransition d(TweenSpec tweenSpec, int i) {
        FiniteAnimationSpec finiteAnimationSpecD = tweenSpec;
        if ((i & 1) != 0) {
            finiteAnimationSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1);
        }
        Object obj = Alignment.Companion.j;
        BiasAlignment.Vertical vertical = Alignment.Companion.l;
        return b(finiteAnimationSpecD, vertical.equals(obj) ? Alignment.Companion.b : vertical.equals(vertical) ? Alignment.Companion.h : Alignment.Companion.e, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            public final /* synthetic */ Function1 h = EnterExitTransitionKt$expandVertically$1.h;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                long j = ((IntSize) obj2).f2202a;
                return new IntSize((((int) (j >> 32)) << 32) | (4294967295L & ((Number) this.h.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()));
            }
        });
    }

    public static EnterTransition e(TweenSpec tweenSpec, int i) {
        int i2 = i & 1;
        float f = BitmapDescriptorFactory.HUE_RED;
        FiniteAnimationSpec finiteAnimationSpecD = tweenSpec;
        if (i2 != 0) {
            finiteAnimationSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5);
        }
        if ((i & 2) == 0) {
            f = 0.6f;
        }
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpecD), (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 62));
    }

    public static ExitTransition f(TweenSpec tweenSpec, int i) {
        FiniteAnimationSpec finiteAnimationSpecD = tweenSpec;
        if ((i & 1) != 0) {
            finiteAnimationSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5);
        }
        return new ExitTransitionImpl(new TransitionData(new Fade(BitmapDescriptorFactory.HUE_RED, finiteAnimationSpecD), (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 62));
    }

    public static final EnterTransition g(float f, long j, TweenSpec tweenSpec) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, new Scale(f, j, tweenSpec), (LinkedHashMap) null, 55));
    }

    public static EnterTransition h(TweenSpec tweenSpec) {
        return g(0.92f, TransformOrigin.b, tweenSpec);
    }

    public static ExitTransition i(TweenSpec tweenSpec, int i) {
        FiniteAnimationSpec finiteAnimationSpecD = tweenSpec;
        if ((i & 1) != 0) {
            finiteAnimationSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1);
        }
        int i2 = i & 2;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.o;
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
        BiasAlignment.Horizontal horizontal3 = i2 != 0 ? horizontal : horizontal2;
        return j(finiteAnimationSpecD, Intrinsics.c(horizontal3, horizontal2) ? Alignment.Companion.d : Intrinsics.c(horizontal3, horizontal) ? Alignment.Companion.f : Alignment.Companion.e, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            public final /* synthetic */ Function1 h = EnterExitTransitionKt$shrinkHorizontally$1.h;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j = ((IntSize) obj).f2202a;
                return new IntSize((((Number) this.h.invoke(Integer.valueOf((int) (j >> 32)))).intValue() << 32) | (4294967295L & ((int) (j & 4294967295L))));
            }
        });
    }

    public static final ExitTransition j(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, Function1 function1) {
        return new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(finiteAnimationSpec, alignment, function1), (Scale) null, (LinkedHashMap) null, 59));
    }

    public static ExitTransition l(TweenSpec tweenSpec, int i) {
        FiniteAnimationSpec finiteAnimationSpecD = tweenSpec;
        if ((i & 1) != 0) {
            finiteAnimationSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1);
        }
        Object obj = Alignment.Companion.j;
        BiasAlignment.Vertical vertical = Alignment.Companion.l;
        return j(finiteAnimationSpecD, vertical.equals(obj) ? Alignment.Companion.b : vertical.equals(vertical) ? Alignment.Companion.h : Alignment.Companion.e, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            public final /* synthetic */ Function1 h = EnterExitTransitionKt$shrinkVertically$1.h;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                long j = ((IntSize) obj2).f2202a;
                return new IntSize((((int) (j >> 32)) << 32) | (4294967295L & ((Number) this.h.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()));
            }
        });
    }

    public static final EnterTransition m(FiniteAnimationSpec finiteAnimationSpec, final Function1 function1) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, new Slide(finiteAnimationSpec, new Function1<IntSize, IntOffset>(function1) { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            public final /* synthetic */ Lambda h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.h = (Lambda) function1;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new IntOffset((((Number) this.h.invoke(Integer.valueOf((int) (((IntSize) obj).f2202a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            }
        }), (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 61));
    }

    public static final EnterTransition n(FiniteAnimationSpec finiteAnimationSpec, final Function1 function1) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, new Slide(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new IntOffset((0 << 32) | (4294967295L & ((Number) function1.invoke(Integer.valueOf((int) (((IntSize) obj).f2202a & 4294967295L)))).intValue()));
            }
        }), (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 61));
    }

    public static final ExitTransition p(FiniteAnimationSpec finiteAnimationSpec, final Function1 function1) {
        return new ExitTransitionImpl(new TransitionData((Fade) null, new Slide(finiteAnimationSpec, new Function1<IntSize, IntOffset>(function1) { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            public final /* synthetic */ Lambda h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.h = (Lambda) function1;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new IntOffset((((Number) this.h.invoke(Integer.valueOf((int) (((IntSize) obj).f2202a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            }
        }), (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 61));
    }

    public static final ExitTransition q(FiniteAnimationSpec finiteAnimationSpec, final Function1 function1) {
        return new ExitTransitionImpl(new TransitionData((Fade) null, new Slide(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new IntOffset((0 << 32) | (4294967295L & ((Number) function1.invoke(Integer.valueOf((int) (((IntSize) obj).f2202a & 4294967295L)))).intValue()));
            }
        }), (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 61));
    }
}
