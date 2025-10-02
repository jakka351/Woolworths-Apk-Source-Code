package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.measurement.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerApi33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RequiresExtension
@RestrictTo
/* loaded from: classes2.dex */
public final class TopicsManagerApi33Ext4Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi33Ext4Impl(@NotNull Context context) {
        Intrinsics.h(context, "context");
        Object systemService = context.getSystemService((Class<Object>) a.p());
        Intrinsics.g(systemService, "context.getSystemService…opicsManager::class.java)");
        super(a.k(systemService));
    }
}
