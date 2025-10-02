package org.commonmark.node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class SourceSpans {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f26857a;

    public final void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f26857a == null) {
            this.f26857a = new ArrayList();
        }
        if (this.f26857a.isEmpty()) {
            this.f26857a.addAll(list);
            return;
        }
        int size = this.f26857a.size() - 1;
        SourceSpan sourceSpan = (SourceSpan) this.f26857a.get(size);
        SourceSpan sourceSpan2 = (SourceSpan) list.get(0);
        int i = sourceSpan.c;
        int i2 = sourceSpan.d;
        if (i + i2 != sourceSpan2.c) {
            this.f26857a.addAll(list);
        } else {
            this.f26857a.set(size, new SourceSpan(sourceSpan.f26856a, sourceSpan.b, i, i2 + sourceSpan2.d));
            this.f26857a.addAll(list.subList(1, list.size()));
        }
    }

    public final void b(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(((Node) it.next()).e());
        }
    }
}
