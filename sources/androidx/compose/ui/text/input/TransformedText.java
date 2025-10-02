package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TransformedText;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransformedText {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f2132a;
    public final OffsetMapping b;

    public TransformedText(AnnotatedString annotatedString, OffsetMapping offsetMapping) {
        this.f2132a = annotatedString;
        this.b = offsetMapping;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) obj;
        return Intrinsics.c(this.f2132a, transformedText.f2132a) && Intrinsics.c(this.b, transformedText.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2132a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f2132a) + ", offsetMapping=" + this.b + ')';
    }
}
