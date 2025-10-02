package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UnsignedTypes {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f24316a;
    public static final Set b;
    public static final HashMap c;
    public static final HashMap d;
    public static final LinkedHashSet e;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.e);
        }
        f24316a = CollectionsKt.L0(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.d);
        }
        b = CollectionsKt.L0(arrayList2);
        c = new HashMap();
        d = new HashMap();
        MapsKt.f(new Pair(UnsignedArrayType.e, Name.e("ubyteArrayOf")), new Pair(UnsignedArrayType.f, Name.e("ushortArrayOf")), new Pair(UnsignedArrayType.g, Name.e("uintArrayOf")), new Pair(UnsignedArrayType.h, Name.e("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.f.f());
        }
        e = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            HashMap map = c;
            ClassId classId = unsignedType3.f;
            ClassId classId2 = unsignedType3.d;
            map.put(classId, classId2);
            d.put(classId2, unsignedType3.f);
        }
    }

    public static ClassId a(ClassId classId) {
        return (ClassId) c.get(classId);
    }

    public static boolean b(Name name) {
        Intrinsics.h(name, "name");
        return e.contains(name);
    }

    public static final boolean c(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorC;
        if (TypeUtils.n(kotlinType) || (classifierDescriptorC = kotlinType.J0().c()) == null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorE = classifierDescriptorC.e();
        return (declarationDescriptorE instanceof PackageFragmentDescriptor) && Intrinsics.c(((PackageFragmentDescriptor) declarationDescriptorE).d(), StandardNames.l) && f24316a.contains(classifierDescriptorC.getName());
    }
}
