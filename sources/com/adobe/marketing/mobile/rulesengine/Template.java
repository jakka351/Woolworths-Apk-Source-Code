package com.adobe.marketing.mobile.rulesengine;

import com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class Template {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13224a;

    public Template(String str, DelimiterPair delimiterPair) {
        this.f13224a = TemplateParser.a(str, delimiterPair);
    }

    public final String a(LaunchTokenFinder launchTokenFinder, Transformer transformer) {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f13224a.iterator();
        while (it.hasNext()) {
            sb.append(((Segment) it.next()).a(launchTokenFinder, transformer));
        }
        return sb.toString();
    }
}
