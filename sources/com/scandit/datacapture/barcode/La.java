package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class La extends Ja {
    private final Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public La(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.c = context;
    }

    public final void b(boolean z) {
        a(Ka.a(this.c, z));
    }
}
