package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$ReviewFormItems$1$1$2$1", f = "SubmitReviewScreen.kt", l = {378}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubmitReviewScreenKt$ReviewFormItems$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ FocusRequester s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitReviewScreenKt$ReviewFormItems$1$1$2$1(int i, boolean z, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.q = i;
        this.r = z;
        this.s = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubmitReviewScreenKt$ReviewFormItems$1$1$2$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitReviewScreenKt$ReviewFormItems$1$1$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.q > 0 && this.r) {
                this.p = 1;
                if (DelayKt.b(500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        FocusRequester.d(this.s);
        return Unit.f24250a;
    }
}
