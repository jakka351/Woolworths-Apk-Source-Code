package org.commonmark.internal;

import com.google.common.net.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.commonmark.internal.BlockQuoteParser;
import org.commonmark.internal.FencedCodeBlockParser;
import org.commonmark.internal.HeadingParser;
import org.commonmark.internal.HtmlBlockParser;
import org.commonmark.internal.IndentedCodeBlockParser;
import org.commonmark.internal.ListBlockParser;
import org.commonmark.internal.ThematicBreakParser;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.DefinitionMap;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.ListBlock;
import org.commonmark.node.SourceSpan;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.IncludeSourceSpans;
import org.commonmark.parser.InlineParserFactory;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.SourceLines;
import org.commonmark.parser.block.BlockParser;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

/* loaded from: classes8.dex */
public class DocumentParser implements ParserState {
    public static final LinkedHashSet u;
    public static final Map v;

    /* renamed from: a, reason: collision with root package name */
    public SourceLine f26824a;
    public boolean e;
    public boolean i;
    public final List j;
    public final InlineParserFactory k;
    public final List l;
    public final List m;
    public final List n;
    public final Set o;
    public final IncludeSourceSpans p;
    public final DocumentBlockParser q;
    public final ArrayList s;
    public final ArrayList t;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public final Definitions r = new Definitions();

    public static class MatchedBlockParserImpl implements MatchedBlockParser {

        /* renamed from: a, reason: collision with root package name */
        public final BlockParser f26825a;

        public MatchedBlockParserImpl(BlockParser blockParser) {
            this.f26825a = blockParser;
        }

        @Override // org.commonmark.parser.block.MatchedBlockParser
        public final SourceLines a() {
            BlockParser blockParser = this.f26825a;
            if (!(blockParser instanceof ParagraphParser)) {
                return new SourceLines();
            }
            ArrayList arrayList = ((ParagraphParser) blockParser).b.b;
            SourceLines sourceLines = new SourceLines();
            sourceLines.f26861a.addAll(arrayList);
            return sourceLines;
        }
    }

    public static class OpenBlockParser {

        /* renamed from: a, reason: collision with root package name */
        public final BlockParser f26826a;
        public int b;

        public OpenBlockParser(BlockParser blockParser, int i) {
            this.f26826a = blockParser;
            this.b = i;
        }
    }

    static {
        Object[] objArr = {BlockQuote.class, Heading.class, FencedCodeBlock.class, HtmlBlock.class, ThematicBreak.class, ListBlock.class, IndentedCodeBlock.class};
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        u = new LinkedHashSet(Collections.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(BlockQuote.class, new BlockQuoteParser.Factory());
        map.put(Heading.class, new HeadingParser.Factory());
        map.put(FencedCodeBlock.class, new FencedCodeBlockParser.Factory());
        map.put(HtmlBlock.class, new HtmlBlockParser.Factory());
        map.put(ThematicBreak.class, new ThematicBreakParser.Factory());
        map.put(ListBlock.class, new ListBlockParser.Factory());
        map.put(IndentedCodeBlock.class, new IndentedCodeBlockParser.Factory());
        v = Collections.unmodifiableMap(map);
    }

    public DocumentParser(ArrayList arrayList, a aVar, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, IncludeSourceSpans includeSourceSpans) {
        ArrayList arrayList5 = new ArrayList();
        this.s = arrayList5;
        this.t = new ArrayList();
        this.j = arrayList;
        this.k = aVar;
        this.l = arrayList2;
        this.m = arrayList3;
        this.n = arrayList4;
        this.o = hashSet;
        this.p = includeSourceSpans;
        DocumentBlockParser documentBlockParser = new DocumentBlockParser();
        this.q = documentBlockParser;
        arrayList5.add(new OpenBlockParser(documentBlockParser, 0));
    }

    public final void a(OpenBlockParser openBlockParser) {
        BlockParser blockParser = openBlockParser.f26826a;
        while (!g().f(blockParser.d())) {
            e(1);
        }
        g().d().c(blockParser.d());
        this.s.add(openBlockParser);
    }

    public final void b() {
        CharSequence charSequenceSubSequence;
        int i;
        SourceSpan sourceSpan;
        int i2;
        if (this.e) {
            int i3 = this.c + 1;
            CharSequence charSequence = this.f26824a.f26860a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i3, charSequence.length());
            int i4 = 4 - (this.d % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i4);
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            int i6 = this.c;
            if (i6 == 0) {
                charSequenceSubSequence = this.f26824a.f26860a;
            } else {
                CharSequence charSequence2 = this.f26824a.f26860a;
                charSequenceSubSequence = charSequence2.subSequence(i6, charSequence2.length());
            }
        }
        g().e(new SourceLine(charSequenceSubSequence, (this.p != IncludeSourceSpans.e || (i = this.c) >= (i2 = (sourceSpan = this.f26824a.b).d)) ? null : sourceSpan.a(i, i2)));
        c();
    }

