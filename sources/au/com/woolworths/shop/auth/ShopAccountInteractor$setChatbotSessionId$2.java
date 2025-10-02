package au.com.woolworths.shop.auth;

import au.com.woolworths.foundation.shop.chatbot.session.ChatbotSession;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/shop/chatbot/session/ChatbotSession;", "chatbotSession"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAccountInteractor$setChatbotSessionId$2", f = "ShopAccountInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShopAccountInteractor$setChatbotSessionId$2 extends SuspendLambda implements Function2<ChatbotSession, Continuation<? super ChatbotSession>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAccountInteractor$setChatbotSessionId$2(String str, Continuation continuation) {
        super(2, continuation);
        this.q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShopAccountInteractor$setChatbotSessionId$2 shopAccountInteractor$setChatbotSessionId$2 = new ShopAccountInteractor$setChatbotSessionId$2(this.q, continuation);
        shopAccountInteractor$setChatbotSessionId$2.p = obj;
        return shopAccountInteractor$setChatbotSessionId$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopAccountInteractor$setChatbotSessionId$2) create((ChatbotSession) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ((ChatbotSession) this.p).getClass();
        return new ChatbotSession(this.q);
    }
}
