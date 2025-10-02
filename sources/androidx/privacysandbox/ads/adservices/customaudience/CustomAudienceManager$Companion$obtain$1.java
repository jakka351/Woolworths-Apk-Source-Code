package androidx.privacysandbox.ads.adservices.customaudience;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerApi31Ext9Impl;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CustomAudienceManager$Companion$obtain$1 extends Lambda implements Function1<Context, CustomAudienceManagerApi31Ext9Impl> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        return new CustomAudienceManagerApi31Ext9Impl(null);
    }
}
