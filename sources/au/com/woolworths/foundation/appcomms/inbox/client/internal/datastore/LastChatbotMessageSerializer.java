package au.com.woolworths.foundation.appcomms.inbox.client.internal.datastore;

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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/datastore/LastChatbotMessageSerializer;", "Landroidx/datastore/core/Serializer;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/datastore/LastChatbotMessageEntity;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LastChatbotMessageSerializer implements Serializer<LastChatbotMessageEntity> {

    /* renamed from: a, reason: collision with root package name */
    public static final LastChatbotMessageSerializer f8423a = new LastChatbotMessageSerializer();

    @Override // androidx.datastore.core.Serializer
    public final /* bridge */ /* synthetic */ Object getDefaultValue() {
        return null;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            return (LastChatbotMessageEntity) Json.d.b(LastChatbotMessageEntity.INSTANCE.serializer(), StringsKt.r(ByteStreamsKt.b(inputStream)));
        } catch (SerializationException e) {
            throw new CorruptionException("Unable to read LastChatbotMessageEntity", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        LastChatbotMessageEntity lastChatbotMessageEntity = (LastChatbotMessageEntity) obj;
        Unit unit = Unit.f24250a;
        if (lastChatbotMessageEntity == null) {
            return unit;
        }
        outputStream.write(StringsKt.u(Json.d.c(LastChatbotMessageEntity.INSTANCE.serializer(), lastChatbotMessageEntity)));
        return unit;
    }
}
