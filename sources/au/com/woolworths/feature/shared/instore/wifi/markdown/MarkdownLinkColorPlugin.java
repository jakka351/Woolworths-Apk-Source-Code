package au.com.woolworths.feature.shared.instore.wifi.markdown;

import androidx.compose.runtime.internal.StabilityInferred;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.core.MarkwonTheme;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/markdown/MarkdownLinkColorPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarkdownLinkColorPlugin extends AbstractMarkwonPlugin {

    /* renamed from: a, reason: collision with root package name */
    public final int f6520a;

    public MarkdownLinkColorPlugin(int i) {
        this.f6520a = i;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void j(MarkwonTheme.Builder builder) {
        builder.f24203a = this.f6520a;
    }
}
