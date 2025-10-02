package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerApi31Ext11Impl;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RequiresExtension
@RestrictTo
/* loaded from: classes2.dex */
public final class TopicsManagerApi31Ext11Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi31Ext11Impl(@NotNull Context context) {
        Intrinsics.h(context, "context");
        android.adservices.topics.TopicsManager topicsManager = android.adservices.topics.TopicsManager.get(context);
        Intrinsics.g(topicsManager, "get(context)");
        super(topicsManager);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public final android.adservices.topics.GetTopicsRequest b(GetTopicsRequest request) {
        Intrinsics.h(request, "request");
        return GetTopicsRequestHelper.a(request);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public final GetTopicsResponse c(android.adservices.topics.GetTopicsResponse response) {
        Intrinsics.h(response, "response");
        return GetTopicsResponseHelper.a(response);
    }
}
