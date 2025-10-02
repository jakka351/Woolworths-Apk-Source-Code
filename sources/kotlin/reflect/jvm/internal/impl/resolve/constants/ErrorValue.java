package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes7.dex */
public abstract class ErrorValue extends ConstantValue<Unit> {

    public static final class Companion {
        public static ErrorValueWithMessage a(String message) {
            Intrinsics.h(message, "message");
            return new ErrorValueWithMessage(message);
        }
    }

    public static final class ErrorValueWithMessage extends ErrorValue {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorValueWithMessage(String message) {
            super(Unit.f24250a);
            Intrinsics.h(message, "message");
            this.b = message;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public final KotlinType a(ModuleDescriptor module) {
            Intrinsics.h(module, "module");
            return ErrorUtils.c(ErrorTypeKind.w, this.b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public final String toString() {
            return this.b;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final Object b() {
        throw new UnsupportedOperationException();
    }
}
