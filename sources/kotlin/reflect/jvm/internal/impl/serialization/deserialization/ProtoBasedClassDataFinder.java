package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    /* renamed from: a, reason: collision with root package name */
    public final NameResolverImpl f24581a;
    public final BuiltInsBinaryVersion b;
    public final Function1 c;
    public final LinkedHashMap d;

    public ProtoBasedClassDataFinder(ProtoBuf.PackageFragment packageFragment, NameResolverImpl nameResolverImpl, BuiltInsBinaryVersion builtInsBinaryVersion, Function1 function1) {
        this.f24581a = nameResolverImpl;
        this.b = builtInsBinaryVersion;
        this.c = function1;
        List list = packageFragment.j;
        Intrinsics.g(list, "getClass_List(...)");
        List list2 = list;
        int iH = MapsKt.h(CollectionsKt.s(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (Object obj : list2) {
            linkedHashMap.put(NameResolverUtilKt.a(this.f24581a, ((ProtoBuf.Class) obj).h), obj);
        }
        this.d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public final ClassData a(ClassId classId) {
        Intrinsics.h(classId, "classId");
        ProtoBuf.Class r0 = (ProtoBuf.Class) this.d.get(classId);
        if (r0 == null) {
            return null;
        }
        return new ClassData(this.f24581a, r0, this.b, (SourceElement) ((DeserializedPackageFragmentImpl$$Lambda$0) this.c).invoke(classId));
    }
}
