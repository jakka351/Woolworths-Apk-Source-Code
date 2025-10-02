package au.com.woolworths.foundation.ui.image.gallery;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$1$1", f = "GalleryImagesCarousel.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PagerState q;
    public final /* synthetic */ Function2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$1$1(PagerState pagerState, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.q = pagerState;
        this.r = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final Ref.IntRef intRef = new Ref.IntRef();
            PagerState pagerState = this.q;
            intRef.d = pagerState.j();
            Flow flowM = SnapshotStateKt.m(new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.b(pagerState, 2));
            final Function2 function2 = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Function2 function22;
                    int iIntValue = ((Number) obj2).intValue();
                    Ref.IntRef intRef2 = intRef;
                    int i2 = intRef2.d;
                    if (iIntValue != i2 && (function22 = function2) != null) {
                        function22.invoke(new Integer(i2), new Integer(iIntValue));
                    }
                    intRef2.d = iIntValue;
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (((AbstractFlow) flowM).collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
