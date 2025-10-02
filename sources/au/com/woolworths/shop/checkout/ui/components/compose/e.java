package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Placeable placeable = (Placeable) this.e;
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout, "$this$layout");
                layout.e(placeable, 0, 0, BitmapDescriptorFactory.HUE_RED);
                break;
            case 1:
                String str = (String) this.e;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            default:
                Function0 function0 = (Function0) this.e;
                KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
                Intrinsics.h(KeyboardActions, "$this$KeyboardActions");
                function0.invoke();
                break;
        }
        return Unit.f24250a;
    }
}
