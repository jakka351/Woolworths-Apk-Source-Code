package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LottieCompositionResultImpl implements LottieCompositionResult {
    public final CompletableDeferred d = CompletableDeferredKt.a();
    public final MutableState e = SnapshotStateKt.f(null);
    public final MutableState f = SnapshotStateKt.f(null);
    public final State g = SnapshotStateKt.d(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            LottieCompositionResultImpl lottieCompositionResultImpl = this.h;
            return Boolean.valueOf(lottieCompositionResultImpl.getD() == null && ((Throwable) ((SnapshotMutableStateImpl) lottieCompositionResultImpl.f).getD()) == null);
        }
    });
    public final State h = SnapshotStateKt.d(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isComplete$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            LottieCompositionResultImpl lottieCompositionResultImpl = this.h;
            return Boolean.valueOf((lottieCompositionResultImpl.getD() == null && ((Throwable) ((SnapshotMutableStateImpl) lottieCompositionResultImpl.f).getD()) == null) ? false : true);
        }
    });
    public final State i = SnapshotStateKt.d(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(((Throwable) ((SnapshotMutableStateImpl) this.h.f).getD()) != null);
        }
    });
    public final State j = SnapshotStateKt.d(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isSuccess$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(this.h.getD() != null);
        }
    });

    @Override // androidx.compose.runtime.State
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final LottieComposition getD() {
        return (LottieComposition) ((SnapshotMutableStateImpl) this.e).getD();
    }
}
