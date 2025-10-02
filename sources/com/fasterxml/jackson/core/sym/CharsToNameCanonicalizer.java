package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class CharsToNameCanonicalizer {

    /* renamed from: a, reason: collision with root package name */
    public final CharsToNameCanonicalizer f14214a;
    public final AtomicReference b;
    public final int c;
    public final int d;
    public boolean e;
    public String[] f;
    public Bucket[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public BitSet m;

    public static final class Bucket {

        /* renamed from: a, reason: collision with root package name */
        public final String f14215a;
        public final Bucket b;
        public final int c;

        public Bucket(String str, Bucket bucket) {
            this.f14215a = str;
            this.b = bucket;
            this.c = bucket != null ? 1 + bucket.c : 1;
        }
    }

    public CharsToNameCanonicalizer(int i) {
        this.f14214a = null;
        this.c = i;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.k = 0;
        this.b = new AtomicReference(new TableInfo(new String[64], new Bucket[32]));
    }

    public final int a(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0085 A[EDGE_INSN: B:128:0x0085->B:48:0x0085 BREAK  A[LOOP:1: B:34:0x0062->B:46:0x0081], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081 A[LOOP:1: B:34:0x0062->B:46:0x0081, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(int r20, int r21, int r22, char[] r23) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.b(int, int, int, char[]):java.lang.String");
    }

    public final CharsToNameCanonicalizer c(int i) {
        return new CharsToNameCanonicalizer(this, i, this.c, (TableInfo) this.b.get());
    }

    public final void d() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (this.l || (charsToNameCanonicalizer = this.f14214a) == null || !this.e) {
            return;
        }
        TableInfo tableInfo = new TableInfo(this);
        AtomicReference atomicReference = charsToNameCanonicalizer.b;
        TableInfo tableInfo2 = (TableInfo) atomicReference.get();
        int i = tableInfo2.f14216a;
        int i2 = tableInfo.f14216a;
        if (i2 != i) {
            if (i2 > 12000) {
                tableInfo = new TableInfo(new String[64], new Bucket[32]);
            }
            while (!atomicReference.compareAndSet(tableInfo2, tableInfo) && atomicReference.get() == tableInfo2) {
            }
        }
        this.l = true;
    }

    public static final class TableInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f14216a;
        public final int b;
        public final String[] c;
        public final Bucket[] d;

        public TableInfo(String[] strArr, Bucket[] bucketArr) {
            this.f14216a = 0;
            this.b = 0;
            this.c = strArr;
            this.d = bucketArr;
        }

        public TableInfo(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.f14216a = charsToNameCanonicalizer.h;
            this.b = charsToNameCanonicalizer.k;
            this.c = charsToNameCanonicalizer.f;
            this.d = charsToNameCanonicalizer.g;
        }
    }

    public CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i, int i2, TableInfo tableInfo) {
        this.f14214a = charsToNameCanonicalizer;
        this.c = i2;
        this.b = null;
        this.d = i;
        this.e = JsonFactory.Feature.e.c(i);
        String[] strArr = tableInfo.c;
        this.f = strArr;
        this.g = tableInfo.d;
        this.h = tableInfo.f14216a;
        this.k = tableInfo.b;
        int length = strArr.length;
        this.i = length - (length >> 2);
        this.j = length - 1;
        this.l = true;
    }
}
