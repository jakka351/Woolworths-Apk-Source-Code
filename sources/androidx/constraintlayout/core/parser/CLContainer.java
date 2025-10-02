package androidx.constraintlayout.core.parser;

import YU.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public class CLContainer extends CLElement {
    public ArrayList h;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.h = new ArrayList();
    }

    public final CLElement A(String str) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.d().equals(str)) {
                return cLKey.J();
            }
        }
        return null;
    }

    public final String B(int i) throws CLParsingException {
        CLElement cLElementO = o(i);
        if (cLElementO instanceof CLString) {
            return cLElementO.d();
        }
        throw new CLParsingException(a.d(i, "no string at index "), this);
    }

    public final String C(String str) throws CLParsingException {
        CLElement cLElementQ = q(str);
        if (cLElementQ instanceof CLString) {
            return cLElementQ.d();
        }
        StringBuilder sbV = a.v("no string found for key <", str, ">, found [", cLElementQ != null ? cLElementQ.i() : null, "] : ");
        sbV.append(cLElementQ);
        throw new CLParsingException(sbV.toString(), this);
    }

    public final String D(String str) {
        CLElement cLElementA = A(str);
        if (cLElementA instanceof CLString) {
            return cLElementA.d();
        }
        return null;
    }

    public final boolean E(String str) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            CLElement cLElement = (CLElement) it.next();
            if ((cLElement instanceof CLKey) && ((CLKey) cLElement).d().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            CLElement cLElement = (CLElement) it.next();
            if (cLElement instanceof CLKey) {
                arrayList.add(((CLKey) cLElement).d());
            }
        }
        return arrayList;
    }

    public final void I(String str, CLElement cLElement) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.d().equals(str)) {
                if (cLKey.h.size() > 0) {
                    cLKey.h.set(0, cLElement);
                    return;
                } else {
                    cLKey.h.add(cLElement);
                    return;
                }
            }
        }
        CLKey cLKey2 = new CLKey(str.toCharArray());
        cLKey2.e = 0L;
        cLKey2.j(str.length() - 1);
        if (cLKey2.h.size() > 0) {
            cLKey2.h.set(0, cLElement);
        } else {
            cLKey2.h.add(cLElement);
        }
        this.h.add(cLKey2);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLContainer) {
            return this.h.equals(((CLContainer) obj).h);
        }
        return false;
    }

    public final int getInt(int i) throws CLParsingException {
        CLElement cLElementO = o(i);
        if (cLElementO != null) {
            return cLElementO.h();
        }
        throw new CLParsingException(a.d(i, "no int at index "), this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return Objects.hash(this.h, Integer.valueOf(super.hashCode()));
    }

    public final void k(CLElement cLElement) {
        this.h.add(cLElement);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CLContainer clone() {
        CLContainer cLContainer = (CLContainer) super.b();
        ArrayList arrayList = new ArrayList(this.h.size());
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            CLElement cLElementClone = ((CLElement) it.next()).b();
            cLElementClone.g = cLContainer;
            arrayList.add(cLElementClone);
        }
        cLContainer.h = arrayList;
        return cLContainer;
    }

    public final CLElement o(int i) throws CLParsingException {
        if (i < 0 || i >= this.h.size()) {
            throw new CLParsingException(a.d(i, "no element at index "), this);
        }
        return (CLElement) this.h.get(i);
    }

    public final CLElement q(String str) throws CLParsingException {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.d().equals(str)) {
                return cLKey.J();
            }
        }
        throw new CLParsingException(a.h("no element for key <", str, ">"), this);
    }

    public final CLArray s(String str) throws CLParsingException {
        CLElement cLElementQ = q(str);
        if (cLElementQ instanceof CLArray) {
            return (CLArray) cLElementQ;
        }
        StringBuilder sbU = a.u("no array found for key <", str, ">, found [");
        sbU.append(cLElementQ.i());
        sbU.append("] : ");
        sbU.append(cLElementQ);
        throw new CLParsingException(sbU.toString(), this);
    }

    public final CLArray t(String str) {
        CLElement cLElementA = A(str);
        if (cLElementA instanceof CLArray) {
            return (CLArray) cLElementA;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            CLElement cLElement = (CLElement) it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cLElement);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public final float u(int i) throws CLParsingException {
        CLElement cLElementO = o(i);
        if (cLElementO != null) {
            return cLElementO.g();
        }
        throw new CLParsingException(a.d(i, "no float at index "), this);
    }

    public final float v(String str) throws CLParsingException {
        CLElement cLElementQ = q(str);
        if (cLElementQ != null) {
            return cLElementQ.g();
        }
        StringBuilder sbU = a.u("no float found for key <", str, ">, found [");
        sbU.append(cLElementQ.i());
        sbU.append("] : ");
        sbU.append(cLElementQ);
        throw new CLParsingException(sbU.toString(), this);
    }

    public final float w(String str) {
        CLElement cLElementA = A(str);
        if (cLElementA instanceof CLNumber) {
            return cLElementA.g();
        }
        return Float.NaN;
    }

    public final CLObject y(String str) {
        CLElement cLElementA = A(str);
        if (cLElementA instanceof CLObject) {
            return (CLObject) cLElementA;
        }
        return null;
    }

    public final CLElement z(int i) {
        if (i < 0 || i >= this.h.size()) {
            return null;
        }
        return (CLElement) this.h.get(i);
    }
}
