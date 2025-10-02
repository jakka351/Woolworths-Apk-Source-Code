package com.adobe.marketing.mobile.rulesengine;

import com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder;

/* loaded from: classes.dex */
public class Context {

    /* renamed from: a, reason: collision with root package name */
    public final LaunchTokenFinder f13212a;
    public final ConditionEvaluator b;
    public final Transformer c;

    public Context(LaunchTokenFinder launchTokenFinder, ConditionEvaluator conditionEvaluator, Transformer transformer) {
        this.f13212a = launchTokenFinder;
        this.b = conditionEvaluator;
        this.c = transformer;
    }
}
