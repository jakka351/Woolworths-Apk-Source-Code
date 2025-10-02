package androidx.os.serialization.serializers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BuiltInSerializerKt {
    public static final String a(String serialName, Decoder decoder) {
        Intrinsics.h(serialName, "serialName");
        Intrinsics.h(decoder, "decoder");
        return "Cannot deserialize " + serialName + " with '" + Reflection.f24268a.b(decoder.getClass()).B() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final String b(String serialName, Encoder encoder) {
        Intrinsics.h(serialName, "serialName");
        Intrinsics.h(encoder, "encoder");
        return "Cannot serialize " + serialName + " with '" + Reflection.f24268a.b(encoder.getClass()).B() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }
}
