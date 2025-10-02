package au.com.woolworths.foundation.ui.image.gallery;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$2$1", f = "GalleryImagesCarousel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableFloatState p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$2$1(MutableFloatState mutableFloatState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = mutableFloatState;
        this.q = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$2$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$2$1 galleryImagesCarouselKt$GalleryImagesCarousel$2$1$2$1 = (GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        galleryImagesCarouselKt$GalleryImagesCarousel$2$1$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.p.p(1.0f);
        this.q.setValue(new Offset(0L));
        return Unit.f24250a;
    }
}
