package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SliderKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1498a = SliderTokens.d;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;

    static {
        float f = SliderTokens.c;
        b = f;
        c = DpKt.a(f, SliderTokens.b);
        d = SliderTokens.f1604a;
        e = 2;
    }

    public static final void a(final Modifier modifier, final RangeSliderState rangeSliderState, final boolean z, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, final ComposableLambdaImpl composableLambdaImpl3, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1411725677);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(rangeSliderState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(mutableInteractionSource2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl3) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) != 4793490 || !composerImplV.c()) {
            composerImplV.x(CompositionLocalsKt.n);
            LayoutDirection layoutDirection = LayoutDirection.e;
            rangeSliderState.getClass();
            throw null;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SliderKt.a(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource2, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Modifier modifier, final SliderState sliderState, final boolean z, final MutableInteractionSource mutableInteractionSource, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1390990089);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(sliderState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl2) ? 131072 : 65536;
        }
        if ((i2 & 74899) != 74898 || !composerImplV.c()) {
            sliderState.f1501a = composerImplV.x(CompositionLocalsKt.n) == LayoutDirection.e;
            if (z) {
                SuspendingPointerInputFilterKt.c(sliderState, mutableInteractionSource, new SliderKt$sliderTapModifier$1(sliderState, null));
            }
            Orientation orientation = Orientation.d;
            throw null;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SliderKt.b(modifier, sliderState, z, mutableInteractionSource, composableLambdaImpl, composableLambdaImpl2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final long c(float f, float f2) {
        if ((Float.isNaN(f) && Float.isNaN(f2)) || f <= f2 + 1.0E-4d) {
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
            int i = SliderRange.b;
            return jFloatToRawIntBits;
        }
        throw new IllegalArgumentException(("start(" + f + ") must be <= endInclusive(" + f2 + ')').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable d(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.r
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.jvm.internal.Ref$FloatRef r8 = r6.p
            kotlin.ResultKt.b(r12)
            goto L51
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.b(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>()
            r6.p = r12
            r6.r = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.internal.DragGestureDetectorCopyKt.a(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L4e
            return r0
        L4e:
            r7 = r12
            r12 = r8
            r8 = r7
        L51:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L62
            float r8 = r8.d
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r12, r9)
            return r8
        L62:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.d(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.io.Serializable");
    }

    public static final float e(float f, float f2, float f3, float[] fArr) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f4 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f4);
            } else {
                float fAbs = Math.abs(MathHelpersKt.b(f2, f3, f4) - f);
                IntProgressionIterator it = new IntRange(1, length, 1).iterator();
                while (it.f) {
                    float f5 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(MathHelpersKt.b(f2, f3, f5) - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f4 = f5;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f4);
            }
        }
        return fValueOf != null ? MathHelpersKt.b(f2, f3, fValueOf.floatValue()) : f;
    }

    public static final float f(float f, float f2, float f3, float f4, float f5) {
        float f6 = f2 - f;
        return MathHelpersKt.b(f4, f5, RangesKt.b(f6 == BitmapDescriptorFactory.HUE_RED ? 0.0f : (f3 - f) / f6, BitmapDescriptorFactory.HUE_RED, 1.0f));
    }
}
