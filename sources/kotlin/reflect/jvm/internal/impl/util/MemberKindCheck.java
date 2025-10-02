package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes7.dex */
public abstract class MemberKindCheck implements Check {

    /* renamed from: a, reason: collision with root package name */
    public final String f24642a;

    public static final class Member extends MemberKindCheck {
        public static final Member b = new Member("must be a member function");

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.m != null;
        }
    }

    public static final class MemberOrExtension extends MemberKindCheck {
        public static final MemberOrExtension b = new MemberOrExtension("must be a member or an extension function");

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return (javaMethodDescriptor.m == null && javaMethodDescriptor.l == null) ? false : true;
        }
    }

    public MemberKindCheck(String str) {
        this.f24642a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return this.f24642a;
    }
}
