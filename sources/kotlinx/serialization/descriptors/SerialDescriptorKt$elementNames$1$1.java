package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.internal.EnumDescriptor;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlinx/serialization/descriptors/SerialDescriptorKt$elementNames$1$1", "", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SerialDescriptorKt$elementNames$1$1 implements Iterator<String>, KMappedMarker {
    public int d;
    public final /* synthetic */ EnumDescriptor e;

    public SerialDescriptorKt$elementNames$1$1(EnumDescriptor enumDescriptor) {
        this.e = enumDescriptor;
        this.d = enumDescriptor.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        EnumDescriptor enumDescriptor = this.e;
        int i = enumDescriptor.c;
        int i2 = this.d;
        this.d = i2 - 1;
        return enumDescriptor.e[i - i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
