package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign;

import android.R;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.navigation.internal.c;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTracker;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTrackerKt;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.StandardCampaignScreenKt;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/standardcampaign/StandardCampaignActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lau/com/woolworths/foundation/swrve/embedded/campaign/standardcampaign/StandardCampaignData;", "data", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class StandardCampaignActivity extends Hilt_StandardCampaignActivity {
    public static final /* synthetic */ int y = 0;
    public AppIdentifier w;
    public SwrveEventTrackerImpl x;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[StandardCampaignContent.PresentationStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StandardCampaignContent.PresentationStyle.Companion companion = StandardCampaignContent.PresentationStyle.INSTANCE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.Hilt_StandardCampaignActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.b(this);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.e(true);
        windowInsetsControllerCompat.d(true);
        getWindow().setNavigationBarColor(getColor(R.color.white));
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignActivity.onCreate.2

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignActivity$onCreate$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[AppIdentifier.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        AppIdentifier appIdentifier = AppIdentifier.d;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ThemeContext themeContext;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final StandardCampaignActivity standardCampaignActivity = StandardCampaignActivity.this;
                    AppIdentifier appIdentifier = standardCampaignActivity.w;
                    if (appIdentifier == null) {
                        Intrinsics.p("appIdentifier");
                        throw null;
                    }
                    int iOrdinal = appIdentifier.ordinal();
                    if (iOrdinal == 0) {
                        themeContext = ThemeContext.d;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        themeContext = ThemeContext.e;
                    }
                    ThemeKt.c(themeContext, ComposableLambdaKt.c(1677755438, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignActivity.onCreate.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue() & 3;
                            Unit unit = Unit.f24250a;
                            if (iIntValue == 2 && composer2.c()) {
                                composer2.j();
                                return unit;
                            }
                            StandardCampaignData standardCampaignData = (StandardCampaignData) FlowExtKt.a(StandardCampaignFetcher.b, composer2).getD();
                            if (standardCampaignData == null) {
                                return unit;
                            }
                            SwrveEmbeddedMessage swrveEmbeddedMessage = standardCampaignData.f8905a;
                            StandardCampaignContent standardCampaignContent = standardCampaignData.b;
                            AnalyticsTracker analyticsTrackerA = AnalyticsTrackerKt.a(composer2);
                            composer2.o(-1224400529);
                            StandardCampaignActivity standardCampaignActivity2 = standardCampaignActivity;
                            boolean zI = composer2.I(standardCampaignActivity2) | composer2.I(analyticsTrackerA) | composer2.I(swrveEmbeddedMessage) | composer2.n(standardCampaignContent);
                            Object objG = composer2.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            if (zI || objG == composer$Companion$Empty$1) {
                                c cVar = new c(standardCampaignActivity2, analyticsTrackerA, swrveEmbeddedMessage, standardCampaignContent, 9);
                                composer2.A(cVar);
                                objG = cVar;
                            }
                            Function1 function1 = (Function1) objG;
                            composer2.l();
                            composer2.o(-1746271574);
                            boolean zN = composer2.n(standardCampaignContent) | composer2.I(standardCampaignActivity2) | composer2.I(analyticsTrackerA);
                            Object objG2 = composer2.G();
                            if (zN || objG2 == composer$Companion$Empty$1) {
                                objG2 = new androidx.work.impl.utils.c(18, standardCampaignContent, standardCampaignActivity2, analyticsTrackerA);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            StandardCampaignScreenKt.a(standardCampaignContent, function1, (Function0) objG2, null, composer2, 0);
                            composer2.o(-1746271574);
                            boolean zI2 = composer2.I(standardCampaignActivity2) | composer2.I(analyticsTrackerA) | composer2.n(standardCampaignContent);
                            Object objG3 = composer2.G();
                            if (zI2 || objG3 == composer$Companion$Empty$1) {
                                objG3 = new StandardCampaignActivity$onCreate$2$1$1$3$1(standardCampaignActivity2, analyticsTrackerA, standardCampaignContent, null);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            EffectsKt.e(composer2, unit, (Function2) objG3);
                            return unit;
                        }
                    }, composer), composer, 48);
                }
                return Unit.f24250a;
            }
        }, true, 1274026378));
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            if (Build.VERSION.SDK_INT >= 34) {
                overrideActivityTransition(1, 0, com.woolworths.R.anim.embedded_campaign_fade_out);
            } else {
                overridePendingTransition(R.anim.fade_in, com.woolworths.R.anim.embedded_campaign_fade_out);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }
}
