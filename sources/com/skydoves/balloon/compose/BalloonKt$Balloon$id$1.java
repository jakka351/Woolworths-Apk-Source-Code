package com.skydoves.balloon.compose;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BalloonKt$Balloon$id$1 extends Lambda implements Function0<UUID> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return UUID.randomUUID();
    }
}
