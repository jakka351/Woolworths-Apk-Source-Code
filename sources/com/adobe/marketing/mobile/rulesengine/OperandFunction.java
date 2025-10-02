package com.adobe.marketing.mobile.rulesengine;

import au.com.woolworths.product.details.epoxy.a;
import com.adobe.marketing.mobile.launch.rulesengine.HistoricalEventsQueryingKt;
import com.adobe.marketing.mobile.launch.rulesengine.json.HistoricalCondition;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class OperandFunction<T> implements Operand<T> {

    /* renamed from: a, reason: collision with root package name */
    public final a f13216a;
    public final Object[] b;

    public OperandFunction(a aVar, Object... objArr) {
        this.f13216a = aVar;
        this.b = objArr;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Operand
    public final Object a(Context context) {
        Object[] objArr = this.b;
        HistoricalCondition historicalCondition = (HistoricalCondition) this.f13216a.e;
        int iA = 0;
        try {
            Object obj = objArr[0];
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<com.adobe.marketing.mobile.EventHistoryRequest>");
            Object obj2 = objArr[1];
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.String");
            iA = HistoricalEventsQueryingKt.a((List) obj, (String) obj2, historicalCondition.b);
        } catch (Exception unused) {
        }
        return Integer.valueOf(iA);
    }
}
