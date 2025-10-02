package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ String f;

    public /* synthetic */ d(String str, Function1 function1) {
        this.d = 3;
        this.f = str;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f);
                break;
            case 1:
                this.e.invoke(this.f);
                break;
            case 2:
                this.e.invoke(this.f);
                break;
            case 3:
                String str = this.f;
                if (str != null) {
                    this.e.invoke(str);
                }
                return Unit.f24250a;
            default:
                this.e.invoke(this.f);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(Function1 function1, String str, int i) {
        this.d = i;
        this.e = function1;
        this.f = str;
    }
}
