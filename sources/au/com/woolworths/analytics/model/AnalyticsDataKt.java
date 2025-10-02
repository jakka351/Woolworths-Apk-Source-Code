package au.com.woolworths.analytics.model;

import androidx.camera.core.impl.b;
import androidx.navigation.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.EventKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnalyticsDataKt {
    public static final Event a(final AnalyticsData analyticsData) {
        Intrinsics.h(analyticsData, "<this>");
        return b(new Event() { // from class: au.com.woolworths.analytics.model.AnalyticsDataKt$getEvent$1
            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                AnalyticsData analyticsData2 = analyticsData;
                String tealiumEvent = analyticsData2.getTealiumEvent();
                return tealiumEvent == null ? b.o(analyticsData2.getEventCategory(), "_", analyticsData2.getEventAction()) : tealiumEvent;
            }

            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return EmptyMap.d;
            }
        }, analyticsData);
    }

    public static final Event b(Event event, AnalyticsData analyticsData) {
        EventConfig eventConfig;
        Intrinsics.h(event, "<this>");
        au.com.woolworths.analytics.EventConfig eventConfig2 = null;
        String tealiumEvent = analyticsData != null ? analyticsData.getTealiumEvent() : null;
        Map mapD = analyticsData != null ? d(analyticsData) : null;
        if (analyticsData != null && (eventConfig = analyticsData.getEventConfig()) != null) {
            Boolean boolA = eventConfig.getForceBundle();
            eventConfig2 = new au.com.woolworths.analytics.EventConfig(boolA != null ? boolA.booleanValue() : false);
        }
        return EventKt.a(event, tealiumEvent, mapD, eventConfig2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 au.com.woolworths.analytics.model.AnalyticsData, still in use, count: 4, list:
          (r2v0 au.com.woolworths.analytics.model.AnalyticsData) from 0x016f: MOVE (r18v0 au.com.woolworths.analytics.model.AnalyticsData) = (r2v0 au.com.woolworths.analytics.model.AnalyticsData)
          (r2v0 au.com.woolworths.analytics.model.AnalyticsData) from 0x00d0: PHI (r2v17 au.com.woolworths.analytics.model.AnalyticsData) = (r2v0 au.com.woolworths.analytics.model.AnalyticsData), (r2v22 au.com.woolworths.analytics.model.AnalyticsData) binds: [B:45:0x00bf, B:72:0x015d] A[DONT_GENERATE, DONT_INLINE]
          (r2v0 au.com.woolworths.analytics.model.AnalyticsData) from 0x0080: MOVE (r18v5 au.com.woolworths.analytics.model.AnalyticsData) = (r2v0 au.com.woolworths.analytics.model.AnalyticsData)
          (r2v0 au.com.woolworths.analytics.model.AnalyticsData) from 0x007a: MOVE (r18v6 au.com.woolworths.analytics.model.AnalyticsData) = (r2v0 au.com.woolworths.analytics.model.AnalyticsData)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
    public static final au.com.woolworths.analytics.model.AnalyticsData c(au.com.woolworths.analytics.model.AnalyticsData r19, au.com.woolworths.analytics.model.AnalyticsData r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.analytics.model.AnalyticsDataKt.c(au.com.woolworths.analytics.model.AnalyticsData, au.com.woolworths.analytics.model.AnalyticsData, boolean):au.com.woolworths.analytics.model.AnalyticsData");
    }

    public static final Map d(AnalyticsData analyticsData) {
        Sequence sequenceN;
        Intrinsics.h(analyticsData, "<this>");
        FilteringSequence filteringSequenceG = SequencesKt.g(ArraysKt.g(new Pair[]{new Pair("app.Section", analyticsData.getAppSection()), new Pair("screen.Name", analyticsData.getScreenName()), new Pair("screen.Type", analyticsData.getScreenType()), new Pair("event.Category", analyticsData.getEventCategory()), new Pair("event.Label", analyticsData.getEventLabel()), new Pair("event.Value", analyticsData.getEventValue()), new Pair("event.Description", analyticsData.getEventDescription()), new Pair("event.Action", analyticsData.getEventAction())}), new a(17));
        List extraContent = analyticsData.getExtraContent();
        if (extraContent != null) {
            List<AnalyticsExtraContent> list = extraContent;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (AnalyticsExtraContent analyticsExtraContent : list) {
                arrayList.add(analyticsExtraContent.getValue() != null ? new Pair(analyticsExtraContent.getKey(), analyticsExtraContent.getValue()) : new Pair(analyticsExtraContent.getKey(), analyticsExtraContent.getValues()));
            }
            sequenceN = CollectionsKt.n(arrayList);
        } else {
            sequenceN = EmptySequence.f24658a;
        }
        return MapsKt.r(SequencesKt.v(filteringSequenceG, sequenceN));
    }

    public static final AnalyticsData e(String str, AnalyticsData analyticsData) {
        ArrayList arrayList;
        List extraContent = analyticsData.getExtraContent();
        if (extraContent != null) {
            List<AnalyticsExtraContent> list = extraContent;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
            for (AnalyticsExtraContent analyticsExtraContent : list) {
                if (Intrinsics.c(analyticsExtraContent.getKey(), "product.Quantity")) {
                    analyticsExtraContent = new AnalyticsExtraContent(analyticsExtraContent.getKey(), str, null);
                }
                arrayList2.add(analyticsExtraContent);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return AnalyticsData.a(analyticsData, null, null, null, arrayList, 1023);
    }
}
