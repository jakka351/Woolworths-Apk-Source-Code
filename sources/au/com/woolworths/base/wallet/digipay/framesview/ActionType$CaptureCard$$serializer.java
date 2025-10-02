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
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/ActionType.CaptureCard.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$CaptureCard;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class ActionType$CaptureCard$$serializer implements GeneratedSerializer<ActionType.CaptureCard> {

    /* renamed from: a, reason: collision with root package name */
    public static final ActionType$CaptureCard$$serializer f4638a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ActionType$CaptureCard$$serializer actionType$CaptureCard$$serializer = new ActionType$CaptureCard$$serializer();
        f4638a = actionType$CaptureCard$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.wallet.digipay.framesview.ActionType.CaptureCard", actionType$CaptureCard$$serializer, 4);
        pluginGeneratedSerialDescriptor.k("verify", false);
        pluginGeneratedSerialDescriptor.k("save", false);
        pluginGeneratedSerialDescriptor.k("useEverydayPay", false);
        pluginGeneratedSerialDescriptor.k("threeDS", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerD = BuiltinSerializersKt.d(ActionType$ThreeDS$$serializer.f4641a);
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        return new KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer, kSerializerD};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        ActionType.ThreeDS threeDS = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                zB = compositeDecoderB.B(serialDescriptor, 0);
                i |= 1;
            } else if (iU == 1) {
                zB2 = compositeDecoderB.B(serialDescriptor, 1);
                i |= 2;
            } else if (iU == 2) {
                zB3 = compositeDecoderB.B(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iU != 3) {
                    throw new UnknownFieldException(iU);
                }
                threeDS = (ActionType.ThreeDS) compositeDecoderB.k(serialDescriptor, 3, ActionType$ThreeDS$$serializer.f4641a, threeDS);
                i |= 8;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new ActionType.CaptureCard(i, zB, zB2, zB3, threeDS);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ActionType.CaptureCard value = (ActionType.CaptureCard) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        boolean z = value.c;
        ActionType.ThreeDS threeDS = value.f;
        compositeEncoderB.o(serialDescriptor, 0, z);
        compositeEncoderB.o(serialDescriptor, 1, value.d);
        compositeEncoderB.o(serialDescriptor, 2, value.e);
        if (compositeEncoderB.q(serialDescriptor, 3) || threeDS != null) {
            compositeEncoderB.w(serialDescriptor, 3, ActionType$ThreeDS$$serializer.f4641a, threeDS);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
