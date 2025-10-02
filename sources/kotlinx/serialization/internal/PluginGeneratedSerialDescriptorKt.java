package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt$elementDescriptors$1$1;
import kotlinx.serialization.descriptors.SerialDescriptorKt$special$$inlined$Iterable$1;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PluginGeneratedSerialDescriptorKt {
    public static final int a(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        Intrinsics.h(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.getB().hashCode() * 31) + Arrays.hashCode(typeParams);
        SerialDescriptorKt$special$$inlined$Iterable$1 serialDescriptorKt$special$$inlined$Iterable$1 = new SerialDescriptorKt$special$$inlined$Iterable$1(serialDescriptor);
        Iterator<SerialDescriptor> it = serialDescriptorKt$special$$inlined$Iterable$1.iterator();
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            SerialDescriptorKt$elementDescriptors$1$1 serialDescriptorKt$elementDescriptors$1$1 = (SerialDescriptorKt$elementDescriptors$1$1) it;
            int iHashCode3 = 0;
            if (!serialDescriptorKt$elementDescriptors$1$1.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String b = ((SerialDescriptor) serialDescriptorKt$elementDescriptors$1$1.next()).getB();
            if (b != null) {
                iHashCode3 = b.hashCode();
            }
            i = i2 + iHashCode3;
        }
        Iterator<SerialDescriptor> it2 = serialDescriptorKt$special$$inlined$Iterable$1.iterator();
        while (true) {
            SerialDescriptorKt$elementDescriptors$1$1 serialDescriptorKt$elementDescriptors$1$12 = (SerialDescriptorKt$elementDescriptors$1$1) it2;
            if (!serialDescriptorKt$elementDescriptors$1$12.hasNext()) {
                return (((iHashCode * 31) + i) * 31) + iHashCode2;
            }
            int i3 = iHashCode2 * 31;
            SerialKind b2 = ((SerialDescriptor) serialDescriptorKt$elementDescriptors$1$12.next()).getB();
            iHashCode2 = i3 + (b2 != null ? b2.hashCode() : 0);
        }
    }
}
