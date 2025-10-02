package au.com.woolworths.feature.rewards.account.closeaccount;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.account.DeleteAccountPageQuery;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/account/closeaccount/model/DeleteAccount;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountRepository$fetchConsentPage$2", f = "CloseAccountRepository.kt", l = {54}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CloseAccountRepository$fetchConsentPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DeleteAccount>, Object> {
    public int p;
    public final /* synthetic */ CloseAccountRepository q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseAccountRepository$fetchConsentPage$2(CloseAccountRepository closeAccountRepository, Continuation continuation) {
        super(2, continuation);
        this.q = closeAccountRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CloseAccountRepository$fetchConsentPage$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CloseAccountRepository$fetchConsentPage$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ApolloClient apolloClient = this.q.f5688a;
                DeleteAccountPageQuery deleteAccountPageQuery = new DeleteAccountPageQuery();
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, deleteAccountPageQuery);
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
            DeleteAccountPageQuery.DeleteAccountPage deleteAccountPage = ((DeleteAccountPageQuery.Data) ExceptionExtKt.k(apolloResponse)).f20538a;
            DeleteAccount deleteAccountA = deleteAccountPage != null ? DeleteAccountPageQueryDeleteAccountPageExtKt.a(deleteAccountPage) : null;
            if (deleteAccountA != null) {
                return deleteAccountA;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
