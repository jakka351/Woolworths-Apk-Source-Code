package au.com.woolworths.feature.shop.account.ui.details.components;

import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ ButtonData f;

    public /* synthetic */ b(ButtonData buttonData, Function1 function1) {
        this.d = 4;
        this.f = buttonData;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f.e);
                break;
            case 1:
                this.e.invoke(this.f);
                break;
            case 2:
                this.e.invoke(this.f);
                break;
            case 3:
                this.e.invoke(this.f);
                break;
            default:
                ActionData actionData = this.f.e;
                if (actionData != null) {
                    this.e.invoke(actionData);
                }
                return Unit.f24250a;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Function1 function1, ButtonData buttonData, int i) {
        this.d = i;
        this.e = function1;
        this.f = buttonData;
    }
}
