package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

/* loaded from: classes7.dex */
public final class ErrorFunctionDescriptor extends SimpleFunctionDescriptorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorFunctionDescriptor(ClassDescriptor containingDeclaration) {
        super(containingDeclaration, null, Annotations.Companion.f24350a, Name.l("<Error function>"), CallableMemberDescriptor.Kind.d, SourceElement.f24343a);
        Intrinsics.h(containingDeclaration, "containingDeclaration");
        ErrorEntity[] errorEntityArr = ErrorEntity.d;
        ErrorType errorTypeC = ErrorUtils.c(ErrorTypeKind.h, new String[0]);
        Modality modality = Modality.g;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.e;
        EmptyList emptyList = EmptyList.d;
        L0(null, null, emptyList, emptyList, emptyList, errorTypeC, modality, descriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final /* bridge */ /* synthetic */ CallableMemberDescriptor F0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        F0(classDescriptor, modality, delegatedDescriptorVisibility);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: H0 */
    public final /* bridge */ /* synthetic */ FunctionDescriptor F0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility) {
        F0(declarationDescriptor, modality, descriptorVisibility);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl I0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        Intrinsics.h(newOwner, "newOwner");
        Intrinsics.h(kind, "kind");
        Intrinsics.h(annotations, "annotations");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Object M(CallableDescriptor.UserDataKey userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void Q(Collection overriddenDescriptors) {
        Intrinsics.h(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    /* renamed from: R0 */
    public final SimpleFunctionDescriptor F0(DeclarationDescriptor newOwner, Modality modality, DescriptorVisibility visibility) {
        Intrinsics.h(newOwner, "newOwner");
        Intrinsics.h(visibility, "visibility");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final FunctionDescriptor.CopyBuilder S() {
        return new FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.types.error.ErrorFunctionDescriptor$newCopyBuilder$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder a(ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder b(TypeSubstitution substitution) {
                Intrinsics.h(substitution, "substitution");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor build() {
                return this.f24632a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder c() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder d(Name name) {
                Intrinsics.h(name, "name");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder e(ClassConstructorDescriptor classConstructorDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder f() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder g(KotlinType type) {
                Intrinsics.h(type, "type");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder h() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder i(Annotations additionalAnnotations) {
                Intrinsics.h(additionalAnnotations, "additionalAnnotations");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder j(List list) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder k() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder l() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder m(DescriptorVisibility visibility) {
                Intrinsics.h(visibility, "visibility");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder n() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder o(Modality modality) {
                Intrinsics.h(modality, "modality");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder p(DeclarationDescriptor owner) {
                Intrinsics.h(owner, "owner");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder q(CallableMemberDescriptor.Kind kind) {
                Intrinsics.h(kind, "kind");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final FunctionDescriptor.CopyBuilder r() {
                return this;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isSuspend() {
        return false;
    }
}
