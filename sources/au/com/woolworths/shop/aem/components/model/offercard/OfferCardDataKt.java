package au.com.woolworths.shop.aem.components.model.offercard;

import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OfferCardDataKt {
    public static final boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((OfferCardData) it.next()).f != null && (!StringsKt.D(r0))) {
                return true;
            }
        }
        return false;
    }

    public static final String b(ActionData actionData) {
        Intrinsics.h(actionData, "<this>");
        if (actionData.getType() == ActionType.e) {
            return actionData.getAction();
        }
        return null;
    }
}
