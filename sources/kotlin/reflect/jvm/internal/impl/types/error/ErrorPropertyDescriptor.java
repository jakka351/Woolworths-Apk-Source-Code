package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes.dex */
public final class ErrorPropertyDescriptor implements PropertyDescriptor {
    public final /* synthetic */ PropertyDescriptorImpl d;

    public ErrorPropertyDescriptor() {
        ErrorUtils errorUtils = ErrorUtils.f24634a;
        ErrorClassDescriptor errorClassDescriptor = ErrorUtils.c;
        Modality modality = Modality.g;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.e;
        ErrorEntity[] errorEntityArr = ErrorEntity.d;
        PropertyDescriptorImpl propertyDescriptorImplK0 = PropertyDescriptorImpl.K0(errorClassDescriptor, modality, descriptorVisibility, true, Name.l("<Error property>"), CallableMemberDescriptor.Kind.d, SourceElement.f24343a);
        ErrorType errorType = ErrorUtils.e;
        EmptyList emptyList = EmptyList.d;
        propertyDescriptorImplK0.O0(errorType, emptyList, null, null, emptyList);
        this.d = propertyDescriptorImplK0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List A0() {
        List listA0 = this.d.A0();
        Intrinsics.g(listA0, "getContextReceiverParameters(...)");
        return listA0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean B0() {
        return this.d.q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean C() {
        return this.d.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final FieldDescriptor D() {
        return this.d.C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor F0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        return this.d.F0(classDescriptor, modality, delegatedDescriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Object M(CallableDescriptor.UserDataKey userDataKey) {
        this.d.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final FieldDescriptor N() {
        return this.d.B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void Q(Collection collection) {
        this.d.n = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        PropertyDescriptorImpl propertyDescriptorImpl = this.d;
        propertyDescriptorImpl.getClass();
        return declarationDescriptorVisitor.b(propertyDescriptorImpl, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public final boolean W() {
        return this.d.u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public final PropertyDescriptor H0() {
        PropertyDescriptor propertyDescriptorA = this.d.H0();
        Intrinsics.g(propertyDescriptorA, "getOriginal(...)");
        return propertyDescriptorA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final PropertyDescriptor b(TypeSubstitutor substitutor) {
        Intrinsics.h(substitutor, "substitutor");
        return this.d.b(substitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final /* bridge */ /* synthetic */ VariableDescriptor b(TypeSubstitutor typeSubstitutor) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final PropertySetterDescriptor c() {
        return this.d.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor c0() {
        return this.d.w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor e() {
        DeclarationDescriptor declarationDescriptorE = this.d.e();
        Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
        return declarationDescriptorE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor e0() {
        return this.d.x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kindF = this.d.f();
        Intrinsics.g(kindF, "getKind(...)");
        return kindF;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement g() {
        SourceElement sourceElementG = this.d.g();
        Intrinsics.g(sourceElementG, "getSource(...)");
        return sourceElementG;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        Annotations annotations = this.d.getAnnotations();
        Intrinsics.g(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final PropertyGetterDescriptorImpl getGetter() {
        return this.d.z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        Name name = this.d.getName();
        Intrinsics.g(name, "getName(...)");
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final KotlinType getReturnType() {
        return this.d.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    public final KotlinType getType() {
        KotlinType type = this.d.getType();
        Intrinsics.g(type, "getType(...)");
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List getTypeParameters() {
        return this.d.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.d.getVisibility();
        Intrinsics.g(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List h() {
        this.d.h();
        List list = Collections.EMPTY_LIST;
        Intrinsics.g(list, "getValueParameters(...)");
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean h0() {
        this.d.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean isConst() {
        return this.d.r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return this.d.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality k() {
        Modality modalityK = this.d.k();
        Intrinsics.g(modalityK, "getModality(...)");
        return modalityK;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final boolean m0() {
        this.d.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean p0() {
        return this.d.s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Collection q() {
        Collection collectionQ = this.d.q();
        Intrinsics.g(collectionQ, "getOverriddenDescriptors(...)");
        return collectionQ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final ConstantValue s0() {
        return this.d.s0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final ArrayList v() {
        return this.d.v();
    }
}
