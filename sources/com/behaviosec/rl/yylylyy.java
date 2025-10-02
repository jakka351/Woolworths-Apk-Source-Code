package com.behaviosec.rl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes4.dex */
public class yylylyy<T> implements Queue<T>, Iterable<T> {
    public static int h006800680068hh0068h = 1;
    public static int h0068h0068hh0068h = 65;
    public static int hh00680068hh0068h = 0;
    public static int hhhh0068h0068h = 2;
    private final int x00780078xx0078x;
    private final LinkedList<T> xxx0078x0078x = new LinkedList<>();

    public yylylyy(int i) {
        this.x00780078xx0078x = i;
    }

    private boolean dd0064006400640064d() {
        boolean z = this.xxx0078x0078x.size() > this.x00780078xx0078x;
        while (this.xxx0078x0078x.size() > this.x00780078xx0078x) {
            this.xxx0078x0078x.remove();
            int i = h0068h0068hh0068h;
            if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != hh00680068hh0068h) {
                h0068h0068hh0068h = 46;
                hh00680068hh0068h = h0068hh0068h0068h();
            }
        }
        return z;
    }

    public static int h00680068h0068h0068h() {
        return 2;
    }

    public static int h0068hh0068h0068h() {
        return 14;
    }

    public static int hh0068h0068h0068h() {
        return 1;
    }

    public static int hhh00680068h0068h() {
        return 0;
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t) {
        boolean zAdd = this.xxx0078x0078x.add(t);
        boolean zDd0064006400640064d = dd0064006400640064d();
        if (!zAdd && !zDd0064006400640064d) {
            return false;
        }
        int i = h0068h0068hh0068h;
        if (((hh0068h0068h0068h() + i) * i) % h00680068h0068h0068h() != 0) {
            h0068h0068hh0068h = 48;
            hh00680068hh0068h = 71;
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean zAddAll = this.xxx0078x0078x.addAll(collection);
        boolean zDd0064006400640064d = dd0064006400640064d();
        if (!zAddAll && !zDd0064006400640064d) {
            return false;
        }
        if ((h0068hh0068h0068h() * (h0068hh0068h0068h() + h006800680068hh0068h)) % hhhh0068h0068h != hh00680068hh0068h) {
            h0068h0068hh0068h = 97;
            hh00680068hh0068h = 36;
        }
        return true;
    }

    @Override // java.util.Collection
    public void clear() {
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != hh00680068hh0068h) {
            h0068h0068hh0068h = 56;
            hh00680068hh0068h = h0068hh0068h0068h();
        }
        this.xxx0078x0078x.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        LinkedList<T> linkedList = this.xxx0078x0078x;
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != 0) {
            h0068h0068hh0068h = h0068hh0068h0068h();
            hh00680068hh0068h = 4;
        }
        return linkedList.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        LinkedList<T> linkedList = this.xxx0078x0078x;
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != 0) {
            h0068h0068hh0068h = 8;
            hh00680068hh0068h = 18;
        }
        return linkedList.containsAll(collection);
    }

    @Override // java.util.Queue
    public T element() {
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != 0) {
            h0068h0068hh0068h = 23;
            hh00680068hh0068h = 7;
        }
        return this.xxx0078x0078x.element();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty = this.xxx0078x0078x.isEmpty();
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != 0) {
            h0068h0068hh0068h = h0068hh0068h0068h();
            hh00680068hh0068h = 87;
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != hh00680068hh0068h) {
            h0068h0068hh0068h = 37;
            hh00680068hh0068h = 61;
        }
        return this.xxx0078x0078x.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        boolean zOffer = this.xxx0078x0078x.offer(t);
        boolean zDd0064006400640064d = dd0064006400640064d();
        if (!zOffer && !zDd0064006400640064d) {
            return false;
        }
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % h00680068h0068h0068h() != 0) {
            h0068h0068hh0068h = h0068hh0068h0068h();
            hh00680068hh0068h = h0068hh0068h0068h();
        }
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % h00680068h0068h0068h() != 0) {
            h0068h0068hh0068h = 58;
            hh00680068hh0068h = h0068hh0068h0068h();
        }
        return this.xxx0078x0078x.peek();
    }

    @Override // java.util.Queue
    public T poll() {
        LinkedList<T> linkedList = this.xxx0078x0078x;
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != 0) {
            h0068h0068hh0068h = h0068hh0068h0068h();
            hh00680068hh0068h = 58;
        }
        return linkedList.poll();
    }

    @Override // java.util.Queue
    public T remove() {
        T tRemove = this.xxx0078x0078x.remove();
        if (((hh0068h0068h0068h() + h0068h0068hh0068h) * h0068h0068hh0068h) % hhhh0068h0068h != hhh00680068h0068h()) {
            h0068h0068hh0068h = 34;
            hh00680068hh0068h = h0068hh0068h0068h();
        }
        return tRemove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        LinkedList<T> linkedList = this.xxx0078x0078x;
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != hh00680068hh0068h) {
            h0068h0068hh0068h = 3;
            hh00680068hh0068h = h0068hh0068h0068h();
        }
        return linkedList.removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        LinkedList<T> linkedList = this.xxx0078x0078x;
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != hh00680068hh0068h) {
            h0068h0068hh0068h = 5;
            hh00680068hh0068h = 57;
        }
        return linkedList.retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        LinkedList<T> linkedList = this.xxx0078x0078x;
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != 0) {
            h0068h0068hh0068h = 58;
            hh00680068hh0068h = h0068hh0068h0068h();
        }
        return linkedList.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array = this.xxx0078x0078x.toArray();
        int i = h0068h0068hh0068h;
        if (((hh0068h0068h0068h() + i) * i) % hhhh0068h0068h != 0) {
            h0068h0068hh0068h = 92;
            hh00680068hh0068h = h0068hh0068h0068h();
        }
        return array;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        LinkedList<T> linkedList = this.xxx0078x0078x;
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != hh00680068hh0068h) {
            h0068h0068hh0068h = 38;
            hh00680068hh0068h = h0068hh0068h0068h();
        }
        return linkedList.remove(obj);
    }

    @Override // java.util.Collection
    public <TObj> TObj[] toArray(TObj[] tobjArr) {
        TObj[] tobjArr2 = (TObj[]) this.xxx0078x0078x.toArray(tobjArr);
        int i = h0068h0068hh0068h;
        if (((h006800680068hh0068h + i) * i) % hhhh0068h0068h != hh00680068hh0068h) {
            h0068h0068hh0068h = 37;
            hh00680068hh0068h = 19;
        }
        return tobjArr2;
    }
}
