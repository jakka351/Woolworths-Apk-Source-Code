package au.com.woolworths.feature.shared.force.upgrade;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import au.com.woolworths.design.core.ui.foundation.ThemeContext;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ConfigActionViewModel extends ViewModel {
    public final PreferencesManager e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final SharedFlowImpl i;
    public final Flow j;
    public final ThemeContext k;
    public final String l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionViewModel$Companion;", "", "", "WOW_STORE_APPLICATION_ID", "Ljava/lang/String;", "REWARDS_STORE_APPLICATION_ID", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ApplicationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ApplicationType applicationType = ApplicationType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ConfigActionViewModel(PreferencesManager preferencesManager, AnalyticsManager analyticsManager, ApplicationType applicationType) {
        ThemeContext themeContext;
        String str;
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(applicationType, "applicationType");
        this.e = preferencesManager;
        this.f = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ConfigActionContract.ViewState.NoContent.f6502a);
        this.g = mutableStateFlowA;
        this.h = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
        int iOrdinal = applicationType.ordinal();
        if (iOrdinal == 0) {
            themeContext = ThemeContext.e;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            themeContext = ThemeContext.d;
        }
        this.k = themeContext;
        int iOrdinal2 = applicationType.ordinal();
        if (iOrdinal2 == 0) {
            str = "com.woolworths.rewards";
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "com.woolworths";
        }
        this.l = str;
    }
}
