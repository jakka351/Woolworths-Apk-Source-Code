package org.commonmark.renderer.html;

import org.commonmark.Extension;
import org.commonmark.renderer.Renderer;

/* loaded from: classes8.dex */
public class HtmlRenderer implements Renderer {

    /* renamed from: org.commonmark.renderer.html.HtmlRenderer$1, reason: invalid class name */
    class AnonymousClass1 implements HtmlNodeRendererFactory {
    }

    public static class Builder {
    }

    public interface HtmlRendererExtension extends Extension {
    }

    public class RendererContext implements HtmlNodeRendererContext, AttributeProviderContext {
    }
}
