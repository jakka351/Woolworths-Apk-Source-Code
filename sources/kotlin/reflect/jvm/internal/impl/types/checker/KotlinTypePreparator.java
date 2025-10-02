package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class KotlinTypePreparator extends AbstractTypePreparator {

    public static final class Default extends KotlinTypePreparator {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f24624a = new Default();
    }

    public static SimpleType c(SimpleType simpleType) {
        KotlinType type;
        TypeConstructor typeConstructorJ0 = simpleType.J0();
        IntersectionTypeConstructor intersectionTypeConstructorI = null;
        unwrappedTypeM0 = null;
        UnwrappedType unwrappedTypeM0 = null;
        if (typeConstructorJ0 instanceof CapturedTypeConstructorImpl) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = (CapturedTypeConstructorImpl) typeConstructorJ0;
            TypeProjection projection = capturedTypeConstructorImpl.getProjection();
            if (projection.b() != Variance.g) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                unwrappedTypeM0 = type.M0();
            }
            UnwrappedType unwrappedType = unwrappedTypeM0;
            if (capturedTypeConstructorImpl.e() == null) {
                TypeProjection projection2 = capturedTypeConstructorImpl.getProjection();
                Collection collectionA = capturedTypeConstructorImpl.a();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(collectionA, 10));
                Iterator it = collectionA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).M0());
                }
                capturedTypeConstructorImpl.f(new NewCapturedTypeConstructor(projection2, arrayList));
            }
            CaptureStatus captureStatus = CaptureStatus.d;
            NewCapturedTypeConstructor newCapturedTypeConstructorE = capturedTypeConstructorImpl.e();
            Intrinsics.e(newCapturedTypeConstructorE);
            return new NewCapturedType(captureStatus, newCapturedTypeConstructorE, unwrappedType, simpleType.I0(), simpleType.K0(), 32);
        }
        if (typeConstructorJ0 instanceof IntegerValueTypeConstructor) {
            CollectionsKt.s(null, 10);
            throw null;
        }
        if (!(typeConstructorJ0 instanceof IntersectionTypeConstructor) || !simpleType.K0()) {
            return simpleType;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) typeConstructorJ0;
        Collection collectionA2 = intersectionTypeConstructor.a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(collectionA2, 10));
        Iterator it2 = collectionA2.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            arrayList2.add(TypeUtilsKt.n((KotlinType) it2.next()));
            z = true;
        }
        if (z) {
            KotlinType kotlinTypeG = intersectionTypeConstructor.g();
            intersectionTypeConstructorI = new IntersectionTypeConstructor(arrayList2).i(kotlinTypeG != null ? TypeUtilsKt.n(kotlinTypeG) : null);
        }
        if (intersectionTypeConstructorI != null) {
            intersectionTypeConstructor = intersectionTypeConstructorI;
        }
        return intersectionTypeConstructor.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final UnwrappedType a(KotlinTypeMarker type) {
        UnwrappedType unwrappedTypeA;
        Intrinsics.h(type, "type");
        if (!(type instanceof KotlinType)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        UnwrappedType unwrappedTypeM0 = ((KotlinType) type).M0();
        if (unwrappedTypeM0 instanceof SimpleType) {
            unwrappedTypeA = c((SimpleType) unwrappedTypeM0);
        } else {
            if (!(unwrappedTypeM0 instanceof FlexibleType)) {
                throw new NoWhenBranchMatchedException();
            }
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeM0;
            SimpleType simpleTypeC = c(flexibleType.R0());
            SimpleType simpleTypeC2 = c(flexibleType.S0());
            unwrappedTypeA = (simpleTypeC == flexibleType.R0() && simpleTypeC2 == flexibleType.S0()) ? unwrappedTypeM0 : KotlinTypeFactory.a(simpleTypeC, simpleTypeC2);
        }
        return TypeWithEnhancementKt.c(unwrappedTypeA, unwrappedTypeM0, new KotlinTypePreparator$prepareType$1(this));
    }
}
