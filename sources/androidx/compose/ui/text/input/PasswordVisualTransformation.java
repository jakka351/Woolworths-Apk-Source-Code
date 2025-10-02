package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/PasswordVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText a(AnnotatedString annotatedString) {
        return new TransformedText(new AnnotatedString(StringsKt.P(annotatedString.e.length(), String.valueOf((char) 0))), OffsetMapping.Companion.f2121a);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PasswordVisualTransformation);
    }

    public final int hashCode() {
        return Character.hashCode((char) 0);
    }
}
