package com.google.zxing.oned.rss.expanded;

import android.support.v4.media.session.a;
import java.util.ArrayList;

/* loaded from: classes6.dex */
final class ExpandedRow {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16189a;
    public final int b;

    public ExpandedRow(int i, ArrayList arrayList) {
        this.f16189a = new ArrayList(arrayList);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExpandedRow) && this.f16189a.equals(((ExpandedRow) obj).f16189a);
    }

    public final int hashCode() {
        return this.f16189a.hashCode() ^ Boolean.FALSE.hashCode();
    }

    public final String toString() {
        return a.q(" }", new StringBuilder("{ "), this.f16189a);
    }
}
