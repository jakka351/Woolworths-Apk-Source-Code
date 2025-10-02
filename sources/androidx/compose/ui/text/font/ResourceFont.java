package androidx.compose.ui.text.font;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResourceFont implements Font {

    /* renamed from: a, reason: collision with root package name */
    public final int f2104a;
    public final FontWeight b;
    public final FontVariation.Settings c;

    public ResourceFont(int i, FontWeight fontWeight, FontVariation.Settings settings) {
        this.f2104a = i;
        this.b = fontWeight;
        this.c = settings;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: a, reason: from getter */
    public final FontWeight getB() {
        return this.b;
    }

    @Override // androidx.compose.ui.text.font.Font
    public final int b() {
        return 0;
    }

    @Override // androidx.compose.ui.text.font.Font
    public final int c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.f2104a == resourceFont.f2104a && Intrinsics.c(this.b, resourceFont.b) && this.c.equals(resourceFont.c);
    }

    public final int hashCode() {
        return this.c.f2100a.hashCode() + b.a(0, b.a(0, ((this.f2104a * 31) + this.b.d) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f2104a + ", weight=" + this.b + ", style=" + ((Object) FontStyle.a(0)) + ", loadingStrategy=Blocking)";
    }
}
