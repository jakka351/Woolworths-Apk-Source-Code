package com.airbnb.epoxy;

import com.airbnb.epoxy.ControllerModelList;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
class ModelList extends ArrayList<EpoxyModel<?>> {
    public boolean d;
    public ControllerModelList.AnonymousClass1 e;

    public class Itr implements Iterator<EpoxyModel<?>> {
        public int d;
        public int e = -1;
        public int f;

        public Itr() {
            this.f = ((ArrayList) ModelList.this).modCount;
        }

        public final void a() {
            if (((ArrayList) ModelList.this).modCount != this.f) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != ModelList.this.size();
        }

        @Override // java.util.Iterator
        public final EpoxyModel<?> next() {
            a();
            int i = this.d;
            this.d = i + 1;
            this.e = i;
            return ModelList.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            ModelList modelList = ModelList.this;
            if (this.e < 0) {
                throw new IllegalStateException();
            }
            a();
            try {
                modelList.remove(this.e);
                this.d = this.e;
                this.e = -1;
                this.f = ((ArrayList) modelList).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public class ListItr extends Itr implements ListIterator<EpoxyModel<?>> {
        public ListItr(int i) {
            super();
            this.d = i;
        }

        @Override // java.util.ListIterator
        public final void add(EpoxyModel<?> epoxyModel) {
            EpoxyModel<?> epoxyModel2 = epoxyModel;
            ModelList modelList = ModelList.this;
            a();
            try {
                int i = this.d;
                modelList.add(i, epoxyModel2);
                this.d = i + 1;
                this.e = -1;
                this.f = ((ArrayList) modelList).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.d != 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.d;
        }

        @Override // java.util.ListIterator
        public final EpoxyModel<?> previous() {
            a();
            int i = this.d - 1;
            if (i < 0) {
                throw new NoSuchElementException();
            }
            this.d = i;
            this.e = i;
            return ModelList.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.d - 1;
        }

        @Override // java.util.ListIterator
        public final void set(EpoxyModel<?> epoxyModel) {
            EpoxyModel<?> epoxyModel2 = epoxyModel;
            if (this.e < 0) {
                throw new IllegalStateException();
            }
            a();
            try {
                ModelList.this.set(this.e, epoxyModel2);
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public interface ModelListObserver {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void add(int i, EpoxyModel epoxyModel) {
        J(i, 1);
        super.add(i, epoxyModel);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final boolean add(EpoxyModel epoxyModel) {
        J(size(), 1);
        return super.add(epoxyModel);
    }

    public final void J(int i, int i2) {
        if (!this.d && this.e != null) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    }

    public final void K(int i, int i2) {
        if (!this.d && this.e != null) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final EpoxyModel remove(int i) {
        K(i, 1);
        return (EpoxyModel) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final EpoxyModel set(int i, EpoxyModel epoxyModel) {
        EpoxyModel epoxyModel2 = (EpoxyModel) super.set(i, epoxyModel);
        if (epoxyModel2.d != epoxyModel.d) {
            K(i, 1);
            J(i, 1);
        }
        return epoxyModel2;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        J(size(), collection.size());
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (isEmpty()) {
            return;
        }
        K(0, size());
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new Itr();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new ListItr(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Itr itr = new Itr();
        boolean z = false;
        while (itr.hasNext()) {
            if (collection.contains(itr.next())) {
                itr.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i, int i2) {
        if (i == i2) {
            return;
        }
        K(i, i2 - i);
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Itr itr = new Itr();
        boolean z = false;
        while (itr.hasNext()) {
            if (!collection.contains(itr.next())) {
                itr.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i2 > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= i2) {
            return new SubList(this, i, i2);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ListItr(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        K(iIndexOf, 1);
        super.remove(iIndexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        J(i, collection.size());
        return super.addAll(i, collection);
    }

    public static class SubList extends AbstractList<EpoxyModel<?>> {
        public final ModelList d;
        public final int e;
        public int f;

        public static final class SubListIterator implements ListIterator<EpoxyModel<?>> {
            public final SubList d;
            public final ListIterator e;
            public final int f;
            public int g;

            public SubListIterator(ListIterator listIterator, SubList subList, int i, int i2) {
                this.e = listIterator;
                this.d = subList;
                this.f = i;
                this.g = i + i2;
            }

            @Override // java.util.ListIterator
            public final void add(EpoxyModel<?> epoxyModel) {
                this.e.add(epoxyModel);
                this.d.b(true);
                this.g++;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.e.nextIndex() < this.g;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.e.previousIndex() >= this.f;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final Object next() {
                ListIterator listIterator = this.e;
                if (listIterator.nextIndex() < this.g) {
                    return (EpoxyModel) listIterator.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.e.nextIndex() - this.f;
            }

            @Override // java.util.ListIterator
            public final EpoxyModel<?> previous() {
                ListIterator listIterator = this.e;
                if (listIterator.previousIndex() >= this.f) {
                    return (EpoxyModel) listIterator.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                int iPreviousIndex = this.e.previousIndex();
                int i = this.f;
                if (iPreviousIndex >= i) {
                    return iPreviousIndex - i;
                }
                return -1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                this.e.remove();
                this.d.b(false);
                this.g--;
            }

            @Override // java.util.ListIterator
            public final void set(EpoxyModel<?> epoxyModel) {
                this.e.set(epoxyModel);
            }
        }

        public SubList(ModelList modelList, int i, int i2) {
            this.d = modelList;
            ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
            this.e = i;
            this.f = i2 - i;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            EpoxyModel epoxyModel = (EpoxyModel) obj;
            int i2 = ((AbstractList) this).modCount;
            ModelList modelList = this.d;
            if (i2 != ((ArrayList) modelList).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i < 0 || i > this.f) {
                throw new IndexOutOfBoundsException();
            }
            modelList.add(i + this.e, epoxyModel);
            this.f++;
            ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection collection) {
            int i2 = ((AbstractList) this).modCount;
            ModelList modelList = this.d;
            if (i2 != ((ArrayList) modelList).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i < 0 || i > this.f) {
                throw new IndexOutOfBoundsException();
            }
            boolean zAddAll = modelList.addAll(i + this.e, collection);
            if (zAddAll) {
                this.f = collection.size() + this.f;
                ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
            }
            return zAddAll;
        }

        public final void b(boolean z) {
            if (z) {
                this.f++;
            } else {
                this.f--;
            }
            ((AbstractList) this).modCount = ((ArrayList) this.d).modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            int i2 = ((AbstractList) this).modCount;
            ModelList modelList = this.d;
            if (i2 != ((ArrayList) modelList).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i < 0 || i >= this.f) {
                throw new IndexOutOfBoundsException();
            }
            return modelList.get(i + this.e);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            int i2 = ((AbstractList) this).modCount;
            ModelList modelList = this.d;
            if (i2 != ((ArrayList) modelList).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i < 0 || i > this.f) {
                throw new IndexOutOfBoundsException();
            }
            int i3 = this.e;
            return new SubListIterator(modelList.new ListItr(i + i3), this, i3, this.f);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            int i2 = ((AbstractList) this).modCount;
            ModelList modelList = this.d;
            if (i2 != ((ArrayList) modelList).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i < 0 || i >= this.f) {
                throw new IndexOutOfBoundsException();
            }
            EpoxyModel epoxyModelRemove = modelList.remove(i + this.e);
            this.f--;
            ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
            return epoxyModelRemove;
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            if (i != i2) {
                int i3 = ((AbstractList) this).modCount;
                ModelList modelList = this.d;
                if (i3 != ((ArrayList) modelList).modCount) {
                    throw new ConcurrentModificationException();
                }
                int i4 = this.e;
                modelList.removeRange(i + i4, i4 + i2);
                this.f -= i2 - i;
                ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            EpoxyModel epoxyModel = (EpoxyModel) obj;
            int i2 = ((AbstractList) this).modCount;
            ModelList modelList = this.d;
            if (i2 != ((ArrayList) modelList).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i < 0 || i >= this.f) {
                throw new IndexOutOfBoundsException();
            }
            return modelList.set(i + this.e, epoxyModel);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            if (((AbstractList) this).modCount == ((ArrayList) this.d).modCount) {
                return this.f;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection collection) {
            int i = ((AbstractList) this).modCount;
            ModelList modelList = this.d;
            if (i == ((ArrayList) modelList).modCount) {
                boolean zAddAll = modelList.addAll(this.e + this.f, collection);
                if (zAddAll) {
                    this.f = collection.size() + this.f;
                    ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
                }
                return zAddAll;
            }
            throw new ConcurrentModificationException();
        }
    }
}
