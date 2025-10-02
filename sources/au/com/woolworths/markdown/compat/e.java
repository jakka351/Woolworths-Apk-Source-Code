package au.com.woolworths.markdown.compat;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements SpanFactory {
    @Override // io.noties.markwon.SpanFactory
    public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
        Intrinsics.h(markwonConfiguration, "<unused var>");
        Intrinsics.h(renderProps, "<unused var>");
        return new RemoveUnderlineSpan();
    }
}
