package au.com.woolworths.foundation.shop.chatbot.session;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/chatbot/session/ChatbotSessionSerializer;", "Landroidx/datastore/core/Serializer;", "Lau/com/woolworths/foundation/shop/chatbot/session/ChatbotSession;", "chatbot-session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChatbotSessionSerializer implements Serializer<ChatbotSession> {

    /* renamed from: a, reason: collision with root package name */
    public static final ChatbotSessionSerializer f8703a = new ChatbotSessionSerializer();

    static {
        ChatbotSession.INSTANCE.getClass();
    }

    @Override // androidx.datastore.core.Serializer
    public final /* bridge */ /* synthetic */ Object getDefaultValue() {
        return ChatbotSession.b;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            return (ChatbotSession) Json.d.b(ChatbotSession.INSTANCE.serializer(), StringsKt.r(ByteStreamsKt.b(inputStream)));
        } catch (SerializationException e) {
            throw new CorruptionException("Unable to read ChatbotSession", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        outputStream.write(StringsKt.u(Json.d.c(ChatbotSession.INSTANCE.serializer(), (ChatbotSession) obj)));
        return Unit.f24250a;
    }
}
