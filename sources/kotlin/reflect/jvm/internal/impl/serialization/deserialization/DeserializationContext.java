package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* loaded from: classes.dex */
public final class DeserializationContext {

    /* renamed from: a, reason: collision with root package name */
    public final DeserializationComponents f24572a;
    public final NameResolver b;
    public final DeclarationDescriptor c;
    public final TypeTable d;
    public final VersionRequirementTable e;
    public final BinaryVersion f;
    public final DeserializedContainerSource g;
    public final TypeDeserializer h;
    public final MemberDeserializer i;

    public DeserializationContext(DeserializationComponents components, NameResolver nameResolver, DeclarationDescriptor containingDeclaration, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource, TypeDeserializer typeDeserializer, List typeParameters) {
        String strA;
        Intrinsics.h(components, "components");
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(containingDeclaration, "containingDeclaration");
        Intrinsics.h(versionRequirementTable, "versionRequirementTable");
        Intrinsics.h(metadataVersion, "metadataVersion");
        Intrinsics.h(typeParameters, "typeParameters");
        this.f24572a = components;
        this.b = nameResolver;
        this.c = containingDeclaration;
        this.d = typeTable;
        this.e = versionRequirementTable;
        this.f = metadataVersion;
        this.g = deserializedContainerSource;
        this.h = new TypeDeserializer(this, typeDeserializer, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (deserializedContainerSource == null || (strA = deserializedContainerSource.a()) == null) ? "[container not found]" : strA);
        this.i = new MemberDeserializer(this);
    }

    public final DeserializationContext a(DeclarationDescriptor declarationDescriptor, List typeParameterProtos, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion) {
        Intrinsics.h(typeParameterProtos, "typeParameterProtos");
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(versionRequirementTable, "versionRequirementTable");
        Intrinsics.h(metadataVersion, "metadataVersion");
        int i = metadataVersion.b;
        if ((i != 1 || metadataVersion.c < 4) && i <= 1) {
            versionRequirementTable = this.e;
        }
        return new DeserializationContext(this.f24572a, nameResolver, declarationDescriptor, typeTable, versionRequirementTable, metadataVersion, this.g, this.h, typeParameterProtos);
    }
}
