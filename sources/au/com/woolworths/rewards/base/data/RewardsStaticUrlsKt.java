package au.com.woolworths.rewards.base.data;

import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.a;
import au.com.woolworths.rewards.base.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"parseRewardsStaticUrls", "Lau/com/woolworths/rewards/base/data/RewardsStaticUrls;", "jsonString", "", "base-rewards-app_release", "json", "Lkotlinx/serialization/json/Json;"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsStaticUrlsKt {
    @Nullable
    public static final RewardsStaticUrls parseRewardsStaticUrls(@NotNull String jsonString) {
        Intrinsics.h(jsonString, "jsonString");
        Lazy lazyB = LazyKt.b(new d(2));
        try {
            if (jsonString.length() == 0) {
                return null;
            }
            Json rewardsStaticUrls$lambda$2 = parseRewardsStaticUrls$lambda$2(lazyB);
            rewardsStaticUrls$lambda$2.getClass();
            return (RewardsStaticUrls) rewardsStaticUrls$lambda$2.b(RewardsStaticUrls.INSTANCE.serializer(), jsonString);
        } catch (SerializationException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.f), e, "Invalid json format for rewards static urls ".concat(jsonString), 8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Json parseRewardsStaticUrls$lambda$1() {
        return JsonKt.a(new a(26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit parseRewardsStaticUrls$lambda$1$lambda$0(JsonBuilder Json) {
        Intrinsics.h(Json, "$this$Json");
        Json.b = true;
        return Unit.f24250a;
    }

    private static final Json parseRewardsStaticUrls$lambda$2(Lazy<? extends Json> lazy) {
        return (Json) lazy.getD();
    }
}
