package com.adobe.marketing.mobile.internal.eventhub;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class EventHubKt$filterRemove$1 extends Lambda implements Function1<Object, Boolean> {
    public final /* synthetic */ Lambda h;
    public final /* synthetic */ ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EventHubKt$filterRemove$1(ArrayList arrayList, Function1 function1) {
        super(1);
        this.h = (Lambda) function1;
        this.i = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        if (((Boolean) this.h.invoke(obj)).booleanValue()) {
            this.i.add(obj);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
