package au.com.woolworths.feature.rewards.account.closeaccount;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccountConfirmation;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.account.DeleteAccountMutation;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/account/closeaccount/model/DeleteAccountConfirmation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountRepository$closeAccount$2", f = "CloseAccountRepository.kt", l = {65}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CloseAccountRepository$closeAccount$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DeleteAccountConfirmation>, Object> {
    public int p;
    public final /* synthetic */ CloseAccountRepository q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseAccountRepository$closeAccount$2(CloseAccountRepository closeAccountRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = closeAccountRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CloseAccountRepository$closeAccount$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CloseAccountRepository$closeAccount$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CloseAccountRepository closeAccountRepository = this.q;
                String str = this.r;
                ApolloClient apolloClient = closeAccountRepository.f5688a;
                DeleteAccountMutation deleteAccountMutation = new DeleteAccountMutation(str);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, deleteAccountMutation);
                this.p = 1;
                obj = apolloCall.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ApolloResponse apolloResponse = (ApolloResponse) obj;
            DeleteAccountMutation.DeleteAccount deleteAccount = ((DeleteAccountMutation.Data) ExceptionExtKt.k(apolloResponse)).f20535a;
            DeleteAccountConfirmation deleteAccountConfirmationA = deleteAccount != null ? DeleteAccountMutationDeleteAccountExtKt.a(deleteAccount) : null;
            if (deleteAccountConfirmationA != null) {
                return deleteAccountConfirmationA;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
