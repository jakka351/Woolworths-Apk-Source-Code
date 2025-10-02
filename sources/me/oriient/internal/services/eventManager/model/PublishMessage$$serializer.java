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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0005B#\b\u0017\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\tJ\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0012HÖ\u0001¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004HÖ\u0001J\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0012HÖ\u0001¢\u0006\u0002\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000b8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00078BXÂ\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u00078BXÂ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"me/oriient/internal/services/eventManager/model/PublishMessage.$serializer", "Data", "Parameters", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/eventManager/model/PublishMessage;", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "typeSerial1", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getTypeSerial0", "()Lkotlinx/serialization/KSerializer;", "getTypeSerial1", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class PublishMessage$$serializer<Data, Parameters> implements GeneratedSerializer<PublishMessage<Data, Parameters>> {
    private final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;
    private final /* synthetic */ KSerializer<?> typeSerial0;
    private final /* synthetic */ KSerializer<?> typeSerial1;

    private PublishMessage$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.eventManager.model.PublishMessage", this, 9);
        pluginGeneratedSerialDescriptor.k("topic", false);
        pluginGeneratedSerialDescriptor.k("requestId", false);
        pluginGeneratedSerialDescriptor.k("userSessionId", false);
        pluginGeneratedSerialDescriptor.k("jwt", false);
        pluginGeneratedSerialDescriptor.k("spaceId", false);
        pluginGeneratedSerialDescriptor.k("senderId", false);
        pluginGeneratedSerialDescriptor.k("senderName", false);
        pluginGeneratedSerialDescriptor.k("payload", false);
        pluginGeneratedSerialDescriptor.k("type", true);
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
        KSerializer<?> kSerializerSerializer = EventPayload.INSTANCE.serializer(this.typeSerial0, this.typeSerial1);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerSerializer, stringSerializer};
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
    public /* synthetic */ PublishMessage$$serializer(KSerializer typeSerial0, KSerializer typeSerial1) {
        this();
        Intrinsics.h(typeSerial0, "typeSerial0");
        Intrinsics.h(typeSerial1, "typeSerial1");
        this.typeSerial0 = typeSerial0;
        this.typeSerial1 = typeSerial1;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public PublishMessage<Data, Parameters> deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor descriptor = getB();
        CompositeDecoder compositeDecoderB = decoder.b(descriptor);
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        String strJ5 = null;
        String strJ6 = null;
        String strJ7 = null;
        EventPayload eventPayload = null;
        String strJ8 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iU = compositeDecoderB.u(descriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strJ = compositeDecoderB.j(descriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strJ2 = compositeDecoderB.j(descriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strJ3 = compositeDecoderB.j(descriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strJ4 = compositeDecoderB.j(descriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strJ5 = compositeDecoderB.j(descriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strJ6 = compositeDecoderB.j(descriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strJ7 = compositeDecoderB.j(descriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    eventPayload = (EventPayload) compositeDecoderB.o(descriptor, 7, EventPayload.INSTANCE.serializer(this.typeSerial0, this.typeSerial1), eventPayload);
                    i |= 128;
                    break;
                case 8:
                    strJ8 = compositeDecoderB.j(descriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(descriptor);
        return new PublishMessage<>(i, strJ, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, eventPayload, strJ8, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PublishMessage<Data, Parameters> value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor descriptor = getB();
        CompositeEncoder compositeEncoderB = encoder.b(descriptor);
        PublishMessage.write$Self$internal_publishRelease(value, compositeEncoderB, descriptor, this.typeSerial0, this.typeSerial1);
        compositeEncoderB.c(descriptor);
    }
}
