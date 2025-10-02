package au.com.woolworths.feature.shop.voc.score;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.voc.VocRepository;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocInteractor;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VocInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final VocDeviceInfoInteractor f8236a;
    public final CollectionModeInteractor b;
    public final VocRepository c;

    public VocInteractor(VocDeviceInfoInteractor vocDeviceInfoInteractor, CollectionModeInteractor collectionModeInteractor, VocRepository vocRepository) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f8236a = vocDeviceInfoInteractor;
        this.b = collectionModeInteractor;
        this.c = vocRepository;
    }

    public static void b(Exception exc, String str) {
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.c(new ReportOwner(ReportOwner.Squad.m), exc, "Could not send VoC score for surveyId: " + str, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Exception {
        /*
            r12 = this;
            boolean r0 = r13 instanceof au.com.woolworths.feature.shop.voc.score.VocInteractor$getSurveyQuestion$1
            if (r0 == 0) goto L13
            r0 = r13
            au.com.woolworths.feature.shop.voc.score.VocInteractor$getSurveyQuestion$1 r0 = (au.com.woolworths.feature.shop.voc.score.VocInteractor$getSurveyQuestion$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.voc.score.VocInteractor$getSurveyQuestion$1 r0 = new au.com.woolworths.feature.shop.voc.score.VocInteractor$getSurveyQuestion$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L64
            goto L4b
        L28:
            r0 = move-exception
            r13 = r0
            goto L54
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L33:
            kotlin.ResultKt.b(r13)
            au.com.woolworths.feature.shop.voc.VocRepository r13 = r12.c     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L64
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r2 = r12.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L64
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r2 = r2.w()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L64
            au.com.woolworths.shop.graphql.type.ShoppingModeType r2 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r2)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L64
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L64
            java.lang.Object r13 = r13.a(r2, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L64
            if (r13 != r1) goto L4b
            return r1
        L4b:
            com.woolworths.CheckoutSurveyQuery$CheckoutSurvey r13 = (com.woolworths.CheckoutSurveyQuery.CheckoutSurvey) r13     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L64
            if (r13 == 0) goto L64
            au.com.woolworths.feature.shop.voc.data.SurveyData r13 = au.com.woolworths.feature.shop.voc.CheckoutSurveyQueryCheckoutSurveyExtKt.a(r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L64
            goto L65
        L54:
            au.com.woolworths.foundation.bark.Bark$Companion r0 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r0 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.m
            au.com.woolworths.foundation.bark.common.ReportOwner r1 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r1.<init>(r0)
            java.lang.String r0 = "ServerError while getting survey"
            r2 = 8
            au.com.woolworths.foundation.bark.Bark.Barker.c(r1, r13, r0, r2)
        L64:
            r13 = r4
        L65:
            if (r13 == 0) goto L8d
            java.util.List r0 = r13.e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r0.next()
            r3 = r2
            au.com.woolworths.feature.shop.voc.data.SurveyQuestion r3 = (au.com.woolworths.feature.shop.voc.data.SurveyQuestion) r3
            au.com.woolworths.feature.shop.voc.data.SurveyQuestionType r3 = r3.c
            boolean r3 = r3.d
            if (r3 == 0) goto L74
            r1.add(r2)
            goto L74
        L8b:
            r10 = r1
            goto L90
        L8d:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.d
            goto L8b
        L90:
            if (r13 == 0) goto La2
            java.lang.String r6 = r13.f8221a
            java.lang.String r7 = r13.b
            java.lang.String r8 = r13.c
            java.lang.String r9 = r13.d
            au.com.woolworths.feature.shop.voc.data.VocSurveyData r11 = r13.f
            au.com.woolworths.feature.shop.voc.data.SurveyData r5 = new au.com.woolworths.feature.shop.voc.data.SurveyData
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4 = r5
        La2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:46)|(1:(1:(4:13|14|43|44)(2:20|21))(4:22|47|23|24))(4:29|30|(1:33)|36)|49|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (r1.b(r9, r3, r4, (au.com.woolworths.shop.graphql.type.DeviceInfo) r11, r6) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        r7 = r10;
        r10 = r0;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        r7 = r10;
        r10 = r0;
        r9 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(au.com.woolworths.feature.shop.voc.data.SurveySubmitData r9, int r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocInteractor.c(au.com.woolworths.feature.shop.voc.data.SurveySubmitData, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
