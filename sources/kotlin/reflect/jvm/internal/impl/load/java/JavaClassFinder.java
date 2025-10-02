package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public interface JavaClassFinder {

    /* loaded from: classes7.dex */
    public static final class Request {

        /* renamed from: a, reason: collision with root package name */
        public final ClassId f24397a;
        public final byte[] b;
        public final JavaClass c;

        public Request(ClassId classId, JavaClass javaClass, int i) {
            javaClass = (i & 4) != 0 ? null : javaClass;
            this.f24397a = classId;
            this.b = null;
            this.c = javaClass;
        }

        public final ClassId a() {
            return this.f24397a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.c(this.f24397a, request.f24397a) && Intrinsics.c(this.b, request.b) && Intrinsics.c(this.c, request.c);
        }

        public final int hashCode() {
            int iHashCode = this.f24397a.hashCode() * 31;
            byte[] bArr = this.b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        public final String toString() {
            return "Request(classId=" + this.f24397a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.b) + ", outerClass=" + this.c + ')';
        }
    }

    ReflectJavaPackage a(FqName fqName);

    void b(FqName fqName);

    ReflectJavaClass c(Request request);
}
