package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KClassifierImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class KClassifiers {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24274a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24274a = iArr;
        }
    }

    public static final KTypeImpl a(KClassifier kClassifier, List arguments, boolean z, List annotations) {
        ClassifierDescriptor descriptor;
        TypeAttributes typeAttributes;
        TypeProjectionBase starProjectionImpl;
        Intrinsics.h(kClassifier, "<this>");
        Intrinsics.h(arguments, "arguments");
        Intrinsics.h(annotations, "annotations");
        KClassifierImpl kClassifierImpl = kClassifier instanceof KClassifierImpl ? (KClassifierImpl) kClassifier : null;
        if (kClassifierImpl == null || (descriptor = kClassifierImpl.getDescriptor()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + kClassifier + " (" + kClassifier.getClass() + ')');
        }
        TypeConstructor typeConstructorM = descriptor.m();
        Intrinsics.g(typeConstructorM, "getTypeConstructor(...)");
        List parameters = typeConstructorM.getParameters();
        Intrinsics.g(parameters, "getParameters(...)");
        if (parameters.size() != arguments.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        if (annotations.isEmpty()) {
            TypeAttributes.e.getClass();
            typeAttributes = TypeAttributes.f;
        } else {
            TypeAttributes.e.getClass();
            typeAttributes = TypeAttributes.f;
        }
        List parameters2 = typeConstructorM.getParameters();
        Intrinsics.g(parameters2, "getParameters(...)");
        List list = arguments;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            KTypeImpl kTypeImpl = (KTypeImpl) kTypeProjection.b;
            KotlinType kotlinType = kTypeImpl != null ? kTypeImpl.d : null;
            KVariance kVariance = kTypeProjection.f24271a;
            int i3 = kVariance == null ? -1 : WhenMappings.f24274a[kVariance.ordinal()];
            if (i3 == -1) {
                Object obj2 = parameters2.get(i);
                Intrinsics.g(obj2, "get(...)");
                starProjectionImpl = new StarProjectionImpl((TypeParameterDescriptor) obj2);
            } else if (i3 == 1) {
                Variance variance = Variance.f;
                Intrinsics.e(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(kotlinType, variance);
            } else if (i3 == 2) {
                Variance variance2 = Variance.g;
                Intrinsics.e(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(kotlinType, variance2);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Variance variance3 = Variance.h;
                Intrinsics.e(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(kotlinType, variance3);
            }
            arrayList.add(starProjectionImpl);
            i = i2;
        }
        return new KTypeImpl(KotlinTypeFactory.d(typeAttributes, typeConstructorM, arrayList, z, null), null);
    }
}
