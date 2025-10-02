package com.scandit.datacapture.core;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: com.scandit.datacapture.core.x4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ConcurrentMapC1165x4 extends AbstractMap implements ConcurrentMap, Serializable {
    static final Q3 j = new Q3();

    /* renamed from: a, reason: collision with root package name */
    final transient int f18988a;
    final transient int b;
    final transient AbstractC0967b4[] c;
    final int d;
    final S1 e;
    final transient X3 f;
    transient Set g;
    transient Collection h;
    transient Set i;

    private ConcurrentMapC1165x4(P3 p3, X3 x3) {
        p3.getClass();
        this.d = Math.min(4, 65536);
        this.e = p3.a();
        this.f = x3;
        int iMin = Math.min(16, 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.d) {
            i3++;
            i4 <<= 1;
        }
        this.b = 32 - i3;
        this.f18988a = i4 - 1;
        this.c = b(i4);
        int i5 = iMin / i4;
        while (i2 < (i4 * i5 < iMin ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            AbstractC0967b4[] abstractC0967b4Arr = this.c;
            if (i >= abstractC0967b4Arr.length) {
                return;
            }
            abstractC0967b4Arr[i] = a(i2);
            i++;
        }
    }

    public static ConcurrentMapC1165x4 a(P3 p3) {
        EnumC0994e4 enumC0994e4 = p3.b;
        EnumC0994e4 enumC0994e42 = EnumC0994e4.f18489a;
        if ((enumC0994e4 != null ? enumC0994e4 : enumC0994e42) == enumC0994e42) {
            EnumC0994e4 enumC0994e43 = p3.c;
            if (enumC0994e43 == null) {
                enumC0994e43 = enumC0994e42;
            }
            if (enumC0994e43 == enumC0994e42) {
                return new ConcurrentMapC1165x4(p3, C1003f4.b());
            }
        }
        if ((enumC0994e4 != null ? enumC0994e4 : enumC0994e42) == enumC0994e42) {
            EnumC0994e4 enumC0994e44 = p3.c;
            if (enumC0994e44 == null) {
                enumC0994e44 = enumC0994e42;
            }
            if (enumC0994e44 == EnumC0994e4.b) {
                return new ConcurrentMapC1165x4(p3, C1030i4.b());
            }
        }
        EnumC0994e4 enumC0994e45 = enumC0994e4 != null ? enumC0994e4 : enumC0994e42;
        C0985d4 c0985d4 = EnumC0994e4.b;
        if (enumC0994e45 == c0985d4) {
            EnumC0994e4 enumC0994e46 = p3.c;
            if (enumC0994e46 == null) {
                enumC0994e46 = enumC0994e42;
            }
            if (enumC0994e46 == enumC0994e42) {
                return new ConcurrentMapC1165x4(p3, C1075n4.b());
            }
        }
        if (enumC0994e4 == null) {
            enumC0994e4 = enumC0994e42;
        }
        if (enumC0994e4 == c0985d4) {
            EnumC0994e4 enumC0994e47 = p3.c;
            if (enumC0994e47 != null) {
                enumC0994e42 = enumC0994e47;
            }
            if (enumC0994e42 == c0985d4) {
                return new ConcurrentMapC1165x4(p3, C1102q4.b());
            }
        }
        throw new AssertionError();
    }

    public static AbstractC0967b4[] b(int i) {
        return new AbstractC0967b4[i];
    }

    public final AbstractC0967b4 c(int i) {
        return this.c[(i >>> this.b) & this.f18988a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (AbstractC0967b4 abstractC0967b4 : this.c) {
            if (abstractC0967b4.b != 0) {
                abstractC0967b4.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = abstractC0967b4.e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    abstractC0967b4.b();
                    abstractC0967b4.g.set(0);
                    abstractC0967b4.c++;
                    abstractC0967b4.b = 0;
                    abstractC0967b4.unlock();
                } catch (Throwable th) {
                    abstractC0967b4.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        W3 w3B;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        AbstractC0967b4 abstractC0967b4C = c(iA);
        abstractC0967b4C.getClass();
        try {
            if (abstractC0967b4C.b == 0) {
                abstractC0967b4C.d();
                return false;
            }
            if (abstractC0967b4C.b != 0) {
                AtomicReferenceArray atomicReferenceArray = abstractC0967b4C.e;
                w3B = (W3) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & iA);
                while (w3B != null) {
                    if (w3B.c() == iA) {
                        Object key = w3B.getKey();
                        if (key == null) {
                            if (abstractC0967b4C.tryLock()) {
                                try {
                                    abstractC0967b4C.c();
                                    abstractC0967b4C.unlock();
                                } catch (Throwable th) {
                                    abstractC0967b4C.unlock();
                                    throw th;
                                }
                            } else {
                                continue;
                            }
                        } else if (abstractC0967b4C.f18419a.e.b(obj, key)) {
                            break;
                        }
                    }
                    w3B = w3B.b();
                }
                w3B = null;
            } else {
                w3B = null;
            }
            if (w3B != null && w3B.getValue() != null) {
                z = true;
            }
            abstractC0967b4C.d();
            return z;
        } catch (Throwable th2) {
            abstractC0967b4C.d();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        AbstractC0967b4[] abstractC0967b4Arr = this.c;
        long j2 = -1;
        int i = 0;
        while (i < 3) {
            int length = abstractC0967b4Arr.length;
            long j3 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                AbstractC0967b4 abstractC0967b4 = abstractC0967b4Arr[r10];
                int i2 = abstractC0967b4.b;
                ?? r12 = abstractC0967b4.e;
                for (?? r13 = z; r13 < r12.length(); r13++) {
                    W3 w3B = (W3) r12.get(r13);
                    while (w3B != null) {
                        if (w3B.getKey() != null) {
                            value = w3B.getValue();
                            if (value == null) {
                                if (abstractC0967b4.tryLock()) {
                                    try {
                                        abstractC0967b4.c();
                                    } finally {
                                    }
                                }
                            }
                            boolean z2 = z;
                            if (value == null && this.f.a().a().b(obj, value)) {
                                return true;
                            }
                            w3B = w3B.b();
                            z = z2;
                        } else if (abstractC0967b4.tryLock()) {
                            try {
                                abstractC0967b4.c();
                            } finally {
                            }
                        }
                        value = null;
                        boolean z22 = z;
                        if (value == null) {
                        }
                        w3B = w3B.b();
                        z = z22;
                    }
                }
                j3 += abstractC0967b4.c;
                z = z;
            }
            boolean z3 = z;
            if (j3 == j2) {
                return z3;
            }
            i++;
            j2 = j3;
            z = z3;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        U3 u3 = new U3(this);
        this.i = u3;
        return u3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        W3 w3B;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        AbstractC0967b4 abstractC0967b4C = c(iA);
        abstractC0967b4C.getClass();
        try {
            if (abstractC0967b4C.b != 0) {
                w3B = (W3) abstractC0967b4C.e.get((r3.length() - 1) & iA);
                while (w3B != null) {
                    if (w3B.c() == iA) {
                        Object key = w3B.getKey();
                        if (key == null) {
                            if (abstractC0967b4C.tryLock()) {
                                try {
                                    abstractC0967b4C.c();
                                    abstractC0967b4C.unlock();
                                } finally {
                                }
                            } else {
                                continue;
                            }
                        } else if (abstractC0967b4C.f18419a.e.b(obj, key)) {
                            break;
                        }
                    }
                    w3B = w3B.b();
                }
                w3B = null;
            } else {
                w3B = null;
            }
            if (w3B == null) {
                abstractC0967b4C.d();
                return null;
            }
            Object value = w3B.getValue();
            if (value == null && abstractC0967b4C.tryLock()) {
                try {
                    abstractC0967b4C.c();
                    abstractC0967b4C.unlock();
                } finally {
                }
            }
            abstractC0967b4C.d();
            return value;
        } catch (Throwable th) {
            abstractC0967b4C.d();
            throw th;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        AbstractC0967b4[] abstractC0967b4Arr = this.c;
        long j2 = 0;
        for (int i = 0; i < abstractC0967b4Arr.length; i++) {
            if (abstractC0967b4Arr[i].b != 0) {
                return false;
            }
            j2 += abstractC0967b4Arr[i].c;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i2 = 0; i2 < abstractC0967b4Arr.length; i2++) {
            if (abstractC0967b4Arr[i2].b != 0) {
                return false;
            }
            j2 -= abstractC0967b4Arr[i2].c;
        }
        return j2 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.g;
        if (set != null) {
            return set;
        }
        Z3 z3 = new Z3(this);
        this.g = z3;
        return z3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return c(iA).a(obj, iA, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return c(iA).a(obj, iA, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r10 = r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r6.getValue() != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r2.c++;
        r0 = r2.a(r5, r6);
        r1 = r2.b - 1;
        r3.set(r4, r0);
        r2.b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r10;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r9.a(r10)
            com.scandit.datacapture.core.b4 r2 = r9.c(r1)
            r2.lock()
            r2.e()     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.e     // Catch: java.lang.Throwable -> L5e
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L5e
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L5e
            com.scandit.datacapture.core.W3 r5 = (com.scandit.datacapture.core.W3) r5     // Catch: java.lang.Throwable -> L5e
            r6 = r5
        L22:
            if (r6 == 0) goto L65
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L5e
            int r8 = r6.c()     // Catch: java.lang.Throwable -> L5e
            if (r8 != r1) goto L60
            if (r7 == 0) goto L60
            com.scandit.datacapture.core.x4 r8 = r2.f18419a     // Catch: java.lang.Throwable -> L5e
            com.scandit.datacapture.core.S1 r8 = r8.e     // Catch: java.lang.Throwable -> L5e
            boolean r7 = r8.b(r10, r7)     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L60
            java.lang.Object r10 = r6.getValue()     // Catch: java.lang.Throwable -> L5e
            if (r10 == 0) goto L41
            goto L47
        L41:
            java.lang.Object r1 = r6.getValue()     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L65
        L47:
            int r0 = r2.c     // Catch: java.lang.Throwable -> L5e
            int r0 = r0 + 1
            r2.c = r0     // Catch: java.lang.Throwable -> L5e
            com.scandit.datacapture.core.W3 r0 = r2.a(r5, r6)     // Catch: java.lang.Throwable -> L5e
            int r1 = r2.b     // Catch: java.lang.Throwable -> L5e
            int r1 = r1 + (-1)
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L5e
            r2.b = r1     // Catch: java.lang.Throwable -> L5e
            r2.unlock()
            return r10
        L5e:
            r10 = move-exception
            goto L69
        L60:
            com.scandit.datacapture.core.W3 r6 = r6.b()     // Catch: java.lang.Throwable -> L5e
            goto L22
        L65:
            r2.unlock()
            return r0
        L69:
            r2.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.ConcurrentMapC1165x4.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        r1.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object replace(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            r9.getClass()
            r10.getClass()
            int r0 = r8.a(r9)
            com.scandit.datacapture.core.b4 r1 = r8.c(r0)
            r1.lock()
            r1.e()     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.e     // Catch: java.lang.Throwable -> L5c
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L5c
            int r3 = r3 + (-1)
            r3 = r3 & r0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.core.W3 r4 = (com.scandit.datacapture.core.W3) r4     // Catch: java.lang.Throwable -> L5c
            r5 = r4
        L24:
            if (r5 == 0) goto L78
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L5c
            int r7 = r5.c()     // Catch: java.lang.Throwable -> L5c
            if (r7 != r0) goto L73
            if (r6 == 0) goto L73
            com.scandit.datacapture.core.x4 r7 = r1.f18419a     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.core.S1 r7 = r7.e     // Catch: java.lang.Throwable -> L5c
            boolean r6 = r7.b(r9, r6)     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L73
            java.lang.Object r9 = r5.getValue()     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L5e
            java.lang.Object r9 = r5.getValue()     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L78
            int r9 = r1.c     // Catch: java.lang.Throwable -> L5c
            int r9 = r9 + 1
            r1.c = r9     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.core.W3 r9 = r1.a(r4, r5)     // Catch: java.lang.Throwable -> L5c
            int r10 = r1.b     // Catch: java.lang.Throwable -> L5c
            int r10 = r10 + (-1)
            r2.set(r3, r9)     // Catch: java.lang.Throwable -> L5c
            r1.b = r10     // Catch: java.lang.Throwable -> L5c
            goto L78
        L5c:
            r9 = move-exception
            goto L7d
        L5e:
            int r0 = r1.c     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 + 1
            r1.c = r0     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.core.x4 r0 = r1.f18419a     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.core.X3 r0 = r0.f     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.core.b4 r2 = r1.f()     // Catch: java.lang.Throwable -> L5c
            r0.a(r2, r5, r10)     // Catch: java.lang.Throwable -> L5c
            r1.unlock()
            return r9
        L73:
            com.scandit.datacapture.core.W3 r5 = r5.b()     // Catch: java.lang.Throwable -> L5c
            goto L24
        L78:
            r1.unlock()
            r9 = 0
            return r9
        L7d:
            r1.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.ConcurrentMapC1165x4.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j2 = 0;
        for (int i = 0; i < this.c.length; i++) {
            j2 += r0[i].b;
        }
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.h;
        if (collection != null) {
            return collection;
        }
        C1066m4 c1066m4 = new C1066m4(this);
        this.h = c1066m4;
        return c1066m4;
    }

    public final int a(Object obj) {
        int iA;
        S1 s1 = this.e;
        if (obj == null) {
            s1.getClass();
            iA = 0;
        } else {
            iA = s1.a(obj);
        }
        int i = iA + ((iA << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final AbstractC0967b4 a(int i) {
        return this.f.a(this, i);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        return c(iA).a(obj, iA, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        AbstractC0967b4 abstractC0967b4C = c(iA);
        abstractC0967b4C.lock();
        try {
            abstractC0967b4C.e();
            AtomicReferenceArray atomicReferenceArray = abstractC0967b4C.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            W3 w3 = (W3) atomicReferenceArray.get(length);
            W3 w3B = w3;
            while (true) {
                if (w3B == null) {
                    break;
                }
                Object key = w3B.getKey();
                if (w3B.c() == iA && key != null && abstractC0967b4C.f18419a.e.b(obj, key)) {
                    Object value = w3B.getValue();
                    if (value == null) {
                        if (w3B.getValue() == null) {
                            abstractC0967b4C.c++;
                            W3 w3A = abstractC0967b4C.a(w3, w3B);
                            int i = abstractC0967b4C.b - 1;
                            atomicReferenceArray.set(length, w3A);
                            abstractC0967b4C.b = i;
                        }
                    } else if (abstractC0967b4C.f18419a.f.a().a().b(obj2, value)) {
                        abstractC0967b4C.c++;
                        abstractC0967b4C.f18419a.f.a(abstractC0967b4C.f(), w3B, obj3);
                        abstractC0967b4C.unlock();
                        return true;
                    }
                } else {
                    w3B = w3B.b();
                }
            }
            abstractC0967b4C.unlock();
            return false;
        } catch (Throwable th) {
            abstractC0967b4C.unlock();
            throw th;
        }
    }
}
