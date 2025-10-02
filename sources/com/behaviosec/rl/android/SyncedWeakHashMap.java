package com.behaviosec.rl.android;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class SyncedWeakHashMap<TKEY, TValue> implements Iterable<TKEY> {
    public static int r0072rr0072007200720072 = 1;
    public static int rr0072r0072007200720072 = 2;
    public static int rrr00720072007200720072 = 0;
    public static int rrrr0072007200720072 = 33;
    public final WeakHashMap<TKEY, TValue> mMap = new WeakHashMap<>();

    public static /* synthetic */ Object[] k006B006B006Bk006Bk(SyncedWeakHashMap syncedWeakHashMap) {
        Object[] objArrKkkk006B006Bk = syncedWeakHashMap.kkkk006B006Bk();
        int i = rrrr0072007200720072;
        if (((r0072rr0072007200720072 + i) * i) % r0072r00720072007200720072() != 0) {
            rrrr0072007200720072 = 41;
            rrr00720072007200720072 = 50;
        }
        return objArrKkkk006B006Bk;
    }

    private synchronized Object[] kkkk006B006Bk() {
        try {
            int i = rrrr0072007200720072;
            if (((r0072rr0072007200720072 + i) * i) % rr0072r0072007200720072 != rrr00720072007200720072) {
                rrrr0072007200720072 = 13;
                rrr00720072007200720072 = 22;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mMap.keySet().toArray();
    }

    public static int r00720072r0072007200720072() {
        return 71;
    }

    public static int r0072r00720072007200720072() {
        return 2;
    }

    public synchronized void clear() {
        try {
            this.mMap.clear();
        } catch (Exception e) {
            throw e;
        }
    }

    public synchronized TValue get(@NonNull TKEY tkey) {
        int i = rrrr0072007200720072;
        if (((r0072rr0072007200720072 + i) * i) % rr0072r0072007200720072 != 0) {
            rrrr0072007200720072 = r00720072r0072007200720072();
            r0072rr0072007200720072 = r00720072r0072007200720072();
        }
        try {
        } catch (Exception e) {
            throw e;
        }
        return this.mMap.get(tkey);
    }

    @Override // java.lang.Iterable
    @NonNull
    public synchronized Iterator<TKEY> iterator() {
        Iterator<TKEY> it;
        it = new Iterator<TKEY>() { // from class: com.behaviosec.rl.android.SyncedWeakHashMap.1
            public static int c0063cccccc = 1;
            public static int cc0063ccccc = 2;
            public static int rr007200720072007200720072 = 98;
            private int i0069i0069iii = 0;
            public final Object[] ii00690069iii;

            {
                this.ii00690069iii = SyncedWeakHashMap.k006B006B006Bk006Bk(SyncedWeakHashMap.this);
            }

            public static int c00630063ccccc() {
                return 12;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                boolean z;
                synchronized (this) {
                    try {
                        int i = this.i0069i0069iii;
                        Object[] objArr = this.ii00690069iii;
                        z = i < objArr.length && objArr[i] != null;
                    } finally {
                    }
                }
                return z;
            }

            @Override // java.util.Iterator
            public TKEY next() {
                TKEY tkey;
                synchronized (this) {
                    try {
                        int i = this.i0069i0069iii;
                        Object[] objArr = this.ii00690069iii;
                        if (i >= objArr.length) {
                            throw new NoSuchElementException();
                        }
                        this.i0069i0069iii = i + 1;
                        tkey = (TKEY) objArr[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return tkey;
            }

            @Override // java.util.Iterator
            public void remove() {
                int i = rr007200720072007200720072;
                if (((c0063cccccc + i) * i) % cc0063ccccc != 0) {
                    rr007200720072007200720072 = c00630063ccccc();
                    c0063cccccc = c00630063ccccc();
                }
                throw new UnsupportedOperationException();
            }
        };
        int i = rrrr0072007200720072;
        if (((r0072rr0072007200720072 + i) * i) % rr0072r0072007200720072 != rrr00720072007200720072) {
            rrrr0072007200720072 = r00720072r0072007200720072();
            rrr00720072007200720072 = 82;
        }
        return it;
    }

    public synchronized Set<TKEY> keySet() {
        HashSet hashSet;
        hashSet = new HashSet(this.mMap.keySet());
        int iR00720072r0072007200720072 = r00720072r0072007200720072();
        if (((r0072rr0072007200720072 + iR00720072r0072007200720072) * iR00720072r0072007200720072) % rr0072r0072007200720072 != 0) {
            rrrr0072007200720072 = r00720072r0072007200720072();
            rrr00720072007200720072 = r00720072r0072007200720072();
        }
        return hashSet;
    }

    public synchronized void put(@NonNull TKEY tkey, @NonNull TValue tvalue) {
        this.mMap.put(tkey, tvalue);
        int i = rrrr0072007200720072;
        if (((r0072rr0072007200720072 + i) * i) % rr0072r0072007200720072 != rrr00720072007200720072) {
            rrrr0072007200720072 = 18;
            rrr00720072007200720072 = 20;
        }
    }

    public synchronized void remove(@NonNull TKEY tkey) {
        this.mMap.remove(tkey);
    }

    public synchronized int size() {
        try {
            int i = rrrr0072007200720072;
            if (((r0072rr0072007200720072 + i) * i) % rr0072r0072007200720072 != rrr00720072007200720072) {
                rrrr0072007200720072 = r00720072r0072007200720072();
                rrr00720072007200720072 = r00720072r0072007200720072();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mMap.size();
    }
}
