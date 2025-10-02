package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

/* loaded from: classes.dex */
public final class RuntimeErrorReporter implements ErrorReporter {
    public static final RuntimeErrorReporter b = new RuntimeErrorReporter();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public final void a(CallableMemberDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public final void b(ClassDescriptor classDescriptor, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + classDescriptor.getName() + ", unresolved classes " + arrayList);
    }
}
