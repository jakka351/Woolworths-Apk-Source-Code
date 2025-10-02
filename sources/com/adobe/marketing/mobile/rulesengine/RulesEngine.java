package com.adobe.marketing.mobile.rulesengine;

import com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder;
import com.adobe.marketing.mobile.rulesengine.Rule;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class RulesEngine<T extends Rule> {
    public final ConditionEvaluator b;
    public final Transformer c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f13220a = new Object();
    public ArrayList d = new ArrayList();

    public RulesEngine(ConditionEvaluator conditionEvaluator, Transformer transformer) {
        this.b = conditionEvaluator;
        this.c = transformer;
    }

    public final ArrayList a(LaunchTokenFinder launchTokenFinder) {
        ArrayList arrayList;
        synchronized (this.f13220a) {
            try {
                Context context = new Context(launchTokenFinder, this.b, this.c);
                arrayList = new ArrayList();
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    Rule rule = (Rule) it.next();
                    if (rule.a().a(context).a()) {
                        arrayList.add(rule);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }
}
