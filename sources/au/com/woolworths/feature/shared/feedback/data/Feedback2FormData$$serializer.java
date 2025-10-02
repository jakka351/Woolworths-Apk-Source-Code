package au.com.woolworths.feature.shared.feedback.data;

import androidx.compose.runtime.internal.StabilityInferred;
import io.jsonwebtoken.Claims;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/feature/shared/feedback/data/Feedback2FormData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/feature/shared/feedback/data/Feedback2FormData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class Feedback2FormData$$serializer implements GeneratedSerializer<Feedback2FormData> {

    /* renamed from: a, reason: collision with root package name */
    public static final Feedback2FormData$$serializer f6478a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Feedback2FormData$$serializer feedback2FormData$$serializer = new Feedback2FormData$$serializer();
        f6478a = feedback2FormData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.feature.shared.feedback.data.Feedback2FormData", feedback2FormData$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("formId", false);
        pluginGeneratedSerialDescriptor.k("data", false);
        pluginGeneratedSerialDescriptor.k(Claims.EXPIRATION, true);
        pluginGeneratedSerialDescriptor.k(Claims.NOT_BEFORE, true);
        pluginGeneratedSerialDescriptor.k(Claims.ISSUED_AT, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = Feedback2FormData.f;
        LongSerializer longSerializer = LongSerializer.f24804a;
        return new KSerializer[]{StringSerializer.f24821a, lazyArr[1].getD(), BuiltinSerializersKt.d(longSerializer), BuiltinSerializersKt.d(longSerializer), BuiltinSerializersKt.d(longSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = Feedback2FormData.f;
        int i = 0;
        String strJ = null;
        Map map = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                strJ = compositeDecoderB.j(serialDescriptor, 0);
                i |= 1;
            } else if (iU == 1) {
                map = (Map) compositeDecoderB.o(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getD(), map);
                i |= 2;
            } else if (iU == 2) {
                l = (Long) compositeDecoderB.k(serialDescriptor, 2, LongSerializer.f24804a, l);
                i |= 4;
            } else if (iU == 3) {
                l2 = (Long) compositeDecoderB.k(serialDescriptor, 3, LongSerializer.f24804a, l2);
                i |= 8;
            } else {
                if (iU != 4) {
                    throw new UnknownFieldException(iU);
                }
                l3 = (Long) compositeDecoderB.k(serialDescriptor, 4, LongSerializer.f24804a, l3);
                i |= 16;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new Feedback2FormData(i, strJ, map, l, l2, l3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Feedback2FormData value = (Feedback2FormData) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = Feedback2FormData.f;
        String str = value.f6477a;
        Long l = value.e;
        Long l2 = value.d;
        Long l3 = value.c;
        compositeEncoderB.p(serialDescriptor, 0, str);
        compositeEncoderB.F(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getD(), value.b);
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
