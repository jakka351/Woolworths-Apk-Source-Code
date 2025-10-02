package org.commonmark.parser.beta;

import org.commonmark.internal.InlineParserContextImpl;
import org.commonmark.internal.inline.LinkResultImpl;

/* loaded from: classes8.dex */
public interface LinkProcessor {
    LinkResultImpl a(LinkInfo linkInfo, Scanner scanner, InlineParserContextImpl inlineParserContextImpl);
}
