package androidx.navigation.fragment;

import android.webkit.WebView;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ d(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Pair it = (Pair) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                break;
            case 2:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, this.e);
                break;
            case 3:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                String str = this.e;
                if (str == null) {
                    str = "";
                }
                SemanticsPropertiesKt.k(clearAndSetSemantics, str);
                break;
            case 4:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                String str2 = this.e;
                if (str2 != null) {
                    SemanticsPropertiesKt.k(semantics2, str2);
                }
                break;
            case 5:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.k(semantics3, this.e);
                break;
            case 6:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.k(semantics4, this.e);
                break;
            case 7:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.k(semantics5, this.e);
                SemanticsPropertiesKt.r(semantics5, 0);
                break;
            case 8:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics2, this.e);
                break;
            case 9:
                SemanticsPropertyReceiver clearAndSetSemantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics3, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics3, this.e);
                break;
            case 10:
                SemanticsPropertyReceiver semantics6 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics6, "$this$semantics");
                SemanticsPropertiesKt.k(semantics6, this.e);
                break;
            case 11:
                SemanticsPropertyReceiver semantics7 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics7, "$this$semantics");
                SemanticsPropertiesKt.k(semantics7, this.e);
                break;
            case 12:
                SemanticsPropertyReceiver semantics8 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics8, "$this$semantics");
                SemanticsPropertiesKt.k(semantics8, this.e);
                break;
            case 13:
                SemanticsPropertyReceiver semantics9 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics9, "$this$semantics");
                SemanticsPropertiesKt.k(semantics9, this.e);
                break;
            case 14:
                SemanticsPropertyReceiver semantics10 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics10, "$this$semantics");
                SemanticsPropertiesKt.k(semantics10, this.e);
                break;
            case 15:
                SemanticsPropertyReceiver semantics11 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics11, "$this$semantics");
                SemanticsPropertiesKt.k(semantics11, this.e);
                break;
            case 16:
                SemanticsPropertyReceiver semantics12 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics12, "$this$semantics");
                SemanticsPropertiesKt.k(semantics12, this.e);
                SemanticsPropertiesKt.r(semantics12, 0);
                break;
            case 17:
                SemanticsPropertyReceiver clearAndSetSemantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics4, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics4, this.e);
                break;
            case 18:
                SemanticsPropertyReceiver clearAndSetSemantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics5, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics5, this.e);
                break;
            case 19:
                SemanticsPropertyReceiver semantics13 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics13, "$this$semantics");
                SemanticsPropertiesKt.k(semantics13, this.e);
                break;
            case 20:
                SemanticsPropertyReceiver semantics14 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics14, "$this$semantics");
                SemanticsPropertiesKt.k(semantics14, this.e);
                break;
            case 21:
                SemanticsPropertyReceiver semantics15 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics15, "$this$semantics");
                SemanticsPropertiesKt.k(semantics15, this.e);
                break;
            case 22:
                SemanticsPropertyReceiver semantics16 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics16, "$this$semantics");
                SemanticsPropertiesKt.k(semantics16, this.e);
                break;
            case 23:
                SemanticsPropertyReceiver semantics17 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics17, "$this$semantics");
                SemanticsPropertiesKt.k(semantics17, this.e);
                break;
            case 24:
                SemanticsPropertyReceiver semantics18 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics18, "$this$semantics");
                SemanticsPropertiesKt.k(semantics18, this.e);
                break;
            case 25:
                WebView webView = (WebView) obj;
                Intrinsics.h(webView, "webView");
                webView.loadUrl(this.e);
                break;
            case 26:
                List offers = (List) obj;
                Intrinsics.h(offers, "offers");
                break;
            case 27:
                SemanticsPropertyReceiver clearAndSetSemantics6 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics6, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics6, this.e);
                break;
            case 28:
                SemanticsPropertyReceiver clearAndSetSemantics7 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics7, "$this$clearAndSetSemantics");
                String str3 = this.e;
                if (str3 != null) {
                    SemanticsPropertiesKt.k(clearAndSetSemantics7, str3);
                }
                break;
            default:
                SemanticsPropertyReceiver clearAndSetSemantics8 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics8, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics8, this.e);
                break;
        }
        return Unit.f24250a;
    }
}
