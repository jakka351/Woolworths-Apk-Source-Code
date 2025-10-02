package au.com.woolworths.feature.rewards.account.preferences;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ f(String str, String str2, int i) {
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(semantics, "$this$semantics");
                String str = this.e;
                if (str == null) {
                    str = this.f;
                }
                SemanticsPropertiesKt.k(semantics, str);
                break;
            case 1:
                Intrinsics.h(semantics, "$this$semantics");
                String str2 = this.e;
                if (str2 == null) {
                    str2 = this.f;
                }
                SemanticsPropertiesKt.k(semantics, str2);
                break;
            case 2:
                Intrinsics.h(semantics, "$this$semantics");
                String str3 = this.e;
                if (str3 != null) {
                    SemanticsPropertiesKt.k(semantics, str3);
                }
                String str4 = this.f;
                if (str4 != null) {
                    SemanticsPropertiesKt.t(semantics, str4);
                }
                return Unit.f24250a;
            case 3:
                Intrinsics.h(semantics, "$this$semantics");
                String str5 = this.e;
                if (str5 == null) {
                    str5 = this.f;
                }
                SemanticsPropertiesKt.k(semantics, str5);
                break;
            case 4:
                Intrinsics.h(semantics, "$this$semantics");
                String str6 = this.e;
                if (str6 == null) {
                    str6 = this.f;
                }
                SemanticsPropertiesKt.k(semantics, str6);
                break;
            default:
                Intrinsics.h(semantics, "$this$clearAndSetSemantics");
                String str7 = this.e;
                if (str7 == null) {
                    str7 = this.f;
                }
                SemanticsPropertiesKt.k(semantics, str7);
                break;
        }
        return Unit.f24250a;
    }
}
