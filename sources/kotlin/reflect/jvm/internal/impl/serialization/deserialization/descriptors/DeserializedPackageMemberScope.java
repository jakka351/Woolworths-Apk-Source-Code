package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;

@SourceDebugExtension
/* loaded from: classes7.dex */
public class DeserializedPackageMemberScope extends DeserializedMemberScope {
    public final PackageFragmentDescriptor g;
    public final String h;
    public final FqName i;

    public DeserializedPackageMemberScope(PackageFragmentDescriptor packageFragmentDescriptor, ProtoBuf.Package proto, NameResolver nameResolver, BinaryVersion metadataVersion, JvmPackagePartSource jvmPackagePartSource, DeserializationComponents components, String debugName, Function0 function0) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(metadataVersion, "metadataVersion");
        Intrinsics.h(components, "components");
        Intrinsics.h(debugName, "debugName");
        ProtoBuf.TypeTable typeTable = proto.j;
        Intrinsics.g(typeTable, "getTypeTable(...)");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable versionRequirementTable = VersionRequirementTable.b;
        ProtoBuf.VersionRequirementTable versionRequirementTable2 = proto.k;
        Intrinsics.g(versionRequirementTable2, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextA = components.a(packageFragmentDescriptor, nameResolver, typeTable2, VersionRequirementTable.Companion.a(versionRequirementTable2), metadataVersion, jvmPackagePartSource);
        List list = proto.g;
        Intrinsics.g(list, "getFunctionList(...)");
        List list2 = proto.h;
        Intrinsics.g(list2, "getPropertyList(...)");
        List list3 = proto.i;
        Intrinsics.g(list3, "getTypeAliasList(...)");
        super(deserializationContextA, list, list2, list3, function0);
        this.g = packageFragmentDescriptor;
        this.h = debugName;
        this.i = packageFragmentDescriptor.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        UtilsKt.b(this.b.f24572a.i, location, this.g, name);
        return super.f(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.d;
        Collection collectionI = i(kindFilter, function1);
        Iterable iterable = this.b.f24572a.k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((ClassDescriptorFactory) it.next()).c(this.i), arrayList);
        }
        return CollectionsKt.c0(arrayList, collectionI);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void h(ArrayList arrayList, Function1 function1) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final ClassId l(Name name) {
        Intrinsics.h(name, "name");
        return new ClassId(this.i, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set n() {
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set o() {
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set p() {
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final boolean q(Name name) {
        Intrinsics.h(name, "name");
        if (super.q(name)) {
            return true;
        }
        Iterable iterable = this.b.f24572a.k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((ClassDescriptorFactory) it.next()).a(this.i, name)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.h;
    }
}
