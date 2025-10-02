package au.com.woolworths.markdown.compat;

import androidx.compose.runtime.internal.StabilityInferred;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.commonmark.node.Link;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/markdown/compat/MarkdownLinkPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MarkdownLinkPlugin extends AbstractMarkwonPlugin {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f9045a;

    public MarkdownLinkPlugin(Function2 function2) {
        this.f9045a = function2;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void d(MarkwonSpansFactory.Builder builder) {
        builder.a(Link.class, new e());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void f(MarkwonConfiguration.Builder builder) {
        builder.d = new CustomTabLinkResolver(this.f9045a);
    }
}
