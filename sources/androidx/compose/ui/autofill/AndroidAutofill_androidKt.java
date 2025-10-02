package androidx.compose.ui.autofill;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidAutofill_androidKt {
    public static final void a(AndroidAutofill androidAutofill, SparseArray sparseArray) {
        if (androidAutofill.b.f1730a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
            if (autofillValue.isText()) {
                AutofillTree autofillTree = androidAutofill.b;
                autofillValue.getTextValue().toString();
            } else {
                if (autofillValue.isDate()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValue.isList()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValue.isToggle()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(AndroidAutofill androidAutofill, ViewStructure viewStructure) {
        AutofillTree autofillTree = androidAutofill.b;
        if (autofillTree.f1730a.isEmpty()) {
            return;
        }
        int iAddChildCount = viewStructure.addChildCount(autofillTree.f1730a.size());
        Iterator it = autofillTree.f1730a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            AutofillNode autofillNode = (AutofillNode) entry.getValue();
            ViewStructure viewStructureNewChild = viewStructure.newChild(iAddChildCount);
            viewStructureNewChild.setAutofillId(androidAutofill.d, iIntValue);
            viewStructureNewChild.setId(iIntValue, androidAutofill.f1727a.getContext().getPackageName(), null, null);
            viewStructureNewChild.setAutofillType(1);
            autofillNode.getClass();
            throw null;
        }
    }
}
