package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui;

import android.webkit.WebView;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt;
import au.com.woolworths.foundation.rewards.onboarding.ui.CoachMarkFrameKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
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
        switch (i) {
            case 0:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, str);
                break;
            case 1:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 2:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.k(semantics2, str);
                break;
            case 3:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                int i2 = PromotionPageKt.d;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.k(semantics3, str);
                break;
            case 4:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.k(semantics4, str);
                break;
            case 5:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.k(semantics5, str);
                break;
            case 6:
                SemanticsPropertyReceiver semantics6 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics6, "$this$semantics");
                SemanticsPropertiesKt.k(semantics6, str);
                break;
            case 7:
                SemanticsPropertyReceiver semantics7 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics7, "$this$semantics");
                SemanticsPropertiesKt.k(semantics7, str + ". Section heading");
                break;
            case 8:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics2, str);
                break;
            case 9:
                SemanticsPropertyReceiver clearAndSetSemantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics3, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics3, str);
                break;
            case 10:
                SemanticsPropertyReceiver semantics8 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics8, "$this$semantics");
                SemanticsPropertiesKt.t(semantics8, str);
                break;
            case 11:
                SemanticsPropertyReceiver semantics9 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics9, "$this$semantics");
                SemanticsPropertiesKt.k(semantics9, CollectionsKt.M(StringsKt.m(str), " ", null, null, null, 62));
                break;
            case 12:
                WebView webView = (WebView) obj;
                Intrinsics.h(webView, "webView");
                if (!Intrinsics.c(webView.getUrl(), str)) {
                    webView.loadUrl(str);
                    break;
                }
                break;
            case 13:
                SemanticsPropertyReceiver semantics10 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics10, "$this$semantics");
                SemanticsPropertiesKt.k(semantics10, str);
                break;
            case 14:
                SemanticsPropertyReceiver semantics11 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics11, "$this$semantics");
                SemanticsPropertiesKt.k(semantics11, str);
                break;
            case 15:
                SemanticsPropertyReceiver semantics12 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics12, "$this$semantics");
                SemanticsPropertiesKt.k(semantics12, str);
                break;
            case 16:
                SemanticsPropertyReceiver semantics13 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics13, "$this$semantics");
                SemanticsPropertiesKt.k(semantics13, str);
                break;
            case 17:
                SemanticsPropertyReceiver clearAndSetSemantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics4, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics4, str);
                break;
            case 18:
                SemanticsPropertyReceiver semantics14 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics14, "$this$semantics");
                SemanticsPropertiesKt.k(semantics14, str);
                break;
            case 19:
                SemanticsPropertyReceiver semantics15 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics15, "$this$semantics");
                SemanticsPropertiesKt.k(semantics15, str);
                break;
            case 20:
                SemanticsPropertyReceiver semantics16 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics16, "$this$semantics");
                SemanticsPropertiesKt.k(semantics16, str);
                break;
            case 21:
                SemanticsPropertyReceiver semantics17 = (SemanticsPropertyReceiver) obj;
                float f = CoachMarkFrameKt.f8637a;
                Intrinsics.h(semantics17, "$this$semantics");
                SemanticsPropertiesKt.k(semantics17, str);
                break;
            case 22:
                SemanticsPropertyReceiver semantics18 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics18, "$this$semantics");
                SemanticsPropertiesKt.k(semantics18, str);
                break;
            case 23:
                SemanticsPropertyReceiver semantics19 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics19, "$this$semantics");
                SemanticsPropertiesKt.k(semantics19, str);
                break;
            case 24:
                SemanticsPropertyReceiver semantics20 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics20, "$this$semantics");
                SemanticsPropertiesKt.k(semantics20, str);
                break;
            case 25:
                SemanticsPropertyReceiver semantics21 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics21, "$this$semantics");
                SemanticsPropertiesKt.k(semantics21, str);
                break;
            case 26:
                SemanticsPropertyReceiver clearAndSetSemantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics5, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics5, str);
                break;
            case 27:
                SemanticsPropertyReceiver clearAndSetSemantics6 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics6, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics6, str);
                break;
            case 28:
                SemanticsPropertyReceiver clearAndSetSemantics7 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics7, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics7, str);
                break;
            default:
                SemanticsPropertyReceiver semantics22 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics22, "$this$semantics");
                SemanticsPropertiesKt.k(semantics22, str);
                break;
        }
        return unit;
    }
}
