package kotlinx.serialization.cbor.internal;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.cbor.ByteString;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-cbor"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EncodingKt {
    public static final boolean a(SerialDescriptor serialDescriptor, int i) {
        Object next;
        Intrinsics.h(serialDescriptor, "<this>");
        Iterator it = serialDescriptor.h(i).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Annotation) next) instanceof ByteString) {
                break;
            }
        }
        return next != null;
    }
}
