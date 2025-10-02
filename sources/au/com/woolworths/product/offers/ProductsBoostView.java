package au.com.woolworths.product.offers;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.InStoreModeInteractor;
import au.com.woolworths.feature.product.list.legacy.ui.a;
import au.com.woolworths.product.databinding.LayoutProductBoostBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.RewardsOfferInfo;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R.\u0010>\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010F\u001a\u00020?2\u0006\u00107\u001a\u00020?8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010R\u001a\u00020?2\u0006\u00107\u001a\u00020?8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010A\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER$\u0010W\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR*\u0010[\u001a\u00020?2\u0006\u00107\u001a\u00020?8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010A\u001a\u0004\bY\u0010C\"\u0004\bZ\u0010ER\u0014\u0010]\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010C¨\u0006^"}, d2 = {"Lau/com/woolworths/product/offers/ProductsBoostView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/product/models/ProductCardConfig;", MlModel.MODEL_FILE_SUFFIX, "", "setProductCardConfig", "(Lau/com/woolworths/product/models/ProductCardConfig;)V", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "f", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "getFeatureToggleManager", "()Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "setFeatureToggleManager", "(Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;)V", "featureToggleManager", "Lau/com/woolworths/android/onesite/modules/collectionmode/InStoreModeInteractor;", "g", "Lau/com/woolworths/android/onesite/modules/collectionmode/InStoreModeInteractor;", "getInStoreModeInteractor", "()Lau/com/woolworths/android/onesite/modules/collectionmode/InStoreModeInteractor;", "setInStoreModeInteractor", "(Lau/com/woolworths/android/onesite/modules/collectionmode/InStoreModeInteractor;)V", "inStoreModeInteractor", "Lau/com/woolworths/product/offers/ProductBoostInteractor;", "h", "Lau/com/woolworths/product/offers/ProductBoostInteractor;", "getProductBoostInteractor", "()Lau/com/woolworths/product/offers/ProductBoostInteractor;", "setProductBoostInteractor", "(Lau/com/woolworths/product/offers/ProductBoostInteractor;)V", "productBoostInteractor", "Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;", "i", "Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;", "getDispatcherProvider", "()Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;", "setDispatcherProvider", "(Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;)V", "dispatcherProvider", "Landroid/app/Activity;", "l", "Lkotlin/Lazy;", "getActivity", "()Landroid/app/Activity;", "activity", "Lau/com/woolworths/product/models/ProductCard;", "value", "m", "Lau/com/woolworths/product/models/ProductCard;", "getProduct", "()Lau/com/woolworths/product/models/ProductCard;", "setProduct", "(Lau/com/woolworths/product/models/ProductCard;)V", "product", "", "n", "Z", "getShowBoostAnimation", "()Z", "setShowBoostAnimation", "(Z)V", "showBoostAnimation", "Lau/com/woolworths/product/offers/ProductsBoostViewListener;", "o", "Lau/com/woolworths/product/offers/ProductsBoostViewListener;", "getBoostViewListener", "()Lau/com/woolworths/product/offers/ProductsBoostViewListener;", "setBoostViewListener", "(Lau/com/woolworths/product/offers/ProductsBoostViewListener;)V", "boostViewListener", "p", "getEnableBoostAnimationContainerGap", "setEnableBoostAnimationContainerGap", "enableBoostAnimationContainerGap", "r", "Lau/com/woolworths/product/models/ProductCardConfig;", "getProductCardConfig", "()Lau/com/woolworths/product/models/ProductCardConfig;", "productCardConfig", "s", "getShouldShowExpiryLabel", "setShouldShowExpiryLabel", "shouldShowExpiryLabel", "getShouldShowTigerDisplayExpiry", "shouldShowTigerDisplayExpiry", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductsBoostView extends Hilt_ProductsBoostView implements Animator.AnimatorListener {
    public static final /* synthetic */ int t = 0;

    /* renamed from: f, reason: from kotlin metadata */
    public FeatureToggleManager featureToggleManager;

    /* renamed from: g, reason: from kotlin metadata */
    public InStoreModeInteractor inStoreModeInteractor;

    /* renamed from: h, reason: from kotlin metadata */
    public ProductBoostInteractor productBoostInteractor;

    /* renamed from: i, reason: from kotlin metadata */
    public DispatcherProvider dispatcherProvider;
    public Job j;
    public final LayoutProductBoostBinding k;

    /* renamed from: l, reason: from kotlin metadata */
    public final Lazy activity;

    /* renamed from: m, reason: from kotlin metadata */
    public ProductCard product;

    /* renamed from: n, reason: from kotlin metadata */
    public boolean showBoostAnimation;

    /* renamed from: o, reason: from kotlin metadata */
    public ProductsBoostViewListener boostViewListener;

    /* renamed from: p, reason: from kotlin metadata */
    public boolean enableBoostAnimationContainerGap;
    public String q;

    /* renamed from: r, reason: from kotlin metadata */
    public ProductCardConfig productCardConfig;

    /* renamed from: s, reason: from kotlin metadata */
    public boolean shouldShowExpiryLabel;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.product.offers.ProductsBoostView$onAttachedToWindow$1", f = "ProductsBoostView.kt", l = {138}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.product.offers.ProductsBoostView$onAttachedToWindow$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductsBoostView.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
            ResultKt.b(obj);
            final ProductsBoostView productsBoostView = ProductsBoostView.this;
            SharedFlowImpl sharedFlowImpl = productsBoostView.getProductBoostInteractor().c;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.product.offers.ProductsBoostView.onAttachedToWindow.1.1
                /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        java.util.List r5 = (java.util.List) r5
                        au.com.woolworths.product.offers.ProductsBoostView r6 = r1
                        au.com.woolworths.product.models.ProductCard r0 = r6.product
                        r1 = 0
                        if (r0 == 0) goto L14
                        au.com.woolworths.product.models.RewardsOfferInfo r0 = r0.getRewardsOfferInfo()
                        if (r0 == 0) goto L14
                        au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r0 = r0.getN()
                        goto L15
                    L14:
                        r0 = r1
                    L15:
                        au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r2 = au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.NOT_ACTIVATED
                        if (r0 == r2) goto L1a
                        goto L79
                    L1a:
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.Iterator r5 = r5.iterator()
                    L20:
                        boolean r0 = r5.hasNext()
                        if (r0 == 0) goto L48
                        java.lang.Object r0 = r5.next()
                        r2 = r0
                        au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData r2 = (au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData) r2
                        java.lang.String r2 = r2.getD()
                        au.com.woolworths.product.models.ProductCard r3 = r6.product
                        if (r3 == 0) goto L40
                        au.com.woolworths.product.models.RewardsOfferInfo r3 = r3.getRewardsOfferInfo()
                        if (r3 == 0) goto L40
                        java.lang.String r3 = r3.getD()
                        goto L41
                    L40:
                        r3 = r1
                    L41:
                        boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r3)
                        if (r2 == 0) goto L20
                        goto L49
                    L48:
                        r0 = r1
                    L49:
                        au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData r0 = (au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData) r0
                        if (r0 != 0) goto L4e
                        goto L79
                    L4e:
                        au.com.woolworths.product.models.ProductCard r5 = r6.product
                        if (r5 == 0) goto L5d
                        au.com.woolworths.product.models.RewardsOfferInfo r5 = r5.getRewardsOfferInfo()
                        if (r5 == 0) goto L5d
                        java.lang.String r5 = r5.getD()
                        goto L5e
                    L5d:
                        r5 = r1
                    L5e:
                        if (r5 != 0) goto L62
                        java.lang.String r5 = ""
                    L62:
                        r6.q = r5
                        au.com.woolworths.product.models.ProductCard r5 = r6.product
                        if (r5 == 0) goto L6c
                        au.com.woolworths.product.models.ProductCard r1 = au.com.woolworths.product.analytics.ProductAnalyticsExtKt.j(r5, r0)
                    L6c:
                        r6.setProduct(r1)
                        au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r5 = r0.getN()
                        au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r0 = au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.ACTIVATED
                        if (r5 != r0) goto L79
                        r5 = 1
                        goto L7a
                    L79:
                        r5 = 0
                    L7a:
                        r6.setShowBoostAnimation(r5)
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.offers.ProductsBoostView.AnonymousClass1.C02311.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.p = 1;
            sharedFlowImpl.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductsBoostView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(au.com.woolworths.product.offers.ProductsBoostView r4, au.com.woolworths.product.databinding.LayoutProductBoostBinding r5, au.com.woolworths.product.models.ProductCard r6, boolean r7, int r8) {
        /*
            r0 = r8 & 1
            if (r0 == 0) goto L6
            au.com.woolworths.product.models.ProductCard r6 = r4.product
        L6:
            r8 = r8 & 2
            if (r8 == 0) goto Lc
            boolean r7 = r4.showBoostAnimation
        Lc:
            r5.N(r6)
            r5.O(r7)
            r8 = 0
            r0 = 0
            r1 = 8
            if (r7 == 0) goto L1a
            r2 = r8
            goto L33
        L1a:
            boolean r2 = r4.enableBoostAnimationContainerGap
            if (r2 == 0) goto L32
            if (r6 == 0) goto L2b
            au.com.woolworths.product.models.RewardsOfferInfo r2 = r6.getRewardsOfferInfo()
            if (r2 == 0) goto L2b
            au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r2 = r2.getN()
            goto L2c
        L2b:
            r2 = r0
        L2c:
            au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r3 = au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.NOT_ACTIVATED
            if (r2 != r3) goto L32
            r2 = 4
            goto L33
        L32:
            r2 = r1
        L33:
            r5.L(r2)
            boolean r2 = r4.getShouldShowTigerDisplayExpiry()
            r5.P(r2)
            au.com.woolworths.product.models.ProductCard r2 = r4.product
            if (r2 == 0) goto L4c
            au.com.woolworths.product.models.RewardsOfferInfo r2 = r2.getRewardsOfferInfo()
            if (r2 == 0) goto L4c
            java.lang.String r2 = r2.getM()
            goto L4d
        L4c:
            r2 = r0
        L4d:
            if (r2 == 0) goto L54
            boolean r2 = r4.showBoostAnimation
            r2 = r2 ^ 1
            goto L55
        L54:
            r2 = r8
        L55:
            r5.Q(r2)
            au.com.woolworths.product.models.ProductCard r2 = r4.product
            if (r2 == 0) goto L67
            au.com.woolworths.product.models.RewardsOfferInfo r2 = r2.getRewardsOfferInfo()
            if (r2 == 0) goto L67
            java.lang.String r2 = r2.getM()
            goto L68
        L67:
            r2 = r0
        L68:
            if (r2 == 0) goto L6f
            boolean r2 = r4.showBoostAnimation
            r2 = r2 ^ 1
            goto L70
        L6f:
            r2 = r8
        L70:
            if (r2 != 0) goto L7e
            boolean r2 = r4.getShouldShowTigerDisplayExpiry()
            if (r2 != 0) goto L7e
            int r2 = r5.G
            if (r2 == r1) goto L7d
            goto L7e
        L7d:
            r8 = r1
        L7e:
            r4.setVisibility(r8)
            if (r7 == 0) goto L86
            java.lang.String r0 = r4.q
            goto L92
        L86:
            if (r6 == 0) goto L92
            au.com.woolworths.product.models.RewardsOfferInfo r4 = r6.getRewardsOfferInfo()
            if (r4 == 0) goto L92
            java.lang.String r0 = r4.getD()
        L92:
            r5.M(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.offers.ProductsBoostView.d(au.com.woolworths.product.offers.ProductsBoostView, au.com.woolworths.product.databinding.LayoutProductBoostBinding, au.com.woolworths.product.models.ProductCard, boolean, int):void");
    }

    private final boolean getShouldShowTigerDisplayExpiry() {
        RewardsOfferInfo rewardsOfferInfo;
        ProductCard productCard = this.product;
        return ((productCard == null || (rewardsOfferInfo = productCard.getRewardsOfferInfo()) == null) ? null : rewardsOfferInfo.getD()) != null && this.shouldShowExpiryLabel;
    }

    @NotNull
    public final Activity getActivity() {
        return (Activity) this.activity.getD();
    }

    @Nullable
    public final ProductsBoostViewListener getBoostViewListener() {
        return this.boostViewListener;
    }

    @NotNull
    public final DispatcherProvider getDispatcherProvider() {
        DispatcherProvider dispatcherProvider = this.dispatcherProvider;
        if (dispatcherProvider != null) {
            return dispatcherProvider;
        }
        Intrinsics.p("dispatcherProvider");
        throw null;
    }

    public final boolean getEnableBoostAnimationContainerGap() {
        return this.enableBoostAnimationContainerGap;
    }

    @NotNull
    public final FeatureToggleManager getFeatureToggleManager() {
        FeatureToggleManager featureToggleManager = this.featureToggleManager;
        if (featureToggleManager != null) {
            return featureToggleManager;
        }
        Intrinsics.p("featureToggleManager");
        throw null;
    }

    @NotNull
    public final InStoreModeInteractor getInStoreModeInteractor() {
        InStoreModeInteractor inStoreModeInteractor = this.inStoreModeInteractor;
        if (inStoreModeInteractor != null) {
            return inStoreModeInteractor;
        }
        Intrinsics.p("inStoreModeInteractor");
        throw null;
    }

    @Nullable
    public final ProductCard getProduct() {
        return this.product;
    }

    @NotNull
    public final ProductBoostInteractor getProductBoostInteractor() {
        ProductBoostInteractor productBoostInteractor = this.productBoostInteractor;
        if (productBoostInteractor != null) {
            return productBoostInteractor;
        }
        Intrinsics.p("productBoostInteractor");
        throw null;
    }

    @NotNull
    public final ProductCardConfig getProductCardConfig() {
        return this.productCardConfig;
    }

    public final boolean getShouldShowExpiryLabel() {
        return this.shouldShowExpiryLabel;
    }

    public final boolean getShowBoostAnimation() {
        return this.showBoostAnimation;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.h(animation, "animation");
        setShowBoostAnimation(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.h(animation, "animation");
        if (this.showBoostAnimation) {
            setShowBoostAnimation(false);
            ProductsBoostViewListener productsBoostViewListener = this.boostViewListener;
            if (productsBoostViewListener != null) {
                productsBoostViewListener.d();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.h(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.h(animation, "animation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(this);
        this.j = lifecycleOwnerA != null ? BuildersKt.c(LifecycleOwnerKt.a(lifecycleOwnerA), null, null, new AnonymousClass1(null), 3) : null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Job job = this.j;
        if (job != null) {
            ((JobSupport) job).cancel((CancellationException) null);
        }
        this.j = null;
    }

    public final void setBoostViewListener(@Nullable ProductsBoostViewListener productsBoostViewListener) {
        this.boostViewListener = productsBoostViewListener;
    }

    public final void setDispatcherProvider(@NotNull DispatcherProvider dispatcherProvider) {
        Intrinsics.h(dispatcherProvider, "<set-?>");
        this.dispatcherProvider = dispatcherProvider;
    }

    public final void setEnableBoostAnimationContainerGap(boolean z) {
        this.enableBoostAnimationContainerGap = z;
        d(this, this.k, null, false, 3);
    }

    public final void setFeatureToggleManager(@NotNull FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "<set-?>");
        this.featureToggleManager = featureToggleManager;
    }

    public final void setInStoreModeInteractor(@NotNull InStoreModeInteractor inStoreModeInteractor) {
        Intrinsics.h(inStoreModeInteractor, "<set-?>");
        this.inStoreModeInteractor = inStoreModeInteractor;
    }

    public final void setProduct(@Nullable ProductCard productCard) {
        this.product = productCard;
        d(this, this.k, productCard, false, 2);
    }

    public final void setProductBoostInteractor(@NotNull ProductBoostInteractor productBoostInteractor) {
        Intrinsics.h(productBoostInteractor, "<set-?>");
        this.productBoostInteractor = productBoostInteractor;
    }

    public final void setProductCardConfig(@Nullable ProductCardConfig config) {
        if (config == null) {
            config = new ProductCardConfig(getInStoreModeInteractor().b(), true, false, false, false, false, null, 124, null);
        }
        this.productCardConfig = config;
    }

    public final void setShouldShowExpiryLabel(boolean z) {
        this.shouldShowExpiryLabel = z;
        d(this, this.k, null, false, 3);
    }

    public final void setShowBoostAnimation(boolean z) {
        if (this.showBoostAnimation != z) {
            this.showBoostAnimation = z;
            d(this, this.k, null, z, 1);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductsBoostView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ProductsBoostView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductsBoostView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        ViewDataBinding viewDataBindingC = DataBindingUtil.c(LayoutInflater.from(context), R.layout.layout_product_boost, this, true, null);
        Intrinsics.g(viewDataBindingC, "inflate(...)");
        LayoutProductBoostBinding layoutProductBoostBinding = (LayoutProductBoostBinding) viewDataBindingC;
        this.k = layoutProductBoostBinding;
        this.activity = LazyKt.b(new a(context, 7));
        this.q = "";
        this.shouldShowExpiryLabel = true;
        if (!isInEditMode()) {
            this.productCardConfig = new ProductCardConfig(getInStoreModeInteractor().b(), true, false, false, false, false, null, 124, null);
            layoutProductBoostBinding.z.k.e.addListener(this);
        } else {
            this.productCardConfig = new ProductCardConfig(false, false, false, false, false, false, null, 124, null);
        }
    }
}
