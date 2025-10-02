package com.fasterxml.jackson.databind.util;

import androidx.camera.core.impl.b;

/* loaded from: classes4.dex */
public abstract class PrimitiveArrayBuilder<T> {

    /* renamed from: a, reason: collision with root package name */
    public Object f14337a;
    public Node b;
    public Node c;
    public int d;

    public static final class Node<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f14338a;
        public final int b;
        public Node c;

        public Node(Object obj, int i) {
            this.f14338a = obj;
            this.b = i;
        }
    }

    public abstract Object a(int i);

    public final Object b(int i, Object obj) {
        Node node = new Node(obj, i);
        if (this.b == null) {
            this.c = node;
            this.b = node;
        } else {
            Node node2 = this.c;
            if (node2.c != null) {
                throw new IllegalStateException();
            }
            node2.c = node;
            this.c = node;
        }
        this.d += i;
        return a(i < 16384 ? i + i : i + (i >> 2));
    }

    public final Object c(int i, Object obj) {
        int i2 = this.d + i;
        Object objA = a(i2);
        int i3 = 0;
        for (Node node = this.b; node != null; node = node.c) {
            Object obj2 = node.f14338a;
            int i4 = node.b;
            System.arraycopy(obj2, 0, objA, i3, i4);
            i3 += i4;
        }
        System.arraycopy(obj, 0, objA, i3, i);
        int i5 = i3 + i;
        if (i5 == i2) {
            return objA;
        }
        throw new IllegalStateException(b.i(i2, i5, "Should have gotten ", " entries, got "));
    }

    public final Object d() {
        Node node = this.c;
        if (node != null) {
            this.f14337a = node.f14338a;
        }
        this.c = null;
        this.b = null;
        this.d = 0;
        Object obj = this.f14337a;
        return obj == null ? a(12) : obj;
    }
}
