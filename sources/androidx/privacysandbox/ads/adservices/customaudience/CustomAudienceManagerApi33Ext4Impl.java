package androidx.privacysandbox.ads.adservices.customaudience;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerApi33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RequiresExtension
@RestrictTo
/* loaded from: classes2.dex */
public final class CustomAudienceManagerApi33Ext4Impl extends CustomAudienceManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public CustomAudienceManagerApi33Ext4Impl(@NotNull Context context) {
        Intrinsics.h(context, "context");
        Object systemService = context.getSystemService((Class<Object>) androidx.privacysandbox.ads.adservices.adselection.a.w());
        Intrinsics.g(systemService, "context.getSystemService…ger::class.java\n        )");
        super(androidx.privacysandbox.ads.adservices.adselection.a.j(systemService));
    }
}
