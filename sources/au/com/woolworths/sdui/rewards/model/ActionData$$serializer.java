package au.com.woolworths.sdui.rewards.model;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsData$$serializer;
import com.salesforce.marketingcloud.UrlHandler;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/sdui/rewards/model/ActionData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/sdui/rewards/model/ActionData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rewards-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class ActionData$$serializer implements GeneratedSerializer<ActionData> {

    /* renamed from: a, reason: collision with root package name */
    public static final ActionData$$serializer f10025a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ActionData$$serializer actionData$$serializer = new ActionData$$serializer();
        f10025a = actionData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.sdui.rewards.model.ActionData", actionData$$serializer, 4);
        pluginGeneratedSerialDescriptor.k(UrlHandler.ACTION, false);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("analytics", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ActionData.h;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, lazyArr[1].getD(), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(AnalyticsData$$serializer.f4018a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = ActionData.h;
        int i = 0;
        String strJ = null;
        ActionType actionType = null;
        String str = null;
        AnalyticsData analyticsData = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                strJ = compositeDecoderB.j(serialDescriptor, 0);
                i |= 1;
            } else if (iU == 1) {
                actionType = (ActionType) compositeDecoderB.o(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getD(), actionType);
                i |= 2;
            } else if (iU == 2) {
                str = (String) compositeDecoderB.k(serialDescriptor, 2, StringSerializer.f24821a, str);
                i |= 4;
            } else {
                if (iU != 3) {
                    throw new UnknownFieldException(iU);
                }
                analyticsData = (AnalyticsData) compositeDecoderB.k(serialDescriptor, 3, AnalyticsData$$serializer.f4018a, analyticsData);
                i |= 8;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new ActionData(i, strJ, actionType, str, analyticsData);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ActionData value = (ActionData) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = ActionData.h;
        compositeEncoderB.p(serialDescriptor, 0, value.d);
        compositeEncoderB.F(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getD(), value.e);
        compositeEncoderB.w(serialDescriptor, 2, StringSerializer.f24821a, value.f);
        compositeEncoderB.w(serialDescriptor, 3, AnalyticsData$$serializer.f4018a, value.g);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
