package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public class CLKey extends CLContainer {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public final CLElement J() {
        if (this.h.size() > 0) {
            return (CLElement) this.h.get(0);
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLKey) || Objects.equals(d(), ((CLKey) obj).d())) {
            return super.equals(obj);
        }
        return false;
    }
}
