package me.oriient.internal.services.dataModel.engine;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/engine/EngineConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/engine/EngineConfigResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class EngineConfigResponse$$serializer implements GeneratedSerializer<EngineConfigResponse> {

    @NotNull
    public static final EngineConfigResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EngineConfigResponse$$serializer engineConfigResponse$$serializer = new EngineConfigResponse$$serializer();
        INSTANCE = engineConfigResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.engine.EngineConfigResponse", engineConfigResponse$$serializer, 18);
        pluginGeneratedSerialDescriptor.k("buildingIds", true);
        pluginGeneratedSerialDescriptor.k("customConfigs", true);
        pluginGeneratedSerialDescriptor.k("enableLocationReporting", true);
        pluginGeneratedSerialDescriptor.k("locationReportingIntervalSeconds", true);
        pluginGeneratedSerialDescriptor.k("locationReportingTimeoutSeconds", true);
        pluginGeneratedSerialDescriptor.k("locationReportingTimeoutsToFail", true);
        pluginGeneratedSerialDescriptor.k("isSmartCartMode", true);
        pluginGeneratedSerialDescriptor.k("modelFetchRetryInterval", true);
        pluginGeneratedSerialDescriptor.k("modelFetchRetryCount", true);
        pluginGeneratedSerialDescriptor.k("engineSessionFetchRetryCount", true);
        pluginGeneratedSerialDescriptor.k("engineSessionFetchRetryInterval", true);
        pluginGeneratedSerialDescriptor.k("engineSessionRefreshIntervalBeforeExpirationSeconds", true);
        pluginGeneratedSerialDescriptor.k("mainOrientationCalculator", true);
        pluginGeneratedSerialDescriptor.k("onDevice", true);
        pluginGeneratedSerialDescriptor.k("isPositioningDebuggingEnabled", true);
        pluginGeneratedSerialDescriptor.k("locationReportingQueueLimit", true);
        pluginGeneratedSerialDescriptor.k("locationReportingConnectionRetryInitialInterval", true);
        pluginGeneratedSerialDescriptor.k("locationReportingConnectionRetryMaxInterval", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EngineConfigResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(EngineConfigResponse.$childSerializers[0]);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(new ArrayListSerializer(INSTANCE));
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        KSerializer<?> kSerializerD3 = BuiltinSerializersKt.d(booleanSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        KSerializer<?> kSerializerD4 = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD5 = BuiltinSerializersKt.d(doubleSerializer);
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{kSerializerD, kSerializerD2, kSerializerD3, kSerializerD4, kSerializerD5, BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(booleanSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(MainOrientationCalculatorConfigResponse$$serializer.INSTANCE), BuiltinSerializersKt.d(OnDeviceEngineConfigResponse$$serializer.INSTANCE), BuiltinSerializersKt.d(booleanSerializer), BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer)};
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
    public EngineConfigResponse deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        int i2;
        Double d;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = EngineConfigResponse.$childSerializers;
        Boolean bool = null;
        Double d2 = null;
        Double d3 = null;
        Integer num = null;
        Double d4 = null;
        Integer num2 = null;
        MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse = null;
        OnDeviceEngineConfigResponse onDeviceEngineConfigResponse = null;
        Integer num3 = null;
        Double d5 = null;
        Double d6 = null;
        Integer num4 = null;
        Boolean bool2 = null;
        Double d7 = null;
        List list2 = null;
        List list3 = null;
        Boolean bool3 = null;
        Double d8 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i5 != 0) {
            Double d9 = d6;
            int iU = compositeDecoderB.u(b);
            Integer num5 = num4;
            switch (iU) {
                case -1:
                    num4 = num5;
                    i5 = i3;
                    d6 = d9;
                    onDeviceEngineConfigResponse = onDeviceEngineConfigResponse;
                    d3 = d3;
                    d8 = d8;
                    d5 = d5;
                case 0:
                    Double d10 = d3;
                    Double d11 = d5;
                    i = i3;
                    list = list3;
                    onDeviceEngineConfigResponse = onDeviceEngineConfigResponse;
                    d8 = d8;
                    d5 = d11;
                    d9 = d9;
                    list2 = (List) compositeDecoderB.k(b, i, kSerializerArr[i3], list2);
                    mainOrientationCalculatorConfigResponse = mainOrientationCalculatorConfigResponse;
                    d2 = d2;
                    bool3 = bool3;
                    d3 = d10;
                    num5 = num5;
                    i2 = 1;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 1:
                    d = d2;
                    Double d12 = d5;
                    i = i3;
                    onDeviceEngineConfigResponse = onDeviceEngineConfigResponse;
                    d3 = d3;
                    d8 = d8;
                    num5 = num5;
                    d5 = d12;
                    i2 = 2;
                    d9 = d9;
                    list = (List) compositeDecoderB.k(b, 1, new ArrayListSerializer(INSTANCE), list3);
                    d2 = d;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 2:
                    i = i3;
                    bool3 = (Boolean) compositeDecoderB.k(b, 2, BooleanSerializer.f24779a, bool3);
                    list = list3;
                    d3 = d3;
                    d2 = d2;
                    num5 = num5;
                    d9 = d9;
                    i2 = 4;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 3:
                    i = i3;
                    d8 = (Double) compositeDecoderB.k(b, 3, DoubleSerializer.f24792a, d8);
                    list = list3;
                    d3 = d3;
                    d2 = d2;
                    num5 = num5;
                    d9 = d9;
                    i2 = 8;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 4:
                    d = d2;
                    i = i3;
                    list = list3;
                    num5 = num5;
                    i2 = 16;
                    d9 = (Double) compositeDecoderB.k(b, 4, DoubleSerializer.f24792a, d9);
                    d2 = d;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 5:
                    d = d2;
                    i2 = 32;
                    i = i3;
                    num5 = (Integer) compositeDecoderB.k(b, 5, IntSerializer.f24800a, num5);
                    list = list3;
                    d2 = d;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 6:
                    i2 = 64;
                    bool2 = (Boolean) compositeDecoderB.k(b, 6, BooleanSerializer.f24779a, bool2);
                    list = list3;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 7:
                    i2 = 128;
                    d7 = (Double) compositeDecoderB.k(b, 7, DoubleSerializer.f24792a, d7);
                    list = list3;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 8:
                    num2 = (Integer) compositeDecoderB.k(b, 8, IntSerializer.f24800a, num2);
                    i2 = 256;
                    i = i3;
                    list = list3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 9:
                    num = (Integer) compositeDecoderB.k(b, 9, IntSerializer.f24800a, num);
                    i2 = 512;
                    i = i3;
                    list = list3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 10:
                    d3 = (Double) compositeDecoderB.k(b, 10, DoubleSerializer.f24792a, d3);
                    i2 = 1024;
                    i = i3;
                    list = list3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 11:
                    d2 = (Double) compositeDecoderB.k(b, 11, DoubleSerializer.f24792a, d2);
                    i2 = 2048;
                    i = i3;
                    list = list3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 12:
                    mainOrientationCalculatorConfigResponse = (MainOrientationCalculatorConfigResponse) compositeDecoderB.k(b, 12, MainOrientationCalculatorConfigResponse$$serializer.INSTANCE, mainOrientationCalculatorConfigResponse);
                    i2 = 4096;
                    i = i3;
                    list = list3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 13:
                    onDeviceEngineConfigResponse = (OnDeviceEngineConfigResponse) compositeDecoderB.k(b, 13, OnDeviceEngineConfigResponse$$serializer.INSTANCE, onDeviceEngineConfigResponse);
                    i2 = 8192;
                    i = i3;
                    list = list3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 14:
                    bool = (Boolean) compositeDecoderB.k(b, 14, BooleanSerializer.f24779a, bool);
                    i2 = 16384;
                    i = i3;
                    list = list3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 15:
                    num3 = (Integer) compositeDecoderB.k(b, 15, IntSerializer.f24800a, num3);
                    i2 = 32768;
                    i = i3;
                    list = list3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 16:
                    d5 = (Double) compositeDecoderB.k(b, 16, DoubleSerializer.f24792a, d5);
                    i2 = 65536;
                    i = i3;
                    list = list3;
                    i4 |= i2;
                    i3 = i;
                    list3 = list;
                    d6 = d9;
                    num4 = num5;
                case 17:
                    d4 = (Double) compositeDecoderB.k(b, 17, DoubleSerializer.f24792a, d4);
                    i4 |= 131072;
                    d6 = d9;
                    num4 = num5;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        Double d13 = d3;
        Double d14 = d5;
        Boolean bool4 = bool3;
        Double d15 = d8;
        MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse2 = mainOrientationCalculatorConfigResponse;
        OnDeviceEngineConfigResponse onDeviceEngineConfigResponse2 = onDeviceEngineConfigResponse;
        List list4 = list2;
        List list5 = list3;
        compositeDecoderB.c(b);
        return new EngineConfigResponse(i4, list4, list5, bool4, d15, d6, num4, bool2, d7, num2, num, d13, d2, mainOrientationCalculatorConfigResponse2, onDeviceEngineConfigResponse2, bool, num3, d14, d4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull EngineConfigResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        EngineConfigResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
