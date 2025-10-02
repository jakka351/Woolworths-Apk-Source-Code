package au.com.woolworths.shop.checkout.ui.content;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.PreferenceId;
import au.com.woolworths.shop.graphql.type.CheckoutSubstitutionInput;
import com.apollographql.apollo.api.Optional;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentInteractor;", "", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutContentInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CheckoutContentRepository f10758a;
    public final Lazy b;
    public final DispatcherProvider c;
    public final SharedPreferences d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentInteractor$Companion;", "", "", "SHOW_MIXED_FULFILMENT_DIALOG", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PreferenceId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PreferenceId preferenceId = PreferenceId.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PreferenceId preferenceId2 = PreferenceId.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PreferenceId preferenceId3 = PreferenceId.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PreferenceId preferenceId4 = PreferenceId.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PreferenceId preferenceId5 = PreferenceId.d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public CheckoutContentInteractor(CheckoutContentRepository checkoutContentRepository, Lazy legacyShoppingModeRepositoryLazy, DispatcherProvider dispatcherProvider, SharedPreferences sharedPreferences) {
        Intrinsics.h(legacyShoppingModeRepositoryLazy, "legacyShoppingModeRepositoryLazy");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f10758a = checkoutContentRepository;
        this.b = legacyShoppingModeRepositoryLazy;
        this.c = dispatcherProvider;
        this.d = sharedPreferences;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor$queryCheckoutDetails$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor$queryCheckoutDetails$1 r0 = (au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor$queryCheckoutDetails$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor$queryCheckoutDetails$1 r0 = new au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor$queryCheckoutDetails$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L56
        L36:
            kotlin.ResultKt.b(r6)
            r0.r = r4
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r6 = r5.c
            r6.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r6 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r6 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor$syncPreviouslyUsedAddresses$2 r2 = new au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor$syncPreviouslyUsedAddresses$2
            r4 = 0
            r2.<init>(r5, r4)
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.f(r6, r2, r0)
            if (r6 != r1) goto L51
            goto L53
        L51:
            kotlin.Unit r6 = kotlin.Unit.f24250a
        L53:
            if (r6 != r1) goto L56
            goto L60
        L56:
            r0.r = r3
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r6 = r5.f10758a
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(PreferenceId preferenceId, String str, Continuation continuation) {
        int iOrdinal = preferenceId.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            throw new IllegalArgumentException("EditPreferenceToggle: Preference id " + preferenceId + " not Boolean value");
        }
        CheckoutContentRepository checkoutContentRepository = this.f10758a;
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return checkoutContentRepository.p(str, (ContinuationImpl) continuation);
            }
            if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("EditPreferenceText: Unknown preference id " + preferenceId);
            }
        }
        return checkoutContentRepository.r(preferenceId, str, (ContinuationImpl) continuation);
    }

    public final Object c(PreferenceId preferenceId, boolean z, Continuation continuation) {
        int iOrdinal = preferenceId.ordinal();
        CheckoutContentRepository checkoutContentRepository = this.f10758a;
        if (iOrdinal == 0) {
            return checkoutContentRepository.t(z, (ContinuationImpl) continuation);
        }
        if (iOrdinal == 1) {
            return checkoutContentRepository.s(z, (ContinuationImpl) continuation);
        }
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            throw new IllegalArgumentException("EditPreferenceToggle: Preference id " + preferenceId + " not Boolean value");
        }
        if (iOrdinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("EditPreferenceToggle: Unknown preference id " + preferenceId);
    }

    public final Object d(List list, boolean z, SuspendLambda suspendLambda) throws Exception {
        List<CheckoutProduct> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (CheckoutProduct checkoutProduct : list2) {
            arrayList.add(new CheckoutSubstitutionInput(checkoutProduct.c, checkoutProduct.b, new Optional.Present(checkoutProduct.h.f10569a), z));
        }
        Object objV = this.f10758a.v(arrayList, suspendLambda);
        return objV == CoroutineSingletons.d ? objV : (Checkout) objV;
    }
}
