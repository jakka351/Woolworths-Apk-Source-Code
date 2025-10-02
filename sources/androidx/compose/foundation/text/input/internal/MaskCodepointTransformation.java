package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/MaskCodepointTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class MaskCodepointTransformation implements CodepointTransformation {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MaskCodepointTransformation);
    }

    public final int hashCode() {
        return Character.hashCode((char) 0);
    }

    public final String toString() {
        return "MaskCodepointTransformation(character=\u0000)";
    }
}
