package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutofillApi26Helper {
    public static int a(ViewStructure viewStructure) {
        return viewStructure.addChildCount(1);
    }

    public static AutofillValue b(String str) {
        return AutofillValue.forText(str);
    }

    public static boolean c(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public static boolean d(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public static boolean e(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public static boolean f(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public static ViewStructure g(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    public static CharSequence h(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
