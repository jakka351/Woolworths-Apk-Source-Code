package au.com.woolworths.rewards.base.info;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.ContentCta$$serializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/rewards/base/info/FeatureInfoFooter.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/rewards/base/info/FeatureInfoFooter;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class FeatureInfoFooter$$serializer implements GeneratedSerializer<FeatureInfoFooter> {

    /* renamed from: a, reason: collision with root package name */
    public static final FeatureInfoFooter$$serializer f9371a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FeatureInfoFooter$$serializer featureInfoFooter$$serializer = new FeatureInfoFooter$$serializer();
        f9371a = featureInfoFooter$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.rewards.base.info.FeatureInfoFooter", featureInfoFooter$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("primaryCta", false);
        pluginGeneratedSerialDescriptor.k("secondaryCta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        ContentCta$$serializer contentCta$$serializer = ContentCta$$serializer.f4240a;
        return new KSerializer[]{contentCta$$serializer, BuiltinSerializersKt.d(contentCta$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        SerializationConstructorMarker serializationConstructorMarker = null;
        boolean z = true;
        int i = 0;
        ContentCta contentCta = null;
        ContentCta contentCta2 = null;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                contentCta = (ContentCta) compositeDecoderB.o(serialDescriptor, 0, ContentCta$$serializer.f4240a, contentCta);
                i |= 1;
            } else {
                if (iU != 1) {
                    throw new UnknownFieldException(iU);
                }
                contentCta2 = (ContentCta) compositeDecoderB.k(serialDescriptor, 1, ContentCta$$serializer.f4240a, contentCta2);
                i |= 2;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new FeatureInfoFooter(i, contentCta, contentCta2, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        FeatureInfoFooter value = (FeatureInfoFooter) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        FeatureInfoFooter.c(value, compositeEncoderB, serialDescriptor);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
