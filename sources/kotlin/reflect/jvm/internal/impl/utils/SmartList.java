package kotlin.reflect.jvm.internal.impl.utils;

import androidx.constraintlayout.core.state.a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {
    public int d;
    public Object e;

    /* loaded from: classes7.dex */
    public static class EmptyIterator<T> implements Iterator<T> {
        public static final EmptyIterator d = new EmptyIterator();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes7.dex */
    public class SingletonIterator extends SingletonIteratorBase<E> {
        public final int e;

        public SingletonIterator() {
            this.e = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        public final void a() {
            SmartList smartList = SmartList.this;
            int i = ((AbstractList) smartList).modCount;
            int i2 = this.e;
            if (i == i2) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) smartList).modCount + "; expected: " + i2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        public final Object b() {
            return SmartList.this.e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            a();
            SmartList.this.clear();
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class SingletonIteratorBase<T> implements Iterator<T> {
        public boolean d;

        public abstract void a();

        public abstract Object b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.d;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.d) {
                throw new NoSuchElementException();
            }
            this.d = true;
            a();
            return b();
        }
    }

    public static /* synthetic */ void b(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.d;
        if (i == 0) {
            this.e = obj;
        } else if (i == 1) {
            this.e = new Object[]{this.e, obj};
        } else {
            Object[] objArr = (Object[]) this.e;
            int length = objArr.length;
            if (i >= length) {
                int iA = a.a(length, 3, 2, 1);
                int i2 = i + 1;
                if (iA < i2) {
                    iA = i2;
                }
                Object[] objArr2 = new Object[iA];
                this.e = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.d] = obj;
        }
        this.d++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.e = null;
        this.d = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.d)) {
            return i2 == 1 ? this.e : ((Object[]) this.e)[i];
        }
        StringBuilder sbR = YU.a.r(i, "Index: ", ", Size: ");
        sbR.append(this.d);
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i = this.d;
        if (i == 0) {
            return EmptyIterator.d;
        }
        if (i == 1) {
            return new SingletonIterator();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        b(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.d)) {
            StringBuilder sbR = YU.a.r(i, "Index: ", ", Size: ");
            sbR.append(this.d);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 == 1) {
            obj = this.e;
            this.e = null;
        } else {
            Object[] objArr = (Object[]) this.e;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.e = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.d - 1] = null;
            }
            obj = obj2;
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            StringBuilder sbR = YU.a.r(i, "Index: ", ", Size: ");
            sbR.append(this.d);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 == 1) {
            Object obj2 = this.e;
            this.e = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.e;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i = this.d;
        if (i >= 2) {
            Arrays.sort((Object[]) this.e, 0, i, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            b(4);
            throw null;
        }
        int length = objArr.length;
        int i = this.d;
        if (i == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.e;
                return objArr2;
            }
            objArr[0] = this.e;
        } else {
            if (length < i) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.e, i, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                b(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.e, 0, objArr, 0, i);
            }
        }
        int i2 = this.d;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        if (i >= 0 && i <= (i2 = this.d)) {
            if (i2 == 0) {
                this.e = obj;
            } else if (i2 == 1 && i == 0) {
                this.e = new Object[]{obj, this.e};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.e;
                } else {
                    Object[] objArr2 = (Object[]) this.e;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.d - i);
                }
                objArr[i] = obj;
                this.e = objArr;
            }
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbR = YU.a.r(i, "Index: ", ", Size: ");
        sbR.append(this.d);
        throw new IndexOutOfBoundsException(sbR.toString());
    }
}
