package au.com.woolworths.shop.auth;

import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsRepository;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.extensions.DateExtKt;
import au.com.woolworths.android.onesite.extensions.StringExtKt;
import au.com.woolworths.android.onesite.logging.dynatrace.TimberDynatraceLogger;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.tealium.core.Tealium;
import com.tealium.core.persistence.Expiry;
import com.tealium.core.persistence.f0;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/auth/ShopAccountInteractor;", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "Lau/com/woolworths/android/onesite/appdata/AccountInteractor;", "Lau/com/woolworths/android/onesite/utils/InStoreWifiSavedMemberProvider;", "LogOutEvent", "LoginDetails", "Companion", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShopAccountInteractor implements PersistentMetadataProvider, AccountInteractor, InStoreWifiSavedMemberProvider {

    /* renamed from: a, reason: collision with root package name */
    public final AdobeAnalyticsRepository f10228a;
    public final AccountRepository b;
    public final FirebaseAnalyticsLogger c;
    public final TimberDynatraceLogger d;
    public final Gson e;
    public final Tealium f;
    public final DataStore g;
    public volatile Member h;
    public final BehaviorSubject i;
    public final PublishSubject j;
    public final PublishSubject k;
    public final SharedFlowImpl l;
    public final Flow m;
    public final SharedFlowImpl n;
    public final Flow o;
    public final Flow p;
    public final ShopAccountInteractor$special$$inlined$map$3 q;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/auth/ShopAccountInteractor$Companion;", "", "", "LEGAL_ADULT_AGE", "I", "", "DEFAULT_ORDER_COUNT", "Ljava/lang/String;", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/ShopAccountInteractor$LogOutEvent;", "", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LogOutEvent {
        public static final LogOutEvent d;
        public static final /* synthetic */ LogOutEvent[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            LogOutEvent logOutEvent = new LogOutEvent("COMPLETE", 0);
            d = logOutEvent;
            LogOutEvent[] logOutEventArr = {logOutEvent};
            e = logOutEventArr;
            f = EnumEntriesKt.a(logOutEventArr);
        }

        public static LogOutEvent valueOf(String str) {
            return (LogOutEvent) Enum.valueOf(LogOutEvent.class, str);
        }

        public static LogOutEvent[] values() {
            return (LogOutEvent[]) e.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/ShopAccountInteractor$LoginDetails;", "", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class LoginDetails {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10229a;
        public final String b;

        public LoginDetails(boolean z, String str) {
            this.f10229a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginDetails)) {
                return false;
            }
            LoginDetails loginDetails = (LoginDetails) obj;
            return this.f10229a == loginDetails.f10229a && Intrinsics.c(this.b, loginDetails.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f10229a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.m("LoginDetails(isFullUserLoggedIn=", this.f10229a, ", guestDeviceAuthToken=", this.b, ")");
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3] */
    public ShopAccountInteractor(AdobeAnalyticsRepository adobeAnalyticsRepository, AccountRepository accountRepository, FirebaseAnalyticsLogger firebaseAnalyticsLogger, TimberDynatraceLogger timberDynatraceLogger, Gson gson, Tealium tealium, DataStore chatbotSessionDataStore) {
        Intrinsics.h(adobeAnalyticsRepository, "adobeAnalyticsRepository");
        Intrinsics.h(accountRepository, "accountRepository");
        Intrinsics.h(firebaseAnalyticsLogger, "firebaseAnalyticsLogger");
        Intrinsics.h(gson, "gson");
        Intrinsics.h(tealium, "tealium");
        Intrinsics.h(chatbotSessionDataStore, "chatbotSessionDataStore");
        this.f10228a = adobeAnalyticsRepository;
        this.b = accountRepository;
        this.c = firebaseAnalyticsLogger;
        this.d = timberDynatraceLogger;
        this.e = gson;
        this.f = tealium;
        this.g = chatbotSessionDataStore;
        Boolean boolValueOf = Boolean.valueOf(d());
        BehaviorSubject behaviorSubject = new BehaviorSubject();
        behaviorSubject.d.lazySet(boolValueOf);
        this.i = behaviorSubject;
        PublishSubject publishSubject = new PublishSubject();
        this.j = publishSubject;
        this.k = publishSubject;
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(1, 0, bufferOverflow, 2);
        this.l = sharedFlowImplB;
        final Flow flowR = FlowKt.r(FlowKt.a(sharedFlowImplB));
        this.m = flowR;
        SharedFlowImpl sharedFlowImplB2 = SharedFlowKt.b(1, 0, bufferOverflow, 2);
        this.n = sharedFlowImplB2;
        this.o = FlowKt.a(sharedFlowImplB2);
        final FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new ShopAccountInteractor$fullUserShopperIdOrNull$2(this, null), new Flow<Member>() { // from class: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;
                public final /* synthetic */ ShopAccountInteractor e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1$2", f = "ShopAccountInteractor.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ShopAccountInteractor shopAccountInteractor) {
                    this.d = flowCollector;
                    this.e = shopAccountInteractor;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1$2$1 r0 = (au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1$2$1 r0 = new au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.shop.auth.ShopAccountInteractor$LoginDetails r5 = (au.com.woolworths.shop.auth.ShopAccountInteractor.LoginDetails) r5
                        au.com.woolworths.shop.auth.ShopAccountInteractor r5 = r4.e
                        au.com.woolworths.android.onesite.models.authentication.Member r5 = r5.n()
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowR.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        });
        this.p = FlowKt.r(new Flow<String>() { // from class: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2$2", f = "ShopAccountInteractor.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2$2$1 r0 = (au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2$2$1 r0 = new au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L50
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.android.onesite.models.authentication.Member r5 = (au.com.woolworths.android.onesite.models.authentication.Member) r5
                        r6 = 0
                        if (r5 == 0) goto L45
                        boolean r2 = r5.isGuestUser()
                        if (r2 != 0) goto L3e
                        goto L3f
                    L3e:
                        r5 = r6
                    L3f:
                        if (r5 == 0) goto L45
                        java.lang.String r6 = r5.getShopperId()
                    L45:
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r5 = r4.d
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L50
                        return r1
                    L50:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        });
        final Flow data = chatbotSessionDataStore.getData();
        this.q = new Flow<String>() { // from class: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3$2", f = "ShopAccountInteractor.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3$2$1 r0 = (au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3$2$1 r0 = new au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L41
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.foundation.shop.chatbot.session.ChatbotSession r5 = (au.com.woolworths.foundation.shop.chatbot.session.ChatbotSession) r5
                        java.lang.String r5 = r5.f8700a
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        };
    }

    public final String E() {
        if (!S()) {
            return "";
        }
        Member memberN = n();
        Intrinsics.e(memberN);
        String accessToken = memberN.getAccessToken();
        Intrinsics.g(accessToken, "getAccessToken(...)");
        return accessToken;
    }

    public final synchronized boolean K() {
        boolean z;
        String dateOfBirth;
        Member memberN = n();
        z = false;
        if (memberN != null && !memberN.isGuestUser() && (dateOfBirth = memberN.getDateOfBirth()) != null && dateOfBirth.length() != 0) {
            String dateOfBirth2 = memberN.getDateOfBirth();
            Intrinsics.g(dateOfBirth2, "getDateOfBirth(...)");
            if (DateExtKt.a(StringExtKt.a(dateOfBirth2)) >= 18) {
                z = true;
            }
        }
        return z;
    }

    public final synchronized boolean S() {
        return n() != null;
    }

    public final synchronized void T() {
        SharedPreferences.Editor editorEdit = this.b.f10225a.edit();
        editorEdit.remove("account");
        editorEdit.apply();
        this.h = null;
        z();
        this.c.a("Guest");
        this.d.b(null);
    }

    public final synchronized void U(Member member, String email) {
        try {
            Intrinsics.h(email, "email");
            this.h = member;
            String strJ = this.e.j(n());
            AccountRepository accountRepository = this.b;
            Intrinsics.e(strJ);
            accountRepository.a(strJ);
            Member memberN = n();
            if (memberN != null && !memberN.isGuestUser()) {
                AccountRepository accountRepository2 = this.b;
                accountRepository2.getClass();
                SharedPreferences.Editor editorEdit = accountRepository2.f10225a.edit();
                editorEdit.putString("user_name", email);
                editorEdit.apply();
            }
            FirebaseAnalyticsLogger firebaseAnalyticsLogger = this.c;
            String shopperId = member.getShopperId();
            if (shopperId == null) {
                shopperId = "Guest";
            }
            firebaseAnalyticsLogger.a(shopperId);
            this.d.b(member.getShopperId());
            f0 f0Var = this.f.w;
            TrackableValue trackableValue = TrackableValue.e;
            String shopperId2 = member.getShopperId();
            Intrinsics.g(shopperId2, "getShopperId(...)");
            f0Var.J("user.ShopperID", shopperId2, Expiry.b);
            z();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Object V(String str, Continuation continuation) {
        Object objA = this.g.a(new ShopAccountInteractor$setChatbotSessionId$2(str, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    @Override // au.com.woolworths.android.onesite.appdata.AccountInteractor
    public final synchronized boolean d() {
        return n() != null ? !r0.isGuestUser() : false;
    }

    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    public final TrackingMetadata getMetadata() {
        String shopperId;
        TrackableValue trackableValue = TrackableValue.R2;
        Member memberN = n();
        if (memberN == null || (shopperId = memberN.getShopperId()) == null) {
            shopperId = "Guest";
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, shopperId);
        TrackableValue trackableValue2 = TrackableValue.E3;
        Member memberN2 = n();
        trackingMetadataA.b(trackableValue2, memberN2 != null ? Integer.valueOf(memberN2.getOrderCount()) : "0");
        TrackableValue trackableValue3 = TrackableValue.J0;
        Member memberN3 = n();
        trackingMetadataA.b(trackableValue3, memberN3 != null ? Integer.valueOf(memberN3.getMarketOrderCount()) : "0");
        return trackingMetadataA;
    }

    @Override // au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider
    public final boolean isFullUserCurrentlyLoggedIn() {
        return d();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AccountInteractor
    public final Member n() {
        String string;
        if (this.h == null) {
            synchronized (Member.class) {
                if (this.h == null && (string = this.b.f10225a.getString("account", null)) != null) {
                    try {
                        this.h = (Member) this.e.d(Member.class, string);
                    } catch (JsonSyntaxException e) {
                        Bark.Companion companion = Bark.f8483a;
                        Bark.Barker.c(ReportOwner.Squad.m.a(), e, "JsonSyntaxException when reading Member from prefs", 8);
                    }
                }
            }
        }
        return this.h;
    }

    @Override // au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider
    public final String retrieveSavedMember() {
        Member memberN = n();
        if (memberN != null) {
            return memberN.getShopperId();
        }
        return null;
    }

    @Override // au.com.woolworths.android.onesite.appdata.AccountInteractor
    public final String u() {
        return this.f10228a.a();
    }

    public final Object v(Continuation continuation) {
        Object objA = this.g.a(new ShopAccountInteractor$clearChatbotSessionData$2(), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final void z() {
        this.i.onNext(Boolean.valueOf(d()));
        boolean zD = d();
        AccountRepository accountRepository = this.b;
        Map map = (Map) accountRepository.c.f(accountRepository.b.getString("guest_login_data", null), new AccountRepository$getGuestLoginData$1().getType());
        this.l.f(new LoginDetails(zD, map != null ? (String) map.get("device_auth_token") : null));
    }
}
