package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformation;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface InputTransformation {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformation$Companion;", "Landroidx/compose/foundation/text/input/InputTransformation;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements InputTransformation {
    }

    default KeyboardOptions a() {
        return null;
    }
}
