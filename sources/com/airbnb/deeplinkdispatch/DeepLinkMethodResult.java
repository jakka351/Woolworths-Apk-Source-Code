package com.airbnb.deeplinkdispatch;

import android.content.Intent;
import androidx.core.app.TaskStackBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;", "", "deeplinkdispatch_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeepLinkMethodResult {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f13291a;
    public final TaskStackBuilder b;

    public DeepLinkMethodResult(Intent intent, TaskStackBuilder taskStackBuilder) {
        this.f13291a = intent;
        this.b = taskStackBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkMethodResult)) {
            return false;
        }
        DeepLinkMethodResult deepLinkMethodResult = (DeepLinkMethodResult) obj;
        return Intrinsics.c(this.f13291a, deepLinkMethodResult.f13291a) && Intrinsics.c(this.b, deepLinkMethodResult.b);
    }

    public final int hashCode() {
        Intent intent = this.f13291a;
        int iHashCode = (intent == null ? 0 : intent.hashCode()) * 31;
        TaskStackBuilder taskStackBuilder = this.b;
        return iHashCode + (taskStackBuilder != null ? taskStackBuilder.hashCode() : 0);
    }

    public final String toString() {
        return "DeepLinkMethodResult(intent=" + this.f13291a + ", taskStackBuilder=" + this.b + ')';
    }
}
