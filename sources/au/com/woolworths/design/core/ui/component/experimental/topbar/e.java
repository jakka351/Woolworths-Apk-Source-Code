package au.com.woolworths.design.core.ui.component.experimental.topbar;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ e(int i, MutableState mutableState, Function1 function1) {
        this.d = i;
        this.e = mutableState;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                MutableState mutableState = this.e;
                mutableState.setValue("");
                this.f.invoke((String) mutableState.getD());
                break;
            case 1:
                this.e.setValue(Boolean.FALSE);
                this.f.invoke(Boolean.TRUE);
                break;
            case 2:
                Boolean bool = Boolean.FALSE;
                this.e.setValue(bool);
                this.f.invoke(bool);
                break;
            case 3:
                this.e.setValue(Boolean.FALSE);
                this.f.invoke(InboxUiEvent.ConfirmDeleteAll.f7271a);
                break;
            case 4:
                this.e.setValue(Boolean.FALSE);
                this.f.invoke(InboxUiEvent.CancelDeleteAll.f7266a);
                break;
            default:
                this.e.setValue(Boolean.TRUE);
                this.f.invoke(InboxUiEvent.ClickDeleteAllButton.f7267a);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(MutableState mutableState, Function1 function1) {
        this.d = 0;
        this.f = function1;
        this.e = mutableState;
    }
}
