package com.google.firebase.sessions;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/firebase/sessions/SessionData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/google/firebase/sessions/SessionData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes.dex */
public /* synthetic */ class SessionData$$serializer implements GeneratedSerializer<SessionData> {

    /* renamed from: a, reason: collision with root package name */
    public static final SessionData$$serializer f15812a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        f15812a = sessionData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.SessionData", sessionData$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("sessionDetails", false);
        pluginGeneratedSerialDescriptor.k("backgroundTime", true);
        pluginGeneratedSerialDescriptor.k("processDataMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SessionDetails$$serializer.f15816a, BuiltinSerializersKt.d(Time$$serializer.f15828a), BuiltinSerializersKt.d(SessionData.d[2])};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = SessionData.d;
        SessionDetails sessionDetails = null;
        boolean z = true;
        int i = 0;
        Time time = null;
        Map map = null;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                sessionDetails = (SessionDetails) compositeDecoderB.o(serialDescriptor, 0, SessionDetails$$serializer.f15816a, sessionDetails);
                i |= 1;
            } else if (iU == 1) {
                time = (Time) compositeDecoderB.k(serialDescriptor, 1, Time$$serializer.f15828a, time);
                i |= 2;
            } else {
                if (iU != 2) {
                    throw new UnknownFieldException(iU);
                }
                map = (Map) compositeDecoderB.k(serialDescriptor, 2, kSerializerArr[2], map);
                i |= 4;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new SessionData(i, sessionDetails, time, map);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SessionData value = (SessionData) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = SessionData.d;
        SessionDetails$$serializer sessionDetails$$serializer = SessionDetails$$serializer.f15816a;
        SessionDetails sessionDetails = value.f15811a;
        Map map = value.c;
        Time time = value.b;
        compositeEncoderB.F(serialDescriptor, 0, sessionDetails$$serializer, sessionDetails);
        if (compositeEncoderB.q(serialDescriptor, 1) || time != null) {
            compositeEncoderB.w(serialDescriptor, 1, Time$$serializer.f15828a, time);
        }
        if (compositeEncoderB.q(serialDescriptor, 2) || map != null) {
            compositeEncoderB.w(serialDescriptor, 2, kSerializerArr[2], map);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
