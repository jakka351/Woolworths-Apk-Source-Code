package au.com.woolworths.android.onesite.bindings.markdown;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import kotlin.Metadata;
import org.commonmark.node.Link;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/bindings/markdown/MarkdownLinkPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarkdownLinkPlugin extends AbstractMarkwonPlugin {

    /* renamed from: a, reason: collision with root package name */
    public final LinkHandler f4233a;

    public MarkdownLinkPlugin(LinkHandler linkHandler) {
        this.f4233a = linkHandler;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void d(MarkwonSpansFactory.Builder builder) {
        builder.a(Link.class, new a());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void f(MarkwonConfiguration.Builder builder) {
        builder.d = new CustomTabLinkResolver(this.f4233a);
    }
}
