package me.oriient.internal.services.dataModel.engine;

import java.util.List;
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
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class OnDeviceEngineCoreConfigProvider$$serializer implements GeneratedSerializer<OnDeviceEngineCoreConfigProvider> {

    @NotNull
    public static final OnDeviceEngineCoreConfigProvider$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OnDeviceEngineCoreConfigProvider$$serializer onDeviceEngineCoreConfigProvider$$serializer = new OnDeviceEngineCoreConfigProvider$$serializer();
        INSTANCE = onDeviceEngineCoreConfigProvider$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfigProvider", onDeviceEngineCoreConfigProvider$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("coreConfig", false);
        pluginGeneratedSerialDescriptor.k("coreConfigPerBuilding", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnDeviceEngineCoreConfigProvider$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{OnDeviceEngineCoreConfig$$serializer.INSTANCE, OnDeviceEngineCoreConfigProvider.$childSerializers[1]};
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* renamed from: getDescriptor */
    public SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public OnDeviceEngineCoreConfigProvider deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getB();
        CompositeDecoder compositeDecoderB = decoder.b(descriptor2);
        KSerializer[] kSerializerArr = OnDeviceEngineCoreConfigProvider.$childSerializers;
        SerializationConstructorMarker serializationConstructorMarker = null;
        boolean z = true;
        int i = 0;
        OnDeviceEngineCoreConfig onDeviceEngineCoreConfig = null;
        List list = null;
        while (z) {
            int iU = compositeDecoderB.u(descriptor2);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                onDeviceEngineCoreConfig = (OnDeviceEngineCoreConfig) compositeDecoderB.o(descriptor2, 0, OnDeviceEngineCoreConfig$$serializer.INSTANCE, onDeviceEngineCoreConfig);
                i |= 1;
            } else {
                if (iU != 1) {
                    throw new UnknownFieldException(iU);
                }
                list = (List) compositeDecoderB.o(descriptor2, 1, kSerializerArr[1], list);
                i |= 2;
            }
        }
        compositeDecoderB.c(descriptor2);
        return new OnDeviceEngineCoreConfigProvider(i, onDeviceEngineCoreConfig, list, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull OnDeviceEngineCoreConfigProvider value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor descriptor2 = getB();
        CompositeEncoder compositeEncoderB = encoder.b(descriptor2);
        OnDeviceEngineCoreConfigProvider.write$Self$internal_publishRelease(value, compositeEncoderB, descriptor2);
        compositeEncoderB.c(descriptor2);
    }
}
