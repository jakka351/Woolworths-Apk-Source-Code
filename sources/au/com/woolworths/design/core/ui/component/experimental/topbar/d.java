package au.com.woolworths.design.core.ui.component.experimental.topbar;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ d(int i, MutableState mutableState, Function1 function1) {
        this.d = i;
        this.e = function1;
        this.f = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                MutableState mutableState = this.f;
                mutableState.setValue(it);
                this.e.invoke((String) mutableState.getD());
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.e.invoke(bool);
                this.f.setValue(bool);
                break;
            case 2:
                TextFieldValue it2 = (TextFieldValue) obj;
                Intrinsics.h(it2, "it");
                this.f.setValue(it2);
                this.e.invoke(it2.f2127a.e);
                break;
            case 3:
                String it3 = (String) obj;
                Intrinsics.h(it3, "it");
                int length = it3.length();
                MutableState mutableState2 = this.f;
                if (length <= 500) {
                    mutableState2.setValue(it3);
                }
                this.e.invoke((String) mutableState2.getD());
                break;
            default:
                TextFieldValue it4 = (TextFieldValue) obj;
                Intrinsics.h(it4, "it");
                String strF0 = StringsKt.f0(13, it4.f2127a.e);
                this.e.invoke(strF0);
                MutableState mutableState3 = this.f;
                TextFieldValue textFieldValue = (TextFieldValue) mutableState3.getD();
                int length2 = strF0.length();
                mutableState3.setValue(TextFieldValue.b(textFieldValue, strF0, TextRangeKt.a(length2, length2), 4));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(MutableState mutableState, Function1 function1) {
        this.d = 2;
        this.f = mutableState;
        this.e = function1;
    }
}
