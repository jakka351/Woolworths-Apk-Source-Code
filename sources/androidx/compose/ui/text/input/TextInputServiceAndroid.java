package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {

    /* renamed from: a, reason: collision with root package name */
    public final View f2129a;
    public final InputMethodManagerImpl b;
    public final b c;
    public boolean d;
    public Lambda e;
    public Function1 f;
    public TextFieldValue g;
    public ImeOptions h;
    public final ArrayList i;
    public final Object j;
    public Rect k;
    public final CursorAnchorInfoController l;
    public final MutableVector m;
    public a n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextInputCommand {
        public static final TextInputCommand d;
        public static final TextInputCommand e;
        public static final TextInputCommand f;
        public static final TextInputCommand g;
        public static final /* synthetic */ TextInputCommand[] h;
        public static final /* synthetic */ EnumEntries i;

        static {
            TextInputCommand textInputCommand = new TextInputCommand("StartInput", 0);
            d = textInputCommand;
            TextInputCommand textInputCommand2 = new TextInputCommand("StopInput", 1);
            e = textInputCommand2;
            TextInputCommand textInputCommand3 = new TextInputCommand("ShowKeyboard", 2);
            f = textInputCommand3;
            TextInputCommand textInputCommand4 = new TextInputCommand("HideKeyboard", 3);
            g = textInputCommand4;
            TextInputCommand[] textInputCommandArr = {textInputCommand, textInputCommand2, textInputCommand3, textInputCommand4};
            h = textInputCommandArr;
            i = EnumEntriesKt.a(textInputCommandArr);
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) h.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextInputCommand textInputCommand = TextInputCommand.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TextInputCommand textInputCommand2 = TextInputCommand.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TextInputCommand textInputCommand3 = TextInputCommand.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TextInputServiceAndroid(View view, AndroidComposeView androidComposeView) {
        InputMethodManagerImpl inputMethodManagerImpl = new InputMethodManagerImpl(view);
        b bVar = new b(Choreographer.getInstance());
        this.f2129a = view;
        this.b = inputMethodManagerImpl;
        this.c = bVar;
        this.e = TextInputServiceAndroid$onEditCommand$1.h;
        this.f = TextInputServiceAndroid$onImeActionPerformed$1.h;
        this.g = new TextFieldValue("", TextRange.b, 4);
        this.h = ImeOptions.h;
        this.i = new ArrayList();
        this.j = LazyKt.a(LazyThreadSafetyMode.e, new Function0<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new BaseInputConnection(this.h.f2129a, false);
            }
        });
        this.l = new CursorAnchorInfoController(androidComposeView, inputMethodManagerImpl);
        this.m = new MutableVector(new TextInputCommand[16], 0);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void a() {
        this.d = false;
        this.e = TextInputServiceAndroid$stopInput$1.h;
        this.f = TextInputServiceAndroid$stopInput$2.h;
        this.k = null;
        i(TextInputCommand.e);
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void b(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z = (TextRange.b(this.g.b, textFieldValue2.b) && Intrinsics.c(this.g.c, textFieldValue2.c)) ? false : true;
        this.g = textFieldValue2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) this.i.get(i)).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.e(textFieldValue2);
            }
        }
        CursorAnchorInfoController cursorAnchorInfoController = this.l;
        synchronized (cursorAnchorInfoController.c) {
            cursorAnchorInfoController.j = null;
            cursorAnchorInfoController.l = null;
            cursorAnchorInfoController.k = null;
            cursorAnchorInfoController.m = CursorAnchorInfoController$invalidate$1$1.h;
            cursorAnchorInfoController.n = null;
            cursorAnchorInfoController.o = null;
        }
        if (Intrinsics.c(textFieldValue, textFieldValue2)) {
            if (z) {
                InputMethodManagerImpl inputMethodManagerImpl = this.b;
                int iF = TextRange.f(textFieldValue2.b);
                int iE = TextRange.e(textFieldValue2.b);
                TextRange textRange = this.g.c;
                int iF2 = textRange != null ? TextRange.f(textRange.f2067a) : -1;
                TextRange textRange2 = this.g.c;
                inputMethodManagerImpl.a(iF, iE, iF2, textRange2 != null ? TextRange.e(textRange2.f2067a) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!Intrinsics.c(textFieldValue.f2127a.e, textFieldValue2.f2127a.e) || (TextRange.b(textFieldValue.b, textFieldValue2.b) && !Intrinsics.c(textFieldValue.c, textFieldValue2.c)))) {
            InputMethodManagerImpl inputMethodManagerImpl2 = this.b;
            ((android.view.inputmethod.InputMethodManager) inputMethodManagerImpl2.b.getD()).restartInput(inputMethodManagerImpl2.f2117a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) this.i.get(i2)).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.f(this.g, this.b);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void c(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.k = new Rect(MathKt.b(rect.f1752a), MathKt.b(rect.b), MathKt.b(rect.c), MathKt.b(rect.d));
        if (!this.i.isEmpty() || (rect2 = this.k) == null) {
            return;
        }
        this.f2129a.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void d() {
        i(TextInputCommand.d);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void e() {
        i(TextInputCommand.g);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void f() {
        i(TextInputCommand.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void g(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        this.d = true;
        this.g = textFieldValue;
        this.h = imeOptions;
        this.e = (Lambda) function1;
        this.f = function12;
        i(TextInputCommand.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void h(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        CursorAnchorInfoController cursorAnchorInfoController = this.l;
        synchronized (cursorAnchorInfoController.c) {
            try {
                cursorAnchorInfoController.j = textFieldValue;
                cursorAnchorInfoController.l = offsetMapping;
                cursorAnchorInfoController.k = textLayoutResult;
                cursorAnchorInfoController.m = (Lambda) function1;
                cursorAnchorInfoController.n = rect;
                cursorAnchorInfoController.o = rect2;
                if (cursorAnchorInfoController.e || cursorAnchorInfoController.d) {
                    cursorAnchorInfoController.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.text.input.a, java.lang.Runnable] */
    public final void i(TextInputCommand textInputCommand) {
        this.m.c(textInputCommand);
        if (this.n == null) {
            ?? r2 = new Runnable() { // from class: androidx.compose.ui.text.input.a
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    TextInputServiceAndroid textInputServiceAndroid = this.d;
                    InputMethodManagerImpl inputMethodManagerImpl = textInputServiceAndroid.b;
                    textInputServiceAndroid.n = null;
                    MutableVector mutableVector = textInputServiceAndroid.m;
                    View view = textInputServiceAndroid.f2129a;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        mutableVector.h();
                        return;
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Object[] objArr = mutableVector.d;
                    int i = mutableVector.f;
                    for (int i2 = 0; i2 < i; i2++) {
                        TextInputServiceAndroid.TextInputCommand textInputCommand2 = (TextInputServiceAndroid.TextInputCommand) objArr[i2];
                        int iOrdinal = textInputCommand2.ordinal();
                        if (iOrdinal == 0) {
                            Boolean bool = Boolean.TRUE;
                            objectRef.d = bool;
                            objectRef2.d = bool;
                        } else if (iOrdinal == 1) {
                            Boolean bool2 = Boolean.FALSE;
                            objectRef.d = bool2;
                            objectRef2.d = bool2;
                        } else if ((iOrdinal == 2 || iOrdinal == 3) && !Intrinsics.c(objectRef.d, Boolean.FALSE)) {
                            objectRef2.d = Boolean.valueOf(textInputCommand2 == TextInputServiceAndroid.TextInputCommand.f);
                        }
                    }
                    mutableVector.h();
                    if (Intrinsics.c(objectRef.d, Boolean.TRUE)) {
                        ((android.view.inputmethod.InputMethodManager) inputMethodManagerImpl.b.getD()).restartInput(inputMethodManagerImpl.f2117a);
                    }
                    Boolean bool3 = (Boolean) objectRef2.d;
                    if (bool3 != null) {
                        if (bool3.booleanValue()) {
                            inputMethodManagerImpl.c.b();
                        } else {
                            inputMethodManagerImpl.c.a();
                        }
                    }
                    if (Intrinsics.c(objectRef.d, Boolean.FALSE)) {
                        ((android.view.inputmethod.InputMethodManager) inputMethodManagerImpl.b.getD()).restartInput(inputMethodManagerImpl.f2117a);
                    }
                }
            };
            this.c.execute(r2);
            this.n = r2;
        }
    }
}
