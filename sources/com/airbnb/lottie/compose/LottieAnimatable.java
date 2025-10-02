package com.airbnb.lottie.compose;

import androidx.compose.runtime.Stable;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LottieAnimatable extends LottieAnimationState {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object a(com.airbnb.lottie.compose.LottieAnimatable r12, com.airbnb.lottie.LottieComposition r13, int r14, boolean r15, float r16, com.airbnb.lottie.compose.LottieClipSpec r17, float r18, kotlin.coroutines.jvm.internal.SuspendLambda r19, int r20) {
            /*
                r6 = r17
                com.airbnb.lottie.compose.LottieCancellationBehavior r9 = com.airbnb.lottie.compose.LottieCancellationBehavior.d
                int r2 = r12.w()
                r0 = r20 & 8
                if (r0 == 0) goto L10
                boolean r15 = r12.u()
            L10:
                r4 = r15
                r15 = r20 & 16
                if (r15 == 0) goto L1b
                float r15 = r12.n()
                r5 = r15
                goto L1d
            L1b:
                r5 = r16
            L1d:
                r15 = r20 & 64
                if (r15 == 0) goto L40
                r15 = 0
                int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
                if (r0 >= 0) goto L29
                if (r13 != 0) goto L29
                goto L35
            L29:
                if (r13 != 0) goto L2c
                goto L3e
            L2c:
                if (r0 >= 0) goto L38
                if (r6 == 0) goto L35
                float r15 = r6.a(r13)
                goto L3e
            L35:
                r15 = 1065353216(0x3f800000, float:1.0)
                goto L3e
            L38:
                if (r6 == 0) goto L3e
                float r15 = r6.b(r13)
            L3e:
                r7 = r15
                goto L42
            L40:
                r7 = r18
            L42:
                r8 = 0
                r10 = 0
                r0 = r12
                r1 = r13
                r3 = r14
                r11 = r19
                java.lang.Object r12 = r0.x(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.a(com.airbnb.lottie.compose.LottieAnimatable, com.airbnb.lottie.LottieComposition, int, boolean, float, com.airbnb.lottie.compose.LottieClipSpec, float, kotlin.coroutines.jvm.internal.SuspendLambda, int):java.lang.Object");
        }
    }

    Object h(LottieComposition lottieComposition, float f, boolean z, Continuation continuation);

    Object x(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, SuspendLambda suspendLambda);
}
