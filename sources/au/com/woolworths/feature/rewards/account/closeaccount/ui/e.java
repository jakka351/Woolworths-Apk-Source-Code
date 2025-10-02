package au.com.woolworths.feature.rewards.account.closeaccount.ui;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ ContentCta f;

    public /* synthetic */ e(Function1 function1, ContentCta contentCta, int i) {
        this.d = i;
        this.e = function1;
        this.f = contentCta;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ContentCta contentCta = this.f;
        Function1 function1 = this.e;
        switch (i) {
            case 0:
                DeleteAccount deleteAccount = ConsentPageUiKt.f5695a;
                function1.invoke(contentCta);
                break;
            case 1:
                function1.invoke(contentCta);
                break;
            case 2:
                function1.invoke(contentCta);
                break;
            case 3:
                function1.invoke(contentCta);
                break;
            default:
                function1.invoke(contentCta);
                break;
        }
        return unit;
    }
}
