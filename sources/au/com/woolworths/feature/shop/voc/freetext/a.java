package au.com.woolworths.feature.shop.voc.freetext;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                int i2 = VocFreeTextActivity.y;
                ((VocFreeTextActivity) obj2).O4().p6(it);
                break;
            default:
                KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
                Intrinsics.h(KeyboardActions, "$this$KeyboardActions");
                ((Function0) obj2).invoke();
                break;
        }
        return unit;
    }
}
