package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UtilKt {
    public static final ArrayList a(ArrayList arrayList, Collection oldValueParameters, FunctionDescriptor functionDescriptor) {
        Intrinsics.h(oldValueParameters, "oldValueParameters");
        arrayList.size();
        oldValueParameters.size();
        ArrayList arrayListQ0 = CollectionsKt.Q0(arrayList, oldValueParameters);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayListQ0, 10));
        Iterator it = arrayListQ0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            KotlinType kotlinType = (KotlinType) pair.d;
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.e;
            int index = valueParameterDescriptor.getIndex();
            Annotations annotations = valueParameterDescriptor.getAnnotations();
            Name name = valueParameterDescriptor.getName();
            Intrinsics.g(name, "getName(...)");
            boolean zP = valueParameterDescriptor.P();
            boolean zV0 = valueParameterDescriptor.v0();
            boolean zT0 = valueParameterDescriptor.t0();
            KotlinType kotlinTypeF = valueParameterDescriptor.y0() != null ? DescriptorUtilsKt.j(functionDescriptor).p().f(kotlinType) : null;
            SourceElement sourceElementG = valueParameterDescriptor.g();
            Intrinsics.g(sourceElementG, "getSource(...)");
            arrayList2.add(new ValueParameterDescriptorImpl(functionDescriptor, null, index, annotations, name, kotlinType, zP, zV0, zT0, kotlinTypeF, sourceElementG));
        }
        return arrayList2;
    }

    public static final LazyJavaStaticClassScope b(ClassDescriptor classDescriptor) {
        ClassDescriptor classDescriptor2;
        ClassifierDescriptor classifierDescriptorC;
        Intrinsics.h(classDescriptor, "<this>");
        int i = DescriptorUtilsKt.f24544a;
        Iterator it = classDescriptor.t().J0().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                classDescriptor2 = null;
                break;
            }
            KotlinType kotlinType = (KotlinType) it.next();
            if (!KotlinBuiltIns.y(kotlinType)) {
                classifierDescriptorC = kotlinType.J0().c();
                int i2 = DescriptorUtils.f24530a;
                if (DescriptorUtils.n(classifierDescriptorC, ClassKind.d) || DescriptorUtils.n(classifierDescriptorC, ClassKind.f)) {
                    break;
                }
            }
        }
        Intrinsics.f(classifierDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        classDescriptor2 = (ClassDescriptor) classifierDescriptorC;
        if (classDescriptor2 == null) {
            return null;
        }
        MemberScope memberScopeQ0 = classDescriptor2.q0();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = memberScopeQ0 instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) memberScopeQ0 : null;
        return lazyJavaStaticClassScope == null ? b(classDescriptor2) : lazyJavaStaticClassScope;
    }
}
