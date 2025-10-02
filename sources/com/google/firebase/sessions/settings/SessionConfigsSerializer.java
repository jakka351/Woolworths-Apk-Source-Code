package com.google.firebase.sessions.settings;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigsSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SessionConfigsSerializer implements Serializer<SessionConfigs> {

    /* renamed from: a, reason: collision with root package name */
    public static final SessionConfigsSerializer f15845a = new SessionConfigsSerializer();
    public static final SessionConfigs b = new SessionConfigs(null, null, null, null, null);

    @Override // androidx.datastore.core.Serializer
    public final /* bridge */ /* synthetic */ Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            Json.Default r3 = Json.d;
            String strR = StringsKt.r(ByteStreamsKt.b(inputStream));
            r3.getClass();
            return (SessionConfigs) r3.b(SessionConfigs.INSTANCE.serializer(), strR);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session configs", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        outputStream.write(StringsKt.u(Json.d.c(SessionConfigs.INSTANCE.serializer(), (SessionConfigs) obj)));
        return Unit.f24250a;
    }
}
