package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.json.JsonElementKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StreamingJsonEncoderKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f24872a = ArraysKt.r0(new SerialDescriptor[]{UIntSerializer.b, ULongSerializer.b, UByteSerializer.b, UShortSerializer.b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        Intrinsics.h(serialDescriptor, "<this>");
        return serialDescriptor.getL() && serialDescriptor.equals(JsonElementKt.f24841a);
    }

    public static final boolean b(SerialDescriptor serialDescriptor) {
        Intrinsics.h(serialDescriptor, "<this>");
        return serialDescriptor.getL() && f24872a.contains(serialDescriptor);
    }
}
