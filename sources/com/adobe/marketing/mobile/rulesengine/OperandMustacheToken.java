package com.adobe.marketing.mobile.rulesengine;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public class OperandMustacheToken<T> implements Operand<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MustacheToken f13218a;
    public final Class b;

    public OperandMustacheToken(String str, Class cls) {
        ArrayList arrayListA = TemplateParser.a(str, TemplateParser.f13225a);
        this.f13218a = (arrayListA.size() <= 0 || !(arrayListA.get(0) instanceof SegmentToken)) ? null : ((SegmentToken) arrayListA.get(0)).f13223a;
        this.b = cls;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Operand
    public final Object a(Context context) throws ExecutionException, InterruptedException {
        MustacheToken mustacheToken = this.f13218a;
        if (mustacheToken == null) {
            return null;
        }
        try {
            return this.b.cast(mustacheToken.a(context.f13212a, context.c));
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
