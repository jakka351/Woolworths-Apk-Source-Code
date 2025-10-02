package me.oriient.internal.services.eventManager.model;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.serializerJson.Jsonable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0005B#\b\u0017\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\tJ\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0012HÖ\u0001¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004HÖ\u0001J\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0012HÖ\u0001¢\u0006\u0002\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000b8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00078BXÂ\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u00078BXÂ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"me/oriient/internal/services/eventManager/model/EventPayload.$serializer", "Data", "Parameters", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/eventManager/model/EventPayload;", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "typeSerial1", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getTypeSerial0", "()Lkotlinx/serialization/KSerializer;", "getTypeSerial1", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class EventPayload$$serializer<Data, Parameters> implements GeneratedSerializer<EventPayload<Data, Parameters>> {
    private final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;
    private final /* synthetic */ KSerializer<?> typeSerial0;
    private final /* synthetic */ KSerializer<?> typeSerial1;

    private EventPayload$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.eventManager.model.EventPayload", this, 2);
        pluginGeneratedSerialDescriptor.k("data", false);
        pluginGeneratedSerialDescriptor.k("parameters", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    private final KSerializer<Data> getTypeSerial0() {
        return (KSerializer<Data>) this.typeSerial0;
    }

    private final KSerializer<Parameters> getTypeSerial1() {
        return (KSerializer<Parameters>) this.typeSerial1;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{this.typeSerial0, this.typeSerial1};
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* renamed from: getDescriptor */
    public SerialDescriptor getB() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0, this.typeSerial1};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ EventPayload$$serializer(KSerializer typeSerial0, KSerializer typeSerial1) {
        this();
        Intrinsics.h(typeSerial0, "typeSerial0");
        Intrinsics.h(typeSerial1, "typeSerial1");
        this.typeSerial0 = typeSerial0;
        this.typeSerial1 = typeSerial1;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public EventPayload<Data, Parameters> deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        SerializationConstructorMarker serializationConstructorMarker = null;
        boolean z = true;
        int i = 0;
        Jsonable jsonable = null;
        Jsonable jsonable2 = null;
        while (z) {
            int iU = compositeDecoderB.u(b);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                jsonable = (Jsonable) compositeDecoderB.o(b, 0, this.typeSerial0, jsonable);
                i |= 1;
            } else {
                if (iU != 1) {
                    throw new UnknownFieldException(iU);
                }
                jsonable2 = (Jsonable) compositeDecoderB.o(b, 1, this.typeSerial1, jsonable2);
                i |= 2;
            }
        }
        compositeDecoderB.c(b);
        return new EventPayload<>(i, jsonable, jsonable2, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull EventPayload<Data, Parameters> value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        EventPayload.write$Self$internal_publishRelease(value, compositeEncoderB, b, this.typeSerial0, this.typeSerial1);
        compositeEncoderB.c(b);
    }
}
