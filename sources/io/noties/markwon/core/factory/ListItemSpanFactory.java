package io.noties.markwon.core.factory;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.spans.BulletListItemSpan;
import io.noties.markwon.core.spans.OrderedListItemSpan;

/* loaded from: classes7.dex */
public class ListItemSpanFactory implements SpanFactory {
    @Override // io.noties.markwon.SpanFactory
    public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
        if (CoreProps.ListItemType.d == CoreProps.f24201a.a(renderProps)) {
            return new BulletListItemSpan(markwonConfiguration.f24186a, ((Integer) CoreProps.b.a(renderProps)).intValue());
        }
        return new OrderedListItemSpan(markwonConfiguration.f24186a, String.valueOf(CoreProps.c.a(renderProps)).concat(". "));
    }
}
