package org.commonmark.parser;

import com.google.common.net.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import org.commonmark.Extension;
import org.commonmark.internal.Definitions;
import org.commonmark.internal.DocumentParser;
import org.commonmark.internal.InlineParserContextImpl;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.node.Node;
import org.commonmark.parser.block.BlockParser;
import org.commonmark.parser.block.BlockParserFactory;

/* loaded from: classes8.dex */
public class Parser {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26858a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final HashSet e;
    public final a f;
    public final ArrayList g;
    public final IncludeSourceSpans h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f26859a = new ArrayList();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public final ArrayList e = new ArrayList();
        public final HashSet f = new HashSet();
        public final LinkedHashSet g = DocumentParser.u;
        public final IncludeSourceSpans h = IncludeSourceSpans.d;

        public final void a(Collection collection) {
            Objects.requireNonNull(collection, "extensions must not be null");
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Extension extension = (Extension) it.next();
                if (extension instanceof ParserExtension) {
                    ((ParserExtension) extension).a(this);
                }
            }
        }
    }

    public interface ParserExtension extends Extension {
        void a(Builder builder);
    }

    public Parser(Builder builder) {
        ArrayList arrayList = builder.f26859a;
        LinkedHashSet linkedHashSet = builder.g;
        LinkedHashSet linkedHashSet2 = DocumentParser.u;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((BlockParserFactory) DocumentParser.v.get((Class) it.next()));
        }
        this.f26858a = arrayList2;
        a aVar = new a(25);
        this.f = aVar;
        this.g = builder.e;
        ArrayList arrayList3 = builder.b;
        this.b = arrayList3;
        ArrayList arrayList4 = builder.c;
        this.c = arrayList4;
        ArrayList arrayList5 = builder.d;
        this.d = arrayList5;
        HashSet hashSet = builder.f;
        this.e = hashSet;
        this.h = builder.h;
        aVar.b(new InlineParserContextImpl(arrayList3, arrayList4, arrayList5, hashSet, new Definitions()));
    }

    public final Node a(String str) {
        Objects.requireNonNull(str, "input must not be null");
        DocumentParser documentParser = new DocumentParser(this.f26858a, this.f, this.b, this.c, this.d, this.e, this.h);
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            documentParser.h(i, str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (!str.isEmpty() && (i == 0 || i < str.length())) {
            documentParser.h(i, str.substring(i));
        }
        documentParser.e(documentParser.s.size());
        InlineParserImpl inlineParserImplB = documentParser.k.b(new InlineParserContextImpl(documentParser.l, documentParser.m, documentParser.n, documentParser.o, documentParser.r));
        Iterator it = documentParser.t.iterator();
        while (it.hasNext()) {
            ((BlockParser) it.next()).a(inlineParserImplB);
        }
        Node nodeA = documentParser.q.f26823a;
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            nodeA = ((PostProcessor) it2.next()).a(nodeA);
        }
        return nodeA;
    }
}
