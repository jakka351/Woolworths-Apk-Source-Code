package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlinx/serialization/descriptors/SerialDescriptorKt$elementDescriptors$1$1", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SerialDescriptorKt$elementDescriptors$1$1 implements Iterator<SerialDescriptor>, KMappedMarker {
    public int d;
    public final /* synthetic */ SerialDescriptor e;

    public SerialDescriptorKt$elementDescriptors$1$1(SerialDescriptor serialDescriptor) {
        this.e = serialDescriptor;
        this.d = serialDescriptor.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0;
    }

    @Override // java.util.Iterator
    public final SerialDescriptor next() {
        SerialDescriptor serialDescriptor = this.e;
        int iE = serialDescriptor.e();
        int i = this.d;
        this.d = i - 1;
        return serialDescriptor.d(iE - i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
