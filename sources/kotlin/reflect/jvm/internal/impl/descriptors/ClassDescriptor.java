package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

/* loaded from: classes.dex */
public interface ClassDescriptor extends ClassOrPackageFragmentDescriptor, ClassifierDescriptorWithTypeParameters {
    MemberScope G();

    boolean G0();

    MemberScope H();

    ReceiverParameterDescriptor U();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassDescriptor a();

    ClassKind f();

    ValueClassRepresentation f0();

    DescriptorVisibility getVisibility();

    List i0();

    boolean isInline();

    boolean j0();

    Modality k();

    boolean l0();

    Collection n();

    Collection o();

    MemberScope q0();

    ClassDescriptor r0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    SimpleType t();

    List u();

    MemberScope u0(TypeSubstitution typeSubstitution);

    boolean w();

    ClassConstructorDescriptor z();
}
