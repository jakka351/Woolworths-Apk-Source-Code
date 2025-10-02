package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class InputMethodSession {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformTextInputMethodRequest f1970a;
    public final Function0 b;
    public final Object c = new Object();
    public final MutableVector d = new MutableVector(new WeakReference[16], 0);
    public boolean e;

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, Function0 function0) {
        this.f1970a = platformTextInputMethodRequest;
        this.b = function0;
    }

    public final InputConnection a(EditorInfo editorInfo) {
        synchronized (this.c) {
            if (this.e) {
                return null;
            }
            NullableInputConnectionWrapper nullableInputConnectionWrapperA = NullableInputConnectionWrapper_androidKt.a(this.f1970a.a(editorInfo), new Function1<NullableInputConnectionWrapper, Unit>() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    NullableInputConnectionWrapper nullableInputConnectionWrapper = (NullableInputConnectionWrapper) obj;
                    nullableInputConnectionWrapper.a();
                    InputMethodSession inputMethodSession = this.h;
                    MutableVector mutableVector = inputMethodSession.d;
                    MutableVector mutableVector2 = inputMethodSession.d;
                    Object[] objArr = mutableVector.d;
                    int i = mutableVector.f;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            i2 = -1;
                            break;
                        }
                        if (Intrinsics.c((WeakReference) objArr[i2], nullableInputConnectionWrapper)) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                        mutableVector2.l(i2);
                    }
                    if (mutableVector2.f == 0) {
                        inputMethodSession.b.invoke();
                    }
                    return Unit.f24250a;
                }
            });
            this.d.c(new WeakReference(nullableInputConnectionWrapperA));
            return nullableInputConnectionWrapperA;
        }
    }

    public final boolean b() {
        return !this.e;
    }
}
