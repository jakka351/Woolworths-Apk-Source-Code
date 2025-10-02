package au.com.woolworths.foundation.rewards.servicemessages;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import java.time.ZonedDateTime;
import java.util.List;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class RewardsServiceMessage$$serializer implements GeneratedSerializer<RewardsServiceMessage> {

    /* renamed from: a, reason: collision with root package name */
    public static final RewardsServiceMessage$$serializer f8646a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RewardsServiceMessage$$serializer rewardsServiceMessage$$serializer = new RewardsServiceMessage$$serializer();
        f8646a = rewardsServiceMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage", rewardsServiceMessage$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("message", false);
        pluginGeneratedSerialDescriptor.k("actionButton", true);
        pluginGeneratedSerialDescriptor.k("coreIconName", true);
        pluginGeneratedSerialDescriptor.k("screenTypes", false);
        pluginGeneratedSerialDescriptor.k("startDate", false);
        pluginGeneratedSerialDescriptor.k("endDate", false);
        pluginGeneratedSerialDescriptor.k("outageType", false);
        pluginGeneratedSerialDescriptor.k("targetApps", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        RewardsServiceMessage.DateSerializer dateSerializer = RewardsServiceMessage.DateSerializer.f8649a;
        return new KSerializer[]{RewardsServiceMessage.k[0].getD(), stringSerializer, stringSerializer, BuiltinSerializersKt.d(RewardsServiceMessage$ActionButton$$serializer.f8647a), BuiltinSerializersKt.d(stringSerializer), RewardsServiceMessage.ScreenTypeSafeListSerializer.f8653a, dateSerializer, dateSerializer, RewardsServiceMessage.OutageTypeSafeSerializer.f8650a, RewardsServiceMessage.RegionListSerializer.f8651a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr2 = RewardsServiceMessage.k;
        RewardsServiceMessage.OutageType outageType = null;
        List list = null;
        InlineErrorType inlineErrorType = null;
        String strJ = null;
        String strJ2 = null;
        RewardsServiceMessage.ActionButton actionButton = null;
        String str = null;
        List list2 = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    inlineErrorType = (InlineErrorType) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), inlineErrorType);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    strJ = compositeDecoderB.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    strJ2 = compositeDecoderB.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    actionButton = (RewardsServiceMessage.ActionButton) compositeDecoderB.k(serialDescriptor, 3, RewardsServiceMessage$ActionButton$$serializer.f8647a, actionButton);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    str = (String) compositeDecoderB.k(serialDescriptor, 4, StringSerializer.f24821a, str);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    list2 = (List) compositeDecoderB.o(serialDescriptor, 5, RewardsServiceMessage.ScreenTypeSafeListSerializer.f8653a, list2);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    zonedDateTime = (ZonedDateTime) compositeDecoderB.o(serialDescriptor, 6, RewardsServiceMessage.DateSerializer.f8649a, zonedDateTime);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    zonedDateTime2 = (ZonedDateTime) compositeDecoderB.o(serialDescriptor, 7, RewardsServiceMessage.DateSerializer.f8649a, zonedDateTime2);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    outageType = (RewardsServiceMessage.OutageType) compositeDecoderB.o(serialDescriptor, 8, RewardsServiceMessage.OutageTypeSafeSerializer.f8650a, outageType);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    list = (List) compositeDecoderB.o(serialDescriptor, 9, RewardsServiceMessage.RegionListSerializer.f8651a, list);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
            lazyArr2 = lazyArr;
        }
        compositeDecoderB.c(serialDescriptor);
        return new RewardsServiceMessage(i, inlineErrorType, strJ, strJ2, actionButton, str, list2, zonedDateTime, zonedDateTime2, outageType, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RewardsServiceMessage value = (RewardsServiceMessage) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        compositeEncoderB.F(serialDescriptor, 0, (SerializationStrategy) RewardsServiceMessage.k[0].getD(), value.f8645a);
        compositeEncoderB.p(serialDescriptor, 1, value.b);
        compositeEncoderB.p(serialDescriptor, 2, value.c);
        compositeEncoderB.w(serialDescriptor, 3, RewardsServiceMessage$ActionButton$$serializer.f8647a, value.d);
        compositeEncoderB.w(serialDescriptor, 4, StringSerializer.f24821a, value.e);
        compositeEncoderB.F(serialDescriptor, 5, RewardsServiceMessage.ScreenTypeSafeListSerializer.f8653a, value.f);
        RewardsServiceMessage.DateSerializer dateSerializer = RewardsServiceMessage.DateSerializer.f8649a;
        compositeEncoderB.F(serialDescriptor, 6, dateSerializer, value.g);
        compositeEncoderB.F(serialDescriptor, 7, dateSerializer, value.h);
        compositeEncoderB.F(serialDescriptor, 8, RewardsServiceMessage.OutageTypeSafeSerializer.f8650a, value.i);
        compositeEncoderB.F(serialDescriptor, 9, RewardsServiceMessage.RegionListSerializer.f8651a, value.j);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
