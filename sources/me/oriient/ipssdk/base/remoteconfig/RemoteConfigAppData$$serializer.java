package me.oriient.ipssdk.base.remoteconfig;

import com.salesforce.marketingcloud.storage.db.k;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/ipssdk/base/remoteconfig/RemoteConfigAppData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigAppData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes2.dex */
public final class RemoteConfigAppData$$serializer implements GeneratedSerializer<RemoteConfigAppData> {

    @NotNull
    public static final RemoteConfigAppData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RemoteConfigAppData$$serializer remoteConfigAppData$$serializer = new RemoteConfigAppData$$serializer();
        INSTANCE = remoteConfigAppData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.ipssdk.base.remoteconfig.RemoteConfigAppData", remoteConfigAppData$$serializer, 19);
        pluginGeneratedSerialDescriptor.k("ipsDomain", false);
        pluginGeneratedSerialDescriptor.k("spaceId", false);
        pluginGeneratedSerialDescriptor.k("apiKey", false);
        pluginGeneratedSerialDescriptor.k("appVersionCode", false);
        pluginGeneratedSerialDescriptor.k("appVersionName", false);
        pluginGeneratedSerialDescriptor.k("bundleId", false);
        pluginGeneratedSerialDescriptor.k("deviceId", false);
        pluginGeneratedSerialDescriptor.k("isSdkDebug", false);
        pluginGeneratedSerialDescriptor.k("isAppDebug", false);
        pluginGeneratedSerialDescriptor.k("sdkType", false);
        pluginGeneratedSerialDescriptor.k("osType", false);
        pluginGeneratedSerialDescriptor.k("osVersion", false);
        pluginGeneratedSerialDescriptor.k("osApiLevel", false);
        pluginGeneratedSerialDescriptor.k("sdkVersionName", false);
        pluginGeneratedSerialDescriptor.k("sdkVersionCode", false);
        pluginGeneratedSerialDescriptor.k("deviceManufacturer", false);
        pluginGeneratedSerialDescriptor.k("deviceModel", false);
        pluginGeneratedSerialDescriptor.k("country", true);
        pluginGeneratedSerialDescriptor.k(k.a.n, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RemoteConfigAppData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(stringSerializer);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(stringSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, doubleSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.f24800a, stringSerializer, doubleSerializer, stringSerializer, stringSerializer, kSerializerD, kSerializerD2};
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
    public RemoteConfigAppData deserialize(@NotNull Decoder decoder) {
        int i;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        String str = null;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        String strJ5 = null;
        String strJ6 = null;
        String strJ7 = null;
        String strJ8 = null;
        String strJ9 = null;
        String strJ10 = null;
        String strJ11 = null;
        String strJ12 = null;
        double D = 0.0d;
        double D2 = 0.0d;
        boolean z = true;
        int i2 = 0;
        boolean zB = false;
        boolean zB2 = false;
        int iG = 0;
        String str2 = null;
        while (z) {
            int iU = compositeDecoderB.u(b);
            int i3 = 16;
            switch (iU) {
                case -1:
                    z = false;
                case 0:
                    strJ = compositeDecoderB.j(b, 0);
                    i = 1;
                    i2 |= i;
                case 1:
                    strJ2 = compositeDecoderB.j(b, 1);
                    i = 2;
                    i2 |= i;
                case 2:
                    i = 4;
                    strJ3 = compositeDecoderB.j(b, 2);
                    i2 |= i;
                case 3:
                    D = compositeDecoderB.D(b, 3);
                    i = 8;
                    i2 |= i;
                case 4:
                    strJ4 = compositeDecoderB.j(b, 4);
                    i = i3;
                    i2 |= i;
                case 5:
                    i3 = 32;
                    strJ5 = compositeDecoderB.j(b, 5);
                    i = i3;
                    i2 |= i;
                case 6:
                    i3 = 64;
                    strJ6 = compositeDecoderB.j(b, 6);
                    i = i3;
                    i2 |= i;
                case 7:
                    zB = compositeDecoderB.B(b, 7);
                    i3 = 128;
                    i = i3;
                    i2 |= i;
                case 8:
                    zB2 = compositeDecoderB.B(b, 8);
                    i3 = 256;
                    i = i3;
                    i2 |= i;
                case 9:
                    i3 = 512;
                    strJ7 = compositeDecoderB.j(b, 9);
                    i = i3;
                    i2 |= i;
                case 10:
                    i3 = 1024;
                    strJ8 = compositeDecoderB.j(b, 10);
                    i = i3;
                    i2 |= i;
                case 11:
                    i3 = 2048;
                    strJ9 = compositeDecoderB.j(b, 11);
                    i = i3;
                    i2 |= i;
                case 12:
                    iG = compositeDecoderB.g(b, 12);
                    i3 = 4096;
                    i = i3;
                    i2 |= i;
                case 13:
                    i3 = 8192;
                    strJ10 = compositeDecoderB.j(b, 13);
                    i = i3;
                    i2 |= i;
                case 14:
                    i = 16384;
                    D2 = compositeDecoderB.D(b, 14);
                    i2 |= i;
                case 15:
                    i3 = 32768;
                    strJ11 = compositeDecoderB.j(b, 15);
                    i = i3;
                    i2 |= i;
                case 16:
                    i3 = 65536;
                    strJ12 = compositeDecoderB.j(b, 16);
                    i = i3;
                    i2 |= i;
                case 17:
                    i3 = 131072;
                    str2 = (String) compositeDecoderB.k(b, 17, StringSerializer.f24821a, str2);
                    i = i3;
                    i2 |= i;
                case 18:
                    i3 = 262144;
                    str = (String) compositeDecoderB.k(b, 18, StringSerializer.f24821a, str);
                    i = i3;
                    i2 |= i;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new RemoteConfigAppData(i2, strJ, strJ2, strJ3, D, strJ4, strJ5, strJ6, zB, zB2, strJ7, strJ8, strJ9, iG, strJ10, D2, strJ11, strJ12, str2, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull RemoteConfigAppData value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        RemoteConfigAppData.write$Self$me_oriient_sdk_base(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
