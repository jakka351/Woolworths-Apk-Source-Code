package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class TextFieldKeyEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final TextFieldPreparedSelectionState f1172a = new TextFieldPreparedSelectionState();
    public final DeadKeyCombiner b = new DeadKeyCombiner();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[16] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KeyCommand keyCommand = KeyCommand.e;
                iArr[17] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KeyCommand keyCommand2 = KeyCommand.e;
                iArr[18] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KeyCommand keyCommand3 = KeyCommand.e;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KeyCommand keyCommand4 = KeyCommand.e;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KeyCommand keyCommand5 = KeyCommand.e;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                KeyCommand keyCommand6 = KeyCommand.e;
                iArr[2] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                KeyCommand keyCommand7 = KeyCommand.e;
                iArr[5] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                KeyCommand keyCommand8 = KeyCommand.e;
                iArr[4] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                KeyCommand keyCommand9 = KeyCommand.e;
                iArr[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                KeyCommand keyCommand10 = KeyCommand.e;
                iArr[11] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                KeyCommand keyCommand11 = KeyCommand.e;
                iArr[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                KeyCommand keyCommand12 = KeyCommand.e;
                iArr[13] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                KeyCommand keyCommand13 = KeyCommand.e;
                iArr[6] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                KeyCommand keyCommand14 = KeyCommand.e;
                iArr[7] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                KeyCommand keyCommand15 = KeyCommand.e;
                iArr[8] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                KeyCommand keyCommand16 = KeyCommand.e;
                iArr[9] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                KeyCommand keyCommand17 = KeyCommand.e;
                iArr[14] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                KeyCommand keyCommand18 = KeyCommand.e;
                iArr[15] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                KeyCommand keyCommand19 = KeyCommand.e;
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                KeyCommand keyCommand20 = KeyCommand.e;
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                KeyCommand keyCommand21 = KeyCommand.e;
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                KeyCommand keyCommand22 = KeyCommand.e;
                iArr[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                KeyCommand keyCommand23 = KeyCommand.e;
                iArr[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                KeyCommand keyCommand24 = KeyCommand.e;
                iArr[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                KeyCommand keyCommand25 = KeyCommand.e;
                iArr[43] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                KeyCommand keyCommand26 = KeyCommand.e;
                iArr[44] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                KeyCommand keyCommand27 = KeyCommand.e;
                iArr[25] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                KeyCommand keyCommand28 = KeyCommand.e;
                iArr[26] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                KeyCommand keyCommand29 = KeyCommand.e;
                iArr[27] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                KeyCommand keyCommand30 = KeyCommand.e;
                iArr[34] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                KeyCommand keyCommand31 = KeyCommand.e;
                iArr[35] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                KeyCommand keyCommand32 = KeyCommand.e;
                iArr[37] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                KeyCommand keyCommand33 = KeyCommand.e;
                iArr[36] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                KeyCommand keyCommand34 = KeyCommand.e;
                iArr[38] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                KeyCommand keyCommand35 = KeyCommand.e;
                iArr[39] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                KeyCommand keyCommand36 = KeyCommand.e;
                iArr[40] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                KeyCommand keyCommand37 = KeyCommand.e;
                iArr[41] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                KeyCommand keyCommand38 = KeyCommand.e;
                iArr[28] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                KeyCommand keyCommand39 = KeyCommand.e;
                iArr[29] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                KeyCommand keyCommand40 = KeyCommand.e;
                iArr[30] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                KeyCommand keyCommand41 = KeyCommand.e;
                iArr[31] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                KeyCommand keyCommand42 = KeyCommand.e;
                iArr[32] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                KeyCommand keyCommand43 = KeyCommand.e;
                iArr[33] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                KeyCommand keyCommand44 = KeyCommand.e;
                iArr[42] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                KeyCommand keyCommand45 = KeyCommand.e;
                iArr[45] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                KeyCommand keyCommand46 = KeyCommand.e;
                iArr[46] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                KeyCommand keyCommand47 = KeyCommand.e;
                iArr[47] = 48;
            } catch (NoSuchFieldError unused48) {
            }
        }
    }

    public boolean a(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, Function1 function1, boolean z, boolean z2, Function0 function0) {
        Integer numA;
        KeyEvent_androidKt.a(keyEvent);
        if (KeyEvent_androidKt.b(keyEvent) == 1) {
            return false;
        }
        if (KeyEvent_androidKt.b(keyEvent) == 0 && !TextFieldKeyInput_androidKt.a(keyEvent)) {
            return false;
        }
        if (TextFieldKeyInput_androidKt.a(keyEvent) && (numA = this.b.a(keyEvent)) != null) {
            new StringBuilder(2).appendCodePoint(numA.intValue()).getClass();
            if (!z) {
                return false;
            }
            TextFieldKeyEventHandler_androidKt.a(keyEvent);
            TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr = TextFieldEditUndoBehavior.d;
            throw null;
        }
        KeyCommand keyCommandA = KeyMapping_androidKt.f1117a.a(keyEvent);
        if (keyCommandA == null) {
            return false;
        }
        if (keyCommandA.d && !z) {
            return false;
        }
        boolean zA = TextFieldKeyEventHandler_androidKt.a(keyEvent);
        textLayoutState.b();
        LayoutCoordinates layoutCoordinatesC = textLayoutState.c();
        if (layoutCoordinatesC != null) {
            if (!layoutCoordinatesC.q()) {
                layoutCoordinatesC = null;
            }
            if (layoutCoordinatesC != null) {
                throw null;
            }
        }
        new TextFieldPreparedSelection(transformedTextFieldState, null, zA, Float.NaN, this.f1172a);
        throw null;
    }
}
