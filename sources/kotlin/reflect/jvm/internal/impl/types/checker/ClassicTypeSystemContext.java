package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractStubType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes7.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {

    @SourceDebugExtension
    public static final class DefaultImpls {
        public static boolean A(TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorC = ((TypeConstructor) typeConstructorMarker).c();
                ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
                return (classDescriptor == null || !ModalityUtilsKt.a(classDescriptor) || classDescriptor.f() == ClassKind.g || classDescriptor.f() == ClassKind.h) ? false : true;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, typeConstructorMarker.getClass(), sb).toString());
        }

        public static boolean B(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).d();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean C(KotlinTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinTypeKt.a((KotlinType) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean D(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorC = ((TypeConstructor) receiver).c();
                ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
                return (classDescriptor != null ? classDescriptor.f0() : null) instanceof InlineClassRepresentation;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean E(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean F(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean G(KotlinTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            return (receiver instanceof SimpleType) && ((SimpleType) receiver).K0();
        }

        public static boolean H(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.J((TypeConstructor) receiver, StandardNames.FqNames.b);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean I(KotlinTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtils.f((KotlinType) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean J(SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof KotlinType) {
                return KotlinBuiltIns.H((KotlinType) simpleTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, simpleTypeMarker.getClass(), sb).toString());
        }

        public static boolean K(CapturedTypeMarker capturedTypeMarker) {
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).j;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, capturedTypeMarker.getClass(), sb).toString());
        }

        public static boolean L(KotlinTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return receiver instanceof RawType;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean M(TypeArgumentMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).a();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean N(RigidTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                KotlinType kotlinType = (KotlinType) receiver;
                if (kotlinType instanceof AbstractStubType) {
                    return true;
                }
                return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).e instanceof AbstractStubType);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean O(RigidTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                KotlinType kotlinType = (KotlinType) receiver;
                if (kotlinType instanceof StubTypeForBuilderInference) {
                    return true;
                }
                return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).e instanceof StubTypeForBuilderInference);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static SimpleType P(FlexibleTypeMarker flexibleTypeMarker) {
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).e;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, flexibleTypeMarker.getClass(), sb).toString());
        }

        public static UnwrappedType Q(CapturedTypeMarker capturedTypeMarker) {
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).g;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, capturedTypeMarker.getClass(), sb).toString());
        }

        public static UnwrappedType R(KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof UnwrappedType) {
                return SpecialTypesKt.b((UnwrappedType) kotlinTypeMarker, false);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, kotlinTypeMarker.getClass(), sb).toString());
        }

        public static int S(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).getParameters().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static Collection T(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            TypeConstructor typeConstructorG = classicTypeSystemContext.G(rigidTypeMarker);
            if (typeConstructorG instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorG).f24540a;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, rigidTypeMarker.getClass(), sb).toString());
        }

        public static TypeProjection U(CapturedTypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).f24627a;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2] */
        public static ClassicTypeSystemContext$substitutionSupertypePolicy$2 V(final ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            if (rigidTypeMarker instanceof SimpleType) {
                KotlinType kotlinType = (KotlinType) rigidTypeMarker;
                final TypeSubstitutor typeSubstitutor = new TypeSubstitutor(TypeConstructorSubstitution.b.a(kotlinType.J0(), kotlinType.H0()));
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    public final RigidTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                        Intrinsics.h(state, "state");
                        Intrinsics.h(type, "type");
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        SimpleType simpleTypeJ = classicTypeSystemContext2.j(typeSubstitutor.i(classicTypeSystemContext2.M(type), Variance.f));
                        Intrinsics.e(simpleTypeJ);
                        return simpleTypeJ;
                    }
                };
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, rigidTypeMarker.getClass(), sb).toString());
        }

        public static Collection W(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                Collection collectionA = ((TypeConstructor) receiver).a();
                Intrinsics.g(collectionA, "getSupertypes(...)");
                return collectionA;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static TypeConstructor X(RigidTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).J0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static NewCapturedTypeConstructor Y(CapturedTypeMarker capturedTypeMarker) {
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).f;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, capturedTypeMarker.getClass(), sb).toString());
        }

        public static SimpleType Z(FlexibleTypeMarker flexibleTypeMarker) {
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).f;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, flexibleTypeMarker.getClass(), sb).toString());
        }

        public static boolean a(TypeConstructorMarker c1, TypeConstructorMarker c2) {
            Intrinsics.h(c1, "c1");
            Intrinsics.h(c2, "c2");
            if (!(c1 instanceof TypeConstructor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(c1);
                sb.append(", ");
                throw new IllegalArgumentException(a.i(Reflection.f24268a, c1.getClass(), sb).toString());
            }
            if (c2 instanceof TypeConstructor) {
                return c1.equals(c2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(c2);
            sb2.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, c2.getClass(), sb2).toString());
        }

        public static SimpleType a0(RigidTypeMarker receiver, boolean z) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).N0(z);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static int b(KotlinTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).H0().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static KotlinTypeMarker b0(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof RigidTypeMarker) {
                return classicTypeSystemContext.k0((RigidTypeMarker) kotlinTypeMarker);
            }
            if (!(kotlinTypeMarker instanceof FlexibleTypeMarker)) {
                throw new IllegalStateException("sealed");
            }
            FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) kotlinTypeMarker;
            return classicTypeSystemContext.f(classicTypeSystemContext.k0(classicTypeSystemContext.d0(flexibleTypeMarker)), classicTypeSystemContext.k0(classicTypeSystemContext.n0(flexibleTypeMarker)));
        }

        public static TypeArgumentListMarker c(RigidTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return (TypeArgumentListMarker) receiver;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static CapturedTypeMarker d(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof SimpleTypeWithEnhancement) {
                    return classicTypeSystemContext.i0(((SimpleTypeWithEnhancement) receiver).e);
                }
                if (receiver instanceof NewCapturedType) {
                    return (NewCapturedType) receiver;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static DefinitelyNotNullType e(RigidTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) receiver;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static DynamicType f(FlexibleType flexibleType) {
            if (flexibleType instanceof DynamicType) {
                return (DynamicType) flexibleType;
            }
            return null;
        }

        public static FlexibleType g(KotlinTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeM0 = ((KotlinType) receiver).M0();
                if (unwrappedTypeM0 instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeM0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static SimpleType h(KotlinTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeM0 = ((KotlinType) receiver).M0();
                if (unwrappedTypeM0 instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeM0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static TypeProjectionImpl i(KotlinTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtilsKt.a((KotlinType) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static kotlin.reflect.jvm.internal.impl.types.SimpleType j(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r13) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.j(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker):kotlin.reflect.jvm.internal.impl.types.SimpleType");
        }

        public static CaptureStatus k(CapturedTypeMarker capturedTypeMarker) {
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).e;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, capturedTypeMarker.getClass(), sb).toString());
        }

        public static UnwrappedType l(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker lowerBound, RigidTypeMarker upperBound) {
            Intrinsics.h(lowerBound, "lowerBound");
            Intrinsics.h(upperBound, "upperBound");
            if (!(lowerBound instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(classicTypeSystemContext);
                sb.append(", ");
                throw new IllegalArgumentException(a.i(Reflection.f24268a, classicTypeSystemContext.getClass(), sb).toString());
            }
            if (upperBound instanceof SimpleType) {
                return KotlinTypeFactory.a((SimpleType) lowerBound, (SimpleType) upperBound);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(classicTypeSystemContext);
            sb2.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, classicTypeSystemContext.getClass(), sb2).toString());
        }

        public static TypeArgumentMarker m(KotlinTypeMarker receiver, int i) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return (TypeArgumentMarker) ((KotlinType) receiver).H0().get(i);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static List n(KotlinTypeMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).H0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static TypeParameterMarker o(TypeConstructorMarker receiver, int i) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                Object obj = ((TypeConstructor) receiver).getParameters().get(i);
                Intrinsics.g(obj, "get(...)");
                return (TypeParameterMarker) obj;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static List p(TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                List parameters = ((TypeConstructor) typeConstructorMarker).getParameters();
                Intrinsics.g(parameters, "getParameters(...)");
                return parameters;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, typeConstructorMarker.getClass(), sb).toString());
        }

        public static UnwrappedType q(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (classicTypeSystemContext.g(receiver)) {
                return null;
            }
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).getType().M0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static TypeParameterDescriptor r(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
            if (typeVariableTypeConstructorMarker instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) typeVariableTypeConstructorMarker).b();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeVariableTypeConstructorMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, typeVariableTypeConstructorMarker.getClass(), sb).toString());
        }

        public static TypeParameterDescriptor s(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorC = ((TypeConstructor) receiver).c();
                if (classifierDescriptorC instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorC;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static TypeVariance t(TypeArgumentMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                Variance varianceB = ((TypeProjection) receiver).b();
                Intrinsics.g(varianceB, "getProjectionKind(...)");
                return TypeSystemContextKt.a(varianceB);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static TypeVariance u(TypeParameterMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                Variance varianceJ = ((TypeParameterDescriptor) receiver).j();
                Intrinsics.g(varianceJ, "getVariance(...)");
                return TypeSystemContextKt.a(varianceJ);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean v(KotlinTypeMarker receiver, FqName fqName) {
            Intrinsics.h(receiver, "$receiver");
            Intrinsics.h(fqName, "fqName");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getAnnotations().m2(fqName);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean w(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
            if (!(typeParameterMarker instanceof TypeParameterDescriptor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeParameterMarker);
                sb.append(", ");
                throw new IllegalArgumentException(a.i(Reflection.f24268a, typeParameterMarker.getClass(), sb).toString());
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) typeParameterMarker;
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.k(typeParameterDescriptor, (TypeConstructor) typeConstructorMarker, 4);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterDescriptor);
            sb2.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, typeParameterDescriptor.getClass(), sb2).toString());
        }

        public static boolean x(RigidTypeMarker a2, RigidTypeMarker b) {
            Intrinsics.h(a2, "a");
            Intrinsics.h(b, "b");
            if (!(a2 instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(a2);
                sb.append(", ");
                throw new IllegalArgumentException(a.i(Reflection.f24268a, a2.getClass(), sb).toString());
            }
            if (b instanceof SimpleType) {
                return ((SimpleType) a2).H0() == ((SimpleType) b).H0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(b);
            sb2.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, b.getClass(), sb2).toString());
        }

        public static boolean y(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.J((TypeConstructor) receiver, StandardNames.FqNames.f24314a);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }

        public static boolean z(TypeConstructorMarker receiver) {
            Intrinsics.h(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).c() instanceof ClassDescriptor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.i(Reflection.f24268a, receiver.getClass(), sb).toString());
        }
    }

    SimpleType d0(FlexibleTypeMarker flexibleTypeMarker);

    UnwrappedType f(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2);

    SimpleType j(KotlinType kotlinType);

    SimpleType k0(RigidTypeMarker rigidTypeMarker);

    SimpleType n0(FlexibleTypeMarker flexibleTypeMarker);
}
