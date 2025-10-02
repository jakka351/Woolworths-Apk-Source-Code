package au.com.woolworths.shop.productcard.ui.components;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextWithAltData e;

    public /* synthetic */ a(TextWithAltData textWithAltData, int i) {
        this.d = i;
        this.e = textWithAltData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, this.e.b);
                break;
            case 1:
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, this.e.b);
                break;
            case 2:
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, this.e.b);
                break;
            default:
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, this.e.b);
                break;
        }
        return Unit.f24250a;
    }
}
