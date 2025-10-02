package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.source.BufferStack;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0974c2 implements BufferStack {

    /* renamed from: a, reason: collision with root package name */
    private final int f18423a;
    private final Stack b;

    public /* synthetic */ C0974c2() {
        this(0);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.BufferStack
    public final void a(byte[] byteArray) {
        Intrinsics.h(byteArray, "byteArray");
        if (this.b.size() < 3) {
            this.b.push(byteArray);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.BufferStack
    public final boolean isEmpty() {
        return this.b.size() == 0;
    }

    public C0974c2(int i) {
        this.f18423a = i;
        this.b = new Stack();
        a();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.BufferStack
    public final byte[] a(int i) {
        byte[] bArr = (byte[]) this.b.pop();
        return bArr.length != i ? new byte[i] : bArr;
    }

    public final void a() {
        this.b.clear();
        for (int i = 0; i < 3; i++) {
            a(new byte[this.f18423a]);
        }
    }
}
