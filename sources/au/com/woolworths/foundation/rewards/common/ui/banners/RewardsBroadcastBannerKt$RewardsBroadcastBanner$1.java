package au.com.woolworths.foundation.rewards.common.ui.banners;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import au.com.woolworths.foundation.rewards.common.ui.banners.data.ElevationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RewardsBroadcastBannerKt$RewardsBroadcastBanner$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.foundation.rewards.common.ui.banners.RewardsBroadcastBannerKt$RewardsBroadcastBanner$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ColumnScope Card = (ColumnScope) obj;
            Composer composer = (Composer) obj2;
            int iIntValue = ((Number) obj3).intValue();
            Intrinsics.h(Card, "$this$Card");
            if ((iIntValue & 17) != 16 || !composer.c()) {
                throw null;
            }
            composer.j();
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.foundation.rewards.common.ui.banners.RewardsBroadcastBannerKt$RewardsBroadcastBanner$1$2, reason: invalid class name */
    final class AnonymousClass2 implements Function3<ColumnScope, Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ColumnScope Card = (ColumnScope) obj;
            Composer composer = (Composer) obj2;
            int iIntValue = ((Number) obj3).intValue();
            Intrinsics.h(Card, "$this$Card");
            if ((iIntValue & 17) != 16 || !composer.c()) {
                throw null;
            }
            composer.j();
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ElevationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ElevationType[] elevationTypeArr = ElevationType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        throw null;
    }
}
