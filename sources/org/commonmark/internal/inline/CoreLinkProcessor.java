package org.commonmark.internal.inline;

import org.commonmark.internal.InlineParserContextImpl;
import org.commonmark.internal.util.Escaping;
import org.commonmark.node.DefinitionMap;
import org.commonmark.node.Image;
import org.commonmark.node.Link;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.parser.beta.LinkInfo;
import org.commonmark.parser.beta.LinkProcessor;
import org.commonmark.parser.beta.Scanner;

/* loaded from: classes8.dex */
public class CoreLinkProcessor implements LinkProcessor {
    public static LinkResultImpl b(LinkInfo linkInfo, Scanner scanner, String str, String str2) {
        if (linkInfo.d() == null || !linkInfo.d().g.equals("!")) {
            return new LinkResultImpl(new Link(str, str2), scanner.k());
        }
        Image image = new Image();
        image.g = str;
        image.h = str2;
        LinkResultImpl linkResultImpl = new LinkResultImpl(image, scanner.k());
        linkResultImpl.c = true;
        return linkResultImpl;
    }

    @Override // org.commonmark.parser.beta.LinkProcessor
    public final LinkResultImpl a(LinkInfo linkInfo, Scanner scanner, InlineParserContextImpl inlineParserContextImpl) {
        Object obj;
        if (linkInfo.c() != null) {
            return b(linkInfo, scanner, linkInfo.c(), linkInfo.a());
        }
        String strB = linkInfo.b();
        if (strB == null || strB.isEmpty()) {
            strB = linkInfo.e();
        }
        DefinitionMap definitionMap = (DefinitionMap) inlineParserContextImpl.e.f26821a.get(LinkReferenceDefinition.class);
        if (definitionMap == null) {
            obj = null;
        } else {
            obj = definitionMap.b.get(Escaping.a(strB));
        }
        LinkReferenceDefinition linkReferenceDefinition = (LinkReferenceDefinition) obj;
        if (linkReferenceDefinition != null) {
            return b(linkInfo, scanner, linkReferenceDefinition.h, linkReferenceDefinition.i);
        }
        return null;
    }
}
