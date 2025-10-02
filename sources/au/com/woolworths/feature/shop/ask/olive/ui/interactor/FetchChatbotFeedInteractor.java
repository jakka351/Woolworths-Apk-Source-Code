package au.com.woolworths.feature.shop.ask.olive.ui.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/interactor/FetchChatbotFeedInteractor;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FetchChatbotFeedInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CollectionModeInteractor f6624a;
    public final AskOliveRepository b;

    public FetchChatbotFeedInteractor(CollectionModeInteractor collectionModeInteractor, AskOliveRepository askOliveRepository) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f6624a = collectionModeInteractor;
        this.b = askOliveRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor$fetchChatbotFeed$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor$fetchChatbotFeed$1 r0 = (au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor$fetchChatbotFeed$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor$fetchChatbotFeed$1 r0 = new au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor$fetchChatbotFeed$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r5 = r4.f6624a
            java.lang.String r2 = r5.a()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r5 = r5.w()
            au.com.woolworths.shop.graphql.type.ShoppingModeType r5 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r5)
            r0.r = r3
            au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository r3 = r4.b
            java.lang.Object r5 = r3.a(r2, r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            au.com.woolworths.feature.shop.ask.olive.ChatbotFeedQuery$More r5 = (au.com.woolworths.feature.shop.ask.olive.ChatbotFeedQuery.More) r5
            java.util.ArrayList r5 = r5.f6605a
            java.lang.Object r5 = kotlin.collections.CollectionsKt.D(r5)
            au.com.woolworths.feature.shop.ask.olive.ChatbotFeedQuery$Feed r5 = (au.com.woolworths.feature.shop.ask.olive.ChatbotFeedQuery.Feed) r5
            au.com.woolworths.feature.shop.ask.olive.ChatbotFeedQuery$OnMoreChat r5 = r5.b
            au.com.woolworths.feature.shop.ask.olive.ui.model.ChatFeed r0 = new au.com.woolworths.feature.shop.ask.olive.ui.model.ChatFeed
            r1 = 0
            if (r5 == 0) goto L5f
            java.lang.String r2 = r5.c
            goto L60
        L5f:
            r2 = r1
        L60:
            if (r5 == 0) goto L64
            java.lang.String r1 = r5.f6606a
        L64:
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
