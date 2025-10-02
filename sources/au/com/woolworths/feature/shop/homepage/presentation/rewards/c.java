package au.com.woolworths.feature.shop.homepage.presentation.rewards;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ c(Serializable serializable, int i, int i2) {
        this.d = i2;
        this.f = serializable;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String str = (String) this.f;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str + " out of " + this.e);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f;
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout, "$this$layout");
                Placeable placeable = (Placeable) CollectionsKt.O(arrayList);
                int i = 0;
                for (Placeable placeable2 : arrayList.subList(0, arrayList.size() - 1)) {
                    Placeable.PlacementScope.h(layout, placeable2, 0, i);
                    i += placeable2.e;
                }
                Placeable.PlacementScope.h(layout, placeable, 0, this.e - placeable.e);
                break;
        }
        return Unit.f24250a;
    }
}
