package au.com.woolworths.shop.product.details.ui;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.product.details.data.ButtonData;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.RatingSubmissionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.u(semantics);
                break;
            case 1:
                ButtonData it = (ButtonData) obj;
                Intrinsics.h(it, "it");
                break;
            case 2:
                ButtonData it2 = (ButtonData) obj;
                Intrinsics.h(it2, "it");
                break;
            case 3:
                ButtonData it3 = (ButtonData) obj;
                Intrinsics.h(it3, "it");
                break;
            case 4:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.u(semantics2);
                break;
            case 5:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 6:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.g(semantics3);
                break;
            case 7:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 8:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.g(semantics4);
                break;
            case 9:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.g(clearAndSetSemantics);
                break;
            case 10:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                break;
            case 11:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 12:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.u(semantics5);
                break;
            case 13:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 14:
                DynamicSizeCardData it4 = (DynamicSizeCardData) obj;
                Intrinsics.h(it4, "it");
                break;
            case 15:
                String it5 = (String) obj;
                Intrinsics.h(it5, "it");
                break;
            case 16:
                ProductCard it6 = (ProductCard) obj;
                Intrinsics.h(it6, "it");
                break;
            case 17:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 18:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 19:
                SemanticsPropertyReceiver semantics6 = (SemanticsPropertyReceiver) obj;
                int i2 = RatingSubmissionKt.b;
                Intrinsics.h(semantics6, "$this$semantics");
                SemanticsPropertiesKt.u(semantics6);
                break;
            case 20:
                SemanticsPropertyReceiver semantics7 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics7, "$this$semantics");
                SemanticsPropertiesKt.g(semantics7);
                break;
            case 21:
                SemanticsPropertyReceiver semantics8 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics8, "$this$semantics");
                SemanticsPropertiesKt.g(semantics8);
                break;
            case 22:
                SemanticsPropertyReceiver semantics9 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics9, "$this$semantics");
                SemanticsPropertiesKt.g(semantics9);
                break;
            case 23:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 24:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 25:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 26:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 27:
                SemanticsPropertyReceiver semantics10 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics10, "$this$semantics");
                SemanticsPropertiesKt.g(semantics10);
                break;
            case 28:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            default:
                SemanticsPropertyReceiver semantics11 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics11, "$this$semantics");
                SemanticsPropertiesKt.g(semantics11);
                break;
        }
        return unit;
    }
}
