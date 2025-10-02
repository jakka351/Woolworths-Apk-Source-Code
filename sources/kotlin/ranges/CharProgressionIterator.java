package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CharProgressionIterator extends CharIterator {
    public final int d;
    public final int e;
    public boolean f;
    public int g;

    public CharProgressionIterator(char c, char c2, int i) {
        this.d = i;
        this.e = c2;
        boolean z = false;
        if (i <= 0 ? Intrinsics.j(c, c2) >= 0 : Intrinsics.j(c, c2) <= 0) {
            z = true;
        }
        this.f = z;
        this.g = z ? c : c2;
    }

    @Override // kotlin.collections.CharIterator
    public final char a() {
        int i = this.g;
        if (i != this.e) {
            this.g = this.d + i;
        } else {
            if (!this.f) {
                throw new NoSuchElementException();
            }
            this.f = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }
}
