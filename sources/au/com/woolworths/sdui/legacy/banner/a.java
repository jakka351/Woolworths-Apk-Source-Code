package au.com.woolworths.sdui.legacy.banner;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ InsetBanner f;

    public /* synthetic */ a(Function1 function1, InsetBanner insetBanner, int i) {
        this.d = i;
        this.e = function1;
        this.f = insetBanner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f);
                break;
            default:
                this.e.invoke(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
