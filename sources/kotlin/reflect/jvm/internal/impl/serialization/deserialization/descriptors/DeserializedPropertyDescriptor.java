package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes7.dex */
public final class DeserializedPropertyDescriptor extends PropertyDescriptorImpl implements DeserializedCallableMemberDescriptor {
    public final ProtoBuf.Property D;
    public final NameResolver E;
    public final TypeTable F;
    public final VersionRequirementTable G;
    public final DeserializedContainerSource H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPropertyDescriptor(DeclarationDescriptor containingDeclaration, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility visibility, boolean z, Name name, CallableMemberDescriptor.Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource) {
        super(containingDeclaration, propertyDescriptor, annotations, modality, visibility, z, name, kind, SourceElement.f24343a, z2, z3, z6, z4, z5);
        Intrinsics.h(containingDeclaration, "containingDeclaration");
        Intrinsics.h(annotations, "annotations");
        Intrinsics.h(modality, "modality");
        Intrinsics.h(visibility, "visibility");
        Intrinsics.h(name, "name");
        Intrinsics.h(kind, "kind");
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(typeTable, "typeTable");
        Intrinsics.h(versionRequirementTable, "versionRequirementTable");
        this.D = proto;
        this.E = nameResolver;
        this.F = typeTable;
        this.G = versionRequirementTable;
        this.H = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final TypeTable A() {
        return this.F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final MessageLite J() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public final PropertyDescriptorImpl L0(DeclarationDescriptor newOwner, Modality newModality, DescriptorVisibility newVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name newName) {
        Intrinsics.h(newOwner, "newOwner");
        Intrinsics.h(newModality, "newModality");
        Intrinsics.h(newVisibility, "newVisibility");
        Intrinsics.h(kind, "kind");
        Intrinsics.h(newName, "newName");
        return new DeserializedPropertyDescriptor(newOwner, propertyDescriptor, getAnnotations(), newModality, newVisibility, this.i, newName, kind, this.q, this.r, isExternal(), this.u, this.s, this.D, this.E, this.F, this.G, this.H);
    }

    public final ProtoBuf.Property P0() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final NameResolver a0() {
        return this.E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final DeserializedContainerSource b0() {
        return this.H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return Flags.E.e(this.D.g).booleanValue();
    }
}
