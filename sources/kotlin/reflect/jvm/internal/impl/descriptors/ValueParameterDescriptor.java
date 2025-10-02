package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {

    public static final class DefaultImpls {
    }

    boolean P();

    ValueParameterDescriptor X(FunctionInvokeDescriptor functionInvokeDescriptor, Name name, int i);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ValueParameterDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    CallableDescriptor e();

    int getIndex();

    boolean t0();

    boolean v0();

    KotlinType y0();
}
