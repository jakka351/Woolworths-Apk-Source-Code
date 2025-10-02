package au.com.woolworths.feature.rewards.account.closeaccount.ui;

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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/ui/CloseAccountMarkwonPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CloseAccountMarkwonPlugin extends AbstractMarkwonPlugin {

    /* renamed from: a, reason: collision with root package name */
    public final int f5694a;
    public final int b;

    public CloseAccountMarkwonPlugin(int i, int i2) {
        this.f5694a = i;
        this.b = i2;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void d(MarkwonSpansFactory.Builder builder) {
        builder.a(ListItem.class, new SpanFactory() { // from class: au.com.woolworths.feature.rewards.account.closeaccount.ui.a
            @Override // io.noties.markwon.SpanFactory
            public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
                Intrinsics.h(markwonConfiguration, "<unused var>");
                Intrinsics.h(renderProps, "<unused var>");
                return new LastLineSpacingSpan(this.f5696a.b);
            }
        });
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void j(MarkwonTheme.Builder builder) {
        builder.e = this.f5694a;
    }
}
