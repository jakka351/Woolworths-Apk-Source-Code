package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class ClassDeserializer {
    public static final Set c = SetsKt.i(ClassId.Companion.b(StandardNames.FqNames.c.g()));

    /* renamed from: a, reason: collision with root package name */
    public final DeserializationComponents f24567a;
    public final MemoizedFunctionToNullable b;

    public static final class ClassKey {

        /* renamed from: a, reason: collision with root package name */
        public final ClassId f24568a;
        public final ClassData b;

        public ClassKey(ClassId classId, ClassData classData) {
            Intrinsics.h(classId, "classId");
            this.f24568a = classId;
            this.b = classData;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ClassKey) {
                return Intrinsics.c(this.f24568a, ((ClassKey) obj).f24568a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f24568a.hashCode();
        }
    }

    public static final class Companion {
    }

    public ClassDeserializer(DeserializationComponents deserializationComponents) {
        this.f24567a = deserializationComponents;
        this.b = deserializationComponents.f24570a.b(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$$Lambda$0
            public final ClassDeserializer d;

            {
                this.d = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ClassData classDataA;
                PackageFragmentDescriptor next;
                NameResolver nameResolver;
                DeserializationContext deserializationContextA;
                ClassDeserializer.ClassKey key = (ClassDeserializer.ClassKey) obj;
                Set set = ClassDeserializer.c;
                Intrinsics.h(key, "key");
                ClassId classId = key.f24568a;
                ClassDeserializer classDeserializer = this.d;
                DeserializationComponents deserializationComponents2 = classDeserializer.f24567a;
                Iterator it = deserializationComponents2.k.iterator();
                while (it.hasNext()) {
                    ClassDescriptor classDescriptorB = ((ClassDescriptorFactory) it.next()).b(classId);
                    if (classDescriptorB != null) {
                        return classDescriptorB;
                    }
                }
                if (!ClassDeserializer.c.contains(classId) && ((classDataA = key.b) != null || (classDataA = deserializationComponents2.d.a(classId)) != null)) {
                    NameResolver nameResolver2 = classDataA.f24566a;
                    ProtoBuf.Class r9 = classDataA.b;
                    BinaryVersion binaryVersion = classDataA.c;
                    SourceElement sourceElement = classDataA.d;
                    ClassId classIdE = classId.e();
                    if (classIdE != null) {
                        ClassDescriptor classDescriptorA = classDeserializer.a(classIdE, null);
                        DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorA instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorA : null;
                        if (deserializedClassDescriptor != null) {
                            if (deserializedClassDescriptor.I0().m().contains(classId.f())) {
                                deserializationContextA = deserializedClassDescriptor.o;
                                nameResolver = nameResolver2;
                                return new DeserializedClassDescriptor(deserializationContextA, r9, nameResolver, binaryVersion, sourceElement);
                            }
                        }
                    } else {
                        Iterator it2 = PackageFragmentProviderKt.c(deserializationComponents2.f, classId.f24499a).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = 0;
                                break;
                            }
                            next = it2.next();
                            PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                            if (!(packageFragmentDescriptor instanceof DeserializedPackageFragment)) {
                                break;
                            }
                            if (((DeserializedMemberScope) ((DeserializedPackageFragmentImpl) ((DeserializedPackageFragment) packageFragmentDescriptor)).s()).m().contains(classId.f())) {
                                break;
                            }
                        }
                        PackageFragmentDescriptor packageFragmentDescriptor2 = next;
                        if (packageFragmentDescriptor2 != null) {
                            ProtoBuf.TypeTable typeTable = r9.H;
                            Intrinsics.g(typeTable, "getTypeTable(...)");
                            TypeTable typeTable2 = new TypeTable(typeTable);
                            VersionRequirementTable versionRequirementTable = VersionRequirementTable.b;
                            ProtoBuf.VersionRequirementTable versionRequirementTable2 = r9.J;
                            Intrinsics.g(versionRequirementTable2, "getVersionRequirementTable(...)");
                            nameResolver = nameResolver2;
                            deserializationContextA = deserializationComponents2.a(packageFragmentDescriptor2, nameResolver, typeTable2, VersionRequirementTable.Companion.a(versionRequirementTable2), binaryVersion, null);
                            return new DeserializedClassDescriptor(deserializationContextA, r9, nameResolver, binaryVersion, sourceElement);
                        }
                    }
                }
                return null;
            }
        });
    }

    public final ClassDescriptor a(ClassId classId, ClassData classData) {
        Intrinsics.h(classId, "classId");
        return (ClassDescriptor) this.b.invoke(new ClassKey(classId, classData));
    }
}
