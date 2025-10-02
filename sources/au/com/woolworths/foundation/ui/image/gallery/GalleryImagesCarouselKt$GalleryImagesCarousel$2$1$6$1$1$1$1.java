package au.com.woolworths.foundation.ui.image.gallery;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.foundation.gestures.TransformableState;
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
@DebugMetadata(c = "au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$6$1$1$1$1", f = "GalleryImagesCarousel.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$6$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TransformableState q;
    public final /* synthetic */ float r;
    public final /* synthetic */ long s;
    public final /* synthetic */ MutableFloatState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ MutableState v;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$6$1$1$1$1$1", f = "GalleryImagesCarousel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$6$1$1$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ float p;
        public final /* synthetic */ long q;
        public final /* synthetic */ MutableFloatState r;
        public final /* synthetic */ MutableState s;
        public final /* synthetic */ MutableState t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, long j, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
            super(2, continuation);
            this.p = f;
            this.q = j;
            this.r = mutableFloatState;
            this.s = mutableState;
            this.t = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.p, this.q, this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((TransformScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            MutableFloatState mutableFloatState = this.r;
            float f = this.p;
            mutableFloatState.p(f);
            this.s.setValue(new Offset(this.q));
            mutableFloatState.p(f);
            this.t.setValue(Boolean.valueOf(!((Boolean) r5.getD()).booleanValue()));
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$6$1$1$1$1(TransformableState transformableState, float f, long j, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.q = transformableState;
        this.r = f;
        this.s = j;
        this.t = mutableFloatState;
        this.u = mutableState;
        this.v = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$6$1$1$1$1(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$6$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, this.v, null);
            this.p = 1;
            if (this.q.a(MutatePriority.d, anonymousClass1, this) == coroutineSingletons) {
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
