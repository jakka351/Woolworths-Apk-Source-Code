package au.com.woolworths.foundation.shop.chatbot.session;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/shop/chatbot/session/ChatbotSession;", "", "Companion", "$serializer", "chatbot-session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class ChatbotSession {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final ChatbotSession b = new ChatbotSession(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f8700a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/chatbot/session/ChatbotSession$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/shop/chatbot/session/ChatbotSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chatbot-session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ChatbotSession> serializer() {
            return ChatbotSession$$serializer.f8701a;
        }
    }

    public /* synthetic */ ChatbotSession(int i, String str) {
        if (1 == (i & 1)) {
            this.f8700a = str;
        } else {
            PluginExceptionsKt.a(i, 1, ChatbotSession$$serializer.f8701a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatbotSession) && Intrinsics.c(this.f8700a, ((ChatbotSession) obj).f8700a);
    }

    public final int hashCode() {
        String str = this.f8700a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.h("ChatbotSession(sessionId=", this.f8700a, ")");
    }

    public ChatbotSession(String str) {
        this.f8700a = str;
    }
}
