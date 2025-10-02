package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter extends LegacyPlatformTextInputServiceAdapter {
    public Job b;
    public LegacyTextInputMethodRequest c;
    public SharedFlowImpl d;

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void a() throws Throwable {
        Job job = this.b;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.b = null;
        MutableSharedFlow mutableSharedFlowK = k();
        if (mutableSharedFlowK != null) {
            ((SharedFlowImpl) mutableSharedFlowK).e();
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void b(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.c;
        if (legacyTextInputMethodRequest != null) {
            boolean z = (TextRange.b(legacyTextInputMethodRequest.h.b, textFieldValue2.b) && Intrinsics.c(legacyTextInputMethodRequest.h.c, textFieldValue2.c)) ? false : true;
            legacyTextInputMethodRequest.h = textFieldValue2;
            int size = legacyTextInputMethodRequest.j.size();
            for (int i = 0; i < size; i++) {
                RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) legacyTextInputMethodRequest.j.get(i)).get();
                if (recordingInputConnection != null) {
                    recordingInputConnection.g = textFieldValue2;
                }
            }
            LegacyCursorAnchorInfoController legacyCursorAnchorInfoController = legacyTextInputMethodRequest.m;
            synchronized (legacyCursorAnchorInfoController.c) {
                legacyCursorAnchorInfoController.j = null;
                legacyCursorAnchorInfoController.l = null;
                legacyCursorAnchorInfoController.k = null;
                legacyCursorAnchorInfoController.m = null;
                legacyCursorAnchorInfoController.n = null;
            }
            if (Intrinsics.c(textFieldValue, textFieldValue2)) {
                if (z) {
                    InputMethodManagerImpl inputMethodManagerImpl = legacyTextInputMethodRequest.b;
                    int iF = TextRange.f(textFieldValue2.b);
                    int iE = TextRange.e(textFieldValue2.b);
                    TextRange textRange = legacyTextInputMethodRequest.h.c;
                    int iF2 = textRange != null ? TextRange.f(textRange.f2067a) : -1;
                    TextRange textRange2 = legacyTextInputMethodRequest.h.c;
                    inputMethodManagerImpl.b(iF, iE, iF2, textRange2 != null ? TextRange.e(textRange2.f2067a) : -1);
                    return;
                }
                return;
            }
            if (textFieldValue != null && (!Intrinsics.c(textFieldValue.f2127a.e, textFieldValue2.f2127a.e) || (TextRange.b(textFieldValue.b, textFieldValue2.b) && !Intrinsics.c(textFieldValue.c, textFieldValue2.c)))) {
                InputMethodManagerImpl inputMethodManagerImpl2 = legacyTextInputMethodRequest.b;
                inputMethodManagerImpl2.a().restartInput(inputMethodManagerImpl2.f1161a);
                return;
            }
            int size2 = legacyTextInputMethodRequest.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) legacyTextInputMethodRequest.j.get(i2)).get();
                if (recordingInputConnection2 != null) {
                    TextFieldValue textFieldValue3 = legacyTextInputMethodRequest.h;
                    InputMethodManagerImpl inputMethodManagerImpl3 = legacyTextInputMethodRequest.b;
                    if (recordingInputConnection2.k) {
                        recordingInputConnection2.g = textFieldValue3;
                        if (recordingInputConnection2.i) {
                            inputMethodManagerImpl3.a().updateExtractedText(inputMethodManagerImpl3.f1161a, recordingInputConnection2.h, RecordingInputConnection_androidKt.a(textFieldValue3));
                        }
                        TextRange textRange3 = textFieldValue3.c;
                        long j = textFieldValue3.b;
                        int iF3 = textRange3 != null ? TextRange.f(textRange3.f2067a) : -1;
                        TextRange textRange4 = textFieldValue3.c;
                        inputMethodManagerImpl3.b(TextRange.f(j), TextRange.e(j), iF3, textRange4 != null ? TextRange.e(textRange4.f2067a) : -1);
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void c(Rect rect) {
        android.graphics.Rect rect2;
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.c;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.l = new android.graphics.Rect(MathKt.b(rect.f1752a), MathKt.b(rect.b), MathKt.b(rect.c), MathKt.b(rect.d));
            if (!legacyTextInputMethodRequest.j.isEmpty() || (rect2 = legacyTextInputMethodRequest.l) == null) {
                return;
            }
            legacyTextInputMethodRequest.f1165a.requestRectangleOnScreen(new android.graphics.Rect(rect2));
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void d() {
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f1163a;
        if (legacyPlatformTextInputNode == null) {
            return;
        }
        this.b = legacyPlatformTextInputNode.C1(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(null, this, legacyPlatformTextInputNode, null));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void g(final TextFieldValue textFieldValue, final ImeOptions imeOptions, final Function1 function1, final Function1 function12) {
        Function1<LegacyTextInputMethodRequest, Unit> function13 = new Function1<LegacyTextInputMethodRequest, Unit>() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LegacyTextInputMethodRequest legacyTextInputMethodRequest = (LegacyTextInputMethodRequest) obj;
                LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f1163a;
                legacyTextInputMethodRequest.h = textFieldValue;
                legacyTextInputMethodRequest.i = imeOptions;
                legacyTextInputMethodRequest.c = (Lambda) function1;
                legacyTextInputMethodRequest.d = function12;
                legacyTextInputMethodRequest.e = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getS() : null;
                legacyTextInputMethodRequest.f = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getT() : null;
                legacyTextInputMethodRequest.g = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getViewConfiguration() : null;
                return Unit.f24250a;
            }
        };
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f1163a;
        if (legacyPlatformTextInputNode == null) {
            return;
        }
        this.b = legacyPlatformTextInputNode.C1(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(function13, this, legacyPlatformTextInputNode, null));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void h(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, Rect rect, Rect rect2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.c;
        if (legacyTextInputMethodRequest != null) {
            LegacyCursorAnchorInfoController legacyCursorAnchorInfoController = legacyTextInputMethodRequest.m;
            synchronized (legacyCursorAnchorInfoController.c) {
                try {
                    legacyCursorAnchorInfoController.j = textFieldValue;
                    legacyCursorAnchorInfoController.l = offsetMapping;
                    legacyCursorAnchorInfoController.k = textLayoutResult;
                    legacyCursorAnchorInfoController.m = rect;
                    legacyCursorAnchorInfoController.n = rect2;
                    if (legacyCursorAnchorInfoController.e || legacyCursorAnchorInfoController.d) {
                        legacyCursorAnchorInfoController.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter
    public final void i() {
        MutableSharedFlow mutableSharedFlowK = k();
        if (mutableSharedFlowK != null) {
            ((SharedFlowImpl) mutableSharedFlowK).f(Unit.f24250a);
        }
    }

    public final MutableSharedFlow k() {
        SharedFlowImpl sharedFlowImpl = this.d;
        if (sharedFlowImpl != null) {
            return sharedFlowImpl;
        }
        if (!StylusHandwriting_androidKt.f1148a) {
            return null;
        }
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(1, 0, BufferOverflow.f, 2);
        this.d = sharedFlowImplB;
        return sharedFlowImplB;
    }
}
