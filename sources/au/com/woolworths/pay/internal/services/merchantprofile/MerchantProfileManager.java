package au.com.woolworths.pay.internal.services.merchantprofile;

import au.com.woolworths.pay.internal.AccessTokenManager;
import au.com.woolworths.pay.internal.network.HttpClient;
import au.com.woolworths.pay.internal.util.Logger;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes4.dex */
public class MerchantProfileManager {

    /* renamed from: a, reason: collision with root package name */
    public final Configuration f9187a;
    public final HttpClient b;
    public final AccessTokenManager c;
    public final Logger d;
    public MerchantProfile e = null;
    public State f = State.d;
    public final LinkedBlockingDeque g = new LinkedBlockingDeque();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final /* synthetic */ State[] h;

        static {
            State state = new State("NOT_INITIALISED", 0);
            d = state;
            State state2 = new State("SHOULD_REFRESH", 1);
            e = state2;
            State state3 = new State("FETCHING", 2);
            f = state3;
            State state4 = new State("STORED", 3);
            g = state4;
            h = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) h.clone();
        }
    }

    public MerchantProfileManager(Configuration configuration, HttpClient httpClient, AccessTokenManager accessTokenManager, Logger logger) {
        this.f9187a = configuration;
        this.b = httpClient;
        this.c = accessTokenManager;
        this.d = logger;
    }

    public static void a(MerchantProfileManager merchantProfileManager, Object obj) {
        LinkedBlockingDeque linkedBlockingDeque = merchantProfileManager.g;
        if (obj instanceof MerchantProfile) {
            while (!linkedBlockingDeque.isEmpty()) {
                ((PayResultCallback) linkedBlockingDeque.remove()).k0((MerchantProfile) obj);
            }
        } else if (obj instanceof PayError) {
            while (!linkedBlockingDeque.isEmpty()) {
                ((PayResultCallback) linkedBlockingDeque.remove()).v((PayError) obj);
            }
        } else if (!(obj instanceof Retryable)) {
            merchantProfileManager.d.b("MerchantProfile", "Unfortunate case, loop shouldn't be here");
        } else {
            while (!linkedBlockingDeque.isEmpty()) {
                ((PayResultCallback) linkedBlockingDeque.remove()).A((Retryable) obj);
            }
        }
    }

    public final void b() {
        this.d.b("MerchantProfile", "fetchAndStoreMerchantProfile()");
        this.f = State.e;
        c(null);
    }

    public final void c(PayResultCallback payResultCallback) {
        boolean zEquals = this.f.equals(State.g);
        Logger logger = this.d;
        if (zEquals) {
            if (payResultCallback != null) {
                logger.b("MerchantProfile", "Fetching merchant profile from cache");
                payResultCallback.k0(this.e);
                return;
            }
            return;
        }
        State state = this.f;
        State state2 = State.f;
        boolean zEquals2 = state.equals(state2);
        LinkedBlockingDeque linkedBlockingDeque = this.g;
        if (zEquals2) {
            if (payResultCallback == null || linkedBlockingDeque == null) {
                return;
            }
            linkedBlockingDeque.add(payResultCallback);
            logger.b("MerchantProfile", "callback Queued");
            return;
        }
        this.f = state2;
        if (payResultCallback != null && linkedBlockingDeque != null) {
            linkedBlockingDeque.add(payResultCallback);
            logger.b("MerchantProfile", "callback Queued");
        }
        MerchantProfileService merchantProfileService = new MerchantProfileService(this.f9187a, this.b, this.c);
        merchantProfileService.e = logger;
        merchantProfileService.a(new PayResultCallback<MerchantProfile>() { // from class: au.com.woolworths.pay.internal.services.merchantprofile.MerchantProfileManager.1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                State state3 = State.e;
                MerchantProfileManager merchantProfileManager = MerchantProfileManager.this;
                merchantProfileManager.f = state3;
                MerchantProfileManager.a(merchantProfileManager, retryable);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                MerchantProfile merchantProfile = (MerchantProfile) obj;
                MerchantProfileManager merchantProfileManager = MerchantProfileManager.this;
                merchantProfileManager.e = merchantProfile;
                merchantProfileManager.f = State.g;
                MerchantProfileManager.a(merchantProfileManager, merchantProfile);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                State state3 = State.e;
                MerchantProfileManager merchantProfileManager = MerchantProfileManager.this;
                merchantProfileManager.f = state3;
                MerchantProfileManager.a(merchantProfileManager, payError);
            }
        });
    }
}