    public final void c() {
        if (this.p == IncludeSourceSpans.d) {
            return;
        }
        int i = 1;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                return;
            }
            OpenBlockParser openBlockParser = (OpenBlockParser) arrayList.get(i);
            int iMin = Math.min(openBlockParser.b, this.c);
            if (this.f26824a.f26860a.length() - iMin != 0) {
                BlockParser blockParser = openBlockParser.f26826a;
                SourceSpan sourceSpan = this.f26824a.b;
                blockParser.h(sourceSpan.a(iMin, sourceSpan.d));
            }
            i++;
        }
    }

    public final void d() {
        char cCharAt = this.f26824a.f26860a.charAt(this.c);
        this.c++;
        if (cCharAt != '\t') {
            this.d++;
        } else {
            int i = this.d;
            this.d = (4 - (i % 4)) + i;
        }
    }

    public final void e(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            BlockParser blockParser = ((OpenBlockParser) this.s.remove(r1.size() - 1)).f26826a;
            for (DefinitionMap definitionMap : blockParser.j()) {
                Definitions definitions = this.r;
                definitions.getClass();
                HashMap map = definitions.f26821a;
                DefinitionMap definitionMap2 = (DefinitionMap) map.get(definitionMap.f26854a);
                if (definitionMap2 == null) {
                    map.put(definitionMap.f26854a, definitionMap);
                } else {
                    for (Map.Entry entry : definitionMap.b.entrySet()) {
                        definitionMap2.b.putIfAbsent((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            blockParser.i();
            this.t.add(blockParser);
        }
    }

    public final void f() {
        int i = this.c;
        int i2 = this.d;
        this.i = true;
        int length = this.f26824a.f26860a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = this.f26824a.f26860a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.i = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f = i;
        this.g = i2;
        this.h = i2 - this.d;
    }

    public final BlockParser g() {
        return ((OpenBlockParser) YU.a.c(1, this.s)).f26826a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c7, code lost:
    
        if (r17.i != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c9, code lost:
    
        a(new org.commonmark.internal.DocumentParser.OpenBlockParser(new org.commonmark.internal.ParagraphParser(), r8));
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01da, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        r1 = r6.size() - r4;
        r4 = ((org.commonmark.internal.DocumentParser.OpenBlockParser) r6.get(r4 - 1)).f26826a;
        r8 = r17.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if ((r4.d() instanceof org.commonmark.node.Paragraph) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r4.b() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r9 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r8 = r17.c;
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (r17.i != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (r17.h >= 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        if (java.lang.Character.isLetter(java.lang.Character.codePointAt(r17.f26824a.f26860a, r17.f)) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        r11 = new org.commonmark.internal.DocumentParser.MatchedBlockParserImpl(r4);
        r12 = r17.j.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        if (r12.hasNext() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        r13 = ((org.commonmark.parser.block.BlockParserFactory) r12.next()).a(r17, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        if (r13 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e6, code lost:
    
        if (r13 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
    
        j(r17.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        r10 = r17.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f1, code lost:
    
        if (r1 <= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f3, code lost:
    
        e(r1);
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f7, code lost:
    
        r11 = r13.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
    
        if (r11 == r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fb, code lost:
    
        j(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
    
        r11 = r13.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
    
        if (r11 == r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
    
        i(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0108, code lost:
    
        if (r13.d >= 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
    
        r11 = g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0111, code lost:
    
        if ((r11 instanceof org.commonmark.internal.ParagraphParser) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0113, code lost:
    
        r12 = r13.d;
        r11 = ((org.commonmark.internal.ParagraphParser) r11).b;
        r11.getClass();
        r15 = r11.d;
        r2 = java.util.Collections.unmodifiableList(new java.util.ArrayList(r15.subList(java.lang.Math.max(r15.size() - r12, r2), r15.size())));
        r5 = r11.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013f, code lost:
    
        if (r12 < r5.size()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0141, code lost:
    
        r5.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0145, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0146, code lost:
    
        if (r11 >= r12) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0148, code lost:
    
        r5.remove(r5.size() - 1);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0157, code lost:
    
        if (r12 < r15.size()) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0159, code lost:
    
        r15.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015d, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015e, code lost:
    
        if (r5 >= r12) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0160, code lost:
    
        r15.remove(r15.size() - 1);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016b, code lost:
    
        e(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016f, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0170, code lost:
    
        r5 = r13.f26819a;
        r11 = r5.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0174, code lost:
    
        if (r12 >= r11) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0176, code lost:
    
        r4 = r5[r12];
        a(new org.commonmark.internal.DocumentParser.OpenBlockParser(r4, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0180, code lost:
    
        if (r2 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
    
        r4.d().h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0189, code lost:
    
        r9 = r4.b();
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0190, code lost:
    
        r10 = true;
        r2 = 0;
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0195, code lost:
    
        j(r17.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019a, code lost:
    
        if (r10 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019e, code lost:
    
        if (r17.i != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a8, code lost:
    
        if (g().c() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01aa, code lost:
    
        ((org.commonmark.internal.DocumentParser.OpenBlockParser) YU.a.c(1, r6)).b = r8;
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b6, code lost:
    
        if (r1 <= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b8, code lost:
    
        e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bf, code lost:
    
        if (r4.b() != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c1, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.DocumentParser.h(int, java.lang.String):void");
    }

    public final void i(int i) {
        int i2;
        int i3 = this.g;
        if (i >= i3) {
            this.c = this.f;
            this.d = i3;
        }
        int length = this.f26824a.f26860a.length();
        while (true) {
            i2 = this.d;
            if (i2 >= i || this.c == length) {
                break;
            } else {
                d();
            }
        }
        if (i2 <= i) {
            this.e = false;
            return;
        }
        this.c--;
        this.d = i;
        this.e = true;
    }

    public final void j(int i) {
        int i2 = this.f;
        if (i >= i2) {
            this.c = i2;
            this.d = this.g;
        }
        int length = this.f26824a.f26860a.length();
        while (true) {
            int i3 = this.c;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                d();
            }
        }
        this.e = false;
    }
}
