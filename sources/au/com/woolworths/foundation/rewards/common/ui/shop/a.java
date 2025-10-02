package au.com.woolworths.foundation.rewards.common.ui.shop;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.rewards.base.data.TextWithAlt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextWithAlt e;

    public /* synthetic */ a(TextWithAlt textWithAlt, int i) {
        this.d = i;
        this.e = textWithAlt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, this.e.getAltText());
                break;
            default:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, this.e.getAltText());
                break;
        }
        return Unit.f24250a;
    }
}
