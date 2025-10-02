package au.com.woolworths.feature.rewards.account.settings;

import au.com.woolworths.base.rewards.account.data.IconListItemAction;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ AccountSettingsClickListenerOld e;

    public /* synthetic */ c(AccountSettingsClickListenerOld accountSettingsClickListenerOld, int i) {
        this.d = i;
        this.e = accountSettingsClickListenerOld;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                IconListItemAction action = (IconListItemAction) obj;
                Intrinsics.h(action, "action");
                this.e.a6(action);
                break;
            default:
                ActionData actionData = (ActionData) obj;
                Intrinsics.h(actionData, "actionData");
                this.e.a1(actionData);
                break;
        }
        return Unit.f24250a;
    }
}
