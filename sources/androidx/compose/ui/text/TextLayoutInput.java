package androidx.compose.ui.text;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/TextLayoutInput;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutInput {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f2063a;
    public final TextStyle b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final Density g;
    public final LayoutDirection h;
    public final FontFamily.Resolver i;
    public final long j;

    public TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        this.f2063a = annotatedString;
        this.b = textStyle;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = density;
        this.h = layoutDirection;
        this.i = resolver;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        return Intrinsics.c(this.f2063a, textLayoutInput.f2063a) && Intrinsics.c(this.b, textLayoutInput.b) && Intrinsics.c(this.c, textLayoutInput.c) && this.d == textLayoutInput.d && this.e == textLayoutInput.e && this.f == textLayoutInput.f && Intrinsics.c(this.g, textLayoutInput.g) && this.h == textLayoutInput.h && Intrinsics.c(this.i, textLayoutInput.i) && Constraints.b(this.j, textLayoutInput.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + b.a(this.f, b.e((b.d(a.d(this.f2063a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f2063a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) TextOverflow.a(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) Constraints.l(this.j)) + ')';
    }
}
