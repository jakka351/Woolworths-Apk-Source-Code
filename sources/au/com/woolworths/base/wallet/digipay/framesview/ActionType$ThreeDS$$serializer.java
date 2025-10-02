package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/ActionType.ThreeDS.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ThreeDS;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class ActionType$ThreeDS$$serializer implements GeneratedSerializer<ActionType.ThreeDS> {

    /* renamed from: a, reason: collision with root package name */
    public static final ActionType$ThreeDS$$serializer f4641a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ActionType$ThreeDS$$serializer actionType$ThreeDS$$serializer = new ActionType$ThreeDS$$serializer();
        f4641a = actionType$ThreeDS$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.wallet.digipay.framesview.ActionType.ThreeDS", actionType$ThreeDS$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("requires3DS", false);
        pluginGeneratedSerialDescriptor.k("consumerAuthenticationInformation", true);
        pluginGeneratedSerialDescriptor.k("env", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.f24779a, BuiltinSerializersKt.d(ActionType$ConsumerAuthenticationInformation$$serializer.f4639a), StringSerializer.f24821a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        ActionType.ConsumerAuthenticationInformation consumerAuthenticationInformation = null;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        String strJ = null;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                zB = compositeDecoderB.B(serialDescriptor, 0);
                i |= 1;
            } else if (iU == 1) {
                consumerAuthenticationInformation = (ActionType.ConsumerAuthenticationInformation) compositeDecoderB.k(serialDescriptor, 1, ActionType$ConsumerAuthenticationInformation$$serializer.f4639a, consumerAuthenticationInformation);
                i |= 2;
            } else {
                if (iU != 2) {
                    throw new UnknownFieldException(iU);
                }
                strJ = compositeDecoderB.j(serialDescriptor, 2);
                i |= 4;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new ActionType.ThreeDS(i, zB, consumerAuthenticationInformation, strJ);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ActionType.ThreeDS value = (ActionType.ThreeDS) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        boolean z = value.f4646a;
        ActionType.ConsumerAuthenticationInformation consumerAuthenticationInformation = value.b;
        compositeEncoderB.o(serialDescriptor, 0, z);
        if (compositeEncoderB.q(serialDescriptor, 1) || consumerAuthenticationInformation != null) {
            compositeEncoderB.w(serialDescriptor, 1, ActionType$ConsumerAuthenticationInformation$$serializer.f4639a, consumerAuthenticationInformation);
        }
        compositeEncoderB.p(serialDescriptor, 2, value.c);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
