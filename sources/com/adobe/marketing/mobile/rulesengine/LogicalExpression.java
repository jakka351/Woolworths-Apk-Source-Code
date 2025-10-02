package com.adobe.marketing.mobile.rulesengine;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class LogicalExpression implements Evaluable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13214a;
    public final String b;

    public LogicalExpression(String str, ArrayList arrayList) {
        this.f13214a = arrayList;
        this.b = str;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Evaluable
    public final RulesResult a(Context context) {
        String str = this.b;
        if (str.isEmpty()) {
            return new RulesResult();
        }
        boolean zEquals = str.equals("or");
        ArrayList arrayList = this.f13214a;
        if (zEquals) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Evaluable evaluable = (Evaluable) it.next();
                if (evaluable == null || !evaluable.a(context).f13221a) {
                }
            }
            return new RulesResult();
        }
        if (!str.equals("and")) {
            return new RulesResult();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Evaluable evaluable2 = (Evaluable) it2.next();
            if (evaluable2 != null && !evaluable2.a(context).f13221a) {
                return new RulesResult();
            }
        }
        return RulesResult.b;
    }
}
