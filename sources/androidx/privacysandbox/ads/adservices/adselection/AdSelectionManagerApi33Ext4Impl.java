package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.media3.datasource.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerApi33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RequiresExtension
@RestrictTo
/* loaded from: classes2.dex */
public final class AdSelectionManagerApi33Ext4Impl extends AdSelectionManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdSelectionManagerApi33Ext4Impl(@NotNull Context context) {
        Intrinsics.h(context, "context");
        Object systemService = context.getSystemService((Class<Object>) c.C());
        Intrinsics.g(systemService, "context.getSystemService…ctionManager::class.java)");
        super(c.l(systemService));
    }
}
