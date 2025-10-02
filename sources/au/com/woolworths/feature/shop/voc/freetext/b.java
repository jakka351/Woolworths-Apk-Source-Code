package au.com.woolworths.feature.shop.voc.freetext;

import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            default:
                int i2 = VocFreeTextActivity.y;
                VocFreeTextViewModel vocFreeTextViewModelO4 = ((VocFreeTextActivity) obj).O4();
                BuildersKt.c(ViewModelKt.a(vocFreeTextViewModelO4), null, null, new VocFreeTextViewModel$sendFreeText$1(vocFreeTextViewModelO4, null), 3);
                break;
        }
        return unit;
    }
}
