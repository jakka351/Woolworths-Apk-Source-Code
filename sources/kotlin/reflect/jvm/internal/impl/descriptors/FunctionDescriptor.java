package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes.dex */
public interface FunctionDescriptor extends CallableMemberDescriptor {

    /* loaded from: classes7.dex */
    public interface CopyBuilder<D extends FunctionDescriptor> {
        CopyBuilder a(ReceiverParameterDescriptor receiverParameterDescriptor);

        CopyBuilder b(TypeSubstitution typeSubstitution);

        FunctionDescriptor build();

        CopyBuilder c();

        CopyBuilder d(Name name);

        CopyBuilder e(ClassConstructorDescriptor classConstructorDescriptor);

        CopyBuilder f();

        CopyBuilder g(KotlinType kotlinType);

        CopyBuilder h();

        CopyBuilder i(Annotations annotations);

        CopyBuilder j(List list);

        CopyBuilder k();

        CopyBuilder l();

        CopyBuilder m(DescriptorVisibility descriptorVisibility);

        CopyBuilder n();

        CopyBuilder o(Modality modality);

        CopyBuilder p(DeclarationDescriptor declarationDescriptor);

        CopyBuilder q(CallableMemberDescriptor.Kind kind);

        CopyBuilder r();
    }

    boolean D0();

    boolean R();

    CopyBuilder S();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    FunctionDescriptor a();

    FunctionDescriptor b(TypeSubstitutor typeSubstitutor);

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    FunctionDescriptor w0();

    boolean y();
}
