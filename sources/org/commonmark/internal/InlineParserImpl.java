package org.commonmark.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.commonmark.internal.inline.AsteriskDelimiterProcessor;
import org.commonmark.internal.inline.AutolinkInlineParser;
import org.commonmark.internal.inline.BackslashInlineParser;
import org.commonmark.internal.inline.BackticksInlineParser;
import org.commonmark.internal.inline.CoreLinkProcessor;
import org.commonmark.internal.inline.EntityInlineParser;
import org.commonmark.internal.inline.HtmlInlineParser;
import org.commonmark.internal.inline.LinkResultImpl;
import org.commonmark.internal.inline.UnderscoreDelimiterProcessor;
import org.commonmark.node.Node;
import org.commonmark.node.SourceSpans;
import org.commonmark.node.Text;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLines;
import org.commonmark.parser.beta.InlineContentParserFactory;
import org.commonmark.parser.beta.InlineParserState;
import org.commonmark.parser.beta.LinkInfo;
import org.commonmark.parser.beta.Position;
import org.commonmark.parser.beta.Scanner;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import org.commonmark.text.Characters;

/* loaded from: classes8.dex */
public class InlineParserImpl implements InlineParser, InlineParserState {

    /* renamed from: a, reason: collision with root package name */
    public final InlineParserContextImpl f26832a;
    public final ArrayList b;
    public final HashMap c;
    public final ArrayList d;
    public final BitSet e;
    public final BitSet f;
    public HashMap g;
    public Scanner h;
    public boolean i;
    public int j;
    public Delimiter k;
    public Bracket l;

