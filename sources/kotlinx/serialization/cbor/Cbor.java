package kotlinx.serialization.cbor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.BinaryFormat;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/cbor/Cbor;", "Lkotlinx/serialization/BinaryFormat;", "Default", "Lkotlinx/serialization/cbor/Cbor$Default;", "Lkotlinx/serialization/cbor/CborImpl;", "kotlinx-serialization-cbor"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes7.dex */
public abstract class Cbor implements BinaryFormat {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/cbor/Cbor$Default;", "Lkotlinx/serialization/cbor/Cbor;", "kotlinx-serialization-cbor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default extends Cbor {
    }

    static {
        SerialModuleImpl serialModuleImpl = SerializersModuleKt.f24879a;
        CborBuilder cborBuilder = new CborBuilder();
        cborBuilder.f24754a = serialModuleImpl;
        SerialModuleImpl serialModuleImpl2 = SerializersModuleKt.f24879a;
        Intrinsics.h(serialModuleImpl2, "<set-?>");
        cborBuilder.f24754a = serialModuleImpl2;
        SerializersModule serializersModule = cborBuilder.f24754a;
        Intrinsics.h(serializersModule, "serializersModule");
    }
}
