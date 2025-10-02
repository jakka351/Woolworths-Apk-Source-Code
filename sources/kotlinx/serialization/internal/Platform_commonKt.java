package kotlinx.serialization.internal;

import io.jsonwebtoken.JwtParser;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class Platform_commonKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialDescriptor[] f24813a = new SerialDescriptor[0];

    public static final Set a(SerialDescriptor serialDescriptor) {
        Intrinsics.h(serialDescriptor, "<this>");
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getC());
        int c = serialDescriptor.getC();
        for (int i = 0; i < c; i++) {
            hashSet.add(serialDescriptor.g(i));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] b(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f24813a : serialDescriptorArr;
    }

    public static final KClass c(KType kType) {
        Intrinsics.h(kType, "<this>");
        KClassifier kClassifierE = kType.e();
        if (kClassifierE instanceof KClass) {
            return (KClass) kClassifierE;
        }
        if (!(kClassifierE instanceof KTypeParameter)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + kClassifierE);
        }
        throw new IllegalArgumentException("Captured type parameter " + kClassifierE + " from generic non-reified function. Such functionality cannot be supported because " + kClassifierE + " is erased, either specify serializer explicitly or make calling function inline with reified " + kClassifierE + JwtParser.SEPARATOR_CHAR);
    }

    public static final void d(KClass kClass) {
        Intrinsics.h(kClass, "<this>");
        String strB = kClass.B();
        if (strB == null) {
            strB = "<local class name not available>";
        }
        throw new SerializationException(YU.a.h("Serializer for class '", strB, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
