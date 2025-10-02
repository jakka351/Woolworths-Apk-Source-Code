package com.adobe.marketing.mobile.services.ui.message.views;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.LayoutCoordinates;
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
final class MessageFrameKt$MessageFrame$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            LayoutCoordinates it = (LayoutCoordinates) obj;
            Intrinsics.h(it, "it");
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        ((Number) obj3).intValue();
        Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
        FillElement fillElement = SizeKt.f977a;
        throw null;
    }
}
