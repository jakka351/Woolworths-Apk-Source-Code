package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.measurement.a;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresExtension.Container
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "a", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public class TopicsManagerImplCommon extends TopicsManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.adservices.topics.TopicsManager f3636a;

    public TopicsManagerImplCommon(android.adservices.topics.TopicsManager mTopicsManager) {
        Intrinsics.h(mTopicsManager, "mTopicsManager");
        this.f3636a = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RequiresPermission
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r5, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4 = r0.p
            kotlin.ResultKt.b(r6)
            goto L5e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.b(r5)
            r0.p = r4
            r0.s = r3
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r6.<init>(r3, r0)
            r6.o()
            android.adservices.topics.TopicsManager r0 = r4.f3636a
            androidx.arch.core.executor.a r2 = new androidx.arch.core.executor.a
            r3 = 2
            r2.<init>(r3)
            android.os.OutcomeReceiver r3 = androidx.core.os.OutcomeReceiverKt.a(r6)
            androidx.privacysandbox.ads.adservices.measurement.a.v(r0, r5, r2, r3)
            java.lang.Object r6 = r6.n()
            if (r6 != r1) goto L5e
            return r1
        L5e:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.measurement.a.h(r6)
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r4 = r4.c(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.d(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object a(@NotNull GetTopicsRequest getTopicsRequest, @NotNull Continuation<? super GetTopicsResponse> continuation) {
        return d(this, getTopicsRequest, continuation);
    }

    public android.adservices.topics.GetTopicsRequest b(GetTopicsRequest request) {
        Intrinsics.h(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = a.d().setAdsSdkName(MobileAds.ERROR_DOMAIN).build();
        Intrinsics.g(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public GetTopicsResponse c(android.adservices.topics.GetTopicsResponse response) {
        Intrinsics.h(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicI = a.i(it.next());
            arrayList.add(new Topic(topicI.getTaxonomyVersion(), topicI.getModelVersion(), topicI.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }
}
