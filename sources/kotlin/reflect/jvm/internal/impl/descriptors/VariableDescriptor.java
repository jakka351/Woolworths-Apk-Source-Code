package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes.dex */
public interface VariableDescriptor extends ValueDescriptor {
    boolean B0();

    boolean C();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    VariableDescriptor b(TypeSubstitutor typeSubstitutor);

    boolean isConst();

    ConstantValue s0();
}
