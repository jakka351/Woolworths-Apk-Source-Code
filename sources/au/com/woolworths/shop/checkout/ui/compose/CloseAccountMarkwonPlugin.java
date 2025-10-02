package au.com.woolworths.shop.checkout.ui.compose;

import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.core.spans.LastLineSpacingSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.ListItem;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/compose/CloseAccountMarkwonPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CloseAccountMarkwonPlugin extends AbstractMarkwonPlugin {

    /* renamed from: a, reason: collision with root package name */
    public final int f10709a;
    public final int b;

    public CloseAccountMarkwonPlugin(int i, int i2) {
        this.f10709a = i;
        this.b = i2;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void d(MarkwonSpansFactory.Builder builder) {
        builder.a(ListItem.class, new SpanFactory() { // from class: au.com.woolworths.shop.checkout.ui.compose.a
            @Override // io.noties.markwon.SpanFactory
            public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
                Intrinsics.h(markwonConfiguration, "<unused var>");
                Intrinsics.h(renderProps, "<unused var>");
                return new LastLineSpacingSpan(this.f10713a.b);
            }
        });
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void j(MarkwonTheme.Builder builder) {
        builder.e = this.f10709a;
    }
}
