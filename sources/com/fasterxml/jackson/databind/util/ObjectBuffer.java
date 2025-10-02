package com.fasterxml.jackson.databind.util;

import androidx.camera.core.impl.b;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ObjectBuffer {

    /* renamed from: a, reason: collision with root package name */
    public LinkedNode f14336a;
    public LinkedNode b;
    public int c;
    public Object[] d;

    public final void a(Object[] objArr, int i, int i2, Object obj) {
        int i3 = 0;
        for (LinkedNode linkedNode = this.f14336a; linkedNode != null; linkedNode = linkedNode.b) {
            Object[] objArr2 = (Object[]) linkedNode.f14334a;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            throw new IllegalStateException(b.i(i, i4, "Should have gotten ", " entries, got "));
        }
    }

    public final void b() {
        LinkedNode linkedNode = this.b;
        if (linkedNode != null) {
            this.d = (Object[]) linkedNode.f14334a;
        }
        this.b = null;
        this.f14336a = null;
        this.c = 0;
    }

    public final Object[] c(Object[] objArr) {
        LinkedNode linkedNode = new LinkedNode(objArr, null);
        if (this.f14336a == null) {
            this.b = linkedNode;
            this.f14336a = linkedNode;
        } else {
            LinkedNode linkedNode2 = this.b;
            if (linkedNode2.b != null) {
                throw new IllegalStateException();
            }
            linkedNode2.b = linkedNode;
            this.b = linkedNode;
        }
        int length = objArr.length;
        this.c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public final void d(Object[] objArr, int i, ArrayList arrayList) {
        int i2;
        LinkedNode linkedNode = this.f14336a;
        while (true) {
            i2 = 0;
            if (linkedNode == null) {
                break;
            }
            Object[] objArr2 = (Object[]) linkedNode.f14334a;
            int length = objArr2.length;
            while (i2 < length) {
                arrayList.add(objArr2[i2]);
                i2++;
            }
            linkedNode = linkedNode.b;
        }
        while (i2 < i) {
            arrayList.add(objArr[i2]);
            i2++;
        }
        b();
    }

    public final Object[] e(int i, Object[] objArr) {
        int i2 = this.c + i;
        Object[] objArr2 = new Object[i2];
        a(objArr, i2, i, objArr2);
        b();
        return objArr2;
    }

    public final Object[] f(Object[] objArr, int i, Class cls) {
        int i2 = this.c + i;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) cls, i2);
        a(objArr, i2, i, objArr2);
        b();
        return objArr2;
    }

    public final Object[] g() {
        b();
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.d = objArr2;
        return objArr2;
    }

    public final Object[] h(int i, Object[] objArr) {
        b();
        Object[] objArr2 = this.d;
        if (objArr2 == null || objArr2.length < i) {
            this.d = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this.d, 0, i);
        return this.d;
    }
}
