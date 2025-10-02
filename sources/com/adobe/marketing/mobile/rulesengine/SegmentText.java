package com.adobe.marketing.mobile.rulesengine;

import com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder;

/* loaded from: classes4.dex */
public class SegmentText implements Segment {

    /* renamed from: a, reason: collision with root package name */
    public final String f13222a;

    public SegmentText(String str) {
        this.f13222a = str;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Segment
    public final String a(LaunchTokenFinder launchTokenFinder, Transformer transformer) {
        return this.f13222a;
    }
}
