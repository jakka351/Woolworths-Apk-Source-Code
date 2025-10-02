package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypesJVMKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24273a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24273a = iArr;
        }
    }

    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence sequenceM = SequencesKt.m(type, TypesJVMKt$typeToString$unwrap$1.d);
        return ((Class) SequencesKt.q(sequenceM)).getName() + StringsKt.P(SequencesKt.d(sequenceM), "[]");
    }

    public static final Type b(KType kType, boolean z) {
        KClassifier kClassifierE = kType.e();
        if (kClassifierE instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) kClassifierE);
        }
        if (!(kClassifierE instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
        }
        KClass kClass = (KClass) kClassifierE;
        Class clsC = z ? JvmClassMappingKt.c(kClass) : JvmClassMappingKt.b(kClass);
        List listB = kType.b();
        if (listB.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return c(clsC, listB);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.p0(listB);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        KVariance kVariance = kTypeProjection.f24271a;
        KType kType2 = kTypeProjection.b;
        int i = kVariance == null ? -1 : WhenMappings.f24273a[kVariance.ordinal()];
        if (i == -1 || i == 1) {
            return clsC;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.e(kType2);
        Type typeB = b(kType2, false);
        return typeB instanceof Class ? clsC : new GenericArrayTypeImpl(typeB);
    }

    public static final Type c(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(d((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeC = c(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(d((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeC, arrayList3);
    }

    public static final Type d(KTypeProjection kTypeProjection) {
        KVariance kVariance = kTypeProjection.f24271a;
        if (kVariance == null) {
            return WildcardTypeImpl.f;
        }
        KType kType = kTypeProjection.b;
        Intrinsics.e(kType);
        int iOrdinal = kVariance.ordinal();
        if (iOrdinal == 0) {
            return b(kType, true);
        }
        if (iOrdinal == 1) {
            return new WildcardTypeImpl(null, b(kType, true));
        }
        if (iOrdinal == 2) {
            return new WildcardTypeImpl(b(kType, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
