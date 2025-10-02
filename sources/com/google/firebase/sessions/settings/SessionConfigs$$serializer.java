package com.google.firebase.sessions.settings;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/firebase/sessions/settings/SessionConfigs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes.dex */
public /* synthetic */ class SessionConfigs$$serializer implements GeneratedSerializer<SessionConfigs> {

    /* renamed from: a, reason: collision with root package name */
    public static final SessionConfigs$$serializer f15844a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SessionConfigs$$serializer sessionConfigs$$serializer = new SessionConfigs$$serializer();
        f15844a = sessionConfigs$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.settings.SessionConfigs", sessionConfigs$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("sessionsEnabled", false);
        pluginGeneratedSerialDescriptor.k("sessionSamplingRate", false);
        pluginGeneratedSerialDescriptor.k("sessionTimeoutSeconds", false);
        pluginGeneratedSerialDescriptor.k("cacheDurationSeconds", false);
        pluginGeneratedSerialDescriptor.k("cacheUpdatedTimeSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerD = BuiltinSerializersKt.d(BooleanSerializer.f24779a);
        KSerializer kSerializerD2 = BuiltinSerializersKt.d(DoubleSerializer.f24792a);
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{kSerializerD, kSerializerD2, BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(LongSerializer.f24804a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                bool = (Boolean) compositeDecoderB.k(serialDescriptor, 0, BooleanSerializer.f24779a, bool);
                i |= 1;
            } else if (iU == 1) {
                d = (Double) compositeDecoderB.k(serialDescriptor, 1, DoubleSerializer.f24792a, d);
                i |= 2;
            } else if (iU == 2) {
                num = (Integer) compositeDecoderB.k(serialDescriptor, 2, IntSerializer.f24800a, num);
                i |= 4;
            } else if (iU == 3) {
                num2 = (Integer) compositeDecoderB.k(serialDescriptor, 3, IntSerializer.f24800a, num2);
                i |= 8;
            } else {
                if (iU != 4) {
                    throw new UnknownFieldException(iU);
                }
                l = (Long) compositeDecoderB.k(serialDescriptor, 4, LongSerializer.f24804a, l);
                i |= 16;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new SessionConfigs(i, bool, d, num, num2, l);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SessionConfigs value = (SessionConfigs) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        compositeEncoderB.w(serialDescriptor, 0, BooleanSerializer.f24779a, value.f15843a);
        compositeEncoderB.w(serialDescriptor, 1, DoubleSerializer.f24792a, value.b);
        IntSerializer intSerializer = IntSerializer.f24800a;
        compositeEncoderB.w(serialDescriptor, 2, intSerializer, value.c);
        compositeEncoderB.w(serialDescriptor, 3, intSerializer, value.d);
        compositeEncoderB.w(serialDescriptor, 4, LongSerializer.f24804a, value.e);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
