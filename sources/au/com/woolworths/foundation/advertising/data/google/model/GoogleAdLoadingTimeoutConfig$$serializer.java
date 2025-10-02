package au.com.woolworths.foundation.advertising.data.google.model;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/advertising/data/google/model/GoogleAdLoadingTimeoutConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdLoadingTimeoutConfig;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class GoogleAdLoadingTimeoutConfig$$serializer implements GeneratedSerializer<GoogleAdLoadingTimeoutConfig> {

    /* renamed from: a, reason: collision with root package name */
    public static final GoogleAdLoadingTimeoutConfig$$serializer f8404a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GoogleAdLoadingTimeoutConfig$$serializer googleAdLoadingTimeoutConfig$$serializer = new GoogleAdLoadingTimeoutConfig$$serializer();
        f8404a = googleAdLoadingTimeoutConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.advertising.data.google.model.GoogleAdLoadingTimeoutConfig", googleAdLoadingTimeoutConfig$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("productList", true);
        pluginGeneratedSerialDescriptor.k("recipe", true);
        pluginGeneratedSerialDescriptor.k("homePage", true);
        pluginGeneratedSerialDescriptor.k("orderConfirmation", true);
        pluginGeneratedSerialDescriptor.k("contentPage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f24804a;
        return new KSerializer[]{BuiltinSerializersKt.d(longSerializer), BuiltinSerializersKt.d(longSerializer), BuiltinSerializersKt.d(longSerializer), BuiltinSerializersKt.d(longSerializer), BuiltinSerializersKt.d(longSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                l = (Long) compositeDecoderB.k(serialDescriptor, 0, LongSerializer.f24804a, l);
                i |= 1;
            } else if (iU == 1) {
                l2 = (Long) compositeDecoderB.k(serialDescriptor, 1, LongSerializer.f24804a, l2);
                i |= 2;
            } else if (iU == 2) {
                l3 = (Long) compositeDecoderB.k(serialDescriptor, 2, LongSerializer.f24804a, l3);
                i |= 4;
            } else if (iU == 3) {
                l4 = (Long) compositeDecoderB.k(serialDescriptor, 3, LongSerializer.f24804a, l4);
                i |= 8;
            } else {
                if (iU != 4) {
                    throw new UnknownFieldException(iU);
                }
                l5 = (Long) compositeDecoderB.k(serialDescriptor, 4, LongSerializer.f24804a, l5);
                i |= 16;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new GoogleAdLoadingTimeoutConfig(i, l, l2, l3, l4, l5);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GoogleAdLoadingTimeoutConfig value = (GoogleAdLoadingTimeoutConfig) obj;
        Intrinsics.h(value, "value");
        Long l = value.e;
        Long l2 = value.d;
        Long l3 = value.c;
        Long l4 = value.b;
        Long l5 = value.f8403a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        if (compositeEncoderB.q(serialDescriptor, 0) || l5 != null) {
            compositeEncoderB.w(serialDescriptor, 0, LongSerializer.f24804a, l5);
        }
        if (compositeEncoderB.q(serialDescriptor, 1) || l4 != null) {
            compositeEncoderB.w(serialDescriptor, 1, LongSerializer.f24804a, l4);
        }
        if (compositeEncoderB.q(serialDescriptor, 2) || l3 != null) {
            compositeEncoderB.w(serialDescriptor, 2, LongSerializer.f24804a, l3);
        }
        if (compositeEncoderB.q(serialDescriptor, 3) || l2 != null) {
            compositeEncoderB.w(serialDescriptor, 3, LongSerializer.f24804a, l2);
        }
        if (compositeEncoderB.q(serialDescriptor, 4) || l != null) {
            compositeEncoderB.w(serialDescriptor, 4, LongSerializer.f24804a, l);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
