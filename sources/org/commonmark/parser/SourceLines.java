package org.commonmark.parser;

import java.util.ArrayList;
import java.util.Iterator;
import org.commonmark.node.SourceSpan;

/* loaded from: classes8.dex */
public class SourceLines {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26861a = new ArrayList();

    public final String a() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f26861a;
            if (i >= arrayList.size()) {
                return sb.toString();
            }
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(((SourceLine) arrayList.get(i)).f26860a);
            i++;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f26861a.iterator();
        while (it.hasNext()) {
            SourceSpan sourceSpan = ((SourceLine) it.next()).b;
            if (sourceSpan != null) {
                arrayList.add(sourceSpan);
            }
        }
        return arrayList;
    }
}
