package au.com.woolworths.feature.rewards.everydayextras.signup;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor;", "", "Event", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class EverydayExtrasSignUpInteractor {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5935a;
    public final BufferedChannel b;
    public final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event;", "", "NavigateToChoosePlan", "NavigateToSummary", "NavigateToOnBoarding", "NavigateToUrl", "PerformSignUpBackAction", "PerformSignUpCloseAction", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$NavigateToChoosePlan;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$NavigateToOnBoarding;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$NavigateToSummary;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$NavigateToUrl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$PerformSignUpBackAction;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$PerformSignUpCloseAction;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Event {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$NavigateToChoosePlan;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToChoosePlan extends Event {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToChoosePlan f5936a = new NavigateToChoosePlan();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToChoosePlan);
            }

            public final int hashCode() {
                return 2143756382;
            }

            public final String toString() {
                return "NavigateToChoosePlan";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$NavigateToOnBoarding;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToOnBoarding extends Event {

            /* renamed from: a, reason: collision with root package name */
            public final EverydayExtrasOnBoarding f5937a;

            public NavigateToOnBoarding(EverydayExtrasOnBoarding everydayExtrasOnBoarding) {
                this.f5937a = everydayExtrasOnBoarding;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToOnBoarding) && Intrinsics.c(this.f5937a, ((NavigateToOnBoarding) obj).f5937a);
            }

            public final int hashCode() {
                return this.f5937a.hashCode();
            }

            public final String toString() {
                return "NavigateToOnBoarding(onBoardingItem=" + this.f5937a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$NavigateToSummary;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToSummary extends Event {

            /* renamed from: a, reason: collision with root package name */
            public final String f5938a;

            public NavigateToSummary(String str) {
                this.f5938a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToSummary) && Intrinsics.c(this.f5938a, ((NavigateToSummary) obj).f5938a);
            }

            public final int hashCode() {
                return this.f5938a.hashCode();
            }

            public final String toString() {
                return a.h("NavigateToSummary(planIdentifier=", this.f5938a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$NavigateToUrl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToUrl extends Event {

            /* renamed from: a, reason: collision with root package name */
            public final String f5939a;

            public NavigateToUrl(String str) {
                this.f5939a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToUrl) && Intrinsics.c(this.f5939a, ((NavigateToUrl) obj).f5939a);
            }

            public final int hashCode() {
                return this.f5939a.hashCode();
            }

            public final String toString() {
                return a.h("NavigateToUrl(url=", this.f5939a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$PerformSignUpBackAction;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformSignUpBackAction extends Event {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformSignUpBackAction f5940a = new PerformSignUpBackAction();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformSignUpBackAction);
            }

            public final int hashCode() {
                return 1429407748;
            }

            public final String toString() {
                return "PerformSignUpBackAction";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event$PerformSignUpCloseAction;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformSignUpCloseAction extends Event {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformSignUpCloseAction f5941a = new PerformSignUpCloseAction();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformSignUpCloseAction);
            }

            public final int hashCode() {
                return -857076441;
            }

            public final String toString() {
                return "PerformSignUpCloseAction";
            }
        }
    }

    public EverydayExtrasSignUpInteractor() {
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.b = bufferedChannelA;
        this.c = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new EverydayExtrasSignUpInteractor$events$1(this, null), FlowKt.I(bufferedChannelA));
    }

    public final Object a(String str, SuspendLambda suspendLambda) {
        Object objZ = this.b.z(new Event.NavigateToUrl(str), suspendLambda);
        return objZ == CoroutineSingletons.d ? objZ : Unit.f24250a;
    }

    public final Object b(SuspendLambda suspendLambda) {
        Object objZ = this.b.z(Event.PerformSignUpCloseAction.f5941a, suspendLambda);
        return objZ == CoroutineSingletons.d ? objZ : Unit.f24250a;
    }
}
