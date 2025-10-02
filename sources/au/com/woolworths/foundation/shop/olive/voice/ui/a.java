package au.com.woolworths.foundation.shop.olive.voice.ui;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdEventAnalytics;
import au.com.woolworths.rewards.base.points.RewardsBalanceCircleIndicator;
import au.com.woolworths.rewards.base.points.RewardsBalanceCircleIndicatorKt;
import au.com.woolworths.rewards.tooltip.Tooltip;
import au.com.woolworths.shop.lists.ui.snapalist.dialog.DialogType;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract;
import au.com.woolworths.shop.rewards.ShopRewardsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnalyticsData analyticsData;
        switch (this.d) {
            case 0:
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) this.e;
                OliveVoiceViewModel oliveVoiceViewModel = (OliveVoiceViewModel) this.f;
                Context context = (Context) this.g;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final androidx.core.view.c cVar = new androidx.core.view.c(5, oliveVoiceViewModel, context);
                lifecycleOwner.getD().a(cVar);
                break;
            case 1:
                VideoAdData videoAdData = (VideoAdData) this.e;
                Function1 function1 = (Function1) this.f;
                MutableState mutableState = (MutableState) this.g;
                DisposableEffectScope DisposableEffect2 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect2, "$this$DisposableEffect");
                if (!((Boolean) mutableState.getD()).booleanValue()) {
                    VideoAdEventAnalytics videoAdEventAnalytics = videoAdData.g;
                    if (videoAdEventAnalytics != null && (analyticsData = videoAdEventAnalytics.f8888a) != null) {
                        function1.invoke(AnalyticsDataKt.c(analyticsData, videoAdData.f, false));
                    }
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                Function1 function12 = (Function1) this.e;
                VideoAdData videoAdData2 = (VideoAdData) this.f;
                Function1 function13 = (Function1) this.g;
                VideoAdBottomSheet it = (VideoAdBottomSheet) obj;
                Intrinsics.h(it, "it");
                function12.invoke(it);
                AnalyticsData analyticsData2 = it.h;
                if (analyticsData2 != null) {
                    function13.invoke(AnalyticsDataKt.c(analyticsData2, videoAdData2.f, false));
                }
                break;
            case 3:
                Density density = (Density) this.e;
                MutableIntState mutableIntState = (MutableIntState) this.f;
                MutableState mutableState2 = (MutableState) this.g;
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates, "coordinates");
                mutableIntState.i((int) (coordinates.a() & 4294967295L));
                mutableState2.setValue(new Dp(density.B((int) (coordinates.a() & 4294967295L))));
                break;
            case 4:
                ProcessorContract.Listener listener = (ProcessorContract.Listener) this.e;
                Context context2 = (Context) this.g;
                MutableState mutableState3 = (MutableState) this.f;
                if (((Boolean) obj).booleanValue()) {
                    listener.P2();
                } else if (ActivityCompat.m(ContextExtKt.b(context2), "android.permission.CAMERA")) {
                    listener.f0();
                } else {
                    mutableState3.setValue(DialogType.NoPermissionDialog.f12454a);
                }
                break;
            case 5:
                MutableState mutableState4 = (MutableState) this.e;
                Function0 function0 = (Function0) this.f;
                MutableState mutableState5 = (MutableState) this.g;
                FocusState it2 = (FocusState) obj;
                Intrinsics.h(it2, "it");
                mutableState5.setValue(Boolean.valueOf(it2.a()));
                FocusState focusState = (FocusState) mutableState4.getD();
                if (focusState != null && focusState.b() && !it2.b()) {
                    function0.invoke();
                }
                mutableState4.setValue(it2);
                break;
            default:
                ShopRewardsContract.ViewState viewState = (ShopRewardsContract.ViewState) this.e;
                Tooltip tooltip = (Tooltip) this.f;
                Function0 function02 = (Function0) this.g;
                RewardsBalanceCircleIndicator it3 = (RewardsBalanceCircleIndicator) obj;
                Intrinsics.h(it3, "it");
                RewardsBalanceCircleIndicatorKt.a(it3, viewState.f12892a);
                if (tooltip != null) {
                    Context context3 = it3.getContext();
                    Intrinsics.g(context3, "getContext(...)");
                    au.com.woolworths.rewards.base.ContextExtKt.a(context3, it3, tooltip.f9967a, tooltip.getC(), function02, 40);
                }
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(ProcessorContract.Listener listener, Context context, MutableState mutableState) {
        this.d = 4;
        this.e = listener;
        this.g = context;
        this.f = mutableState;
    }
}
