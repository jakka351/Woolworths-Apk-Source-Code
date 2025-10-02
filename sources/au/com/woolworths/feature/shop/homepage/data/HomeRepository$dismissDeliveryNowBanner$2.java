package au.com.woolworths.feature.shop.homepage.data;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.shop.homepage.DismissBottomSheetMutation;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/woolworths/shop/homepage/DismissBottomSheetMutation$Data;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.data.HomeRepository$dismissDeliveryNowBanner$2", f = "HomeRepository.kt", l = {125}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class HomeRepository$dismissDeliveryNowBanner$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DismissBottomSheetMutation.Data>, Object> {
    public int p;
    public final /* synthetic */ HomeRepository q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepository$dismissDeliveryNowBanner$2(HomeRepository homeRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = homeRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeRepository$dismissDeliveryNowBanner$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeRepository$dismissDeliveryNowBanner$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                HomeRepository homeRepository = this.q;
                String str = this.r;
                ApolloClient apolloClient = homeRepository.f7197a;
                DismissBottomSheetMutation dismissBottomSheetMutation = new DismissBottomSheetMutation(str);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, dismissBottomSheetMutation);
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
            return (DismissBottomSheetMutation.Data) ExceptionExtKt.k((ApolloResponse) obj);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
