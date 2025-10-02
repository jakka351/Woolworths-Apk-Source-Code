package me.oriient.ui.contentview;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.models.Content;
import me.oriient.ui.contentview.models.PixelCoordinate;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f26615a;
    private final Content b;
    private final PixelCoordinate c;
    private final PixelCoordinate d;

    public e(int i, Content content, PixelCoordinate position, PixelCoordinate originalPosition) {
        Intrinsics.h(content, "content");
        Intrinsics.h(position, "position");
        Intrinsics.h(originalPosition, "originalPosition");
        this.f26615a = i;
        this.b = content;
        this.c = position;
        this.d = originalPosition;
    }

    public final Content a() {
        return this.b;
    }

    public final int b() {
        return this.f26615a;
    }

    public final PixelCoordinate c() {
        return this.d;
    }

    public final PixelCoordinate d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f26615a == eVar.f26615a && Intrinsics.c(this.b, eVar.b) && Intrinsics.c(this.c, eVar.c) && Intrinsics.c(this.d, eVar.d);
    }

    public int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f26615a) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "DraggedContent(layer=" + this.f26615a + ", content=" + this.b + ", position=" + this.c + ", originalPosition=" + this.d + ')';
    }
}
