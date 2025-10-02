package androidx.compose.ui.text.font;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public final int f2091a;

    public AndroidFontResolveInterceptor(int i) {
        this.f2091a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.f2091a == ((AndroidFontResolveInterceptor) obj).f2091a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2091a);
    }

    public final String toString() {
        return a.l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f2091a, ')');
    }
}
