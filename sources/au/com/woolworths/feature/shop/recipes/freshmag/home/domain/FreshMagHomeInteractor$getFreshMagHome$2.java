package au.com.woolworths.feature.shop.recipes.freshmag.home.domain;

import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeRepositoryImpl;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/data/FreshMagHomeData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeInteractor$getFreshMagHome$2", f = "FreshMagHomeInteractor.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FreshMagHomeInteractor$getFreshMagHome$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FreshMagHomeData>, Object> {
    public int p;
    public final /* synthetic */ FreshMagHomeInteractor q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshMagHomeInteractor$getFreshMagHome$2(FreshMagHomeInteractor freshMagHomeInteractor, Continuation continuation) {
        super(2, continuation);
        this.q = freshMagHomeInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshMagHomeInteractor$getFreshMagHome$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshMagHomeInteractor$getFreshMagHome$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FreshMagHomeRepositoryImpl freshMagHomeRepositoryImpl = this.q.f8055a;
            this.p = 1;
            obj = freshMagHomeRepositoryImpl.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        FreshMagHomeData freshMagHomeData = (FreshMagHomeData) obj;
        if (freshMagHomeData.f8052a.isEmpty()) {
            throw FreshMagHomeInteractor.NoContentException.d;
        }
        return freshMagHomeData;
    }
}
