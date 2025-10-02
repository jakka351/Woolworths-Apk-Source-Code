package androidx.constraintlayout.core.parser;

import com.salesforce.marketingcloud.messages.iam.j;

/* loaded from: classes2.dex */
public class CLParsingException extends Exception {
    public final String d;
    public final int e;
    public final String f;

    public CLParsingException(String str, CLElement cLElement) {
        super(str);
        this.d = str;
        if (cLElement != null) {
            this.f = cLElement.i();
            this.e = 0;
        } else {
            this.f = j.h;
            this.e = 0;
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.d + " (" + this.f + " at line " + this.e + ")");
        return sb.toString();
    }
}
