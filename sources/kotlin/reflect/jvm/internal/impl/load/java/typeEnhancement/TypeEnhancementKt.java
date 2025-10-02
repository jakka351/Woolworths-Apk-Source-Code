package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes7.dex */
public final class TypeEnhancementKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Annotations f24456a;
    public static final EnhancedTypeAnnotations b;

    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24457a;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                NullabilityQualifier nullabilityQualifier = NullabilityQualifier.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24457a = iArr;
        }
    }

    static {
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.p;
        Intrinsics.g(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f24456a = new EnhancedTypeAnnotations(ENHANCED_NULLABILITY_ANNOTATION);
        FqName ENHANCED_MUTABILITY_ANNOTATION = JvmAnnotationNames.q;
        Intrinsics.g(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        b = new EnhancedTypeAnnotations(ENHANCED_MUTABILITY_ANNOTATION);
    }

    public static final Annotations a(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? new CompositeAnnotations(CollectionsKt.G0(arrayList)) : (Annotations) CollectionsKt.n0(arrayList);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    public static final ClassDescriptor b(ClassifierDescriptor classifierDescriptor, JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        if (typeComponentPosition != TypeComponentPosition.f && (classifierDescriptor instanceof ClassDescriptor)) {
            if (javaTypeQualifiers.b == MutabilityQualifier.d && typeComponentPosition == TypeComponentPosition.d) {
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptor;
                String str = JavaToKotlinClassMap.f24321a;
                FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(classDescriptor);
                HashMap map = JavaToKotlinClassMap.j;
                if (map.containsKey(fqNameUnsafeG)) {
                    FqName fqName = (FqName) map.get(DescriptorUtils.g(classDescriptor));
                    if (fqName != null) {
                        return DescriptorUtilsKt.e(classDescriptor).j(fqName);
                    }
                    throw new IllegalArgumentException("Given class " + classDescriptor + " is not a mutable collection");
                }
            }
            if (javaTypeQualifiers.b == MutabilityQualifier.e && typeComponentPosition == TypeComponentPosition.e) {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) classifierDescriptor;
                String str2 = JavaToKotlinClassMap.f24321a;
                if (JavaToKotlinClassMap.k.containsKey(DescriptorUtils.g(classDescriptor2))) {
                    return JavaToKotlinClassMapper.a(classDescriptor2);
                }
            }
        }
        return null;
    }

    public static final Boolean d(JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        if (typeComponentPosition == TypeComponentPosition.f) {
            return null;
        }
        NullabilityQualifier nullabilityQualifier = javaTypeQualifiers.f24446a;
        int i = nullabilityQualifier == null ? -1 : WhenMappings.f24457a[nullabilityQualifier.ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final Annotations e() {
        return f24456a;
    }
}