    /* renamed from: org.commonmark.internal.InlineParserImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26833a;

        static {
            int[] iArr = new int[LinkResultImpl.Type.values().length];
            f26833a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26833a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class DelimiterData {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f26834a;
        public final boolean b;
        public final boolean c;

        public DelimiterData(ArrayList arrayList, boolean z, boolean z2) {
            this.f26834a = arrayList;
            this.c = z;
            this.b = z2;
        }
    }

    public static class DestinationTitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f26835a;
        public final String b;

        public DestinationTitle(String str, String str2) {
            this.f26835a = str;
            this.b = str2;
        }
    }

    public static class LinkInfoImpl implements LinkInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Text f26836a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public LinkInfoImpl(Text text, String str, String str2, String str3, String str4) {
            this.f26836a = text;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // org.commonmark.parser.beta.LinkInfo
        public final String a() {
            return this.e;
        }

        @Override // org.commonmark.parser.beta.LinkInfo
        public final String b() {
            return this.c;
        }

        @Override // org.commonmark.parser.beta.LinkInfo
        public final String c() {
            return this.d;
        }

        @Override // org.commonmark.parser.beta.LinkInfo
        public final Text d() {
            return this.f26836a;
        }

        @Override // org.commonmark.parser.beta.LinkInfo
        public final String e() {
            return this.b;
        }
    }

    public InlineParserImpl(InlineParserContextImpl inlineParserContextImpl) {
        this.f26832a = inlineParserContextImpl;
        ArrayList arrayList = new ArrayList(inlineParserContextImpl.f26831a);
        arrayList.add(new BackslashInlineParser.Factory());
        arrayList.add(new BackticksInlineParser.Factory());
        arrayList.add(new EntityInlineParser.Factory());
        arrayList.add(new AutolinkInlineParser.Factory());
        arrayList.add(new HtmlInlineParser.Factory());
        this.b = arrayList;
        List list = inlineParserContextImpl.b;
        HashMap map = new HashMap();
        Object[] objArr = {new AsteriskDelimiterProcessor('*'), new UnderscoreDelimiterProcessor('_')};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        c(Collections.unmodifiableList(arrayList2), map);
        c(list, map);
        this.c = map;
        ArrayList arrayList3 = new ArrayList(inlineParserContextImpl.c);
        arrayList3.add(new CoreLinkProcessor());
        this.d = arrayList3;
        Set set = inlineParserContextImpl.d;
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f = bitSet;
        Set setKeySet = this.c.keySet();
        ArrayList arrayList4 = this.b;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InlineContentParserFactory) it3.next()).a().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.e = bitSet2;
    }

    public static void b(char c, DelimiterProcessor delimiterProcessor, HashMap map) {
        if (((DelimiterProcessor) map.put(Character.valueOf(c), delimiterProcessor)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void c(List list, HashMap map) {
        StaggeredDelimiterProcessor staggeredDelimiterProcessor;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) it.next();
            char c = delimiterProcessor.c();
            char cA = delimiterProcessor.a();
            if (c == cA) {
                DelimiterProcessor delimiterProcessor2 = (DelimiterProcessor) map.get(Character.valueOf(c));
                if (delimiterProcessor2 == null || delimiterProcessor2.c() != delimiterProcessor2.a()) {
                    b(c, delimiterProcessor, map);
                } else {
                    if (delimiterProcessor2 instanceof StaggeredDelimiterProcessor) {
                        staggeredDelimiterProcessor = (StaggeredDelimiterProcessor) delimiterProcessor2;
                    } else {
                        StaggeredDelimiterProcessor staggeredDelimiterProcessor2 = new StaggeredDelimiterProcessor(c);
                        staggeredDelimiterProcessor2.e(delimiterProcessor2);
                        staggeredDelimiterProcessor = staggeredDelimiterProcessor2;
                    }
                    staggeredDelimiterProcessor.e(delimiterProcessor);
                    map.put(Character.valueOf(c), staggeredDelimiterProcessor);
                }
            } else {
                b(c, delimiterProcessor, map);
                b(cA, delimiterProcessor, map);
            }
        }
    }

    public static Text i(SourceLines sourceLines) {
        Text text = new Text(sourceLines.a());
        text.h(sourceLines.b());
        return text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r7v50, types: [org.commonmark.internal.InlineParserImpl$DelimiterData] */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v67 */
    @Override // org.commonmark.parser.InlineParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(org.commonmark.parser.SourceLines r25, org.commonmark.node.Node r26) {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.InlineParserImpl.a(org.commonmark.parser.SourceLines, org.commonmark.node.Node):void");
    }

    public final void d(Node node) {
        Node node2 = node.b;
        if (node2 == null) {
            return;
        }
        Node node3 = node.c;
        Text text = null;
        Text text2 = null;
        int length = 0;
        while (node2 != null) {
            if (node2 instanceof Text) {
                text2 = node2;
                if (text == null) {
                    text = text2;
                }
                length = text2.g.length() + length;
            } else {
                e(text, text2, length);
                d(node2);
                text = null;
                text2 = null;
                length = 0;
            }
            if (node2 == node3) {
                break;
            } else {
                node2 = node2.e;
            }
        }
        e(text, text2, length);
    }

    public final void e(Text text, Text text2, int i) {
        SourceSpans sourceSpans;
        if (text == null || text2 == null || text == text2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(text.g);
        if (this.i) {
            sourceSpans = new SourceSpans();
            sourceSpans.a(text.e());
        } else {
            sourceSpans = null;
        }
        Node node = text.e;
        Node node2 = text2.e;
        while (node != node2) {
            sb.append(((Text) node).g);
            if (sourceSpans != null) {
                sourceSpans.a(node.e());
            }
            Node node3 = node.e;
            node.j();
            node = node3;
        }
        text.g = sb.toString();
        if (sourceSpans != null) {
            List list = sourceSpans.f26857a;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            text.h(list);
        }
    }

    public final Text f() {
        char cJ;
        Position positionK = this.h.k();
        this.h.g();
        while (true) {
            cJ = this.h.j();
            if (cJ == 0 || this.e.get(cJ)) {
                break;
            }
            this.h.g();
        }
        Scanner scanner = this.h;
        SourceLines sourceLinesC = scanner.c(positionK, scanner.k());
        String strA = sourceLinesC.a();
        if (cJ == '\n') {
            int length = strA.length() - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                }
                if (strA.charAt(length) != ' ') {
                    break;
                }
                length--;
            }
            int i = length + 1;
            this.j = strA.length() - i;
            strA = strA.substring(0, i);
        } else if (cJ == 0) {
            strA = strA.substring(0, Characters.e(strA, strA.length() - 1, 0) + 1);
        }
        Text text = new Text(strA);
        text.h(sourceLinesC.b());
        return text;
    }

    public final void g(Delimiter delimiter) {
        boolean z;
        HashMap map = new HashMap();
        Delimiter delimiter2 = this.k;
        while (delimiter2 != null) {
            Delimiter delimiter3 = delimiter2.f;
            if (delimiter3 == delimiter) {
                break;
            } else {
                delimiter2 = delimiter3;
            }
        }
        while (delimiter2 != null) {
            ArrayList arrayList = delimiter2.f26822a;
            char c = delimiter2.b;
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) this.c.get(Character.valueOf(c));
            if (!delimiter2.e || delimiterProcessor == null) {
                delimiter2 = delimiter2.g;
            } else {
                char c2 = delimiterProcessor.c();
                Delimiter delimiter4 = delimiter2.f;
                int iD = 0;
                boolean z2 = false;
                while (delimiter4 != null && delimiter4 != delimiter && delimiter4 != map.get(Character.valueOf(c))) {
                    if (delimiter4.d && delimiter4.b == c2) {
                        iD = delimiterProcessor.d(delimiter4, delimiter2);
                        if (iD > 0) {
                            z = true;
                            z2 = true;
                            break;
                        }
                        z2 = true;
                    }
                    delimiter4 = delimiter4.f;
                }
                z = false;
                if (z) {
                    for (int i = 0; i < iD; i++) {
                        ArrayList arrayList2 = delimiter4.f26822a;
                        ((Text) arrayList2.remove(arrayList2.size() - 1)).j();
                    }
                    for (int i2 = 0; i2 < iD; i2++) {
                        ((Text) arrayList.remove(0)).j();
                    }
                    Delimiter delimiter5 = delimiter2.f;
                    while (delimiter5 != null && delimiter5 != delimiter4) {
                        Delimiter delimiter6 = delimiter5.f;
                        h(delimiter5);
                        delimiter5 = delimiter6;
                    }
                    if (delimiter4.f26822a.size() == 0) {
                        h(delimiter4);
                    }
                    if (arrayList.size() == 0) {
                        Delimiter delimiter7 = delimiter2.g;
                        h(delimiter2);
                        delimiter2 = delimiter7;
                    }
                } else {
                    if (!z2) {
                        map.put(Character.valueOf(c), delimiter2.f);
                        if (!delimiter2.d) {
                            h(delimiter2);
                        }
                    }
                    delimiter2 = delimiter2.g;
                }
            }
        }
        while (true) {
            Delimiter delimiter8 = this.k;
            if (delimiter8 == null || delimiter8 == delimiter) {
                return;
            } else {
                h(delimiter8);
            }
        }
    }

    public final void h(Delimiter delimiter) {
        Delimiter delimiter2 = delimiter.f;
        if (delimiter2 != null) {
            delimiter2.g = delimiter.g;
        }
        Delimiter delimiter3 = delimiter.g;
        if (delimiter3 == null) {
            this.k = delimiter2;
        } else {
            delimiter3.f = delimiter2;
        }
    }
}
