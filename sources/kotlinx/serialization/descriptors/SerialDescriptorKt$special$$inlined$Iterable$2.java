package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.internal.EnumDescriptor;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u001c\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SerialDescriptorKt$special$$inlined$Iterable$2 implements Iterable<String>, KMappedMarker {
    public final /* synthetic */ EnumDescriptor d;

    public SerialDescriptorKt$special$$inlined$Iterable$2(EnumDescriptor enumDescriptor) {
        this.d = enumDescriptor;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new SerialDescriptorKt$elementNames$1$1(this.d);
    }
}
