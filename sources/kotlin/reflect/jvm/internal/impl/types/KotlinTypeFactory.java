package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class KotlinTypeFactory {

    /* loaded from: classes7.dex */
    public static final class ExpandedTypeOrRefinedConstructor {
    }

    public static final UnwrappedType a(SimpleType lowerBound, SimpleType upperBound) {
        Intrinsics.h(lowerBound, "lowerBound");
        Intrinsics.h(upperBound, "upperBound");
        return lowerBound.equals(upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    public static ExpandedTypeOrRefinedConstructor b(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List list) {
        ClassifierDescriptor classifierDescriptorC = typeConstructor.c();
        if (classifierDescriptorC != null) {
            kotlinTypeRefiner.d(classifierDescriptorC);
        }
        return null;
    }

    public static final SimpleType c(TypeAttributes attributes, ClassDescriptor descriptor, List arguments) {
        Intrinsics.h(attributes, "attributes");
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(arguments, "arguments");
        TypeConstructor typeConstructorM = descriptor.m();
        Intrinsics.g(typeConstructorM, "getTypeConstructor(...)");
        return d(attributes, typeConstructorM, arguments, false, null);
    }

    public static final SimpleType d(final TypeAttributes attributes, final TypeConstructor constructor, final List arguments, final boolean z, KotlinTypeRefiner kotlinTypeRefiner) {
        MemberScope memberScopeE;
        Intrinsics.h(attributes, "attributes");
        Intrinsics.h(constructor, "constructor");
        Intrinsics.h(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z && constructor.c() != null) {
            ClassifierDescriptor classifierDescriptorC = constructor.c();
            Intrinsics.e(classifierDescriptorC);
            SimpleType simpleTypeT = classifierDescriptorC.t();
            Intrinsics.g(simpleTypeT, "getDefaultType(...)");
            return simpleTypeT;
        }
        ClassifierDescriptor classifierDescriptorC2 = constructor.c();
        if (classifierDescriptorC2 instanceof TypeParameterDescriptor) {
            memberScopeE = ((TypeParameterDescriptor) classifierDescriptorC2).t().s();
        } else if (classifierDescriptorC2 instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                DescriptorUtilsKt.i(DescriptorUtilsKt.j(classifierDescriptorC2));
                kotlinTypeRefiner = KotlinTypeRefiner.Default.f24625a;
            }
            memberScopeE = arguments.isEmpty() ? ModuleAwareClassDescriptorKt.b((ClassDescriptor) classifierDescriptorC2, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.a((ClassDescriptor) classifierDescriptorC2, TypeConstructorSubstitution.b.a(constructor, arguments), kotlinTypeRefiner);
        } else if (classifierDescriptorC2 instanceof TypeAliasDescriptor) {
            memberScopeE = ErrorUtils.a(ErrorScopeKind.g, true, ((TypeAliasDescriptor) classifierDescriptorC2).getName().d);
        } else {
            if (!(constructor instanceof IntersectionTypeConstructor)) {
                throw new IllegalStateException("Unsupported classifier: " + classifierDescriptorC2 + " for constructor: " + constructor);
            }
            memberScopeE = ((IntersectionTypeConstructor) constructor).e();
        }
        return f(attributes, constructor, arguments, z, memberScopeE, new Function1(constructor, arguments, attributes, z) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$$Lambda$0
            public final TypeConstructor d;
            public final List e;

            {
                this.d = constructor;
                this.e = arguments;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner refiner = (KotlinTypeRefiner) obj;
                Intrinsics.h(refiner, "refiner");
                KotlinTypeFactory.b(this.d, refiner, this.e);
                return null;
            }
        });
    }

    public static final SimpleType e(final List arguments, final MemberScope memberScope, final TypeAttributes attributes, final TypeConstructor constructor, final boolean z) {
        Intrinsics.h(attributes, "attributes");
        Intrinsics.h(constructor, "constructor");
        Intrinsics.h(arguments, "arguments");
        Intrinsics.h(memberScope, "memberScope");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z, memberScope, new Function1(arguments, memberScope, attributes, constructor, z) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$$Lambda$1
            public final TypeConstructor d;
            public final List e;
            public final MemberScope f;

            {
                this.d = constructor;
                this.e = arguments;
                this.f = memberScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
                KotlinTypeFactory.b(this.d, kotlinTypeRefiner, this.e);
                return null;
            }
        });
        return attributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, attributes);
    }

    public static final SimpleType f(TypeAttributes attributes, TypeConstructor constructor, List arguments, boolean z, MemberScope memberScope, Function1 function1) {
        Intrinsics.h(attributes, "attributes");
        Intrinsics.h(constructor, "constructor");
        Intrinsics.h(arguments, "arguments");
        Intrinsics.h(memberScope, "memberScope");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z, memberScope, function1);
        return attributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, attributes);
    }
}
