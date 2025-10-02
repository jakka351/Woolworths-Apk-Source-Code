package com.adobe.marketing.mobile.services.ui.floatingbutton.views;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class FloatingButtonScreenKt$FloatingButtonScreen$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreenKt$FloatingButtonScreen$1$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function1<Offset, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            long j = ((Offset) obj).f1751a;
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        ((Number) obj3).intValue();
        Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
        int i = ((Configuration) ((Composer) obj2).x(AndroidCompositionLocals_androidKt.f1950a)).orientation;
        throw null;
    }
}
