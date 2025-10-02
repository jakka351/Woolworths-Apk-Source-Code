package au.com.woolworths.feature.shop.ask.olive.ui.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/repository/AskOliveRepository;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AskOliveRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6636a;
    public final DispatcherProvider b;

    public AskOliveRepository(DispatcherProvider dispatcherProvider, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f6636a = apolloClient;
        this.b = dispatcherProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, au.com.woolworths.shop.graphql.type.ShoppingModeType r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository$fetchChatbotFeed$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository$fetchChatbotFeed$1 r0 = (au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository$fetchChatbotFeed$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository$fetchChatbotFeed$1 r0 = new au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository$fetchChatbotFeed$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L4e
        L27:
            r6 = move-exception
            goto L51
        L29:
            r6 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r8 = r5.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            kotlinx.coroutines.scheduling.DefaultScheduler r8 = kotlinx.coroutines.Dispatchers.f24691a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            kotlinx.coroutines.scheduling.DefaultIoScheduler r8 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository$fetchChatbotFeed$2$1 r2 = new au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository$fetchChatbotFeed$2$1     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4 = 0
            r2.<init>(r5, r6, r7, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.f(r8, r2, r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 != r1) goto L4e
            return r1
        L4e:
            au.com.woolworths.feature.shop.ask.olive.ChatbotFeedQuery$More r8 = (au.com.woolworths.feature.shop.ask.olive.ChatbotFeedQuery.More) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r8
        L51:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L56:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository.a(java.lang.String, au.com.woolworths.shop.graphql.type.ShoppingModeType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
