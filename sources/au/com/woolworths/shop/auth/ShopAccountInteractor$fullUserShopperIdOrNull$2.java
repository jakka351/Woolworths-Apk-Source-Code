package au.com.woolworths.shop.auth;

import au.com.woolworths.android.onesite.models.authentication.Member;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/android/onesite/models/authentication/Member;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAccountInteractor$fullUserShopperIdOrNull$2", f = "ShopAccountInteractor.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ShopAccountInteractor$fullUserShopperIdOrNull$2 extends SuspendLambda implements Function2<FlowCollector<? super Member>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShopAccountInteractor r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAccountInteractor$fullUserShopperIdOrNull$2(ShopAccountInteractor shopAccountInteractor, Continuation continuation) {
        super(2, continuation);
        this.r = shopAccountInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShopAccountInteractor$fullUserShopperIdOrNull$2 shopAccountInteractor$fullUserShopperIdOrNull$2 = new ShopAccountInteractor$fullUserShopperIdOrNull$2(this.r, continuation);
        shopAccountInteractor$fullUserShopperIdOrNull$2.q = obj;
        return shopAccountInteractor$fullUserShopperIdOrNull$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopAccountInteractor$fullUserShopperIdOrNull$2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.q;
            Member memberN = this.r.n();
            this.p = 1;
            if (flowCollector.emit(memberN, this) == coroutineSingletons) {
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
