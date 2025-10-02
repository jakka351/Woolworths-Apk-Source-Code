package com.adobe.marketing.mobile.rulesengine;

import com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public class SegmentToken implements Segment {

    /* renamed from: a, reason: collision with root package name */
    public final MustacheToken f13223a;

    public SegmentToken(String str) {
        this.f13223a = new MustacheToken(str);
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Segment
    public final String a(LaunchTokenFinder launchTokenFinder, Transformer transformer) throws ExecutionException, InterruptedException {
        Object objA = this.f13223a.a(launchTokenFinder, transformer);
        return objA != null ? objA.toString() : "";
    }
}
