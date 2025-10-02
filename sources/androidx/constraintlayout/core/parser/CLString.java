package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLString extends CLElement {
    public static CLString k(String str) {
        CLString cLString = new CLString(str.toCharArray());
        cLString.e = 0L;
        cLString.j(str.length() - 1);
        return cLString;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CLString) && d().equals(((CLString) obj).d())) {
            return true;
        }
        return super.equals(obj);
    }
}
