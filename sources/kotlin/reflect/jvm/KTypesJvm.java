package kotlin.reflect.jvm;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class KTypesJvm {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KClass a(KClassifier kClassifier) {
        ClassDescriptor classDescriptor;
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (!(kClassifier instanceof KTypeParameter)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kClassifier);
        }
        List upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KType kType = (KType) next;
            Intrinsics.f(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            ClassifierDescriptor classifierDescriptorC = ((KTypeImpl) kType).d.J0().c();
            classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
            if (classDescriptor != null && classDescriptor.f() != ClassKind.e && classDescriptor.f() != ClassKind.h) {
                classDescriptor = next;
                break;
            }
        }
        KType kType2 = (KType) classDescriptor;
        if (kType2 == null) {
            kType2 = (KType) CollectionsKt.F(upperBounds);
        }
        return kType2 != null ? b(kType2) : Reflection.f24268a.b(Object.class);
    }

    public static final KClass b(KType kType) {
        Intrinsics.h(kType, "<this>");
        KClassifier d = kType.getD();
        if (d != null) {
            return a(d);
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kType);
    }
}
