package com.dynatrace.android.agent.events.ragetap;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.events.ragetap.RageTapSegment;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.SimpleClassNameGenerator;
import com.dynatrace.android.ragetap.detection.RageTap;
import com.dynatrace.android.ragetap.detection.RageTapListener;

/* loaded from: classes.dex */
public class RageTapObserver implements RageTapListener {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleClassNameGenerator f14126a = new SimpleClassNameGenerator();

    @Override // com.dynatrace.android.ragetap.detection.RageTapListener
    public final void a(RageTap rageTap, boolean z) {
        if (Dynatrace.a()) {
            String str = AndroidMetrics.a().s;
            String strA = str == null ? null : this.f14126a.a(str);
            Session sessionB = Session.b(rageTap.a().f14175a.c, !z);
            int i = AdkSettings.l.c;
            long j = sessionB.f14113a;
            long j2 = rageTap.a().f14175a.c - j;
            long j3 = (rageTap.b().b.c - j2) - j;
            int andIncrement = Utility.b.getAndIncrement();
            RageTapSegment.Builder builder = new RageTapSegment.Builder();
            builder.b(strA);
            builder.i(sessionB);
            builder.h(i);
            builder.g(andIncrement);
            builder.c(j2);
            builder.e(j3);
            builder.f(rageTap.c());
            builder.d();
            RageTapSegment rageTapSegmentA = builder.a();
            Core.j.b();
            Core.f(rageTapSegmentA, 16);
        }
    }
}
