package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt$toTrolleyData$1", f = "ShoppingListsExt.kt", l = {333}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListsExtKt$toTrolleyData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef p;
    public int q;
    public final /* synthetic */ Ref.ObjectRef r;
    public final /* synthetic */ TrolleyInteractor s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListsExtKt$toTrolleyData$1(Ref.ObjectRef objectRef, TrolleyInteractor trolleyInteractor, Continuation continuation) {
        super(2, continuation);
        this.r = objectRef;
        this.s = trolleyInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListsExtKt$toTrolleyData$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListsExtKt$toTrolleyData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow p = this.s.getP();
            Ref.ObjectRef objectRef2 = this.r;
            this.p = objectRef2;
            this.q = 1;
            obj = FlowKt.w(p, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.p;
            ResultKt.b(obj);
        }
        objectRef.d = ((Result) obj).f4591a;
        return Unit.f24250a;
    }
}
