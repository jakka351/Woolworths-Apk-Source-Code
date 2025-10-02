package org.commonmark.ext.gfm.tables;

import org.commonmark.ext.gfm.tables.internal.TableBlockParser;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlNodeRendererFactory;
import org.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.renderer.markdown.MarkdownNodeRendererFactory;
import org.commonmark.renderer.markdown.MarkdownRenderer;
import org.commonmark.renderer.text.TextContentNodeRendererFactory;
import org.commonmark.renderer.text.TextContentRenderer;

/* loaded from: classes8.dex */
public class TablesExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension, TextContentRenderer.TextContentRendererExtension, MarkdownRenderer.MarkdownRendererExtension {

    /* renamed from: org.commonmark.ext.gfm.tables.TablesExtension$1, reason: invalid class name */
    class AnonymousClass1 implements HtmlNodeRendererFactory {
    }

    /* renamed from: org.commonmark.ext.gfm.tables.TablesExtension$2, reason: invalid class name */
    class AnonymousClass2 implements TextContentNodeRendererFactory {
    }

    /* renamed from: org.commonmark.ext.gfm.tables.TablesExtension$3, reason: invalid class name */
    class AnonymousClass3 implements MarkdownNodeRendererFactory {
    }

    @Override // org.commonmark.parser.Parser.ParserExtension
    public final void a(Parser.Builder builder) {
        builder.f26859a.add(new TableBlockParser.Factory());
    }
}
