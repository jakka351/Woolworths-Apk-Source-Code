package org.nibor.autolink.internal;

import YU.a;
import androidx.camera.core.impl.b;
import org.nibor.autolink.LinkSpan;
import org.nibor.autolink.LinkType;

/* loaded from: classes8.dex */
public class LinkSpanImpl implements LinkSpan {

    /* renamed from: a, reason: collision with root package name */
    public final LinkType f26871a;
    public final int b;
    public final int c;

    public LinkSpanImpl(LinkType linkType, int i, int i2) {
        this.f26871a = linkType;
        this.b = i;
        this.c = i2;
    }

    @Override // org.nibor.autolink.Span
    public final int getBeginIndex() {
        return this.b;
    }

    @Override // org.nibor.autolink.Span
    public final int getEndIndex() {
        return this.c;
    }

    @Override // org.nibor.autolink.LinkSpan
    public final LinkType getType() {
        return this.f26871a;
    }

    public final String toString() {
        return a.m(b.u("Link{type=", this.b, String.valueOf(this.f26871a), ", beginIndex=", ", endIndex="), this.c, "}");
    }
}
