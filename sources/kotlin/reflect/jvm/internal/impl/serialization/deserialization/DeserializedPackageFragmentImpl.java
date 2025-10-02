package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {
    public final BuiltInsBinaryVersion j;
    public final NameResolverImpl k;
    public final ProtoBasedClassDataFinder l;
    public ProtoBuf.PackageFragment m;
    public DeserializedPackageMemberScope n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(FqName fqName, LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor module, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion) {
        super(module, fqName);
        Intrinsics.h(fqName, "fqName");
        Intrinsics.h(module, "module");
        this.j = builtInsBinaryVersion;
        ProtoBuf.StringTable stringTable = packageFragment.g;
        Intrinsics.g(stringTable, "getStrings(...)");
        ProtoBuf.QualifiedNameTable qualifiedNameTable = packageFragment.h;
        Intrinsics.g(qualifiedNameTable, "getQualifiedNames(...)");
        NameResolverImpl nameResolverImpl = new NameResolverImpl(stringTable, qualifiedNameTable);
        this.k = nameResolverImpl;
        this.l = new ProtoBasedClassDataFinder(packageFragment, nameResolverImpl, builtInsBinaryVersion, new DeserializedPackageFragmentImpl$$Lambda$0());
        this.m = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public final ProtoBasedClassDataFinder H0() {
        return this.l;
    }

    public final void I0(DeserializationComponents components) {
        Intrinsics.h(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.m;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.m = null;
        ProtoBuf.Package r4 = packageFragment.i;
        Intrinsics.g(r4, "getPackage(...)");
        this.n = new DeserializedPackageMemberScope(this, r4, this.k, this.j, null, components, "scope of " + this, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$$Lambda$1
            public final DeserializedPackageFragmentImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setKeySet = this.d.l.d.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    ClassId classId = (ClassId) obj;
                    if (!classId.g() && !ClassDeserializer.c.contains(classId)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ClassId) it.next()).f());
                }
                return arrayList2;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public final MemberScope s() {
        DeserializedPackageMemberScope deserializedPackageMemberScope = this.n;
        if (deserializedPackageMemberScope != null) {
            return deserializedPackageMemberScope;
        }
        Intrinsics.p("_memberScope");
        throw null;
    }
}
