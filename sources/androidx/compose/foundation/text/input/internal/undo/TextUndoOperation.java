package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextUndoOperation {
    public static final TextUndoOperation$Companion$Saver$1 g = new TextUndoOperation$Companion$Saver$1();

    /* renamed from: a, reason: collision with root package name */
    public final int f1185a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public TextUndoOperation(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2) {
        j3 = (i2 & 32) != 0 ? System.currentTimeMillis() : j3;
        this.f1185a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        if (str.length() == 0 && str2.length() > 0) {
            TextEditType textEditType = TextEditType.d;
        } else if (str.length() <= 0 || str2.length() != 0) {
            TextEditType textEditType2 = TextEditType.f;
        } else {
            TextEditType textEditType3 = TextEditType.e;
        }
    }
}
