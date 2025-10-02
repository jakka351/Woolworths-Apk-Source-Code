package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f24317a;
    public final ModuleDescriptor b;

    public BuiltInFictitiousFunctionClassFactory(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptorImpl module) {
        Intrinsics.h(module, "module");
        this.f24317a = lockBasedStorageManager;
        this.b = module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final boolean a(FqName packageFqName, Name name) {
        Intrinsics.h(packageFqName, "packageFqName");
        Intrinsics.h(name, "name");
        String strB = name.b();
        Intrinsics.g(strB, "asString(...)");
        if (StringsKt.W(strB, "Function", false) || StringsKt.W(strB, "KFunction", false) || StringsKt.W(strB, "SuspendFunction", false) || StringsKt.W(strB, "KSuspendFunction", false)) {
            FunctionTypeKindExtractor functionTypeKindExtractor = FunctionTypeKindExtractor.c;
            if (FunctionTypeKindExtractor.Companion.a().a(strB, packageFqName) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final ClassDescriptor b(ClassId classId) {
        Intrinsics.h(classId, "classId");
        if (classId.c || classId.g()) {
            return null;
        }
        String str = classId.b.f24500a.f24501a;
        if (!StringsKt.o(str, "Function", false)) {
            return null;
        }
        FqName fqName = classId.f24499a;
        FunctionTypeKindExtractor functionTypeKindExtractor = FunctionTypeKindExtractor.c;
        FunctionTypeKindExtractor.KindWithArity kindWithArityA = FunctionTypeKindExtractor.Companion.a().a(str, fqName);
        if (kindWithArityA == null) {
            return null;
        }
        FunctionTypeKind functionTypeKindA = kindWithArityA.a();
        int iB = kindWithArityA.b();
        List listK = this.b.L(fqName).K();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(next);
            }
        }
        BuiltInsPackageFragment builtInsPackageFragment = (FunctionInterfacePackageFragment) CollectionsKt.F(arrayList2);
        if (builtInsPackageFragment == null) {
            builtInsPackageFragment = (BuiltInsPackageFragment) CollectionsKt.D(arrayList);
        }
        return new FunctionClassDescriptor(this.f24317a, builtInsPackageFragment, functionTypeKindA, iB);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final Collection c(FqName packageFqName) {
        Intrinsics.h(packageFqName, "packageFqName");
        return EmptySet.d;
    }
}
