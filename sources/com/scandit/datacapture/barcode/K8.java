package com.scandit.datacapture.barcode;

import android.graphics.Paint;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class K8 {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f17217a;
    private final Paint b;
    private final List c;

    public K8(Paint fill, Paint stroke, List shadows) {
        Intrinsics.h(fill, "fill");
        Intrinsics.h(stroke, "stroke");
        Intrinsics.h(shadows, "shadows");
        this.f17217a = fill;
        this.b = stroke;
        this.c = shadows;
    }

    public final Paint a() {
        return this.f17217a;
    }

    public final List b() {
        return this.c;
    }

    public final Paint c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K8)) {
            return false;
        }
        K8 k8 = (K8) obj;
        return Intrinsics.c(this.f17217a, k8.f17217a) && Intrinsics.c(this.b, k8.b) && Intrinsics.c(this.c, k8.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f17217a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Paints(fill=");
        sb.append(this.f17217a);
        sb.append(", stroke=");
        sb.append(this.b);
        sb.append(", shadows=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.c, ')');
    }
}
