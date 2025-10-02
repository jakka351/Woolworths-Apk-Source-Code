package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes7.dex */
public abstract class ReturnsCheck implements Check {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f24647a;
    public final String b;

    public static final class ReturnsBoolean extends ReturnsCheck {
        public static final ReturnsBoolean c = new ReturnsBoolean("Boolean", ReturnsCheck$ReturnsBoolean$$Lambda$0.d);
    }

    public static final class ReturnsInt extends ReturnsCheck {
        public static final ReturnsInt c = new ReturnsInt("Int", ReturnsCheck$ReturnsInt$$Lambda$0.d);
    }

    public static final class ReturnsUnit extends ReturnsCheck {
        public static final ReturnsUnit c = new ReturnsUnit("Unit", ReturnsCheck$ReturnsUnit$$Lambda$0.d);
    }

    public ReturnsCheck(String str, Function1 function1) {
        this.f24647a = function1;
        this.b = "must return ".concat(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
        return Intrinsics.c(javaMethodDescriptor.j, this.f24647a.invoke(DescriptorUtilsKt.e(javaMethodDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return this.b;
    }
}
