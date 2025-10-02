package kotlinx.serialization.cbor.internal;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/cbor/internal/DefiniteLengthCborWriter;", "Lkotlinx/serialization/cbor/internal/CborWriter;", "kotlinx-serialization-cbor"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DefiniteLengthCborWriter extends CborWriter {
    @Override // kotlinx.serialization.cbor.internal.CborWriter
    public final ByteArrayOutput J() {
        CollectionsKt.O(null);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        CollectionsKt.j0(null);
        throw null;
    }
}
