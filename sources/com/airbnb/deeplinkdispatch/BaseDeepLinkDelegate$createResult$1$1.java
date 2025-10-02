package com.airbnb.deeplinkdispatch;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "key", "", "<anonymous parameter 1>", "", "invoke", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BaseDeepLinkDelegate$createResult$1$1 extends Lambda implements Function2<String, Object, Boolean> {
    public final /* synthetic */ Intent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDeepLinkDelegate$createResult$1$1(Intent intent) {
        super(2);
        this.h = intent;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String key = (String) obj;
        Intrinsics.h(key, "key");
        Bundle extras = this.h.getExtras();
        boolean z = false;
        if (extras != null && extras.containsKey(key)) {
            z = true;
        }
        return Boolean.valueOf(!z);
    }
}
