package androidx.constraintlayout.compose.carousel;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "anchors", "", "", "emit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CarouselSwipeableState$snapTo$2<T> implements FlowCollector {
    public final /* synthetic */ CarouselSwipeableState d;

    public CarouselSwipeableState$snapTo$2(CarouselSwipeableState carouselSwipeableState) {
        this.d = carouselSwipeableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.util.Map r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1 r0 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1 r0 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            java.lang.String r3 = "start"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.p
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2 r6 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2) r6
            kotlin.ResultKt.b(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            java.lang.Float r6 = androidx.constraintlayout.compose.carousel.CarouselSwipeableKt.a(r3, r6)
            if (r6 == 0) goto L58
            float r6 = r6.floatValue()
            r0.p = r5
            r0.s = r4
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState r7 = r5.d
            java.lang.Object r6 = r7.d(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r6 = r5
        L50:
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState r6 = r6.d
            r6.c(r3)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L58:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The target value must have an associated anchor."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2.emit(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
