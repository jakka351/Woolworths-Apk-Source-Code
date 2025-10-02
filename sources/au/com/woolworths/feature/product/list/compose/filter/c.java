package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnnotatedString e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ c(AnnotatedString annotatedString, Function0 function0, int i) {
        this.d = i;
        this.e = annotatedString;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                if (((AnnotatedString.Range) CollectionsKt.F(this.e.b(iIntValue, iIntValue))) != null) {
                    this.f.invoke();
                }
                break;
            default:
                if (((AnnotatedString.Range) CollectionsKt.F(this.e.b(iIntValue, iIntValue))) != null) {
                    this.f.invoke();
                }
                break;
        }
        return Unit.f24250a;
    }
}
