package org.commonmark.ext.gfm.strikethrough;

import org.commonmark.ext.gfm.strikethrough.internal.StrikethroughDelimiterProcessor;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlNodeRendererFactory;
import org.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.renderer.markdown.MarkdownNodeRendererFactory;
import org.commonmark.renderer.markdown.MarkdownRenderer;
import org.commonmark.renderer.text.TextContentNodeRendererFactory;
import org.commonmark.renderer.text.TextContentRenderer;

/* loaded from: classes8.dex */
public class StrikethroughExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension, TextContentRenderer.TextContentRendererExtension, MarkdownRenderer.MarkdownRendererExtension {

    /* renamed from: org.commonmark.ext.gfm.strikethrough.StrikethroughExtension$1, reason: invalid class name */
    class AnonymousClass1 implements HtmlNodeRendererFactory {
    }

    /* renamed from: org.commonmark.ext.gfm.strikethrough.StrikethroughExtension$2, reason: invalid class name */
    class AnonymousClass2 implements TextContentNodeRendererFactory {
    }

    /* renamed from: org.commonmark.ext.gfm.strikethrough.StrikethroughExtension$3, reason: invalid class name */
    class AnonymousClass3 implements MarkdownNodeRendererFactory {
    }

    public static class Builder {
    }

    @Override // org.commonmark.parser.Parser.ParserExtension
    public final void a(Parser.Builder builder) {
        builder.c.add(new StrikethroughDelimiterProcessor());
    }
}
