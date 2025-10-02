package au.com.woolworths.android.onesite.data;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/android/onesite/data/DownloadableAsset.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class DownloadableAsset$$serializer implements GeneratedSerializer<DownloadableAsset> {

    /* renamed from: a, reason: collision with root package name */
    public static final DownloadableAsset$$serializer f4241a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        DownloadableAsset$$serializer downloadableAsset$$serializer = new DownloadableAsset$$serializer();
        f4241a = downloadableAsset$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.android.onesite.data.DownloadableAsset", downloadableAsset$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("assetType", false);
        pluginGeneratedSerialDescriptor.k("assetUrl", false);
        pluginGeneratedSerialDescriptor.k("assetWidth", false);
        pluginGeneratedSerialDescriptor.k("assetHeight", false);
        pluginGeneratedSerialDescriptor.k("fit", false);
        pluginGeneratedSerialDescriptor.k("altText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = DownloadableAsset.d;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{lazyArr[0].getD(), stringSerializer, intSerializer, intSerializer, BuiltinSerializersKt.d((KSerializer) lazyArr[4].getD()), BuiltinSerializersKt.d(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = DownloadableAsset.d;
        int i = 0;
        int iG = 0;
        int iG2 = 0;
        DownloadableAssetType downloadableAssetType = null;
        String strJ = null;
        DownloadableAssetFit downloadableAssetFit = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    downloadableAssetType = (DownloadableAssetType) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), downloadableAssetType);
                    i |= 1;
                    break;
                case 1:
                    strJ = compositeDecoderB.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iG = compositeDecoderB.g(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iG2 = compositeDecoderB.g(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    downloadableAssetFit = (DownloadableAssetFit) compositeDecoderB.k(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getD(), downloadableAssetFit);
                    i |= 16;
                    break;
                case 5:
                    str = (String) compositeDecoderB.k(serialDescriptor, 5, StringSerializer.f24821a, str);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new DownloadableAsset(i, downloadableAssetType, strJ, iG, iG2, downloadableAssetFit, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        DownloadableAsset value = (DownloadableAsset) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        DownloadableAsset.g(value, compositeEncoderB, serialDescriptor);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
