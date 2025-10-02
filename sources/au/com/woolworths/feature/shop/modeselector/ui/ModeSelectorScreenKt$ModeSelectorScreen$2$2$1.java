package au.com.woolworths.feature.shop.modeselector.ui;

import au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics;
import au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$click$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.modules.button.Analytics;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorContract;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ModeSelectorScreenKt$ModeSelectorScreen$2$2$1 extends FunctionReferenceImpl implements Function2<String, Analytics, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String label;
        String p0 = (String) obj;
        Analytics analytics = (Analytics) obj2;
        Intrinsics.h(p0, "p0");
        ModeSelectorViewModel modeSelectorViewModel = (ModeSelectorViewModel) this.receiver;
        modeSelectorViewModel.getClass();
        if (analytics != null && (label = analytics.getLabel()) != null) {
            AnalyticsManager analyticsManager = modeSelectorViewModel.h;
            ModeSelectorAnalytics.ModeSelector.Action.d.getClass();
            analyticsManager.g(new ModeSelectorAnalytics$ModeSelector$Action$Companion$click$1(label));
        }
        if (modeSelectorViewModel.j.d()) {
            modeSelectorViewModel.x6(p0);
        } else {
            modeSelectorViewModel.m.f(new ModeSelectorContract.Actions.LaunchLoginScreen(p0));
        }
        return Unit.f24250a;
    }
}
