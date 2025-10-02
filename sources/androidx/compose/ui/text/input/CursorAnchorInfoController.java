package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f2109a;
    public final InputMethodManagerImpl b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public TextFieldValue j;
    public TextLayoutResult k;
    public OffsetMapping l;
    public Rect n;
    public Rect o;
    public final Object c = new Object();
    public Lambda m = CursorAnchorInfoController$textFieldToRootTransform$1.h;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = Matrix.a();
    public final android.graphics.Matrix r = new android.graphics.Matrix();

    public CursorAnchorInfoController(AndroidComposeView androidComposeView, InputMethodManagerImpl inputMethodManagerImpl) {
        this.f2109a = androidComposeView;
        this.b = inputMethodManagerImpl;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void a() {
        InputMethodManagerImpl inputMethodManagerImpl = this.b;
        ?? r2 = inputMethodManagerImpl.b;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) r2.getD();
        View view = inputMethodManagerImpl.f2117a;
        if (inputMethodManager.isActive(view)) {
            ?? r3 = this.m;
            float[] fArr = this.q;
            r3.invoke(new Matrix(fArr));
            this.f2109a.c(fArr);
            android.graphics.Matrix matrix = this.r;
            AndroidMatrixConversions_androidKt.a(matrix, fArr);
            TextFieldValue textFieldValue = this.j;
            Intrinsics.e(textFieldValue);
            OffsetMapping offsetMapping = this.l;
            Intrinsics.e(offsetMapping);
            TextLayoutResult textLayoutResult = this.k;
            Intrinsics.e(textLayoutResult);
            Rect rect = this.n;
            Intrinsics.e(rect);
            Rect rect2 = this.o;
            Intrinsics.e(rect2);
            ((android.view.inputmethod.InputMethodManager) r2.getD()).updateCursorAnchorInfo(view, CursorAnchorInfoBuilder_androidKt.a(this.p, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.f, this.g, this.h, this.i));
            this.e = false;
        }
    }
}
