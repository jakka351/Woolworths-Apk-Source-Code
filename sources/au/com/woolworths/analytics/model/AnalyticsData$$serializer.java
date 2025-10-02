package au.com.woolworths.analytics.model;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/analytics/model/AnalyticsData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes2.dex */
public /* synthetic */ class AnalyticsData$$serializer implements GeneratedSerializer<AnalyticsData> {

    /* renamed from: a, reason: collision with root package name */
    public static final AnalyticsData$$serializer f4018a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AnalyticsData$$serializer analyticsData$$serializer = new AnalyticsData$$serializer();
        f4018a = analyticsData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.analytics.model.AnalyticsData", analyticsData$$serializer, 11);
        pluginGeneratedSerialDescriptor.k("eventConfig", true);
        pluginGeneratedSerialDescriptor.k("appSection", true);
        pluginGeneratedSerialDescriptor.k("screenName", true);
        pluginGeneratedSerialDescriptor.k("screenType", true);
        pluginGeneratedSerialDescriptor.k("eventCategory", true);
        pluginGeneratedSerialDescriptor.k("eventLabel", true);
        pluginGeneratedSerialDescriptor.k("eventValue", true);
        pluginGeneratedSerialDescriptor.k("eventAction", true);
        pluginGeneratedSerialDescriptor.k("eventDescription", true);
        pluginGeneratedSerialDescriptor.k("tealiumEvent", true);
        pluginGeneratedSerialDescriptor.k("extraContent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = AnalyticsData.d;
        KSerializer kSerializerD = BuiltinSerializersKt.d(EventConfig$$serializer.f4020a);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{kSerializerD, BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d((KSerializer) lazyArr[10].getD())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr2 = AnalyticsData.d;
        String str = null;
        String str2 = null;
        List list = null;
        EventConfig eventConfig = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    lazyArr = lazyArr2;
                    eventConfig = (EventConfig) compositeDecoderB.k(serialDescriptor, 0, EventConfig$$serializer.f4020a, eventConfig);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    str3 = (String) compositeDecoderB.k(serialDescriptor, 1, StringSerializer.f24821a, str3);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    str4 = (String) compositeDecoderB.k(serialDescriptor, 2, StringSerializer.f24821a, str4);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    str5 = (String) compositeDecoderB.k(serialDescriptor, 3, StringSerializer.f24821a, str5);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    str6 = (String) compositeDecoderB.k(serialDescriptor, 4, StringSerializer.f24821a, str6);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    str7 = (String) compositeDecoderB.k(serialDescriptor, 5, StringSerializer.f24821a, str7);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    str8 = (String) compositeDecoderB.k(serialDescriptor, 6, StringSerializer.f24821a, str8);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    str9 = (String) compositeDecoderB.k(serialDescriptor, 7, StringSerializer.f24821a, str9);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    str = (String) compositeDecoderB.k(serialDescriptor, 8, StringSerializer.f24821a, str);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    str2 = (String) compositeDecoderB.k(serialDescriptor, 9, StringSerializer.f24821a, str2);
                    i |= 512;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    list = (List) compositeDecoderB.k(serialDescriptor, 10, (DeserializationStrategy) lazyArr2[10].getD(), list);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
            lazyArr2 = lazyArr;
        }
        compositeDecoderB.c(serialDescriptor);
        return new AnalyticsData(i, eventConfig, str3, str4, str5, str6, str7, str8, str9, str, str2, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        AnalyticsData value = (AnalyticsData) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        AnalyticsData.m(value, compositeEncoderB, serialDescriptor);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
