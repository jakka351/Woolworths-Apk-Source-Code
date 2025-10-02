package au.com.woolworths.feature.shop.ask.olive.ui.repository;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.feature.shop.ask.olive.ChatbotFeedQuery;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$More;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository$fetchChatbotFeed$2$1", f = "AskOliveRepository.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AskOliveRepository$fetchChatbotFeed$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChatbotFeedQuery.More>, Object> {
    public int p;
    public final /* synthetic */ AskOliveRepository q;
    public final /* synthetic */ String r;
    public final /* synthetic */ ShoppingModeType s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskOliveRepository$fetchChatbotFeed$2$1(AskOliveRepository askOliveRepository, String str, ShoppingModeType shoppingModeType, Continuation continuation) {
        super(2, continuation);
        this.q = askOliveRepository;
        this.r = str;
        this.s = shoppingModeType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskOliveRepository$fetchChatbotFeed$2$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AskOliveRepository$fetchChatbotFeed$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f6636a;
            ChatbotFeedQuery chatbotFeedQuery = new ChatbotFeedQuery(Optional.Companion.a(this.r), this.s);
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, chatbotFeedQuery);
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
        return ((ChatbotFeedQuery.Data) ExceptionExtKt.k((ApolloResponse) obj)).f6603a;
    }
}
