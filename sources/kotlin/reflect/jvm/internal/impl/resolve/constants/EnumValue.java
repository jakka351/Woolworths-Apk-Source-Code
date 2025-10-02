package kotlin.reflect.jvm.internal.impl.resolve.constants;

import io.jsonwebtoken.JwtParser;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {
    public final ClassId b;
    public final Name c;

    public EnumValue(ClassId classId, Name name) {
        super(new Pair(classId, name));
        this.b = classId;
        this.c = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        SimpleType simpleTypeT;
        Intrinsics.h(module, "module");
        ClassId classId = this.b;
        ClassDescriptor classDescriptorA = FindClassInModuleKt.a(module, classId);
        if (classDescriptorA != null) {
            int i = DescriptorUtils.f24530a;
            if (!DescriptorUtils.n(classDescriptorA, ClassKind.f)) {
                classDescriptorA = null;
            }
            if (classDescriptorA != null && (simpleTypeT = classDescriptorA.t()) != null) {
                return simpleTypeT;
            }
        }
        return ErrorUtils.c(ErrorTypeKind.D, classId.toString(), this.c.d);
    }

    public final Name c() {
        return this.c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.c);
        return sb.toString();
    }
}
