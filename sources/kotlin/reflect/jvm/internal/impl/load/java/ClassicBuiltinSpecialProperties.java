package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ClassicBuiltinSpecialProperties {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static String a(CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        KotlinBuiltIns.A(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorB = DescriptorUtilsKt.b(DescriptorUtilsKt.l(callableMemberDescriptor), ClassicBuiltinSpecialProperties$$Lambda$0.d);
        if (callableMemberDescriptorB == null || (name = (Name) BuiltinSpecialProperties.f24394a.get(DescriptorUtilsKt.g(callableMemberDescriptorB))) == null) {
            return null;
        }
        return name.b();
    }

    public static boolean b(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.h(callableMemberDescriptor, "callableMemberDescriptor");
        if (!BuiltinSpecialProperties.d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (CollectionsKt.t(BuiltinSpecialProperties.c, DescriptorUtilsKt.c(callableMemberDescriptor)) && callableMemberDescriptor.h().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.A(callableMemberDescriptor)) {
            return false;
        }
        Collection collectionQ = callableMemberDescriptor.q();
        Intrinsics.g(collectionQ, "getOverriddenDescriptors(...)");
        Collection<CallableMemberDescriptor> collection = collectionQ;
        if (collection.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            Intrinsics.e(callableMemberDescriptor2);
            if (b(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }
}
