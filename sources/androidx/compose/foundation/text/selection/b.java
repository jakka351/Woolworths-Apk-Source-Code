package androidx.compose.foundation.text.selection;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ b(int i, Function2 function2) {
        this.d = i;
        this.e = function2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.d;
        Function2 function2 = this.e;
        switch (i) {
            case 0:
                int i2 = SelectionRegistrarImpl.f;
                break;
            default:
                Comparator[] comparatorArr = AndroidComposeViewAccessibilityDelegateCompat_androidKt.f1941a;
                break;
        }
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }
}
