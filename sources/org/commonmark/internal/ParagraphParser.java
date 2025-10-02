package org.commonmark.internal;

import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.commonmark.internal.LinkReferenceDefinitionParser;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.node.Block;
import org.commonmark.node.DefinitionMap;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;
import org.commonmark.node.Paragraph;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.SourceLines;
import org.commonmark.parser.beta.Position;
import org.commonmark.parser.beta.Scanner;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.BlockContinue;

/* loaded from: classes8.dex */
public class ParagraphParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final Paragraph f26842a = new Paragraph();
    public final LinkReferenceDefinitionParser b = new LinkReferenceDefinitionParser();

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void a(InlineParser inlineParser) {
        ArrayList arrayList = this.b.b;
        SourceLines sourceLines = new SourceLines();
        ArrayList arrayList2 = sourceLines.f26861a;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        inlineParser.a(sourceLines, this.f26842a);
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26842a;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void e(SourceLine sourceLine) {
        LinkReferenceDefinitionParser linkReferenceDefinitionParser = this.b;
        ArrayList arrayList = linkReferenceDefinitionParser.b;
        arrayList.add(sourceLine);
        LinkReferenceDefinitionParser.State state = linkReferenceDefinitionParser.f26837a;
        LinkReferenceDefinitionParser.State state2 = LinkReferenceDefinitionParser.State.i;
        if (state == state2) {
            return;
        }
        ArrayList arrayList2 = new SourceLines().f26861a;
        arrayList2.add(sourceLine);
        Scanner scanner = new Scanner(arrayList2);
        while (scanner.d()) {
            int iOrdinal = linkReferenceDefinitionParser.f26837a.ordinal();
            if (iOrdinal == 0) {
                linkReferenceDefinitionParser.a();
                scanner.m();
                if (!scanner.h('[')) {
                    linkReferenceDefinitionParser.f26837a = state2;
                    linkReferenceDefinitionParser.a();
                    return;
                } else {
                    linkReferenceDefinitionParser.f26837a = LinkReferenceDefinitionParser.State.e;
                    linkReferenceDefinitionParser.e = new StringBuilder();
                    if (!scanner.d()) {
                        linkReferenceDefinitionParser.e.append('\n');
                    }
                }
            } else {
                if (iOrdinal == 1) {
                    Position positionK = scanner.k();
                    if (LinkScanner.b(scanner)) {
                        linkReferenceDefinitionParser.e.append(scanner.c(positionK, scanner.k()).a());
                        if (!scanner.d()) {
                            linkReferenceDefinitionParser.e.append('\n');
                        } else if (scanner.h(']') && scanner.h(':') && linkReferenceDefinitionParser.e.length() <= 999 && !Escaping.a(linkReferenceDefinitionParser.e.toString()).isEmpty()) {
                            linkReferenceDefinitionParser.f26837a = LinkReferenceDefinitionParser.State.f;
                            scanner.m();
                        }
                    }
                    linkReferenceDefinitionParser.f26837a = state2;
                    linkReferenceDefinitionParser.a();
                    return;
                }
                if (iOrdinal == 2) {
                    scanner.m();
                    Position positionK2 = scanner.k();
                    if (LinkScanner.a(scanner)) {
                        String strA = scanner.c(positionK2, scanner.k()).a();
                        if (strA.startsWith("<")) {
                            strA = a.h(1, 1, strA);
                        }
                        linkReferenceDefinitionParser.f = strA;
                        int iM = scanner.m();
                        if (!scanner.d()) {
                            linkReferenceDefinitionParser.i = true;
                            arrayList.clear();
                        } else if (iM == 0) {
                        }
                        linkReferenceDefinitionParser.f26837a = LinkReferenceDefinitionParser.State.g;
                    }
                    linkReferenceDefinitionParser.f26837a = state2;
                    linkReferenceDefinitionParser.a();
                    return;
                }
                LinkReferenceDefinitionParser.State state3 = LinkReferenceDefinitionParser.State.d;
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("Unknown parsing state: ".concat(String.valueOf(linkReferenceDefinitionParser.f26837a)));
                    }
                    Position positionK3 = scanner.k();
                    if (LinkScanner.c(scanner, linkReferenceDefinitionParser.g)) {
                        linkReferenceDefinitionParser.h.append(scanner.c(positionK3, scanner.k()).a());
                        if (scanner.d()) {
                            scanner.g();
                            scanner.m();
                            if (scanner.d()) {
                                linkReferenceDefinitionParser.h = null;
                            } else {
                                linkReferenceDefinitionParser.i = true;
                                arrayList.clear();
                                linkReferenceDefinitionParser.f26837a = state3;
                            }
                        } else {
                            linkReferenceDefinitionParser.h.append('\n');
                        }
                    } else {
                        linkReferenceDefinitionParser.h = null;
                    }
                    linkReferenceDefinitionParser.f26837a = state2;
                    linkReferenceDefinitionParser.a();
                    return;
                }
                scanner.m();
                if (scanner.d()) {
                    linkReferenceDefinitionParser.g = (char) 0;
                    char cJ = scanner.j();
                    if (cJ == '\"' || cJ == '\'') {
                        linkReferenceDefinitionParser.g = cJ;
                    } else if (cJ == '(') {
                        linkReferenceDefinitionParser.g = ')';
                    }
                    if (linkReferenceDefinitionParser.g != 0) {
                        linkReferenceDefinitionParser.f26837a = LinkReferenceDefinitionParser.State.h;
                        linkReferenceDefinitionParser.h = new StringBuilder();
                        scanner.g();
                        if (!scanner.d()) {
                            linkReferenceDefinitionParser.h.append('\n');
                        }
                    } else {
                        linkReferenceDefinitionParser.f26837a = state3;
                    }
                } else {
                    linkReferenceDefinitionParser.f26837a = state3;
                }
            }
        }
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        if (documentParser.i) {
            return null;
        }
        return BlockContinue.a(documentParser.c);
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void h(SourceSpan sourceSpan) {
        this.b.d.add(sourceSpan);
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void i() {
        Paragraph paragraph;
        LinkReferenceDefinitionParser linkReferenceDefinitionParser = this.b;
        linkReferenceDefinitionParser.a();
        Iterator it = linkReferenceDefinitionParser.c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            paragraph = this.f26842a;
            if (!zHasNext) {
                break;
            }
            LinkReferenceDefinition linkReferenceDefinition = (LinkReferenceDefinition) it.next();
            linkReferenceDefinition.j();
            Node node = paragraph.d;
            linkReferenceDefinition.d = node;
            if (node != null) {
                node.e = linkReferenceDefinition;
            }
            linkReferenceDefinition.e = paragraph;
            paragraph.d = linkReferenceDefinition;
            Node node2 = paragraph.f26855a;
            linkReferenceDefinition.f26855a = node2;
            if (linkReferenceDefinition.d == null) {
                node2.b = linkReferenceDefinition;
            }
        }
        ArrayList arrayList = linkReferenceDefinitionParser.b;
        ArrayList arrayList2 = new SourceLines().f26861a;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            paragraph.j();
        } else {
            paragraph.h(linkReferenceDefinitionParser.d);
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final List j() {
        DefinitionMap definitionMap = new DefinitionMap();
        LinkReferenceDefinitionParser linkReferenceDefinitionParser = this.b;
        linkReferenceDefinitionParser.a();
        Iterator it = linkReferenceDefinitionParser.c.iterator();
        while (it.hasNext()) {
            LinkReferenceDefinition linkReferenceDefinition = (LinkReferenceDefinition) it.next();
            definitionMap.b.putIfAbsent(Escaping.a(linkReferenceDefinition.g), linkReferenceDefinition);
        }
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{definitionMap}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }
}
