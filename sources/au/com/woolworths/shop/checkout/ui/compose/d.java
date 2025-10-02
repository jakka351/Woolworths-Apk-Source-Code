package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String str = (String) this.e;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.r(semantics, 0);
                SemanticsPropertiesKt.k(semantics, str);
                break;
            default:
                Function1 function1 = (Function1) this.e;
                ActionData actionData = (ActionData) obj;
                Intrinsics.h(actionData, "actionData");
                function1.invoke(actionData);
                break;
        }
        return Unit.f24250a;
    }
}
