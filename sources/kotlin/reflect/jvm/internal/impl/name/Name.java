package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes.dex */
public final class Name implements Comparable<Name> {
    public final String d;
    public final boolean e;

    public Name(String str, boolean z) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.d = str;
        this.e = z;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static Name d(String str) {
        if (str != null) {
            return str.startsWith("<") ? l(str) : e(str);
        }
        a(9);
        throw null;
    }

    public static Name e(String str) {
        if (str != null) {
            return new Name(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static Name l(String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (this.e) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strB = b();
        if (strB != null) {
            return strB;
        }
        a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Name name) {
        return this.d.compareTo(name.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.e == name.e && this.d.equals(name.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.e ? 1 : 0);
    }

    public final String toString() {
        return this.d;
    }
}
