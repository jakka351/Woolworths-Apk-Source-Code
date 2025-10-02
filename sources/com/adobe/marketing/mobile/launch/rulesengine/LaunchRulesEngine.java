package com.adobe.marketing.mobile.launch.rulesengine;

import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.rulesengine.ConditionEvaluator;
import com.adobe.marketing.mobile.rulesengine.RulesEngine;
import com.adobe.marketing.mobile.util.StringUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class LaunchRulesEngine {

    /* renamed from: a, reason: collision with root package name */
    public final String f13198a;
    public final RulesEngine b;
    public final ExtensionApi c;
    public final LaunchRulesConsequence d;
    public final ArrayList e;
    public boolean f;

    public LaunchRulesEngine(ExtensionApi extensionApi) {
        RulesEngine rulesEngine = new RulesEngine(new ConditionEvaluator(), LaunchRuleTransformer.a());
        LaunchRulesConsequence launchRulesConsequence = new LaunchRulesConsequence(extensionApi);
        this.e = new ArrayList();
        this.f = false;
        if (StringUtils.a("Configuration")) {
            throw new IllegalArgumentException("LaunchRulesEngine cannot have a null/empty name");
        }
        this.f13198a = "Configuration";
        this.d = launchRulesConsequence;
        this.c = extensionApi;
        this.b = rulesEngine;
    }
}
