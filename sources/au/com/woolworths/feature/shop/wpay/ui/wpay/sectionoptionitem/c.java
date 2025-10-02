package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ FocusManager e;

    public /* synthetic */ c(FocusManager focusManager, int i) {
        this.d = i;
        this.e = focusManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(KeyboardActions, "$this$KeyboardActions");
                this.e.u(false);
                break;
            case 1:
                Intrinsics.h(KeyboardActions, "$this$KeyboardActions");
                this.e.l(6);
                break;
            default:
                Intrinsics.h(KeyboardActions, "$this$KeyboardActions");
                this.e.l(6);
                break;
        }
        return Unit.f24250a;
    }
}
