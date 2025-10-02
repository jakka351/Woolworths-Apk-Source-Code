package org.commonmark.ext.gfm.strikethrough.internal;

import YU.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.internal.Delimiter;
import org.commonmark.node.Node;
import org.commonmark.node.Nodes;
import org.commonmark.node.SourceSpans;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;

/* loaded from: classes8.dex */
public class StrikethroughDelimiterProcessor implements DelimiterProcessor {
    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final char a() {
        return '~';
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final int b() {
        return 1;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final char c() {
        return '~';
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final int d(Delimiter delimiter, Delimiter delimiter2) {
        String strG;
        ArrayList arrayList = delimiter.f26822a;
        int size = arrayList.size();
        ArrayList arrayList2 = delimiter2.f26822a;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        Text textC = delimiter.c();
        if (arrayList.size() == 1) {
            strG = textC.g;
        } else {
            String str = textC.g;
            strG = a.g(str, str);
        }
        Strikethrough strikethrough = new Strikethrough();
        strikethrough.g = strG;
        SourceSpans sourceSpans = new SourceSpans();
        sourceSpans.b(delimiter.d(arrayList.size()));
        for (Node node : Nodes.a(textC, delimiter2.a())) {
            strikethrough.c(node);
            sourceSpans.a(node.e());
        }
        sourceSpans.b(delimiter2.b(arrayList2.size()));
        List list = sourceSpans.f26857a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        strikethrough.h(list);
        textC.f(strikethrough);
        return arrayList.size();
    }
}
