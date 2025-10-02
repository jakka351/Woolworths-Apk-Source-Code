package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.emoji2.text.EmojiCompat;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/EmojiCompatStatus;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {

    /* renamed from: a, reason: collision with root package name */
    public static final EmojiCompatStatusDelegate f2144a;

    static {
        DefaultImpl defaultImpl = new DefaultImpl();
        defaultImpl.f2142a = EmojiCompat.g() ? defaultImpl.a() : null;
        f2144a = defaultImpl;
    }
}
