package com.airbnb.epoxy.preload;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003\"\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u0005\"\b\b\u0002\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\n¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/airbnb/epoxy/EpoxyModel;", "U", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "P", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "context", "Landroid/content/Context;", "err", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PreloaderExtensionsKt$addEpoxyPreloader$1 extends Lambda implements Function2<Context, RuntimeException, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        RuntimeException err = (RuntimeException) obj2;
        Intrinsics.h(context, "context");
        Intrinsics.h(err, "err");
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return Unit.f24250a;
        }
        throw err;
    }
}
