package com.skydoves.balloon.internals;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"balloon_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewPropertyKt {
    public static final /* synthetic */ ViewPropertyDelegate a(final View view, Object obj) {
        return new ViewPropertyDelegate(obj, new Function0<Unit>() { // from class: com.skydoves.balloon.internals.ViewPropertyKt$viewProperty$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                view.invalidate();
                return Unit.f24250a;
            }
        });
    }
}
