package com.skydoves.balloon.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BalloonKt$Balloon$balloonComposeView$1$1$1 extends Lambda implements Function3<BalloonComposeView, Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.skydoves.balloon.compose.BalloonKt$Balloon$balloonComposeView$1$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
            Intrinsics.h(semantics, "$this$semantics");
            SemanticsPropertyKey semanticsPropertyKey = BalloonSemanticsKt.f19020a;
            Unit unit = Unit.f24250a;
            semantics.b(semanticsPropertyKey, unit);
            return unit;
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.skydoves.balloon.compose.BalloonKt$Balloon$balloonComposeView$1$1$1$2, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BalloonComposeView it = (BalloonComposeView) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        Intrinsics.h(it, "it");
        final MutableState mutableState = null;
        BalloonKt.a(SemanticsModifierKt.b(Modifier.Companion.d, false, AnonymousClass1.h), ComposableLambdaKt.b(composer, 1137041577, new Function2<Composer, Integer, Unit>() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$balloonComposeView$1$1$1.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj4, Object obj5) {
                Composer composer2 = (Composer) obj4;
                if ((((Number) obj5).intValue() & 11) == 2 && composer2.c()) {
                    composer2.j();
                } else {
                    Function2 function2 = (Function2) mutableState.getD();
                    if (function2 != null) {
                        function2.invoke(composer2, 0);
                    }
                }
                return Unit.f24250a;
            }
        }), composer, 48);
        return Unit.f24250a;
    }
}
