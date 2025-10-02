package io.noties.markwon.core.factory;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.core.spans.StrongEmphasisSpan;

/* loaded from: classes7.dex */
public class StrongEmphasisSpanFactory implements SpanFactory {
    @Override // io.noties.markwon.SpanFactory
    public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
        return new StrongEmphasisSpan();
    }
}
