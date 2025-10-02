package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.CollectDeviceData;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/android/onesite/modules/checkout/digitalpay/CollectDeviceData.DeviceData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/CollectDeviceData$DeviceData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class CollectDeviceData$DeviceData$$serializer implements GeneratedSerializer<CollectDeviceData.DeviceData> {

    /* renamed from: a, reason: collision with root package name */
    public static final CollectDeviceData$DeviceData$$serializer f4281a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CollectDeviceData$DeviceData$$serializer collectDeviceData$DeviceData$$serializer = new CollectDeviceData$DeviceData$$serializer();
        f4281a = collectDeviceData$DeviceData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.android.onesite.modules.checkout.digitalpay.CollectDeviceData.DeviceData", collectDeviceData$DeviceData$$serializer, 1);
        pluginGeneratedSerialDescriptor.k("correlation_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.d(StringSerializer.f24821a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else {
                if (iU != 0) {
                    throw new UnknownFieldException(iU);
                }
                str = (String) compositeDecoderB.k(serialDescriptor, 0, StringSerializer.f24821a, str);
                i = 1;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new CollectDeviceData.DeviceData(i, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CollectDeviceData.DeviceData value = (CollectDeviceData.DeviceData) obj;
        Intrinsics.h(value, "value");
        String str = value.f4282a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        if (compositeEncoderB.q(serialDescriptor, 0) || str != null) {
            compositeEncoderB.w(serialDescriptor, 0, StringSerializer.f24821a, str);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
