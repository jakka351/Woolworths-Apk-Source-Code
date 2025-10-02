package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes7.dex */
public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {
    public final ProtoBuf.TypeAlias n;
    public final NameResolver o;
    public final TypeTable p;
    public final VersionRequirementTable q;
    public final DeserializedContainerSource r;
    public SimpleType s;
    public SimpleType t;
    public List u;
    public SimpleType v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedTypeAliasDescriptor(StorageManager storageManager, DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, DescriptorVisibility visibility, ProtoBuf.TypeAlias proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource) {
        super(storageManager, containingDeclaration, annotations, name, visibility);
        Intrinsics.h(storageManager, "storageManager");
        Intrinsics.h(containingDeclaration, "containingDeclaration");
        Intrinsics.h(visibility, "visibility");
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(typeTable, "typeTable");
        Intrinsics.h(versionRequirementTable, "versionRequirementTable");
        this.n = proto;
        this.o = nameResolver;
        this.p = typeTable;
        this.q = versionRequirementTable;
        this.r = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final TypeTable A() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    public final List I0() {
        List list = this.u;
        if (list != null) {
            return list;
        }
        Intrinsics.p("typeConstructorParameters");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final MessageLite J() {
        return this.n;
    }

    public final void J0(List list, SimpleType underlyingType, SimpleType expandedType) {
        Intrinsics.h(underlyingType, "underlyingType");
        Intrinsics.h(expandedType, "expandedType");
        this.k = list;
        this.s = underlyingType;
        this.t = expandedType;
        this.u = TypeParameterUtilsKt.c(this);
        this.v = H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public final SimpleType Z() {
        SimpleType simpleType = this.t;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.p("expandedType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final NameResolver a0() {
        return this.o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final DeclarationDescriptorNonRoot b(TypeSubstitutor substitutor) {
        Intrinsics.h(substitutor, "substitutor");
        if (substitutor.f24619a.f()) {
            return this;
        }
        DeclarationDescriptor declarationDescriptorE = e();
        Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
        Annotations annotations = getAnnotations();
        Intrinsics.g(annotations, "<get-annotations>(...)");
        Name name = getName();
        Intrinsics.g(name, "getName(...)");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.h, declarationDescriptorE, annotations, name, this.i, this.n, this.o, this.p, this.q, this.r);
        List listU = u();
        SimpleType simpleTypeX0 = x0();
        Variance variance = Variance.f;
        deserializedTypeAliasDescriptor.J0(listU, TypeSubstitutionKt.a(substitutor.i(simpleTypeX0, variance)), TypeSubstitutionKt.a(substitutor.i(Z(), variance)));
        return deserializedTypeAliasDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final DeserializedContainerSource b0() {
        return this.r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public final ClassDescriptor l() {
        if (KotlinTypeKt.a(Z())) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorC = Z().J0().c();
        if (classifierDescriptorC instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorC;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType t() {
        SimpleType simpleType = this.v;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.p("defaultTypeImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public final SimpleType x0() {
        SimpleType simpleType = this.s;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.p("underlyingType");
        throw null;
    }
}
