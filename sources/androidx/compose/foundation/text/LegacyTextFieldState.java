package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.EditingBuffer;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/LegacyTextFieldState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LegacyTextFieldState {
    public final MutableState A;

    /* renamed from: a, reason: collision with root package name */
    public TextDelegate f1121a;
    public final RecomposeScope b;
    public final SoftwareKeyboardController c;
    public final EditProcessor d;
    public TextInputSession e;
    public final MutableState f;
    public final MutableState g;
    public LayoutCoordinates h;
    public final MutableState i;
    public AnnotatedString j;
    public final MutableState k;
    public final MutableState l;
    public final MutableState m;
    public final MutableState n;
    public final MutableState o;
    public boolean p;
    public final MutableState q;
    public final KeyboardActionRunner r;
    public final MutableState s;
    public final MutableState t;
    public Function1 u;
    public final Function1 v;
    public final Function1 w;
    public final AndroidPaint x;
    public long y;
    public final MutableState z;

    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController softwareKeyboardController) {
        this.f1121a = textDelegate;
        this.b = recomposeScope;
        this.c = softwareKeyboardController;
        EditProcessor editProcessor = new EditProcessor();
        AnnotatedString annotatedString = AnnotatedStringKt.f2033a;
        long j = TextRange.b;
        TextFieldValue textFieldValue = new TextFieldValue(annotatedString, j, (TextRange) null);
        editProcessor.f2112a = textFieldValue;
        editProcessor.b = new EditingBuffer(annotatedString, textFieldValue.b);
        this.d = editProcessor;
        Boolean bool = Boolean.FALSE;
        this.f = SnapshotStateKt.f(bool);
        this.g = SnapshotStateKt.f(new Dp(0));
        this.i = SnapshotStateKt.f(null);
        this.k = SnapshotStateKt.f(HandleState.d);
        this.l = SnapshotStateKt.f(bool);
        this.m = SnapshotStateKt.f(bool);
        this.n = SnapshotStateKt.f(bool);
        this.o = SnapshotStateKt.f(bool);
        this.p = true;
        this.q = SnapshotStateKt.f(Boolean.TRUE);
        this.r = new KeyboardActionRunner(softwareKeyboardController);
        this.s = SnapshotStateKt.f(bool);
        this.t = SnapshotStateKt.f(bool);
        this.u = LegacyTextFieldState$onValueChangeOriginal$1.h;
        this.v = new LegacyTextFieldState$onValueChange$1(this);
        this.w = new LegacyTextFieldState$onImeActionPerformed$1(this);
        this.x = AndroidPaint_androidKt.a();
        this.y = Color.k;
        this.z = SnapshotStateKt.f(new TextRange(j));
        this.A = SnapshotStateKt.f(new TextRange(j));
    }

    public final HandleState a() {
        return (HandleState) ((SnapshotMutableStateImpl) this.k).getD();
    }

    public final boolean b() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.f).getD()).booleanValue();
    }

    public final LayoutCoordinates c() {
        LayoutCoordinates layoutCoordinates = this.h;
        if (layoutCoordinates == null || !layoutCoordinates.q()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final TextLayoutResultProxy d() {
        return (TextLayoutResultProxy) ((SnapshotMutableStateImpl) this.i).getD();
    }

    public final void e(long j) {
        ((SnapshotMutableStateImpl) this.A).setValue(new TextRange(j));
    }

    public final void f(long j) {
        ((SnapshotMutableStateImpl) this.z).setValue(new TextRange(j));
    }
}
