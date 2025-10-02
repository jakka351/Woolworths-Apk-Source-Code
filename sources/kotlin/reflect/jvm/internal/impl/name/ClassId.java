package kotlin.reflect.jvm.internal.impl.name;

import androidx.compose.ui.platform.i;
import com.medallia.digital.mobilesdk.q2;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class ClassId {

    /* renamed from: a, reason: collision with root package name */
    public final FqName f24499a;
    public final FqName b;
    public final boolean c;

    public static final class Companion {
        public static ClassId a(String string, boolean z) {
            String strQ;
            Intrinsics.h(string, "string");
            int iB = StringsKt.B(string, '`', 0, 6);
            if (iB == -1) {
                iB = string.length();
            }
            int iF = StringsKt.F(iB, 4, string, q2.c);
            String str = "";
            if (iF == -1) {
                strQ = StringsKt.Q(string, "`", "", false);
            } else {
                String strSubstring = string.substring(0, iF);
                Intrinsics.g(strSubstring, "substring(...)");
                String strR = StringsKt.R(strSubstring, '/', JwtParser.SEPARATOR_CHAR);
                String strSubstring2 = string.substring(iF + 1);
                Intrinsics.g(strSubstring2, "substring(...)");
                strQ = StringsKt.Q(strSubstring2, "`", "", false);
                str = strR;
            }
            return new ClassId(new FqName(str), new FqName(strQ), z);
        }

        public static ClassId b(FqName topLevelFqName) {
            Intrinsics.h(topLevelFqName, "topLevelFqName");
            return new ClassId(topLevelFqName.b(), topLevelFqName.f24500a.f());
        }
    }

    public ClassId(FqName packageFqName, FqName relativeClassName, boolean z) {
        Intrinsics.h(packageFqName, "packageFqName");
        Intrinsics.h(relativeClassName, "relativeClassName");
        this.f24499a = packageFqName;
        this.b = relativeClassName;
        this.c = z;
        relativeClassName.f24500a.c();
    }

    public static final String c(FqName fqName) {
        String str = fqName.f24500a.f24501a;
        return StringsKt.p(str, '/') ? i.a('`', "`", str) : str;
    }

    public final FqName a() {
        FqName fqName = this.f24499a;
        boolean zC = fqName.f24500a.c();
        FqName fqName2 = this.b;
        if (zC) {
            return fqName2;
        }
        return new FqName(fqName.f24500a.f24501a + JwtParser.SEPARATOR_CHAR + fqName2.f24500a.f24501a);
    }

    public final String b() {
        FqName fqName = this.f24499a;
        boolean zC = fqName.f24500a.c();
        FqName fqName2 = this.b;
        if (zC) {
            return c(fqName2);
        }
        return StringsKt.R(fqName.f24500a.f24501a, JwtParser.SEPARATOR_CHAR, '/') + q2.c + c(fqName2);
    }

    public final ClassId d(Name name) {
        Intrinsics.h(name, "name");
        return new ClassId(this.f24499a, this.b.a(name), this.c);
    }

    public final ClassId e() {
        FqName fqNameB = this.b.b();
        if (fqNameB.f24500a.c()) {
            return null;
        }
        return new ClassId(this.f24499a, fqNameB, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return Intrinsics.c(this.f24499a, classId.f24499a) && Intrinsics.c(this.b, classId.b) && this.c == classId.c;
    }

    public final Name f() {
        return this.b.f24500a.f();
    }

    public final boolean g() {
        return !this.b.b().f24500a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f24499a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        if (!this.f24499a.f24500a.c()) {
            return b();
        }
        return q2.c + b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(FqName packageFqName, Name topLevelName) {
        this(packageFqName, FqName.Companion.a(topLevelName), false);
        Intrinsics.h(packageFqName, "packageFqName");
        Intrinsics.h(topLevelName, "topLevelName");
        FqName fqName = FqName.c;
    }
}
