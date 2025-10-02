package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes7.dex */
public final class KClassValue extends ConstantValue<Value> {

    public static final class Companion {
    }

    public static abstract class Value {

        public static final class LocalClass extends Value {

            /* renamed from: a, reason: collision with root package name */
            public final KotlinType f24541a;

            public LocalClass(KotlinType kotlinType) {
                this.f24541a = kotlinType;
            }

            public final KotlinType a() {
                return this.f24541a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && Intrinsics.c(this.f24541a, ((LocalClass) obj).f24541a);
            }

            public final int hashCode() {
                return this.f24541a.hashCode();
            }

            public final String toString() {
                return "LocalClass(type=" + this.f24541a + ')';
            }
        }

        public static final class NormalClass extends Value {

            /* renamed from: a, reason: collision with root package name */
            public final ClassLiteralValue f24542a;

            public NormalClass(ClassLiteralValue classLiteralValue) {
                this.f24542a = classLiteralValue;
            }

            public final int a() {
                return this.f24542a.b;
            }

            public final ClassId b() {
                return this.f24542a.f24538a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && Intrinsics.c(this.f24542a, ((NormalClass) obj).f24542a);
            }

            public final int hashCode() {
                return this.f24542a.hashCode();
            }

            public final String toString() {
                return "NormalClass(value=" + this.f24542a + ')';
            }
        }
    }

    public KClassValue(ClassId classId, int i) {
        super(new Value.NormalClass(new ClassLiteralValue(classId, i)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        KotlinType kotlinTypeC;
        Intrinsics.h(module, "module");
        TypeAttributes.e.getClass();
        TypeAttributes typeAttributes = TypeAttributes.f;
        KotlinBuiltIns kotlinBuiltInsP = module.p();
        kotlinBuiltInsP.getClass();
        ClassDescriptor classDescriptorJ = kotlinBuiltInsP.j(StandardNames.FqNames.Q.g());
        Object obj = this.f24539a;
        Value value = (Value) obj;
        if (value instanceof Value.LocalClass) {
            kotlinTypeC = ((Value.LocalClass) obj).f24541a;
        } else {
            if (!(value instanceof Value.NormalClass)) {
                throw new NoWhenBranchMatchedException();
            }
            ClassLiteralValue classLiteralValue = ((Value.NormalClass) obj).f24542a;
            ClassId classId = classLiteralValue.f24538a;
            int i = classLiteralValue.b;
            ClassDescriptor classDescriptorA = FindClassInModuleKt.a(module, classId);
            if (classDescriptorA == null) {
                kotlinTypeC = ErrorUtils.c(ErrorTypeKind.g, classId.toString(), String.valueOf(i));
            } else {
                SimpleType simpleTypeT = classDescriptorA.t();
                Intrinsics.g(simpleTypeT, "getDefaultType(...)");
                UnwrappedType unwrappedTypeP = TypeUtilsKt.p(simpleTypeT);
                for (int i2 = 0; i2 < i; i2++) {
                    KotlinBuiltIns kotlinBuiltInsP2 = module.p();
                    Variance variance = Variance.f;
                    unwrappedTypeP = kotlinBuiltInsP2.h(unwrappedTypeP);
                }
                kotlinTypeC = unwrappedTypeP;
            }
        }
        return KotlinTypeFactory.c(typeAttributes, classDescriptorJ, CollectionsKt.Q(new TypeProjectionImpl(kotlinTypeC)));
    }
}
