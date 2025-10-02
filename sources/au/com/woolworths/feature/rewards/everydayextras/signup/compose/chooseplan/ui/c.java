package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.extensions.IntExtKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import com.google.pay.button.ButtonTheme;
import com.google.pay.button.ButtonType;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c(ButtonType buttonType, int i, String str, Function1 function1, MutableState mutableState) {
        ButtonTheme buttonTheme = ButtonTheme.d;
        this.g = buttonType;
        this.e = i;
        this.f = str;
        this.h = function1;
        this.i = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence text;
        Text text2;
        int i = this.d;
        Object objA = Unit.f24250a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        String str = this.f;
        int i2 = this.e;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                String str2 = (String) obj4;
                BrandLabel brandLabel = (BrandLabel) obj3;
                Context context = (Context) obj2;
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                int i3 = SubscribePlanItemUiKt.b;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                String strC = IntExtKt.c(i2);
                if (brandLabel == null || (text2 = brandLabel.getText()) == null || (text = text2.getText(context)) == null) {
                    text = "";
                }
                SemanticsPropertiesKt.k(clearAndSetSemantics, str + "\n" + strC + "\n" + str2 + "\n" + ((Object) text));
                return objA;
            default:
                ButtonTheme buttonTheme = ButtonTheme.d;
                ButtonType buttonType = (ButtonType) obj4;
                Function1 function1 = (Function1) obj3;
                MutableState mutableState = (MutableState) obj2;
                Context context2 = (Context) obj;
                Intrinsics.h(context2, "context");
                PayButton payButton = new PayButton(context2);
                try {
                    payButton.initialize(ButtonOptions.newBuilder().setButtonTheme(1).setButtonType(buttonType.d).setCornerRadius(i2).setAllowedPaymentMethods(str).build());
                } catch (Throwable th) {
                    objA = ResultKt.a(th);
                }
                Throwable thA = Result.a(objA);
                if (thA != null) {
                    function1.invoke(thA);
                    mutableState.setValue(Boolean.TRUE);
                }
                return payButton;
        }
    }

    public /* synthetic */ c(String str, int i, String str2, BrandLabel brandLabel, Context context) {
        this.f = str;
        this.e = i;
        this.g = str2;
        this.h = brandLabel;
        this.i = context;
    }
}
