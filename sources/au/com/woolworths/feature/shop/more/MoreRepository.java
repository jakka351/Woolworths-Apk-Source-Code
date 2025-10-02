package au.com.woolworths.feature.shop.more;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.shop.chatbot.session.ChatbotSessionDataStoreKt;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreRepository;", "", "Companion", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MoreRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7605a;
    public final FeatureToggleManager b;
    public final Context c;
    public final DataStore d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreRepository$Companion;", "", "", "HEADER_APP_CONFIG", "Ljava/lang/String;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public MoreRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager, Context context) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(context, "context");
        this.f7605a = apolloClient;
        this.b = featureToggleManager;
        this.c = context;
        KProperty[] kPropertyArr = ChatbotSessionDataStoreKt.f8702a;
        this.d = (DataStore) ChatbotSessionDataStoreKt.b.getValue(context, ChatbotSessionDataStoreKt.f8702a[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.shop.graphql.type.ShoppingModeType r8, java.lang.String r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.String r0 = ";"
            boolean r1 = r11 instanceof au.com.woolworths.feature.shop.more.MoreRepository$fetchMoreFeed$1
            if (r1 == 0) goto L15
            r1 = r11
            au.com.woolworths.feature.shop.more.MoreRepository$fetchMoreFeed$1 r1 = (au.com.woolworths.feature.shop.more.MoreRepository$fetchMoreFeed$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.more.MoreRepository$fetchMoreFeed$1 r1 = new au.com.woolworths.feature.shop.more.MoreRepository$fetchMoreFeed$1
            r1.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L94
        L29:
            r8 = move-exception
            goto La3
        L2b:
            r8 = move-exception
            goto La8
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r11)
            com.apollographql.apollo.ApolloClient r11 = r7.f7605a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.feature.shop.more.MoreFeedQuery r3 = new au.com.woolworths.feature.shop.more.MoreFeedQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r5 = r7.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.base.shopapp.BaseShopAppFeature r6 = au.com.woolworths.base.shopapp.BaseShopAppFeature.Y     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r5 = r5.c(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r3.<init>(r9, r8, r10, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r11.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r11, r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.String r9 = "x-app-config"
            android.content.Context r10 = r7.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.String r10 = au.com.woolworths.android.onesite.extensions.ContextExtKt.c(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.shop.graphql.type.AppOS$Companion r11 = au.com.woolworths.shop.graphql.type.AppOS.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.String r11 = "ANDROID"
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.String r11 = r11.toLowerCase(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.String r3 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.g(r11, r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.<init>()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.append(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.append(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.append(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.append(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.append(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.String r10 = r5.toString()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.a(r9, r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r11 = r8.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r11 != r2) goto L94
            return r2
        L94:
            com.apollographql.apollo.api.ApolloResponse r11 = (com.apollographql.apollo.api.ApolloResponse) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Operation$Data r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.feature.shop.more.MoreFeedQuery$Data r8 = (au.com.woolworths.feature.shop.more.MoreFeedQuery.Data) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.feature.shop.more.MoreFeedQuery$More r8 = r8.f7584a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.feature.shop.more.data.MoreFeed r8 = au.com.woolworths.feature.shop.more.data.MoreFeedQueryMoreExtKt.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            return r8
        La3:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        La8:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.more.MoreRepository.a(au.com.woolworths.shop.graphql.type.ShoppingModeType, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.more.MoreRepository$getChatbotSessionId$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.more.MoreRepository$getChatbotSessionId$1 r0 = (au.com.woolworths.feature.shop.more.MoreRepository$getChatbotSessionId$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.more.MoreRepository$getChatbotSessionId$1 r0 = new au.com.woolworths.feature.shop.more.MoreRepository$getChatbotSessionId$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            androidx.datastore.core.DataStore r5 = r4.d
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.r = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.w(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            au.com.woolworths.foundation.shop.chatbot.session.ChatbotSession r5 = (au.com.woolworths.foundation.shop.chatbot.session.ChatbotSession) r5
            java.lang.String r5 = r5.f8700a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.more.MoreRepository.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
