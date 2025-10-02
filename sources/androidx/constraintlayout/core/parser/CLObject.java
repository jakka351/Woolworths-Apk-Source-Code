package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes2.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    public static class CLObjectIterator implements Iterator<CLKey> {
        public CLObject d;
        public int e;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e < this.d.h.size();
        }

        @Override // java.util.Iterator
        public final CLKey next() {
            CLKey cLKey = (CLKey) this.d.h.get(this.e);
            this.e++;
            return cLKey;
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer
    /* renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final CLObject b() {
        return (CLObject) super.b();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public final Object clone() {
        return (CLObject) super.b();
    }

    @Override // java.lang.Iterable
    public final Iterator<CLKey> iterator() {
        CLObjectIterator cLObjectIterator = new CLObjectIterator();
        cLObjectIterator.e = 0;
        cLObjectIterator.d = this;
        return cLObjectIterator;
    }
}
