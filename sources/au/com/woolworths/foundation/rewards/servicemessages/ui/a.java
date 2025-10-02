package au.com.woolworths.foundation.rewards.servicemessages.ui;

import android.content.Context;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ String f;

    public /* synthetic */ a(Context context, String str, int i) {
        this.d = i;
        this.e = context;
        this.f = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ContextExtKt.e(this.e, this.f);
                break;
            default:
                ContextExtKt.e(this.e, this.f);
                break;
        }
        return Unit.f24250a;
    }
}
