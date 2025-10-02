package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.camera.core.impl.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* loaded from: classes7.dex */
public final class MemberSignature {

    /* renamed from: a, reason: collision with root package name */
    public final String f24474a;

    public static final class Companion {
        public static MemberSignature a(String name, String desc) {
            Intrinsics.h(name, "name");
            Intrinsics.h(desc, "desc");
            return new MemberSignature(name + '#' + desc);
        }

        public static MemberSignature b(JvmMemberSignature jvmMemberSignature) {
            if (jvmMemberSignature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) jvmMemberSignature;
                return d(method.f24495a, method.b);
            }
            if (!(jvmMemberSignature instanceof JvmMemberSignature.Field)) {
                throw new NoWhenBranchMatchedException();
            }
            JvmMemberSignature.Field field = (JvmMemberSignature.Field) jvmMemberSignature;
            return a(field.f24494a, field.b);
        }

        public static MemberSignature c(NameResolver nameResolver, JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            Intrinsics.h(nameResolver, "nameResolver");
            return d(nameResolver.getString(jvmMethodSignature.f), nameResolver.getString(jvmMethodSignature.g));
        }

        public static MemberSignature d(String name, String desc) {
            Intrinsics.h(name, "name");
            Intrinsics.h(desc, "desc");
            return new MemberSignature(name.concat(desc));
        }

        public static MemberSignature e(MemberSignature memberSignature, int i) {
            return new MemberSignature(memberSignature.f24474a + '@' + i);
        }
    }

    public MemberSignature(String str) {
        this.f24474a = str;
    }

    public final String a() {
        return this.f24474a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.c(this.f24474a, ((MemberSignature) obj).f24474a);
    }

    public final int hashCode() {
        return this.f24474a.hashCode();
    }

    public final String toString() {
        return b.r(new StringBuilder("MemberSignature(signature="), this.f24474a, ')');
    }
}
