package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.b;
import androidx.camera.core.impl.utils.futures.e;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.domain.model.ExtraInfoButton;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.ui.analytics.FulfilmentWindowsActions;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutFulfilmentWindows;
import au.com.woolworths.shop.checkout.ui.details.c;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import shop.checkout.ItemCheckoutFulfilmentWindowsBinding;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$observeData$1", f = "FulfilmentWindowsFragment.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FulfilmentWindowsFragment$observeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FulfilmentWindowsFragment q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$observeData$1$1", f = "FulfilmentWindowsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$observeData$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<FulfilmentWindowsContract.ViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ FulfilmentWindowsFragment q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FulfilmentWindowsFragment fulfilmentWindowsFragment, Continuation continuation) {
            super(2, continuation);
            this.q = fulfilmentWindowsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((FulfilmentWindowsContract.ViewState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            final FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) this.p;
            final FulfilmentWindowsFragment fulfilmentWindowsFragment = this.q;
            FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding = fulfilmentWindowsFragment.n;
            Intrinsics.e(fragmentFulfilmentWindowsBinding);
            boolean z = viewState.f10787a;
            boolean z2 = viewState.g;
            fragmentFulfilmentWindowsBinding.O(Boolean.valueOf(z));
            if (!viewState.f10787a) {
                FulfilmentWindows fulfilmentWindows = viewState.c;
                Integer num = null;
                if (fulfilmentWindows != null) {
                    FragmentActivity activity = fulfilmentWindowsFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.A(fulfilmentWindows.b);
                    }
                    FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding2 = fulfilmentWindowsFragment.n;
                    Intrinsics.e(fragmentFulfilmentWindowsBinding2);
                    InsetBannerApiData insetBannerApiData = fulfilmentWindows.c;
                    fragmentFulfilmentWindowsBinding2.S(insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null);
                    FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding3 = fulfilmentWindowsFragment.n;
                    Intrinsics.e(fragmentFulfilmentWindowsBinding3);
                    ItemCheckoutFulfilmentWindows itemCheckoutFulfilmentWindows = fragmentFulfilmentWindowsBinding3.y;
                    itemCheckoutFulfilmentWindows.setFulfilmentWindows(fulfilmentWindows);
                    itemCheckoutFulfilmentWindows.setTitle(fulfilmentWindows.d);
                    itemCheckoutFulfilmentWindows.setListener(fulfilmentWindowsFragment);
                    ItemCheckoutFulfilmentWindowsBinding itemCheckoutFulfilmentWindowsBinding = itemCheckoutFulfilmentWindows.d;
                    itemCheckoutFulfilmentWindowsBinding.L(itemCheckoutFulfilmentWindows.getTitle());
                    itemCheckoutFulfilmentWindowsBinding.y.F0(new d(itemCheckoutFulfilmentWindows, 10));
                }
                FulfilmentWindowsOption fulfilmentWindowsOption = viewState.d;
                if (fulfilmentWindowsOption != null) {
                    FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding4 = fulfilmentWindowsFragment.n;
                    Intrinsics.e(fragmentFulfilmentWindowsBinding4);
                    fragmentFulfilmentWindowsBinding4.Q(fulfilmentWindowsOption.g);
                    FulfilmentWindowsAdapter fulfilmentWindowsAdapter = (FulfilmentWindowsAdapter) fulfilmentWindowsFragment.o.getD();
                    List list = fulfilmentWindowsOption.m;
                    fulfilmentWindowsAdapter.getClass();
                    fulfilmentWindowsAdapter.p = list;
                    fulfilmentWindowsAdapter.l();
                    DeliveryNowWindow deliveryNowWindow = fulfilmentWindowsOption.n;
                    FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding5 = fulfilmentWindowsFragment.n;
                    Intrinsics.e(fragmentFulfilmentWindowsBinding5);
                    fragmentFulfilmentWindowsBinding5.L(deliveryNowWindow);
                    if (deliveryNowWindow != null) {
                        AnalyticsManager analyticsManager = fulfilmentWindowsFragment.i;
                        if (analyticsManager == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        analyticsManager.c(FulfilmentWindowsActions.DeliveryNowImpression.e);
                    }
                    ExtraInfoButton extraInfoButton = fulfilmentWindowsOption.h;
                    c cVar = new c(6, fulfilmentWindowsFragment, fulfilmentWindowsOption);
                    if (extraInfoButton != null) {
                        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding6 = fulfilmentWindowsFragment.n;
                        Intrinsics.e(fragmentFulfilmentWindowsBinding6);
                        View view = fragmentFulfilmentWindowsBinding6.F.h;
                        Intrinsics.g(view, "getRoot(...)");
                        view.setVisibility(0);
                        String str = extraInfoButton.f10598a;
                        String str2 = extraInfoButton.b;
                        Typeface typefaceCreate = Typeface.create(ResourcesCompat.e(R.font.roboto_medium, fulfilmentWindowsFragment.requireContext()), 0);
                        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding7 = fulfilmentWindowsFragment.n;
                        Intrinsics.e(fragmentFulfilmentWindowsBinding7);
                        TextView textView = fragmentFulfilmentWindowsBinding7.F.y;
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        String str3 = str + " " + str2;
                        textView.setContentDescription(str3);
                        SpannableString spannableString = new SpannableString(str3);
                        SpannableStringExtKt.a(spannableString, str2, typefaceCreate, cVar);
                        textView.setText(spannableString);
                    } else {
                        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding8 = fulfilmentWindowsFragment.n;
                        Intrinsics.e(fragmentFulfilmentWindowsBinding8);
                        View view2 = fragmentFulfilmentWindowsBinding8.F.h;
                        Intrinsics.g(view2, "getRoot(...)");
                        view2.setVisibility(8);
                    }
                    DirectToBootNowWindow directToBootNowWindow = fulfilmentWindowsOption.o;
                    FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding9 = fulfilmentWindowsFragment.n;
                    Intrinsics.e(fragmentFulfilmentWindowsBinding9);
                    fragmentFulfilmentWindowsBinding9.M(directToBootNowWindow);
                    if (directToBootNowWindow != null) {
                        AnalyticsManager analyticsManager2 = fulfilmentWindowsFragment.i;
                        if (analyticsManager2 == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        analyticsManager2.c(FulfilmentWindowsActions.DirectToBootNowImpression.e);
                    }
                    FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding10 = fulfilmentWindowsFragment.n;
                    Intrinsics.e(fragmentFulfilmentWindowsBinding10);
                    ItemCheckoutFulfilmentWindows itemCheckoutFulfilmentWindows2 = fragmentFulfilmentWindowsBinding10.y;
                    Iterator it = itemCheckoutFulfilmentWindows2.getFulfilmentWindows().e.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (((FulfilmentWindowsOption) it.next()).d) {
                            break;
                        }
                        i++;
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    if (i > 0 && itemCheckoutFulfilmentWindows2.e.d1() < i) {
                        num = numValueOf;
                    }
                    if (num != null) {
                        itemCheckoutFulfilmentWindows2.d.y.o0(num.intValue());
                    }
                    if (viewState.h) {
                        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding11 = fulfilmentWindowsFragment.n;
                        Intrinsics.e(fragmentFulfilmentWindowsBinding11);
                        ViewPager2 viewPager2 = fragmentFulfilmentWindowsBinding11.B;
                        viewPager2.post(new e(26, viewPager2, fulfilmentWindowsOption));
                    }
                }
                FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding12 = fulfilmentWindowsFragment.n;
                Intrinsics.e(fragmentFulfilmentWindowsBinding12);
                fragmentFulfilmentWindowsBinding12.N(viewState.i);
                FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding13 = fulfilmentWindowsFragment.n;
                Intrinsics.e(fragmentFulfilmentWindowsBinding13);
                ComposeView footerContainer = fragmentFulfilmentWindowsBinding13.A;
                Intrinsics.g(footerContainer, "footerContainer");
                footerContainer.setVisibility(z2 ? 8 : 0);
                if (!z2) {
                    FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding14 = fulfilmentWindowsFragment.n;
                    Intrinsics.e(fragmentFulfilmentWindowsBinding14);
                    ComposeView composeView = fragmentFulfilmentWindowsBinding14.A;
                    composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
                    composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$updateFooter$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Composer composer = (Composer) obj2;
                            if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                                composer.j();
                            } else {
                                final FulfilmentWindowsContract.ViewState viewState2 = viewState;
                                final FulfilmentWindowsFragment fulfilmentWindowsFragment2 = fulfilmentWindowsFragment;
                                ThemeKt.b(6, composer, ComposableLambdaKt.c(1631542802, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$updateFooter$1$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        Composer composer2 = (Composer) obj4;
                                        if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            Modifier modifierD = WindowInsetsPaddingKt.d(SizeKt.c, WindowInsets_androidKt.a(composer2));
                                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.h, false);
                                            int p = composer2.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                            Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierD);
                                            ComposeUiNode.e3.getClass();
                                            Function0 function0 = ComposeUiNode.Companion.b;
                                            if (composer2.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer2.i();
                                            if (composer2.getO()) {
                                                composer2.K(function0);
                                            } else {
                                                composer2.e();
                                            }
                                            Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                            Function2 function2 = ComposeUiNode.Companion.j;
                                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                                b.z(p, composer2, p, function2);
                                            }
                                            Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                                            FooterData footerData = viewState2.f;
                                            composer2.o(5004770);
                                            FulfilmentWindowsFragment fulfilmentWindowsFragment3 = fulfilmentWindowsFragment2;
                                            boolean zI = composer2.I(fulfilmentWindowsFragment3);
                                            Object objG = composer2.G();
                                            if (zI || objG == Composer.Companion.f1624a) {
                                                objG = new d(fulfilmentWindowsFragment3, 17);
                                                composer2.A(objG);
                                            }
                                            composer2.l();
                                            FulfilmentWindowsFooterUiKt.b(footerData, null, false, (Function1) objG, composer2, 0, 6);
                                            composer2.f();
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer));
                            }
                            return Unit.f24250a;
                        }
                    }, true, -941998134));
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulfilmentWindowsFragment$observeData$1(FulfilmentWindowsFragment fulfilmentWindowsFragment, Continuation continuation) {
        super(2, continuation);
        this.q = fulfilmentWindowsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FulfilmentWindowsFragment$observeData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FulfilmentWindowsFragment$observeData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FulfilmentWindowsFragment fulfilmentWindowsFragment = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(fulfilmentWindowsFragment, null), FlowExtKt.a(fulfilmentWindowsFragment.I1().l, fulfilmentWindowsFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
