package kotlin.reflect.jvm.internal.impl.util;

import YU.a;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes7.dex */
public abstract class ValueParameterCountCheck implements Check {

    /* renamed from: a, reason: collision with root package name */
    public final String f24649a;

    public static final class AtLeast extends ValueParameterCountCheck {
        public final int b;

        /* JADX WARN: Illegal instructions before constructor call */
        public AtLeast(int i) {
            StringBuilder sbR = a.r(i, "must have at least ", " value parameter");
            sbR.append(i > 1 ? "s" : "");
            super(sbR.toString());
            this.b = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.h().size() >= this.b;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {
        public final int b;

        public Equals() {
            super("must have exactly 2 value parameters");
            this.b = 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.h().size() == this.b;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {
        public static final NoValueParameters b = new NoValueParameters("must have no value parameters");

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.h().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {
        public static final SingleValueParameter b = new SingleValueParameter("must have a single value parameter");

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.h().size() == 1;
        }
    }

    public ValueParameterCountCheck(String str) {
        this.f24649a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return this.f24649a;
    }
}
