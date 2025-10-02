package androidx.compose.ui.text;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformParagraphStyle {
    public static final PlatformParagraphStyle b = new PlatformParagraphStyle(false, 0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2052a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public PlatformParagraphStyle(boolean z) {
        this.f2052a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlatformParagraphStyle) {
            return this.f2052a == ((PlatformParagraphStyle) obj).f2052a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f2052a) * 31);
    }

    public final String toString() {
        return a.k(", emojiSupportMatch=EmojiSupportMatch.Default)", new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.f2052a);
    }

    public PlatformParagraphStyle(boolean z, int i) {
        this.f2052a = z;
    }
}
