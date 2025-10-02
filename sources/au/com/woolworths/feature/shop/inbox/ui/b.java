package au.com.woolworths.feature.shop.inbox.ui;

import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.DialogType;
import au.com.woolworths.shop.lists.ui.snapalist.dialog.DialogType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ b(Function0 function0, Function1 function1) {
        this.d = 0;
        this.f = function0;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.f.invoke();
                this.e.invoke(InboxUiEvent.ClickDeleteAllButton.f7267a);
                break;
            case 1:
                this.e.invoke(DialogType.NoPermissionDialog.f8841a);
                this.f.invoke();
                break;
            case 2:
                this.e.invoke(DialogType.NoPermissionDialog.f12454a);
                this.f.invoke();
                break;
            default:
                this.e.invoke(DialogType.NoPermissionDialog.f12454a);
                this.f.invoke();
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Function1 function1, Function0 function0, int i) {
        this.d = i;
        this.e = function1;
        this.f = function0;
    }
}
