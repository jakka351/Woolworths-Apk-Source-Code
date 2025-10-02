package kotlin.reflect.jvm.internal.impl.name;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class FqNameUnsafe {
    public static final Name e = Name.l("<root>");

    /* renamed from: a, reason: collision with root package name */
    public final String f24501a;
    public transient FqName b;
    public transient FqNameUnsafe c;
    public transient Name d;

    public static final class Companion {
    }

    static {
        Intrinsics.g(Pattern.compile("\\."), "compile(...)");
    }

    public FqNameUnsafe(String fqName, FqName fqName2) {
        Intrinsics.h(fqName, "fqName");
        this.f24501a = fqName;
        this.b = fqName2;
    }

    public static final List e(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.c()) {
            return new ArrayList();
        }
        FqNameUnsafe fqNameUnsafe2 = fqNameUnsafe.c;
        if (fqNameUnsafe2 == null) {
            if (fqNameUnsafe.c()) {
                throw new IllegalStateException("root");
            }
            fqNameUnsafe.b();
            fqNameUnsafe2 = fqNameUnsafe.c;
            Intrinsics.e(fqNameUnsafe2);
        }
        List listE = e(fqNameUnsafe2);
        listE.add(fqNameUnsafe.f());
        return listE;
    }

    public final FqNameUnsafe a(Name name) {
        String strB;
        Intrinsics.h(name, "name");
        if (c()) {
            strB = name.b();
        } else {
            strB = this.f24501a + JwtParser.SEPARATOR_CHAR + name.b();
        }
        Intrinsics.e(strB);
        return new FqNameUnsafe(strB, this, name);
    }

    public final void b() {
        String str = this.f24501a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                break;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.d = Name.d(str);
            this.c = FqName.c.f24500a;
            return;
        }
        String strSubstring = str.substring(length + 1);
        Intrinsics.g(strSubstring, "substring(...)");
        this.d = Name.d(strSubstring);
        String strSubstring2 = str.substring(0, length);
        Intrinsics.g(strSubstring2, "substring(...)");
        this.c = new FqNameUnsafe(strSubstring2);
    }

    public final boolean c() {
        return this.f24501a.length() == 0;
    }

    public final boolean d() {
        return this.b != null || StringsKt.B(this.f24501a, '<', 0, 6) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FqNameUnsafe) {
            return Intrinsics.c(this.f24501a, ((FqNameUnsafe) obj).f24501a);
        }
        return false;
    }

    public final Name f() {
        Name name = this.d;
        if (name != null) {
            return name;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        Name name2 = this.d;
        Intrinsics.e(name2);
        return name2;
    }

    public final FqName g() {
        FqName fqName = this.b;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.b = fqName2;
        return fqName2;
    }

    public final int hashCode() {
        return this.f24501a.hashCode();
    }

    public final String toString() {
        if (!c()) {
            return this.f24501a;
        }
        String strB = e.b();
        Intrinsics.g(strB, "asString(...)");
        return strB;
    }

    public FqNameUnsafe(String str) {
        this.f24501a = str;
    }

    public FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.f24501a = str;
        this.c = fqNameUnsafe;
        this.d = name;
    }
}
