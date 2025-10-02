package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ModalityUtilsKt {
    public static final boolean a(ClassDescriptor classDescriptor) {
        Intrinsics.h(classDescriptor, "<this>");
        return classDescriptor.k() == Modality.e && classDescriptor.f() != ClassKind.f;
    }
}
