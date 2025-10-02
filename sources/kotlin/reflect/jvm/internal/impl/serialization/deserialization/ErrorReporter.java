package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* loaded from: classes.dex */
public interface ErrorReporter {

    /* renamed from: a, reason: collision with root package name */
    public static final ErrorReporter f24575a = new AnonymousClass1();

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter$1, reason: invalid class name */
    public static class AnonymousClass1 implements ErrorReporter {
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        public final void a(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        public final void b(ClassDescriptor classDescriptor, ArrayList arrayList) {
        }
    }

    void a(CallableMemberDescriptor callableMemberDescriptor);

    void b(ClassDescriptor classDescriptor, ArrayList arrayList);
}
