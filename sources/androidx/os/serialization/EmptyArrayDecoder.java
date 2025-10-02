package androidx.os.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/savedstate/serialization/EmptyArrayDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class EmptyArrayDecoder extends AbstractDecoder {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialModuleImpl f3735a = SerializersModuleKt.f24879a;

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    /* renamed from: a */
    public final SerializersModule getD() {
        return f3735a;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int u(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return -1;
    }
}
