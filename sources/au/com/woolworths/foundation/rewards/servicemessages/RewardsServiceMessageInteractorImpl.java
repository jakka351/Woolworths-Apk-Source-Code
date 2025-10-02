package au.com.woolworths.foundation.rewards.servicemessages;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.feature.shop.bundles.ui.a;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.OpenEndRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessageInteractorImpl;", "Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessageInteractor;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsServiceMessageInteractorImpl implements RewardsServiceMessageInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureToggleManager f8655a;
    public final RewardsAccountInteractor b;
    public final Lazy c;
    public final Lazy d;

    public RewardsServiceMessageInteractorImpl(FeatureToggleManager featureToggleManager, RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        this.f8655a = featureToggleManager;
        this.b = rewardsAccountInteractor;
        int i = 21;
        this.c = LazyKt.b(new a(i));
        this.d = LazyKt.b(new au.com.woolworths.feature.shop.myorders.details.infomodal.a(this, i));
    }

    public final RewardsServiceMessage a(RewardsServiceMessage.ScreenType screenType) {
        List listC = c((String) ((StateFlow) this.d.getD()).getValue());
        Object obj = null;
        if (listC == null) {
            return null;
        }
        Iterator it = listC.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            RewardsServiceMessage rewardsServiceMessage = (RewardsServiceMessage) next;
            OpenEndRange openEndRangeL = RangesKt.l(rewardsServiceMessage.g, rewardsServiceMessage.h);
            ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
            Intrinsics.g(zonedDateTimeNow, "now(...)");
            if (openEndRangeL.contains(zonedDateTimeNow) && rewardsServiceMessage.f.contains(screenType)) {
                List list = rewardsServiceMessage.j;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((Region) it2.next()) == RewardsAccountInteractorKt.a(this.b)) {
                            obj = next;
                            break loop0;
                        }
                    }
                }
            }
        }
        return (RewardsServiceMessage) obj;
    }

    public final Object b(CoroutineScope coroutineScope) {
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(a(RewardsServiceMessage.ScreenType.e));
        BuildersKt.c(coroutineScope, null, null, new RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2(this, null, mutableStateFlowA), 3);
        return mutableStateFlowA;
    }

    public final List c(String str) {
        try {
            if (str.length() == 0) {
                return null;
            }
            Json json = (Json) this.c.getD();
            json.getClass();
            return (List) json.b(new ArrayListSerializer(RewardsServiceMessage.INSTANCE.serializer()), str);
        } catch (SerializationException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.e), e, "Invalid json format for service message " + str, 8);
            return null;
        } catch (IllegalArgumentException e2) {
            Bark.Companion companion2 = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.e), e2, "Invalid json format for service message " + str, 8);
            return null;
        } catch (DateTimeParseException e3) {
            Bark.Companion companion3 = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.e), e3, "Invalid datetime format for service message " + str, 8);
            return null;
        }
    }
}
