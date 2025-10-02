package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes4.dex */
public class UnaryExpression<A> implements Evaluable {

    /* renamed from: a, reason: collision with root package name */
    public final OperandMustacheToken f13228a;
    public final String b;

    public UnaryExpression(OperandMustacheToken operandMustacheToken, String str) {
        this.f13228a = operandMustacheToken;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return com.adobe.marketing.mobile.rulesengine.RulesResult.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        return new com.adobe.marketing.mobile.rulesengine.RulesResult();
     */
    @Override // com.adobe.marketing.mobile.rulesengine.Evaluable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.adobe.marketing.mobile.rulesengine.RulesResult a(com.adobe.marketing.mobile.rulesengine.Context r4) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            r3 = this;
            com.adobe.marketing.mobile.rulesengine.OperandMustacheToken r0 = r3.f13228a
            java.lang.Object r4 = r0.a(r4)
            java.lang.String r0 = r3.b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1d
            com.adobe.marketing.mobile.rulesengine.RulesResult r1 = new com.adobe.marketing.mobile.rulesengine.RulesResult
            java.lang.String r2 = "Evaluating %s %s returned false"
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r0}
            java.lang.String.format(r2, r4)
            r1.<init>()
            return r1
        L1d:
            java.lang.String r1 = "exists"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L36
            java.lang.String r1 = "notExist"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L33
            com.adobe.marketing.mobile.rulesengine.RulesResult r4 = new com.adobe.marketing.mobile.rulesengine.RulesResult
            r4.<init>()
            return r4
        L33:
            if (r4 != 0) goto L3b
            goto L38
        L36:
            if (r4 == 0) goto L3b
        L38:
            com.adobe.marketing.mobile.rulesengine.RulesResult r4 = com.adobe.marketing.mobile.rulesengine.RulesResult.b
            return r4
        L3b:
            com.adobe.marketing.mobile.rulesengine.RulesResult r4 = new com.adobe.marketing.mobile.rulesengine.RulesResult
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.rulesengine.UnaryExpression.a(com.adobe.marketing.mobile.rulesengine.Context):com.adobe.marketing.mobile.rulesengine.RulesResult");
    }
}
