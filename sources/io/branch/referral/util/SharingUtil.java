package io.branch.referral.util;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/branch/referral/util/SharingUtil;", "", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SharingUtil {
    public static final void a(String text) {
        Intrinsics.h(text, "text");
        Intrinsics.h(null, "activity");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", text);
        intent.putExtra("android.intent.extra.TITLE", (String) null);
        intent.putExtra("android.intent.extra.SUBJECT", (String) null);
        throw null;
    }
}
