package au.com.woolworths.product.addtocart;

import au.com.woolworths.android.onesite.extensions.LiveDataExtKt;
import au.com.woolworths.product.addtocart.AddToCartContract;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType;
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
@DebugMetadata(c = "au.com.woolworths.product.addtocart.AddToCartViewModel$onAnimationEnd$1", f = "AddToCartViewModel.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AddToCartViewModel$onAnimationEnd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddToCartViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartViewModel$onAnimationEnd$1(AddToCartViewModel addToCartViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = addToCartViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddToCartViewModel$onAnimationEnd$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddToCartViewModel$onAnimationEnd$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            if (DelayKt.b(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        AddToCartViewModel addToCartViewModel = this.q;
        addToCartViewModel.s6(new AddToCartContract.Actions.FinishWithSuccess(((AddToCartContract.ViewState) LiveDataExtKt.a(addToCartViewModel.m)).j ? ProductBottomSheetActionType.d : ProductBottomSheetActionType.e));
        return Unit.f24250a;
    }
}
