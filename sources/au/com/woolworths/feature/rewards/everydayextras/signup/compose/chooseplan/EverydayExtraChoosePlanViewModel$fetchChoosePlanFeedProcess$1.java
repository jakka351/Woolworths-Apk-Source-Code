package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.everydayextras.signup.common.SubscribePlanExtensionsKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel$fetchChoosePlanFeedProcess$1", f = "EverydayExtraChoosePlanViewModel.kt", l = {75}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EverydayExtraChoosePlanViewModel$fetchChoosePlanFeedProcess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraChoosePlanViewModel q;
    public final /* synthetic */ SuspendLambda r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EverydayExtraChoosePlanViewModel$fetchChoosePlanFeedProcess$1(EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraChoosePlanViewModel;
        this.r = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraChoosePlanViewModel$fetchChoosePlanFeedProcess$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraChoosePlanViewModel$fetchChoosePlanFeedProcess$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeedR6;
        RewardsServiceMessage rewardsServiceMessage;
        Object next;
        EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel = this.q;
        MutableStateFlow mutableStateFlow = everydayExtraChoosePlanViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
        } catch (NoConnectivityException unused) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, new EverydayExtraChoosePlanContract.ViewState.Error(FullPageError.ConnectionError.f8581a)));
        } catch (ServerErrorException unused2) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new EverydayExtraChoosePlanContract.ViewState.Error(FullPageError.ServerError.f8582a)));
        }
        if (i == 0) {
            ResultKt.b(obj);
            RewardsServiceMessage rewardsServiceMessage2 = everydayExtraChoosePlanViewModel.l;
            if (rewardsServiceMessage2 == null || !RewardsServiceMessageKt.a(rewardsServiceMessage2)) {
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, EverydayExtraChoosePlanContract.ViewState.Loading.f6070a));
                ?? r12 = this.r;
                this.p = 1;
                obj = r12.invoke(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        everydayExtraChoosePlanViewModel.k = (EverydayExtrasChoosePlanFeed) obj;
        EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed = (EverydayExtrasChoosePlanFeed) obj;
        do {
            value4 = mutableStateFlow.getValue();
            EverydayExtraChoosePlanContract.ViewState.Content contentB = ((EverydayExtraChoosePlanContract.ViewState) mutableStateFlow.getValue()).b();
            everydayExtrasChoosePlanFeedR6 = EverydayExtraChoosePlanViewModel.r6(contentB != null ? contentB.d : null, everydayExtrasChoosePlanFeed);
            rewardsServiceMessage = everydayExtraChoosePlanViewModel.l;
            Iterator it = everydayExtrasChoosePlanFeed.b.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                EverydayExtrasChoosePlanContentItem everydayExtrasChoosePlanContentItem = (EverydayExtrasChoosePlanContentItem) next;
                if ((everydayExtrasChoosePlanContentItem instanceof EverydayExtrasChoosePlanContentItem.SubscribePlan) && !SubscribePlanExtensionsKt.a(((EverydayExtrasChoosePlanContentItem.SubscribePlan) everydayExtrasChoosePlanContentItem).g)) {
                    break;
                }
            }
        } while (!mutableStateFlow.d(value4, new EverydayExtraChoosePlanContract.ViewState.Content(everydayExtrasChoosePlanFeedR6, next != null, rewardsServiceMessage, null)));
        return Unit.f24250a;
    }
}
