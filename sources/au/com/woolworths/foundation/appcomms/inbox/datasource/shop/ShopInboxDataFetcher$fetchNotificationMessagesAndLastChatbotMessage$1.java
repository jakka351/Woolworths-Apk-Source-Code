package au.com.woolworths.foundation.appcomms.inbox.datasource.shop;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher", f = "ShopInboxDataFetcher.kt", l = {41}, m = "fetchNotificationMessagesAndLastChatbotMessage")
/* loaded from: classes4.dex */
final class ShopInboxDataFetcher$fetchNotificationMessagesAndLastChatbotMessage$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShopInboxDataFetcher q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopInboxDataFetcher$fetchNotificationMessagesAndLastChatbotMessage$1(ShopInboxDataFetcher shopInboxDataFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shopInboxDataFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, this);
    }
}
