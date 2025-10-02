package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DefaultImeEditCommandScope implements ImeEditCommandScope {

    /* renamed from: a, reason: collision with root package name */
    public final TransformedTextFieldState f1158a;
    public int b;
    public final MutableVector c = new MutableVector(new Function1[16], 0);

    public DefaultImeEditCommandScope(TransformedTextFieldState transformedTextFieldState) {
        this.f1158a = transformedTextFieldState;
    }

    public final void a(Function1 function1) {
        this.b++;
        this.c.c(function1);
        int i = this.b - 1;
        this.b = i;
        if (i == 0 && this.c.f != 0) {
            throw null;
        }
    }
}
