package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class JvmMemberSignature {

    public static final class Field extends JvmMemberSignature {

        /* renamed from: a, reason: collision with root package name */
        public final String f24494a;
        public final String b;

        public Field(String name, String desc) {
            Intrinsics.h(name, "name");
            Intrinsics.h(desc, "desc");
            this.f24494a = name;
            this.b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public final String a() {
            return this.f24494a + ':' + this.b;
        }

        public final String b() {
            return this.f24494a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.c(this.f24494a, field.f24494a) && Intrinsics.c(this.b, field.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f24494a.hashCode() * 31);
        }
    }

    public static final class Method extends JvmMemberSignature {

        /* renamed from: a, reason: collision with root package name */
        public final String f24495a;
        public final String b;

        public Method(String name, String desc) {
            Intrinsics.h(name, "name");
            Intrinsics.h(desc, "desc");
            this.f24495a = name;
            this.b = desc;
        }

        public static Method b(Method method, String desc) {
            String name = method.f24495a;
            Intrinsics.h(name, "name");
            Intrinsics.h(desc, "desc");
            return new Method(name, desc);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public final String a() {
            return this.f24495a + this.b;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.f24495a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.c(this.f24495a, method.f24495a) && Intrinsics.c(this.b, method.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f24495a.hashCode() * 31);
        }
    }

    public abstract String a();

    public final String toString() {
        return a();
    }
}
