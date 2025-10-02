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

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/shop/chatbot/session/ChatbotSession;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAccountInteractor$clearChatbotSessionData$2", f = "ShopAccountInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShopAccountInteractor$clearChatbotSessionData$2 extends SuspendLambda implements Function2<ChatbotSession, Continuation<? super ChatbotSession>, Object> {
    public ShopAccountInteractor$clearChatbotSessionData$2() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopAccountInteractor$clearChatbotSessionData$2(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((ShopAccountInteractor$clearChatbotSessionData$2) create((ChatbotSession) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return ChatbotSession.b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ChatbotSession.INSTANCE.getClass();
        return ChatbotSession.b;
    }
}
