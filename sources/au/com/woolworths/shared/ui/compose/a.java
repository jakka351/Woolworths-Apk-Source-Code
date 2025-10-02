package au.com.woolworths.shared.ui.compose;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.product.extensions.StringExtKt;
import au.com.woolworths.shared.ui.compose.price.PriceLabelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ a(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        String str = this.e;
        SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                float f = CoachmarkKt.f10086a;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 1:
                Intrinsics.h(semantics, "$this$semantics");
                if (str != null) {
                    SemanticsPropertiesKt.k(semantics, str);
                    break;
                }
                break;
            case 2:
                Intrinsics.h(semantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 3:
                Intrinsics.h(semantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 4:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 5:
                int i2 = PriceLabelKt.b;
                Intrinsics.h(semantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 6:
                Intrinsics.h(semantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 7:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 8:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 9:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 10:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 11:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 12:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.h(semantics, str, null);
                break;
            case 13:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 14:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 15:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 16:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.r(semantics, 0);
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 17:
                Intrinsics.h(semantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(semantics, "Heading " + str);
                break;
            case 18:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 19:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.r(semantics, 0);
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 20:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.r(semantics, 0);
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 21:
                Intrinsics.h(semantics, "$this$semantics");
                String strA = StringExtKt.a(str);
                if (strA != null) {
                    str = strA;
                }
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 22:
                Intrinsics.h(semantics, "$this$semantics");
                String strA2 = StringExtKt.a(str);
                if (strA2 != null) {
                    str = strA2;
                }
                SemanticsPropertiesKt.k(semantics, "Unit Price " + str);
                break;
            case 23:
                Intrinsics.h(semantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 24:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                SemanticsPropertiesKt.n(semantics, 0);
                break;
            case 25:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                SemanticsPropertiesKt.n(semantics, 0);
                break;
            case 26:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 27:
                Intrinsics.h(semantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 28:
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            default:
                Intrinsics.h(semantics, "$this$semantics");
                String strA3 = StringExtKt.a(str);
                if (strA3 != null) {
                    str = strA3;
                } else if (str == null) {
                    str = "";
                }
                SemanticsPropertiesKt.k(semantics, str);
                break;
        }
        return unit;
    }
}
