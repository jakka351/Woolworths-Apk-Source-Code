package org.commonmark.internal;

import YU.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.commonmark.parser.delimiter.DelimiterProcessor;

/* loaded from: classes8.dex */
class StaggeredDelimiterProcessor implements DelimiterProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final char f26843a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public StaggeredDelimiterProcessor(char c) {
        this.f26843a = c;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final char a() {
        return this.f26843a;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final int b() {
        return this.b;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final char c() {
        return this.f26843a;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final int d(Delimiter delimiter, Delimiter delimiter2) {
        DelimiterProcessor delimiterProcessor;
        int size = delimiter.f26822a.size();
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                delimiterProcessor = (DelimiterProcessor) linkedList.getFirst();
                break;
            }
            delimiterProcessor = (DelimiterProcessor) it.next();
            if (delimiterProcessor.b() <= size) {
                break;
            }
        }
        return delimiterProcessor.d(delimiter, delimiter2);
    }

    public final void e(DelimiterProcessor delimiterProcessor) {
        int iB = delimiterProcessor.b();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            DelimiterProcessor delimiterProcessor2 = (DelimiterProcessor) listIterator.next();
            int iB2 = delimiterProcessor2.b();
            if (iB > iB2) {
                listIterator.previous();
                listIterator.add(delimiterProcessor);
                return;
            } else if (iB == iB2) {
                String strValueOf = String.valueOf(delimiterProcessor2);
                String strValueOf2 = String.valueOf(delimiterProcessor);
                StringBuilder sb = new StringBuilder("Cannot add two delimiter processors for char '");
                sb.append(this.f26843a);
                sb.append("' and minimum length ");
                sb.append(iB);
                sb.append("; conflicting processors: ");
                throw new IllegalArgumentException(a.p(sb, strValueOf, ", ", strValueOf2));
            }
        }
        linkedList.add(delimiterProcessor);
        this.b = iB;
    }
}
