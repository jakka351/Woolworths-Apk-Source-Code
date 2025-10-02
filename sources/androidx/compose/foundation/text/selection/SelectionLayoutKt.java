package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionLayoutKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Direction direction = Direction.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Direction direction2 = Direction.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final ResolvedTextDirection a(TextLayoutResult textLayoutResult, int i) {
        TextLayoutInput textLayoutInput = textLayoutResult.f2064a;
        MultiParagraph multiParagraph = textLayoutResult.b;
        if (textLayoutInput.f2063a.e.length() != 0) {
            int iD = multiParagraph.d(i);
            if ((i != 0 && iD == multiParagraph.d(i - 1)) || (i != textLayoutInput.f2063a.e.length() && iD == multiParagraph.d(i + 1))) {
                return textLayoutResult.a(i);
            }
        }
        return textLayoutResult.h(i);
    }

    public static final Direction b(Direction direction, Direction direction2) {
        int iOrdinal = direction2.ordinal();
        if (iOrdinal == 0) {
            return Direction.d;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Direction.f;
            }
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal2 = direction.ordinal();
        if (iOrdinal2 == 0) {
            return Direction.d;
        }
        if (iOrdinal2 == 1) {
            return Direction.e;
        }
        if (iOrdinal2 == 2) {
            return Direction.f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
