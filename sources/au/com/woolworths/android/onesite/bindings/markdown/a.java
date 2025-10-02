package au.com.woolworths.android.onesite.bindings.markdown;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements SpanFactory {
    @Override // io.noties.markwon.SpanFactory
    public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
        Intrinsics.h(markwonConfiguration, "<unused var>");
        Intrinsics.h(renderProps, "<unused var>");
        return new RemoveUnderlineSpan();
    }
}
