package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LottieAnimatableKt {
    public static final LottieAnimatable a(Composer composer) {
        composer.F(2024497114);
        composer.F(-610207850);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new LottieAnimatableImpl();
            composer.A(objG);
        }
        LottieAnimatable lottieAnimatable = (LottieAnimatable) objG;
        composer.N();
        composer.N();
        return lottieAnimatable;
    }
}
