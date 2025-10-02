package io.noties.markwon.image;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;

/* loaded from: classes7.dex */
public class ImageSpanFactory implements SpanFactory {
    @Override // io.noties.markwon.SpanFactory
    public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
        return new AsyncDrawableSpan(markwonConfiguration.f24186a, new AsyncDrawable((String) ImageProps.f24211a.a(renderProps), markwonConfiguration.b, markwonConfiguration.f, (ImageSize) renderProps.b(ImageProps.c)), ((Boolean) renderProps.get()).booleanValue());
    }
}
