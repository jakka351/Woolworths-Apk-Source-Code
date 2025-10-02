package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.SecureRewardsDollars;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsViewModel$secureRewardsDollars$1", f = "SecureDollarsViewModel.kt", l = {75}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class SecureDollarsViewModel$secureRewardsDollars$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SecureDollarsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureDollarsViewModel$secureRewardsDollars$1(SecureDollarsViewModel secureDollarsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = secureDollarsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SecureDollarsViewModel$secureRewardsDollars$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SecureDollarsViewModel$secureRewardsDollars$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        SecureDollarsViewModel secureDollarsViewModel = this.q;
        MutableStateFlow mutableStateFlow = secureDollarsViewModel.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                SecureDollarsViewModel.p6(secureDollarsViewModel, SecureDollarsContract.Content.Loading.f6443a);
                SecureDollarsInteractor secureDollarsInteractor = secureDollarsViewModel.e;
                String str = ((SecureDollarsContract.ViewState) mutableStateFlow.getValue()).b;
                this.p = 1;
                obj = secureDollarsInteractor.f6447a.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            SecureRewardsDollars secureRewardsDollars = (SecureRewardsDollars) obj;
            boolean z = secureRewardsDollars.f6471a;
            String str2 = secureRewardsDollars.b;
            if (z) {
                mutableStateFlow.setValue(SecureDollarsContract.ViewState.a((SecureDollarsContract.ViewState) mutableStateFlow.getValue(), null, null, null, new SecureDollarsContract.ViewAction.Success(str2), 111));
            } else {
                SecureDollarsViewModel.p6(secureDollarsViewModel, new SecureDollarsContract.Content.Error(str2));
            }
        } catch (NoConnectivityException unused) {
            SecureDollarsViewModel.p6(secureDollarsViewModel, new SecureDollarsContract.Content.Error(null));
        } catch (ServerErrorException unused2) {
            SecureDollarsViewModel.p6(secureDollarsViewModel, new SecureDollarsContract.Content.Error(null));
        }
        return Unit.f24250a;
    }
}
