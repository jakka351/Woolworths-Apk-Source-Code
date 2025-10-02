package com.airbnb.epoxy;

import androidx.collection.LongSparseArray;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class BoundViewHolders implements Iterable<EpoxyViewHolder> {
    public final LongSparseArray d = new LongSparseArray((Object) null);

    public class HolderIterator implements Iterator<EpoxyViewHolder> {
        public int d = 0;

        public HolderIterator() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d < BoundViewHolders.this.d.j();
        }

        @Override // java.util.Iterator
        public final EpoxyViewHolder next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            LongSparseArray longSparseArray = BoundViewHolders.this.d;
            int i = this.d;
            this.d = i + 1;
            return (EpoxyViewHolder) longSparseArray.k(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<EpoxyViewHolder> iterator() {
        return new HolderIterator();
    }
}
