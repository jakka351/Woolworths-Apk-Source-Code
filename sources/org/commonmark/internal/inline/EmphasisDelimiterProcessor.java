package org.commonmark.internal.inline;

import java.util.Collections;
import java.util.List;
import org.commonmark.internal.Delimiter;
import org.commonmark.node.Emphasis;
import org.commonmark.node.Node;
import org.commonmark.node.Nodes;
import org.commonmark.node.SourceSpans;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;

/* loaded from: classes8.dex */
public abstract class EmphasisDelimiterProcessor implements DelimiterProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final char f26847a;

    public EmphasisDelimiterProcessor(char c) {
        this.f26847a = c;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final char a() {
        return this.f26847a;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final int b() {
        return 1;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final char c() {
        return this.f26847a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final int d(Delimiter delimiter, Delimiter delimiter2) {
        Emphasis emphasis;
        if (delimiter.e || delimiter2.d) {
            int i = delimiter2.c;
            if (i % 3 != 0 && (i + delimiter.c) % 3 == 0) {
                return 0;
            }
        }
        int size = delimiter.f26822a.size();
        char c = this.f26847a;
        int i2 = 2;
        if (size < 2 || delimiter2.f26822a.size() < 2) {
            String strValueOf = String.valueOf(c);
            Emphasis emphasis2 = new Emphasis();
            emphasis2.g = strValueOf;
            i2 = 1;
            emphasis = emphasis2;
        } else {
            String str = String.valueOf(c) + c;
            StrongEmphasis strongEmphasis = new StrongEmphasis();
            strongEmphasis.g = str;
            emphasis = strongEmphasis;
        }
        SourceSpans sourceSpans = new SourceSpans();
        sourceSpans.b(delimiter.d(i2));
        Text textC = delimiter.c();
        for (Node node : Nodes.a(textC, delimiter2.a())) {
            emphasis.c(node);
            sourceSpans.a(node.e());
        }
        sourceSpans.b(delimiter2.b(i2));
        List list = sourceSpans.f26857a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        emphasis.h(list);
        textC.f(emphasis);
        return i2;
    }
}
