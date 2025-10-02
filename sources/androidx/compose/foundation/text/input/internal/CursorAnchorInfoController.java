package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CursorAnchorInfoController {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayoutState f1156a;
    public final ComposeInputMethodManager b;
    public final CoroutineScope c;
    public Job d;

    public CursorAnchorInfoController(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, CoroutineScope coroutineScope) {
        this.f1156a = textLayoutState;
        this.b = composeInputMethodManager;
        this.c = coroutineScope;
        new CursorAnchorInfo.Builder();
        new Matrix();
    }
}
