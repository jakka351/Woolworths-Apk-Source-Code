package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes4.dex */
public class OperandLiteral<T> implements Operand<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13217a;

    public OperandLiteral(Object obj) {
        this.f13217a = obj;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Operand
    public final Object a(Context context) {
        return this.f13217a;
    }
}
