package kotlin.reflect.jvm.internal.impl.name;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class FqName {
    public static final FqName c = new FqName("");

    /* renamed from: a, reason: collision with root package name */
    public final FqNameUnsafe f24500a;
    public transient FqName b;

    public static final class Companion {
        public static FqName a(Name shortName) {
            Intrinsics.h(shortName, "shortName");
            String strB = shortName.b();
            Intrinsics.g(strB, "asString(...)");
            return new FqName(new FqNameUnsafe(strB, FqName.c.f24500a, shortName));
        }
    }

    public FqName(String fqName) {
        Intrinsics.h(fqName, "fqName");
        this.f24500a = new FqNameUnsafe(fqName, this);
    }

    public final FqName a(Name name) {
        Intrinsics.h(name, "name");
        return new FqName(this.f24500a.a(name), this);
    }

    public final FqName b() {
        FqName fqName = this.b;
        if (fqName != null) {
            return fqName;
        }
        FqNameUnsafe fqNameUnsafe = this.f24500a;
        if (fqNameUnsafe.c()) {
            throw new IllegalStateException("root");
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
        FqName fqName2 = new FqName(fqNameUnsafe2);
        this.b = fqName2;
        return fqName2;
    }

    public final boolean c(Name segment) {
        Intrinsics.h(segment, "segment");
        FqNameUnsafe fqNameUnsafe = this.f24500a;
        fqNameUnsafe.getClass();
        String str = fqNameUnsafe.f24501a;
        if (!fqNameUnsafe.c()) {
            int iB = StringsKt.B(str, JwtParser.SEPARATOR_CHAR, 0, 6);
            if (iB == -1) {
                iB = str.length();
            }
            int i = iB;
            String strB = segment.b();
            Intrinsics.g(strB, "asString(...)");
            if (i == strB.length() && StringsKt.K(0, 0, i, fqNameUnsafe.f24501a, strB, false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FqName) {
            return Intrinsics.c(this.f24500a, ((FqName) obj).f24500a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24500a.f24501a.hashCode();
    }

    public final String toString() {
        return this.f24500a.toString();
    }

    public FqName(FqNameUnsafe fqNameUnsafe) {
        this.f24500a = fqNameUnsafe;
    }

    public FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f24500a = fqNameUnsafe;
        this.b = fqName;
    }
}
