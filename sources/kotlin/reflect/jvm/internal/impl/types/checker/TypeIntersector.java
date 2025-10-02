package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeIntersector {

    /* renamed from: a, reason: collision with root package name */
    public static final TypeIntersector f24631a = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResultNullability {
        public static final START d;
        public static final ACCEPT_NULL e;
        public static final UNKNOWN f;
        public static final NOT_NULL g;
        public static final /* synthetic */ ResultNullability[] h;
        public static final /* synthetic */ EnumEntries i;

        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL() {
                super("ACCEPT_NULL", 1);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(UnwrappedType nextType) {
                Intrinsics.h(nextType, "nextType");
                return ResultNullability.b(nextType);
            }
        }

        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL() {
                super("NOT_NULL", 3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(UnwrappedType nextType) {
                Intrinsics.h(nextType, "nextType");
                return this;
            }
        }

        public static final class START extends ResultNullability {
            public START() {
                super("START", 0);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(UnwrappedType nextType) {
                Intrinsics.h(nextType, "nextType");
                return ResultNullability.b(nextType);
            }
        }

        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN() {
                super("UNKNOWN", 2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(UnwrappedType nextType) {
                Intrinsics.h(nextType, "nextType");
                ResultNullability resultNullabilityB = ResultNullability.b(nextType);
                return resultNullabilityB == ResultNullability.e ? this : resultNullabilityB;
            }
        }

        static {
            START start = new START();
            d = start;
            ACCEPT_NULL accept_null = new ACCEPT_NULL();
            e = accept_null;
            UNKNOWN unknown = new UNKNOWN();
            f = unknown;
            NOT_NULL not_null = new NOT_NULL();
            g = not_null;
            ResultNullability[] resultNullabilityArr = {start, accept_null, unknown, not_null};
            h = resultNullabilityArr;
            i = EnumEntriesKt.a(resultNullabilityArr);
        }

        public static ResultNullability b(UnwrappedType unwrappedType) {
            Intrinsics.h(unwrappedType, "<this>");
            if (unwrappedType.K0()) {
                return e;
            }
            if (!(unwrappedType instanceof DefinitelyNotNullType) || !(((DefinitelyNotNullType) unwrappedType).e instanceof StubTypeForBuilderInference)) {
                boolean z = unwrappedType instanceof StubTypeForBuilderInference;
                UNKNOWN unknown = f;
                if (z || !AbstractNullabilityChecker.a(ClassicTypeCheckerStateKt.a(false, SimpleClassicTypeSystemContext.f24629a, null, 24), FlexibleTypesKt.c(unwrappedType), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f24612a)) {
                    return unknown;
                }
            }
            return g;
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) h.clone();
        }

        public abstract ResultNullability a(UnwrappedType unwrappedType);
    }

    public static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        Intrinsics.g(it, "iterator(...)");
        while (it.hasNext()) {
            SimpleType simpleType = (SimpleType) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SimpleType simpleType2 = (SimpleType) it2.next();
                    if (simpleType2 != simpleType) {
                        Intrinsics.e(simpleType2);
                        Intrinsics.e(simpleType);
                        if (((Boolean) function2.invoke(simpleType2, simpleType)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.reflect.jvm.internal.impl.types.TypeAttributes] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.TypeAttributes, kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner, kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final SimpleType b(ArrayList arrayList) {
        SimpleType simpleTypeF;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SimpleType simpleType = (SimpleType) it.next();
            if (simpleType.J0() instanceof IntersectionTypeConstructor) {
                Collection collectionA = simpleType.J0().a();
                Intrinsics.g(collectionA, "getSupertypes(...)");
                Collection<KotlinType> collection = collectionA;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(collection, 10));
                for (KotlinType kotlinType : collection) {
                    Intrinsics.e(kotlinType);
                    SimpleType simpleTypeD = FlexibleTypesKt.d(kotlinType);
                    if (simpleType.K0()) {
                        simpleTypeD = simpleTypeD.N0(true);
                    }
                    arrayList3.add(simpleTypeD);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(simpleType);
            }
        }
        ResultNullability resultNullabilityA = ResultNullability.d;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            resultNullabilityA = resultNullabilityA.a((UnwrappedType) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            SimpleType simpleTypeN0 = (SimpleType) it3.next();
            if (resultNullabilityA == ResultNullability.g) {
                if (simpleTypeN0 instanceof NewCapturedType) {
                    NewCapturedType newCapturedType = (NewCapturedType) simpleTypeN0;
                    simpleTypeN0 = new NewCapturedType(newCapturedType.e, newCapturedType.f, newCapturedType.g, newCapturedType.h, newCapturedType.i, true);
                }
                Intrinsics.h(simpleTypeN0, "<this>");
                SimpleType simpleTypeA = DefinitelyNotNullType.Companion.a(simpleTypeN0, false);
                simpleTypeN0 = (simpleTypeA == null && (simpleTypeA = SpecialTypesKt.c(simpleTypeN0)) == null) ? simpleTypeN0.N0(false) : simpleTypeA;
            }
            linkedHashSet.add(simpleTypeN0);
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((SimpleType) it4.next()).I0());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (it5.hasNext()) {
            TypeAttributes other = (TypeAttributes) it5.next();
            next = (TypeAttributes) next;
            next.getClass();
            TypeAttributes.Companion companion = TypeAttributes.e;
            Intrinsics.h(other, "other");
            if (!next.isEmpty() || !other.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = companion.f24648a.values();
                Intrinsics.g(collectionValues, "<get-values>(...)");
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    TypeAttribute typeAttribute = (TypeAttribute) next.d.get(iIntValue);
                    TypeAttribute typeAttribute2 = (TypeAttribute) other.d.get(iIntValue);
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList5, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.c(typeAttribute) : null : typeAttribute.c(typeAttribute2));
                }
                next = TypeAttributes.Companion.c(arrayList5);
            }
        }
        TypeAttributes typeAttributes = (TypeAttributes) next;
        if (linkedHashSet.size() == 1) {
            simpleTypeF = (SimpleType) CollectionsKt.m0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(2, this, TypeIntersector.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0));
            arrayListA.isEmpty();
            SimpleType simpleTypeA2 = IntegerLiteralTypeConstructor.Companion.a(arrayListA);
            if (simpleTypeA2 != null) {
                simpleTypeF = simpleTypeA2;
            } else {
                NewKotlinTypeChecker.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(2, NewKotlinTypeChecker.Companion.b, NewKotlinTypeCheckerImpl.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0));
                arrayListA2.isEmpty();
                simpleTypeF = arrayListA2.size() < 2 ? (SimpleType) CollectionsKt.m0(arrayListA2) : new IntersectionTypeConstructor(linkedHashSet).f();
            }
        }
        return simpleTypeF.P0(typeAttributes);
    }
}
