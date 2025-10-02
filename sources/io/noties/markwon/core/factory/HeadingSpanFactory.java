package io.noties.markwon.core.factory;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.spans.HeadingSpan;

/* loaded from: classes7.dex */
public class HeadingSpanFactory implements SpanFactory {
    @Override // io.noties.markwon.SpanFactory
    public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
        return new HeadingSpan(markwonConfiguration.f24186a, ((Integer) CoreProps.d.a(renderProps)).intValue());
    }
}
