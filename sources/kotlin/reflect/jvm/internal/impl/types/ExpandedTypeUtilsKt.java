package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.a;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes7.dex */
public final class ExpandedTypeUtilsKt {
    public static final KotlinTypeMarker a(KotlinTypeMarker receiver, HashSet hashSet) {
        KotlinTypeMarker kotlinTypeMarkerA;
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.f24629a;
        TypeConstructor typeConstructorA = simpleClassicTypeSystemContext.A(receiver);
        if (!hashSet.add(typeConstructorA)) {
            return null;
        }
        TypeParameterDescriptor typeParameterDescriptorS = ClassicTypeSystemContext.DefaultImpls.s(typeConstructorA);
        if (typeParameterDescriptorS != null) {
            if (!(typeParameterDescriptorS instanceof TypeParameterDescriptor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeParameterDescriptorS);
                sb.append(", ");
                throw new IllegalArgumentException(a.i(Reflection.f24268a, typeParameterDescriptorS.getClass(), sb).toString());
            }
            KotlinTypeMarker kotlinTypeMarkerI = TypeUtilsKt.i(typeParameterDescriptorS);
            KotlinTypeMarker kotlinTypeMarkerA2 = a(kotlinTypeMarkerI, hashSet);
            if (kotlinTypeMarkerA2 != null) {
                return ((kotlinTypeMarkerA2 instanceof SimpleTypeMarker) && ClassicTypeSystemContext.DefaultImpls.J((SimpleTypeMarker) kotlinTypeMarkerA2) && ClassicTypeSystemContext.DefaultImpls.I(receiver) && (ClassicTypeSystemContext.DefaultImpls.D(simpleClassicTypeSystemContext.A(kotlinTypeMarkerI)) || ((kotlinTypeMarkerI instanceof SimpleTypeMarker) && ClassicTypeSystemContext.DefaultImpls.J((SimpleTypeMarker) kotlinTypeMarkerI)))) ? simpleClassicTypeSystemContext.t0(kotlinTypeMarkerI) : (ClassicTypeSystemContext.DefaultImpls.I(kotlinTypeMarkerA2) || !ClassicTypeSystemContext.DefaultImpls.G(receiver)) ? kotlinTypeMarkerA2 : simpleClassicTypeSystemContext.t0(kotlinTypeMarkerA2);
            }
            return null;
        }
        if (ClassicTypeSystemContext.DefaultImpls.D(typeConstructorA)) {
            Intrinsics.h(receiver, "$receiver");
            if (!(receiver instanceof KotlinType)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(receiver);
                sb2.append(", ");
                throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb2).toString());
            }
            SimpleType simpleTypeI = InlineClassesUtilsKt.i((KotlinType) receiver);
            if (simpleTypeI == null || (kotlinTypeMarkerA = a(simpleTypeI, hashSet)) == null) {
                return null;
            }
            if (!ClassicTypeSystemContext.DefaultImpls.I(receiver)) {
                return kotlinTypeMarkerA;
            }
            if (!ClassicTypeSystemContext.DefaultImpls.I(kotlinTypeMarkerA) && (!(kotlinTypeMarkerA instanceof SimpleTypeMarker) || !ClassicTypeSystemContext.DefaultImpls.J((SimpleTypeMarker) kotlinTypeMarkerA))) {
                return simpleClassicTypeSystemContext.t0(kotlinTypeMarkerA);
            }
        }
        return receiver;
    }
}
