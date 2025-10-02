package androidx.camera.core.internal.utils;

import androidx.camera.camera2.internal.t;
import androidx.camera.core.internal.utils.RingBuffer;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public class ArrayRingBuffer<T> implements RingBuffer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f542a;
    public final ArrayDeque b;
    public final Object c = new Object();
    public final RingBuffer.OnRemoveCallback d;

    public ArrayRingBuffer(int i, t tVar) {
        this.f542a = i;
        this.b = new ArrayDeque(i);
        this.d = tVar;
    }

    public final Object a() {
        Object objRemoveLast;
        synchronized (this.c) {
            objRemoveLast = this.b.removeLast();
        }
        return objRemoveLast;
    }

    public final boolean b() {
        boolean zIsEmpty;
        synchronized (this.c) {
            zIsEmpty = this.b.isEmpty();
        }
        return zIsEmpty;
    }
}
