package au.com.woolworths.foundation.appcomms.inbox.datasource.shop;

import au.com.woolworths.foundation.appcomms.inbox.datasource.common.InboxDataFetcher;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/ShopInboxDataFetcher;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/common/InboxDataFetcher;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopInboxDataFetcher implements InboxDataFetcher {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f8456a;

    public ShopInboxDataFetcher(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f8456a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchLastChatbotMessage$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchLastChatbotMessage$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchLastChatbotMessage$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchLastChatbotMessage$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchLastChatbotMessage$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.LastChatbotMessageQuery r6 = new au.com.woolworths.foundation.appcomms.inbox.datasource.shop.LastChatbotMessageQuery
            com.apollographql.apollo.api.Optional r5 = com.apollographql.apollo.api.Optional.Companion.a(r5)
            r6.<init>(r5)
            com.apollographql.apollo.ApolloClient r5 = r4.f8456a
            r5.getClass()
            com.apollographql.apollo.ApolloCall r2 = new com.apollographql.apollo.ApolloCall
            r2.<init>(r5, r6)
            r0.r = r3
            java.lang.Object r6 = r2.b(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6
            com.apollographql.apollo.api.Operation$Data r5 = r6.a()
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.LastChatbotMessageQuery$Data r5 = (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.LastChatbotMessageQuery.Data) r5
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.LastChatbotMessageQuery$LastChatbotMsg r5 = r5.f8448a
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage r5 = r5.b
            au.com.woolworths.foundation.appcomms.inbox.datasource.common.LastChatbotMessageRemote r6 = new au.com.woolworths.foundation.appcomms.inbox.datasource.common.LastChatbotMessageRemote
            java.lang.String r0 = r5.f8464a
            java.lang.String r1 = r5.b
            java.lang.String r2 = r5.c
            int r5 = r5.d
            r6.<init>(r5, r0, r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable b(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessages$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessages$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessages$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessages$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessages$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesQuery r6 = new au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesQuery
            r6.<init>()
            com.apollographql.apollo.ApolloClient r2 = r5.f8456a
            r2.getClass()
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall
            r4.<init>(r2, r6)
            r0.r = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6
            com.apollographql.apollo.api.Operation$Data r6 = r6.a()
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesQuery$Data r6 = (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesQuery.Data) r6
            java.util.ArrayList r6 = r6.f8454a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.s(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L63:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r6.next()
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesQuery$NotificationMessage r1 = (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesQuery.NotificationMessage) r1
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage r1 = r1.b
            au.com.woolworths.foundation.appcomms.inbox.datasource.common.NotificationMessageRemote r1 = au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessageRemoteMapperKt.a(r1)
            r0.add(r1)
            goto L63
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable c(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessagesAndLastChatbotMessage$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessagesAndLastChatbotMessage$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessagesAndLastChatbotMessage$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessagesAndLastChatbotMessage$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher$fetchNotificationMessagesAndLastChatbotMessage$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesAndLastChatbotMessageQuery r6 = new au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesAndLastChatbotMessageQuery
            com.apollographql.apollo.api.Optional r5 = com.apollographql.apollo.api.Optional.Companion.a(r5)
            r6.<init>(r5)
            com.apollographql.apollo.ApolloClient r5 = r4.f8456a
            r5.getClass()
            com.apollographql.apollo.ApolloCall r2 = new com.apollographql.apollo.ApolloCall
            r2.<init>(r5, r6)
            r0.r = r3
            java.lang.Object r6 = r2.b(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6
            com.apollographql.apollo.api.Operation$Data r5 = r6.a()
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesAndLastChatbotMessageQuery$Data r5 = (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesAndLastChatbotMessageQuery.Data) r5
            java.util.ArrayList r6 = r5.f8451a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.s(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r6.next()
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesAndLastChatbotMessageQuery$NotificationMessage r1 = (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesAndLastChatbotMessageQuery.NotificationMessage) r1
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage r1 = r1.b
            au.com.woolworths.foundation.appcomms.inbox.datasource.common.NotificationMessageRemote r1 = au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessageRemoteMapperKt.a(r1)
            r0.add(r1)
            goto L67
        L7d:
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesAndLastChatbotMessageQuery$LastChatbotMsg r5 = r5.b
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage r5 = r5.b
            au.com.woolworths.foundation.appcomms.inbox.datasource.common.LastChatbotMessageRemote r6 = new au.com.woolworths.foundation.appcomms.inbox.datasource.common.LastChatbotMessageRemote
            java.lang.String r1 = r5.f8464a
            java.lang.String r2 = r5.b
            java.lang.String r3 = r5.c
            int r5 = r5.d
            r6.<init>(r5, r1, r2, r3)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
