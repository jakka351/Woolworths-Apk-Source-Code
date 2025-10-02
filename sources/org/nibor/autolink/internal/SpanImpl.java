package org.nibor.autolink.internal;

import androidx.camera.core.impl.b;
import org.nibor.autolink.Span;

/* loaded from: classes8.dex */
public class SpanImpl implements Span {

    /* renamed from: a, reason: collision with root package name */
    public final int f26872a;
    public final int b;

    public SpanImpl(int i, int i2) {
        this.f26872a = i;
        this.b = i2;
    }

    @Override // org.nibor.autolink.Span
    public final int getBeginIndex() {
        return this.f26872a;
    }

    @Override // org.nibor.autolink.Span
    public final int getEndIndex() {
        return this.b;
    }

    public final String toString() {
        return b.j(this.f26872a, this.b, "Span{beginIndex=", ", endIndex=", "}");
    }
}
