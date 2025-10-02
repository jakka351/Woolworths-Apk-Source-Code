package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {
    public static final Name g;
    public static final ClassId h;

    /* renamed from: a, reason: collision with root package name */
    public final ModuleDescriptorImpl f24323a;
    public final Function1 b = JvmBuiltInClassDescriptorFactory$$Lambda$1.d;
    public final NotNullLazyValue c;
    public static final /* synthetic */ KProperty[] e = {Reflection.f24268a.h(new PropertyReference1Impl(JvmBuiltInClassDescriptorFactory.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};
    public static final Companion d = new Companion();
    public static final FqName f = StandardNames.l;

    public static final class Companion {
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.c;
        g = fqNameUnsafe.f();
        h = ClassId.Companion.b(fqNameUnsafe.g());
    }

    public JvmBuiltInClassDescriptorFactory(final LockBasedStorageManager lockBasedStorageManager, ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f24323a = moduleDescriptorImpl;
        this.c = lockBasedStorageManager.d(new Function0(this, lockBasedStorageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$$Lambda$0
            public final JvmBuiltInClassDescriptorFactory d;
            public final LockBasedStorageManager e;

            {
                this.d = this;
                this.e = lockBasedStorageManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory = this.d;
                Function1 function1 = jvmBuiltInClassDescriptorFactory.b;
                ModuleDescriptorImpl moduleDescriptorImpl2 = jvmBuiltInClassDescriptorFactory.f24323a;
                DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) function1.invoke(moduleDescriptorImpl2);
                Name name = JvmBuiltInClassDescriptorFactory.g;
                Modality modality = Modality.h;
                ClassKind classKind = ClassKind.e;
                List listQ = CollectionsKt.Q(moduleDescriptorImpl2.g.e());
                LockBasedStorageManager lockBasedStorageManager2 = this.e;
                ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(declarationDescriptor, name, modality, classKind, listQ, lockBasedStorageManager2);
                classDescriptorImpl.I0(new CloneableClassScope(classDescriptorImpl, lockBasedStorageManager2), EmptySet.d, null);
                return classDescriptorImpl;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final boolean a(FqName packageFqName, Name name) {
        Intrinsics.h(packageFqName, "packageFqName");
        Intrinsics.h(name, "name");
        return name.equals(g) && packageFqName.equals(f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final ClassDescriptor b(ClassId classId) {
        Intrinsics.h(classId, "classId");
        if (!classId.equals(h)) {
            return null;
        }
        return (ClassDescriptorImpl) StorageKt.a(this.c, e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final Collection c(FqName packageFqName) {
        Intrinsics.h(packageFqName, "packageFqName");
        if (!packageFqName.equals(f)) {
            return EmptySet.d;
        }
        return SetsKt.i((ClassDescriptorImpl) StorageKt.a(this.c, e[0]));
    }
}
