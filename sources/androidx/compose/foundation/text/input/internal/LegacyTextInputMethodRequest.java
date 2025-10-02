package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyTextInputMethodRequest;", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {

    /* renamed from: a, reason: collision with root package name */
    public final View f1165a;
    public final InputMethodManagerImpl b;
    public LegacyTextFieldState e;
    public TextFieldSelectionManager f;
    public ViewConfiguration g;
    public Rect l;
    public final LegacyCursorAnchorInfoController m;
    public Lambda c = LegacyTextInputMethodRequest$onEditCommand$1.h;
    public Function1 d = LegacyTextInputMethodRequest$onImeActionPerformed$1.h;
    public TextFieldValue h = new TextFieldValue("", TextRange.b, 4);
    public ImeOptions i = ImeOptions.h;
    public final ArrayList j = new ArrayList();
    public final Object k = LazyKt.a(LazyThreadSafetyMode.e, new Function0<BaseInputConnection>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$baseInputConnection$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new BaseInputConnection(this.h.f1165a, false);
        }
    });

    public LegacyTextInputMethodRequest(View view, Function1 function1, InputMethodManagerImpl inputMethodManagerImpl) {
        this.f1165a = view;
        this.b = inputMethodManagerImpl;
        this.m = new LegacyCursorAnchorInfoController(function1, inputMethodManagerImpl);
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public final InputConnection a(EditorInfo editorInfo) {
        int i;
        int i2;
        TextFieldValue textFieldValue = this.h;
        String str = textFieldValue.f2127a.e;
        long j = textFieldValue.b;
        ImeOptions imeOptions = this.i;
        int i3 = imeOptions.e;
        int i4 = imeOptions.d;
        boolean z = imeOptions.f2116a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i;
        LocaleList localeList = imeOptions.g;
        if (Intrinsics.c(localeList, LocaleList.f)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.s(localeList, 10));
            Iterator it = localeList.d.iterator();
            while (it.hasNext()) {
                arrayList.add(((Locale) it.next()).f2136a);
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (imeOptions.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = imeOptions.b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (imeOptions.c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = TextRange.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        EditorInfoCompat.a(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!StylusHandwriting_androidKt.f1148a || i4 == 7 || i4 == 8) {
            EditorInfoCompat.b(editorInfo, false);
        } else {
            EditorInfoCompat.b(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(CollectionsKt.R(androidx.camera.camera2.internal.compat.c.o(), androidx.camera.camera2.internal.compat.c.z(), androidx.camera.camera2.internal.compat.c.v(), androidx.camera.camera2.internal.compat.c.x(), androidx.camera.camera2.internal.compat.c.B(), androidx.camera.camera2.internal.compat.c.C(), androidx.camera.camera2.internal.compat.c.D()));
            editorInfo.setSupportedHandwritingGesturePreviews(ArraysKt.r0(new Class[]{androidx.camera.camera2.internal.compat.c.o(), androidx.camera.camera2.internal.compat.c.z(), androidx.camera.camera2.internal.compat.c.v(), androidx.camera.camera2.internal.compat.c.x()}));
        }
        Function1 function1 = LegacyPlatformTextInputServiceAdapter_androidKt.f1164a;
        if (EmojiCompat.g()) {
            EmojiCompat.a().l(editorInfo);
        }
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.h, new LegacyTextInputMethodRequest$createInputConnection$1(this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }
}
